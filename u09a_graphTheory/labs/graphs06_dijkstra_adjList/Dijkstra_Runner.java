import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Dijkstra_Runner
{
   public static void main( String[] args ) throws IOException
   { 
      String edges = "AB7 AD5 BC8 BD9 BE7 CE5 DE15 DF6 EF8 EG9 FG11";
      Graph grapher = new Graph(false, edges);
      out.println(grapher);
      grapher.dijkstra("A");
   }
    
   public static void main2( String[] args ) throws IOException
   { 
      Scanner file = new Scanner(new File("graphs.dat"));
      int howManyTimes = file.nextInt();
      file.nextLine();
      for(int x = 1; x <= howManyTimes; x++)
      {
         boolean directed = false;
         String graphType = file.nextLine();
         out.println("Graph #" + x + " - " + graphType);
         if (graphType.equalsIgnoreCase("Directed Graph")) {
            directed = true;
         }
         String connections = file.nextLine();
         Graph grapher = new Graph(directed, connections);
      
         String start = file.nextLine();
         out.println(grapher + "\n");
         grapher.dijkstra(start);
         out.println();
      }
   }
}
