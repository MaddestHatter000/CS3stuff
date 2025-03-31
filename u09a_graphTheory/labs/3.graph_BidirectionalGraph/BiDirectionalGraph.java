//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class BiDirectionalGraph
{
	private TreeMap<String, TreeSet<String>> map;
	private boolean yahOrNay;

	public BiDirectionalGraph(String line)
	{
		map = new TreeMap<String, TreeSet<String>>();
		String[] list = line.split(" ");
		for(int i = 0; i < list.length; i += 2)
		{
			if(!map.containsKey(list[i]))
			{
				map.put(list[i], new TreeSet<String>());
			}
			if(!map.containsKey(list[i + 1]))
			{
				map.put(list[i + 1], new TreeSet<String>());
			}
			map.get(list[i]).add(list[i + 1]);
			map.get(list[i + 1]).add(list[i]);
		}
	}

	public boolean contains(String name)
	{
		return map.containsKey(name);
	}

	public void check(String first, String second)
	{
		yahOrNay = false;
		check(first, second, new TreeSet<String>());
	}

	public void check(String current, String second, TreeSet<String> placedUsed)
	{
		if(current.equals(second)){
			yahOrNay = true;
			return;
		}
		for(String i : map.get(current))
		{
			if(!placedUsed.contains(i)){
				placedUsed.add(current);
				check(i, second, placedUsed);
			}
		}
	}


	public String toString()
	{ 
		if(yahOrNay)
		{
			return "YAH";
		}
		else
		{
			return "NAH";
		}
	}
}