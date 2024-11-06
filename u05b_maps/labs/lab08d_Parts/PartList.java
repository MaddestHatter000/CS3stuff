//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class PartList
{
	private TreeMap<Part, Integer> partsMap;
	
	public PartList()
	{
		partsMap = new TreeMap<>();

	}
	
	public PartList(String fileName)
	{
		this();
		try
		{
			Scanner file = new Scanner(new File("lab08d.dat"));
			while(file.hasNextLine()){
				Part part = new Part(file.nextLine());
				if(partsMap.containsKey(part))
				{
					partsMap.put(part, partsMap.get(part) + 1);
				}
				else{
					partsMap.put(part, 1);
				}
			}
		}
		catch( IOException e )  //Most specific exceptions must be listed 1st
		{
			out.println(e);
		}
		catch( RuntimeException e )
		{
			out.println(e);
		}
		catch( Exception e )
		{
			out.println(e);
		}
		finally
		{
			//no code needed here
		}
	}
	
	public String toString()
	{
		String output="";
		for(Map.Entry<Part,Integer> entry : partsMap.entrySet()){
			output += entry.getKey().toString() + " - " + entry.getValue() + "\n";
		}
		return output;
	}
}