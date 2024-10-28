//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab08b
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("dictionary.dat"));

		SpanishToEnglish test = new SpanishToEnglish();

		while(file.hasNextLine()){
			test.putEntry(file.nextLine());
		}

		out.println("\n====\tMAP CONTENTS\t====\n\n");
		out.println(test+"\n\n");

		//read in the lines and convert them
		Scanner phrases = new Scanner(new File("phrase.dat"));

		while(phrases.hasNextLine())
		{
			for(String w : phrases.nextLine().split(" "))
			{
				out.print(test.translate(w));
			}
			out.println();
		}
	}
}