//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab07b
{
	public static void main( String args[] ) throws IOException
	{
		Scanner scan = new Scanner(new File("lab07b.dat"));
		OddEvenSets test;
		while(scan.hasNextLine()){
			test = new OddEvenSets(scan.nextLine());
			out.println(test);
		}
	}
}