import java.util.*;
import static java.lang.System.*;

public class Graph {
   private Map<String, List<String>> graph;
   private boolean directed;
   
   /*  This is similar to the previous graphs, except since it's a weighted
    *  graph the weights must be stored somewhere. I suggest storing the weights
    *  as part of the Strings in the lists of neighbors. So the graph will be:
    *     "A" --> "B7.0", "D5.0"
    *     "B" --> "A7.0", "C8.0", "D9.0", "E7.0"
    *     "C" --> "B8.0", "E5.0"
    *     "D" --> "A5.0", "B9.0", "E15.0", "F6.0"
    *     "E" --> "B7.0", "C5.0", "D15.0", "F8.0", "G9.0"
    *     "F" --> "D6.0", "E8.0", "G11.0"
    *     "G" --> "E9.0", "F11.0"
    *
    *  Another option to store the weights is to define an Edge class and have each 
    *  edge store the name of the target node and weight of the edge. 
    */
   public Graph(boolean directed, String line) {
      this.directed = directed;
      this.graph = new HashMap<>();
      for (String part : line.split(" ")) {
         String n1 = part.substring(0,1);
         String n2 = part.substring(1,2);
         String cost = part.substring(2);

         if(!graph.containsKey(n1))
            graph.put(n1, new LinkedList<String>());
         graph.get(n1).add(n2+cost);
         if(!graph.containsKey(n2))
               graph.put(n2, new LinkedList<String>());
         if(!directed){
            graph.get(n2).add(n1+cost);
         }
      }
   }

   public boolean contains(String letter) {
      return graph.containsKey(letter);
      
   }

   /** Dijkstra's Algorithm: **/ 
   public void dijkstra(String start){
      // Before the loop, 
      //  - make maps to store the costs and previous nodes and a set to keep track of the visited nodes.
      //  - Map each vertex to a cost of Double.POSITIVE_INFINITY and previous as null.
      //  - Set the cost of the starting node to zero. 


      Map<String, String> previouses = new HashMap<>();
      Map<String, Double> costs = new HashMap<>();
      for(String i : graph.keySet())
      {
         costs.put(i, Double.POSITIVE_INFINITY);
         previouses.put(i, null);
      }
      costs.put(start, 0.0);
      
      
      // Loop size times:
      //    Find the node with the smallest cost not yet visited and set is as the current node
      //    If there are no more reachable nodes, stop looping.
      //    Mark the current node as visited
      //    Loop thru all neighbors of the current node:
      //       If the neighbor has already been visited:
      //           Skip it
      //       Calculate the tentative cost this neighbor
      //       Ff the tentative cost is cheaper than the current cost stored for this neighbor:
      //           Update the cheapest cost and prev 
      
      // loop header goes here
      Set<String> visited = new HashSet<>();
      for(int i = 0; i < graph.size(); i ++)
      {
         String node = getNodeWithMinCost(costs, visited);
         if (node == null) {
            break;
         }
         visited.add(node);
         for(String nextNode : graph.get(node))
         {
            String next = nextNode.replaceAll("[^A-Za-z]", "");
            Double cost = Double.parseDouble(nextNode.replaceAll("[^0-9.]", ""));
            if(costs.get(next) > (costs.get(node) + cost))
            {
               previouses.put(next, node);
               costs.put(next, (costs.get(node) + cost));
            }
         }
         // I put this inside the loop so I could see whether the costs
         // and previous nodes were updating properly. Feel free to move
         // after the loop once you're done. 
         displayCostsAndPreviouses(costs, previouses);    
      }
      displayPaths(start, costs, previouses);
   }
   
   /* This method finds the node with the smallest current cost and returns the name of that node.
    * If multiple nodes have the same distance, the one with the smallest name will be returned.
    * Algorithm:
    *  - Make a list of map entries. You list type will be Map.Entry<String, Double> because you'll 
    *    be copying entries from the <code>costs</code> map.
    *  - Loop thru the <code>costs</code> map's entry set:
    *       - Skip the current entry if it has already been visited.
    *       - Add the current entry if the list is empty or if the cost of the current entry
              equals the cost of the items in the list
    *       - Clear the list and then add the current entry if the cost of the current entry 
    *         is less than the cost of items in the list:
    *  - Sort the list first by costs and then alphabetically using a Comparator
    *    You can either implement the compare() method in the SortByCosts class
    *    or in a lambda expression that you write in the call to the sort method.
    *  - Return the name of the first node in the list
    */
   private String getNodeWithMinCost(Map<String, Double> costs, Set<String> visited) {
      List<String> smallestCosts = new ArrayList<>();
      for(String e : costs.keySet()) {
         if(visited.contains(e))
           continue;
         if(smallestCosts.size() == 0 || costs.get(smallestCosts.get(0)) == costs.get(e)){
            smallestCosts.add(e);
         }
         if(costs.get(smallestCosts.get(0)) > costs.get(e)){
            smallestCosts.clear();
            smallestCosts.add(e);
         }
      }
      Collections.sort(smallestCosts);
      return smallestCosts.get(0);
   } 
   
   // An inner class to be used in getNodeWithMinCost() above if opting not
   // to use a lambda expression in the call to Collections.sort().
   private class SortByCost implements Comparator<Map.Entry<String, Double>> {
      @Override
      public int compare(Map.Entry<String, Double> e1, Map.Entry<String, Double> e2) {
         return 0;
      }
   }

   private void displayCostsAndPreviouses(Map<String, Double> costs, Map<String, String> previouses) {
      out.println("Minimum Distances:");
      String names = "", costStrings = "", prevs="";
      for (String v : graph.keySet()) {
         names += String.format("%-6s", v);
         double cost = costs.get(v);
         costStrings += (cost < Double.POSITIVE_INFINITY) ? String.format("%-6.1f", cost) : "inf   ";
         prevs += String.format("%-6s", previouses.get(v));
      }
      out.println(names + "\n" + costStrings + "\n" + prevs);
      out.println();
   }
   
   private void displayPaths(String start, Map<String, Double> costs, Map<String, String> previouses) {
      out.println(graph);
      for (String v : graph.keySet()) {
         if ( ! v.equals(start) ) {
            System.out.print("Path from " + start + " to " + v + ":  ");
            // If the cost of the current node == Double.POSITIVE_INFINITY
            //    print "does not exist."
            String node = v;
            if(costs.get(node) == Double.POSITIVE_INFINITY)
               System.out.println("does not exist");
            else{
               String path = v;
               //loop
               //   node = previous node
               //   concatenate the current node and an arrow onto path
               //   node = previous node
               while(!node.equals(start))
               {
                  node = previouses.get(node);
                  path = node + " -> " + path;
               }
               System.out.println(path);
            }
         }
      }
   }   
  
   public int size() {
      return graph.size();
   }
      
   @Override
   public String toString() {
      return "";
   }
}