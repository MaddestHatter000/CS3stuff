//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;

public class Relatives
{
	private Map<String,Set<String>> map;

	public Relatives()
	{
		map = new TreeMap<>();
	}

	public void setPersonRelative(String line)
	{
		String[] personRelative = line.split(" ");
		if(!map.containsKey(personRelative[0])){
			Set<String> relatives = new TreeSet<>();
			relatives.add(personRelative[1]);
			map.put(personRelative[0], relatives);
		}
		else{
			map.get(personRelative[0]).add(personRelative[1]);
		}
	}


	public String getRelatives(String person)
	{
		return map.get(person).toString();
	}


	public String toString()
	{
		String output="";
		for(Map.Entry<String, Set<String>> entry : map.entrySet()){
			output += entry.getKey() + " is related to ";
			for(String s : entry.getValue()){
				output += s + " ";
			}
			output += "\n";
		}
		return output;
	}
}