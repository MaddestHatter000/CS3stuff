//Import the Scanner, File, IOException (or FileNotFoundException) classes:

//Staticly import the members of the System class, or type System.out everywhere.

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GraphRunner
{
   public static void main( String[] args ) throws IOException
   { 
      Scanner scan = new Scanner(new File("graph1.dat"));
      GraphDFS tester;
          
      while(scan.hasNextLine()){
         tester = new GraphDFS(scan.nextLine());  
         System.out.println("\n\n" + tester);
         tester.dfs(scan.nextLine());
      }

      
   }
}