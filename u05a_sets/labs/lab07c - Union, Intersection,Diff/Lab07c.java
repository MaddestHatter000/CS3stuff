//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
           
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab07c
{
	public static void main(String args[]) throws IOException
	{
		Scanner scan = new Scanner(new File("lab07c.dat"));
		MathSet test;
		while(scan.hasNextLine()){
			test = new MathSet(scan.nextLine(), scan.nextLine());
			out.println(test);
		}
		scan.close();
	}
}