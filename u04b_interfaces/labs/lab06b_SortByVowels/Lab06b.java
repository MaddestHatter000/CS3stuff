//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class Lab06b
{
	public static void main( String args[] ) throws IOException
	{
		Scanner scan = new Scanner(new File("lab06b.dat"));
		ArrayList<VowelWord> list = new ArrayList<>();
		while(scan.hasNext()){
			list.add(new VowelWord(scan.next()));
		}
		Collections.sort(list);
		out.println(list);
	}
}