import java.util.*;
import java.io.*;

public class AdjMatrix_Dijkstras {
   private int SIZE;
   private int[][] matrix;

   public AdjMatrix_Dijkstras(int[][] matrix)
   {
      this.matrix = matrix;
      this.SIZE = matrix.length;
   }

   public void dijsktras(int start) {
      int count = 1;
      // Create cost, previous, and visited arrays
      int[] cost = new int[SIZE];
      int[] prev = new int[SIZE];
      boolean[] visited = new boolean[SIZE];
  
      // Initialize cost array with "infinity" and prev array with -1
      for (int i = 0; i < SIZE; i++) {
          cost[i] = Integer.MAX_VALUE;
          prev[i] = -1;
          visited[i] = false;
      }
  
      // Set the starting node's cost to 0
      cost[start] = 0;
  
      // Loop through all nodes
      for (int i = 0; i < SIZE; i++) {
          // Find the node with the minimum cost that hasn't been visited
          int currentNode = nodeWithMinCost(visited, cost);
  
          // If no such node exists, break (graph may be disconnected)
          if (currentNode == -1) {
              break;
          }
  
          // Mark the current node as visited
          visited[currentNode] = true;
  
          // Update the cheapest cost to each neighbor
          for (int j = 0; j < SIZE; j++) {
              // If the node is not visited and there is a path to it
              if (!visited[j] && matrix[currentNode][j] != 0) {
                  // Check if the cost to reach this node is less than the current cost
                  if (cost[currentNode] + matrix[currentNode][j] < cost[j]) {
                      cost[j] = cost[currentNode] + matrix[currentNode][j];
                      prev[j] = currentNode;
                  }
              }
          }
  
          // Display the state of the algorithm after each iteration
          displayState(count++, prev, visited, cost);
      }
  
      // Display the final results
      displayResults(prev, visited, cost, start);
  }
   
   private int nodeWithMinCost(boolean[] visited, int[] cost) {
      int minCost = Integer.MAX_VALUE;
      int minIndex = -1;
   
      for(int i=0; i<SIZE; i++){
         if(!visited[i] && cost[i] < minCost){
            minCost = cost[i];
            minIndex = i;
         }
      }
      return minIndex;
   }
   
   //Shows the state of each array
   private void displayState(int count, int[] prev, boolean[] visited, int[] cost) {
      System.out.println("Verify: pass #" + count);
      System.out.println(Arrays.toString(prev));
      System.out.println(Arrays.toString(visited));
      System.out.println(Arrays.toString(cost)+"\n");
   }
   
   //Displays
   private void displayResults(int[] prev, boolean[] visited, int[] cost, int start) {
      char letter = Letters.LETTERS[start].charAt(0);
      for(int i=0; i<SIZE;i++){
         if(i == start)
            continue;
         System.out.print("Path from " + letter + " to " + (char)(i + 65) + ":  ");
         if (cost[i] == Integer.MAX_VALUE){
            System.out.println(" does not exist.");
            continue;
         }
         int spot = i;
         String path = "" + (char)(i+65);
         do{
            spot = prev[spot];
            path = (char)(spot+65) + " -> " + path;
         }while(cost[spot] != 0);
         System.out.println(path);
      }
   }

   @Override
   public String toString() {
      String output = "";
      for(int[] i : matrix){
         for(int j : i){
            output += String.format("%-4s", j);
         }
         output += "\n";
      }
      return output;
   }

}

