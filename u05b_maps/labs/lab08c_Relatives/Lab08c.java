//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab08c
{
	public static void main( String args[] ) throws IOException
	{
		Scanner scan = new Scanner(new File("lab08c.dat"));
		Relatives test = new Relatives();
		while(scan.hasNextLine()){
			test.setPersonRelative(scan.nextLine());
		}
		scan.close();
		out.println(test);
		out.println("Dot is directly related to " + test.getRelatives("Dot"));

		out.print("\nIs Dot directly related to Tom?  ");
		if(test.getRelatives("Dot").contains("Tom"))
			out.println("Yes");
		else
			out.println("No");

			out.print("\nIs Dot directly related to Alice?  ");
			if(test.getRelatives("Dot").contains("Alice"))
				out.println("Yes");
			else
				out.println("No");
	}
}