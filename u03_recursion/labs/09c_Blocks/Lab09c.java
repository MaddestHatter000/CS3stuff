//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab09c
{
	public static void main( String args[] ) throws IOException
	{
		Grid test = new Grid(12, 12, "A E I".split(" "));
		out.println(test);
		out.println("A count: " + test.findMax("A"));
		out.println("E count: " + test.findMax("E"));
		out.println("I count: " + test.findMax("I"));
	}
}