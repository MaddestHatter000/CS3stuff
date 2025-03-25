//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class ShortestPathGraph
{
	private TreeMap<String, ArrayList<String>> map;
	private boolean yayOrNay;
	private int shortest;

	public ShortestPathGraph(String line)
	{
		map = new TreeMap<String, ArrayList<String>>();
		for (String i : line.split(" "))
		{
			String spotA = i.substring(0,1);
			String spotB = i.substring(1);

			if(!contains(spotA))
				map.put(spotA, new ArrayList<>());
			if(!contains(spotB))
				map.put(spotB, new ArrayList<>());
			map.get(spotA).add(spotB);
			map.get(spotB).add(spotA);
		}
	}

	public boolean contains(String letter)
	{
		return map.containsKey(letter)
	}

	public void check(String first, String second, String placesUsed, int steps)
	{
	}

	public String toString()
	{
		return "";
	}
}