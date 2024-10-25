//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Histogram
{
	private Map<String,Integer> histogram;

	public Histogram()
	{
		histogram = new TreeMap<>();
	}

	public Histogram(String sent)
	{
		setSentence(sent);
	}
	
	public void setSentence(String sent)
	{
		Scanner scan = new Scanner(sent);
		histogram = new TreeMap<>();
		while(scan.hasNextLine()){
			String i = scan.next();
			if(!histogram.containsKey(i))
				histogram.put(i, 1);
			else
				histogram.put(i, histogram.get(i) + 1);
		}
		scan.close();
	}

	public String toString()
	{
		String output= "";
		for(Map.Entry<String, Integer>entry : histogram.entrySet())
		{	
			output += entry.getKey() + "   ";
			for(int i = 0; i < entry.getValue(); i++)
			{
				output += "*";
			}
			output += "\n";
		}

		return output+"\n\n";
	}
}