import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Runner_AdjMatrix_Dijkstras {

       
   public static void main(String[] args) {
                       // A  B  C  D  E  F
      int[][] matrix1 = {{0, 0, 2, 8, 3, 0}, // A
                         {0, 0, 0, 6, 0, 0}, // B
                         {0, 3, 0, 4, 9, 0}, // C
                         {0, 0, 0, 0, 0, 0}, // D is a sink
                         {0, 0, 0, 0, 0, 0}, // E is a sink
                         {1, 0, 0, 0, 0, 0}  // F is
                        };         //    ^----- a source
    
                       //  A   B   C   D   E   F
      int[][] matrix2 = {{  0, 22,  0, 15,  3,  0},  // A
                        {  0,  0,  0,  4,  0,  0},  // B
                        {  0,  1,  0,  0,  0,  0},  // C
                        {  0,  0, 25,  0,  0,  6},  // D
                        {  0,  0,  0,  2,  0,  0},  // E
                        {  0,  0,  8,  0,  0,  0},  // F
                       };
   
     // Same as matrix2, but symmetric since it's an undirected graph.
     
                       //  A   B   C   D   E   F
      int[][] matrix4 = {{  0, 22,  0, 15,  3,  0},  // A
                        { 22,  0,  1,  4,  0,  0},  // B
                        {  0,  1,  0, 25,  0,  8},  // C
                        { 15,  4, 25,  0,  2,  6},  // D
                        {  3,  0,  0,  2,  0,  0},  // E
                        {  0,  0,  8,  6,  0,  0},  // F
                       };    
                        
                                     //  A    B    C    D    E    F    G
      int[][] matrix5 = new int[][]{ {   0,   7,   0,   5,   0,   0,   0 },
                                     {   7,   0,   8,   9,   7,   0,   0 },
                                     {   0,   8,   0,   0,   5,   0,   0 },
                                     {   5,   9,   0,   0,  15,   6,   0 },
                                     {   0,   7,   5,  15,   0,   8,   9 },
                                     {   0,   0,   0,   6,   8,   0,  11 },
                                     {   0,   0,   0,   0,   9,  11,   0 },
                                   };
                                      
                                      //  A    B    C    D    E    F    G    H
      int[][] matrix6 = new int[][]{  {   0,   6,   1,   3,   0,   0,   5,   0 },
                                      {   6,   0,   0,   0,   3,   0,   6,   3 },
                                      {   1,   0,   0,   1,   0,   0,   0,   0 },
                                      {   3,   0,   1,   0,   2,   8,   0,   0 },
                                      {   0,   3,   0,   2,   0,   0,   0,   4 },
                                      {   0,   0,   0,   8,   0,   0,   0,   5 },
                                      {   5,   6,   0,   0,   0,   0,   0,   0 },
                                      {   0,   3,   0,   0,   4,   5,   0,   0 },
                                     };
   
      // out.println("Graph one:");
      // AdjMatrix_Dijkstras graph1 = new AdjMatrix_Dijkstras(matrix1);
      // out.println(graph1);
      // out.print("DFS recursive: ");
      // graph1.printDfsRecur(5);
      // out.print("DFS iter ->:   ");
      // graph1.printDfsIter_Forward(5);      
      // out.print("DFS iter <-:   ");
      // graph1.printDfsIter_Forward(5);         
      // out.print("BFS: ");
      // graph1.printBFS(5);
      // out.println("\n");
      // out.println("Dijkstra's starting at F:");
      // graph1.dijsktras(5);
         
      // out.println("Graph two:");
      // AdjMatrix_Dijkstras graph2 = new AdjMatrix_Dijkstras(matrix2);
      // out.println(graph2);
      // out.print("DFS recursive: ");
      // graph2.printDfsRecur(0);
      // out.print("DFS iter ->:   ");
      // graph2.printDfsIter_Forward(0);      
      // out.print("DFS iter <-:   ");
      // graph2.printDfsIter_Forward(0);         
      // out.print("BFS: ");
      // graph2.printBFS(3);
      // out.println("\n");
      // out.println("Dijkstra's starting at A:");
      // graph2.dijsktras(0);
      // out.println("\n");
      // out.println("Dijkstra's starting at B:");
      // graph2.dijsktras(1);            
                            
      // out.println("Graph four:");
      // AdjMatrix_Dijkstras graph4 = new AdjMatrix_Dijkstras(matrix4);
      // out.println(graph4);
      // out.print("DFS recursive starting at C: ");
      // graph4.printDfsRecur(2);
      // out.print("DFS iter -> starting at C:   ");
      // graph4.printDfsIter_Forward(2);      
      // out.print("DFS iter <- starting at C:   ");
      // graph4.printDfsIter_Forward(2);         
      // out.print("BFS starting at F: ");
      // graph4.printBFS(5);
      // out.println("\n");
      // out.println("Dijkstra's starting at E:");
      // graph4.dijsktras(4);
      // out.println("\n");
                                           
      // out.println("Graph five:");
      // AdjMatrix_Dijkstras graph5 = new AdjMatrix_Dijkstras(matrix5);
      // out.println(graph5);
      // out.print("DFS recursive: ");
      // graph5.printDfsRecur(0);
      // out.print("DFS iter ->:   ");
      // graph5.printDfsIter_Forward(0);      
      // out.print("DFS iter <-:   ");
      // graph5.printDfsIter_Forward(0);         
      // out.print("BFS: ");
      // graph5.printBFS(0);
      // out.println("\n");
      // out.println("Dijkstra's starting at A:");
      // graph5.dijsktras(0);
      
      // out.println("\nGraph six:");
      // AdjMatrix_Dijkstras graph6 = new AdjMatrix_Dijkstras(matrix6);
      // out.println(graph6);
      // out.print("DFS recursive: ");
      // graph6.printDfsRecur(0);
      // out.print("DFS iter ->:   ");
      // graph6.printDfsIter_Forward(0);      
      // out.print("DFS iter <-:   ");
      // graph6.printDfsIter_Forward(0);         
      // out.print("BFS: ");
      // graph6.printBFS(0);
      // out.println("\n");
      // out.println("Dijkstra's starting at A:");
      // graph6.dijsktras(0);
   }
}

