//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;
import static java.lang.System.*;

public class BiDirectionalGraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner file = new Scanner(new File("bidgraph.dat"));
		BiDirectionalGraph test;
		int howManyTimes = file.nextInt();
		file.nextLine();
		for(int x = 0; x < howManyTimes; x++)
		{
			while(file.hasNext())
			{
				test = new BiDirectionalGraph(file.nextLine());
				String first = file.next();
				String second = file.next();
				test.check(first, second);
				System.out.println(first + " connects to " + second + " == " + test);
				file.nextLine();
			}
		}
	}
}