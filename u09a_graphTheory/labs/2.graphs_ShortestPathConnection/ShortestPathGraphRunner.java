//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class ShortestPathGraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner scan = new Scanner(new File("labdat.dat"));
		ShortestPathGraph test;

		// int num = scan.nextInt();
		// scan.nextLine();
		// for(int i = 0; i < num; i++);
		// {
		// 	test = new ShortestPathGraph(scan.nextLine());
		// 	String path = scan.nextLine();
		// 	String start = path.substring(0,1);
		// 	String end = path.substring(1);
		// 	test.check(start, end);
		// 	System.out.println(start + " connects to " + end + " == " + test);
		// }

		while(scan.hasNextLine())
		{
			test = new ShortestPathGraph(scan.nextLine());
			String path = scan.nextLine().trim();
			String start = path.substring(0,1).trim();
			String end = path.substring(1).trim();
			test.check(start, end);
			System.out.println(start + " connects to " + end + " == " + test);
		}
	}
}