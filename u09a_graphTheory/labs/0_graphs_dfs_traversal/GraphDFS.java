import java.util.*;
import static java.lang.System.*;

public class GraphDFS
{
   
   Map<String, ArrayList<String>> graph;

   //The constructor should take a String of one-directional connections
   //as an input and add each connection to the graph.

   public GraphDFS(String line)
   {
      graph = new TreeMap<String, ArrayList<String>>();
      Scanner scan = new Scanner(line);
      while(scan.hasNext())
      {
         String i = scan.next();
         String key = i.substring(0,1);
         String val = i.substring(1);
         if(!graph.containsKey(key)){
            graph.put(key, new ArrayList<String>());
         }
         graph.get(key).add(val);
      }
   }

   ////////////////////////////////////////////////////
   // The signature of the public method called      //
   // by the main method should be:  dfs(String)     //
   // You're going to make both a recursive and      //
   // an iterative version. Just change the name of  //
   // the one you don't want to run to dfs1 or dfs2. //
   ////////////////////////////////////////////////////
    
   /* Two options for keeping track of which nodes have been visited:
    * If using an array or list to store the graph, you can use a 
    * list or array of booleans that's the same size.  You'll set the
    * corresponding spot in the boolean array to true when it's visited.
    
    * If using a map to store the graph, just make an empty set to 
    * store the visited list.  You can add a node to the set AND check
    * where that node had previously been visited by putting the 
    * call to the add method as the IF's condition.
    */   
     
   //public method called to start the recursive version: 
   public void dfs(String start)
   {
      //Bail if the starting key isn't even in the graph
      if(!graph.containsKey(start))
      {
         return;
      }
      dfs(start, new TreeSet<String>());
   }
      
   //The recursive helper method:
   private void dfs(String start, Set<String> visited)
   {
      visited.add(start);
      out.print(start);
      for(String i : graph.get(start)){
         if(!visited.contains(i)){
            dfs(i, visited);
         }
      }
   } 
   
   // //public method called to run the iterative version: 
   // public void dfs(String start)
   // {
   //  	//let SOS be a stack of stacks (it's really just a LinkedList)
   //   	//SOS.addFront(v)
   //   	//while SOS is not empty do
   //    //  v = SOS.removeFront()
   //    //    if v is not labeled as discovered then
   //    //      label v as discovered
   //    //      add to list of v's neighbors to the front of SOS, maintaining their order
   // }    
   
   @Override
   public String toString()
   {
      return graph.toString();
   }
}