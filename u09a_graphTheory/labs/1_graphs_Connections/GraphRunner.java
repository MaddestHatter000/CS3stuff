//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner scan = new Scanner(new File("graph1.dat"));
		Graph tester;
		while(scan.hasNextLine()){
			tester = new Graph(scan.nextLine()); 
			String i = scan.nextLine();
			String src = i.substring(0,1);
			String dest = i.substring(1);
			if(tester.connected(src, dest)){
				System.out.println(src + " is connected to " + dest);
			}
			else{
				System.out.println(src + " is NOT connected to " + dest);
			}
		}
	}
}