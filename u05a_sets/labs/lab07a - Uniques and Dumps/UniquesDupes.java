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

		//add code
		for(int i = 0; i < input.length(); i++){
				uniques.add(input.substring(i, i+1));
			}
		}
		

		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		//add code
		
		return null;
	}
}