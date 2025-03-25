//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Graph
{
   //Choose:
   private Map<String, List<String>> map;
   
	public Graph(String line)
	{
		map = new TreeMap<String, List<String>>();
		Scanner scan = new Scanner(line);
		while(scan.hasNext())
		{
			String i = scan.next();
			String val1 = i.substring(0,1);
			String val2 = i.substring(1);
			if(!map.containsKey(val1)){
				map.put(val1, new ArrayList<String>());
			}
			if(!map.containsKey(val2)){
				map.put(val2, new ArrayList<String>());
			}
			map.get(val1).add(val2);
			map.get(val2).add(val1);
		}
	}

	public boolean contains(String letter)
	{
		return map.containsKey(letter);
	}

   public boolean connected(String src, String dest)
	{
		return connected(src, dest, "");
	}

   private boolean connected(String src, String dest, String placesUsed)
   { 
	  if(src.equals(dest))
	  {
		 return true;
	  }
	  if(placesUsed.contains(src))
	  {
		 return false;
	  }
	  placesUsed += src;
	  for(String s : map.get(src))
	  {
		 if(connected(s, dest, placesUsed))
		 {
			return true;
		 }
	  }
	  return false;
   }
   
   @Override
	public String toString()
	{
		String output = "";
		for(String s : map.keySet())
		{
			output += s + " " + map.get(s) + "\n";
		}
		return output;
	}
}