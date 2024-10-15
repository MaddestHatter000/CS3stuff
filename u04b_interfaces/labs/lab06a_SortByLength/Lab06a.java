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

public class Lab06a
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		Scanner scan = new Scanner(new File("lab06a.dat"));
		ArrayList<Word> list = new ArrayList<>();
		while(scan.hasNext()){
			list.add(new Word(scan.next()));
		}
		Collections.sort(list);
		out.println(list);
	}
}