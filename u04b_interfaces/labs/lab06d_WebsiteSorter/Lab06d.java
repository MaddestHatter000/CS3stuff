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

public class Lab06d
{
	public static void main ( String[] args ) throws IOException
	{
		Scanner scan = new Scanner(new File("lab06d.dat"));
		ArrayList<SiteName> list = new ArrayList<>();
		while(scan.hasNext())
			list.add(new SiteName(scan.next()));
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++)
			out.println(list.get(i));
	}
}
