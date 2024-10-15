//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{
		Set<String> uniques = new TreeSet<String>();
		for(String i : input.split(" ")){
			uniques.add(i);
		}
		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		String all = "";
		Set<String> dupes = new TreeSet<String>();
		for(String i : input.split(" ")){
			if(all.contains(i))
				dupes.add(i);
			else
				all += i;
		}
		return dupes;
	}
}