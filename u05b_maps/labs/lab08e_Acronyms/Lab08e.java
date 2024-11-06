//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab08e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab08e.dat"));
		Acronyms test = new Acronyms();
		for(int i = Integer.parseInt(file.nextLine()); i > 0; i--){
			test.putEntry(file.nextLine());
		}

		out.println("====    MAP CONTENTS    ====\n");
		out.println(test);
		out.println("\n====    READ LINES      ====\n");
		while(file.hasNextLine()){
			out.println(test.convert(file.nextLine()));
		}
	}
}