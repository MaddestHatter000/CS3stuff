
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Scanner;
import java.io.File;
import java.io.*;

/** An abstract class that implements a directed graph.
 * The graph may have self-loops, parallel edges.
 * Vertices are labeled by integers 0 .. n-1
 * The edges of the graph are not labeled.
 * Representation of edges is left abstract.
 */

public abstract class Graph {

	private int numVertices;
	private int numEdges;
	//optional association of String labels to vertices
	private Map<Integer,String> vertexLabels;

	public Graph() {
		numVertices = 0;
		numEdges = 0;
		vertexLabels = null;
	}

	public int getNumVertices() {
		return numVertices;
	}

	public int getNumEdges() {
		return numEdges;
	}

	/**
	 * Add new vertex to the graph.  This vertex will
	 * have as its index the next available integer.
	 * Precondition: contiguous integers are used to
	 * index vertices.
	 * @return index of newly added vertex
	 */
	public int addVertex() {
		implementAddVertex();
		numVertices ++;
		return (numVertices-1);
	}

	/**
	 * Abstract method implementing adding a new
	 * vertex to the representation of the graph.
	 */
	public abstract void implementAddVertex();

	/**
	 * Add new edge to the graph between given vertices,
	 * @param u Index of the start point of the edge to be added.
	 * @param v Index of the end point of the edge to be added.
	 */
	public void addEdge(int v , int w) {
		numEdges ++;
		if (v < numVertices && w < numVertices) {
			implementAddEdge(v , w);
		}
		else {
			throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * Abstract method implementing adding a new
	 * edge to the representation of the graph.
	 */
	public abstract void implementAddEdge(int v, int w);

	/**
	 * Get all (out-)neighbors of a given vertex.
	 * @param v Index of vertex in question.
	 * @return List of indices of all vertices that are adjacent to v
	 * 	via outgoing edges from v.
	 */
	public abstract List<Integer> getNeighbors(int v);

	/**
	 * Get all in-neighbors of a given vertex.
	 * @param v Index of vertex in question.
	 * @return List of indices of all vertices that are adjacent to v
	 * 	via incoming edges to v.
	 */
	public abstract List<Integer> getInNeighbors(int v);

	/**
	 * The degree sequence of a graph is a sorted (organized in numerical order
	 * from largest to smallest, possibly with repetitions) list of the degrees
	 * of the vertices in the graph. The degree of a vertex of a graph is the
	 * number of edges incident to the vertex.
	 *
	 * Each vertex has an in-degree (the number of edges leading
	 * into it) and an out-degree (the number of edges leading out of
	 * it). The degree sequence accounts for both.
	 *
	 * @return The degree sequence of this graph.
	 */
	public List<Integer> degreeSequence() {
		// XXX: implement
		List<Integer> degrees = new ArrayList<Integer>();
		for (int i = 0; i < numVertices; i++) {
			int degree = getNeighbors(i).size() + getInNeighbors(i).size();
			degrees.add(degree);
		}
		Collections.sort(degrees, Collections.reverseOrder());
		return degrees;
	}

	/**
	 * Get all the vertices that are 2 away from the vertex in question.
	 * @param v The starting vertex
	 * @return A list of the vertices that can be reached in exactly two hops (by
	 * following two edges) from vertex v.
	 */
	public abstract List<Integer> getDistance2(int v);

	/** Return a String representation of the graph
	 * @return A string representation of the graph
	 */
   public String toString() {
      String s = "Graph with " + numVertices + " vertices and " + numEdges + " edges.\n";
      s += "Degree sequence: " + degreeSequence() + ".\n";
      s += "Nodes two hops from 0: " + getDistance2(0) + "\n";
      s += "Nodes two hops from 2: " + getDistance2(2) + "\n";
      if (numVertices <= 20) s += adjacencyString();
      return s;
   }

	/**
	 * Generate string representation of adjacency list
	 * @return the String
	 */
	public abstract String adjacencyString();

   ////////////////////////////////////////////////////////
	// The next methods implement labeled vertices.       //
	// Basic graphs may or may not have labeled vertices. //
   ////////////////////////////////////////////////////////
	/**
	 * Create a new map of vertex indices to string labels
	 * (Optional: only if using labeled vertices.)
	 */
	public void initializeLabels() {
		vertexLabels = new HashMap<Integer,String>();
	}
	/**
	 * Test whether some vertex in the graph is labeled
	 * with a given index.
	 * @param The index being checked
	 * @return True if there's a vertex in the graph with this index; false otherwise.
	 */
	public boolean hasVertex(int v)
	{
		return v < getNumVertices();
	}

	/**
	 * Test whether some vertex in the graph is labeled
	 * with a given String label
	 * @param The String label being checked
	 * @return True if there's a vertex in the graph with this label; false otherwise.
	 */
	public boolean hasVertex(String s)
	{
		return vertexLabels.containsValue(s);
	}

	/**
	 * Add label to an unlabeled vertex in the graph.
	 * @param The index of the vertex to be labeled.
	 * @param The label to be assigned to this vertex.
	 */
	public void addLabel(int v, String s) {
		if (v < getNumVertices() && !vertexLabels.containsKey(v))
		{
			vertexLabels.put(v, s);
		}
		else {
			System.out.println("ERROR: tried to label a vertex that is out of range or already labeled");
		}
	}

	/**
	 * Report label of vertex with given index
	 * @param The integer index of the vertex
	 * @return The String label of this vertex
	 */
	public String getLabel(int v) {
		if (vertexLabels.containsKey(v)) {
			return vertexLabels.get(v);
		}
		else return null;
	}

	/**
	 * Report index of vertex with given label.
	 * (Assume distinct labels for vertices.)
	 * @param The String label of the vertex
	 * @return The integer index of this vertex
	 */
	public int getIndex(String s) {
		for (Map.Entry<Integer,String> entry : vertexLabels.entrySet()) {
			if (entry.getValue().equals(s))
				return entry.getKey();
		}
		System.out.println("ERROR: No vertex with this label");
		return -1;
	}

	public static void main (String[] args) throws IOException {
		// For testing of functionality
		System.out.println("Straight line (0->1->2->3->...)");
		test("1",5);
		System.out.println("\nUndirected straight line (0<->1<->2<->3<->...)");
		test("2",6);
		System.out.println("\nStar graph - 0 is connected in both directions to all nodes except itself (starting at 0)");
		test("3",0);
		System.out.println("\nStar graph - 0 is connected out to all nodes except itself (starting at 0)");
		test("4",5);
		System.out.println("\nStar graph - Each 'arm' consists of two undirected edges leading away from 0 and connecting to one vertex (starts at 0)");
		test("5",0);
		System.out.println("\nStar graph - Each 'arm' is of length two and consists of undirected edges leading away from 0 (starts at 0)");
		test("6",5);

	}
	public static void test(String num, int case1) throws IOException{
		GraphAdjList adjList = new GraphAdjList();
		GraphAdjMatrix adjMat = new GraphAdjMatrix();
		Scanner file = new Scanner(new File("graph"+num+".txt"));
		int numberOfVertices = file.nextInt();
		for(int i=0;i<numberOfVertices;i++){
			adjList.addVertex();
			adjMat.addVertex();
		}
		while(file.hasNextInt()){
			int v = file.nextInt();
			int n = file.nextInt();
			adjList.addEdge(v,n);
			adjMat.addEdge(v,n);
		}
      System.out.println(adjList);
      System.out.println(adjMat);
	}
}
