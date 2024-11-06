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

public class Acronyms
{
	private Map<String,String> acronymTable;

	public Acronyms()
	{
		acronymTable = new TreeMap<>();
	}

	public void putEntry(String entry)
	{
		String[] list = entry.split(" ");
		String value = "";
		for(int i = 2; i < list.length; i++){
			value += list[i] + " ";
		}
		acronymTable.put(list[0],value.substring(0,value.length()-1));
	}

	public String convert(String sent)
	{
		Scanner chop = new Scanner(sent);
		String output ="";
		while(chop.hasNext()){
			String word = chop.next();
			boolean containsPeriod = false;
			if(word.contains(".")){
				word = word.substring(0,word.length() - 1);
				containsPeriod = true;
			}
			if(acronymTable.containsKey(word)){
				output += acronymTable.get(word);
			}
			else{
				output += word;
			}
			if(containsPeriod){
				output += ".";
			}
			output += " ";
		}
		return output;
	}

	public String toString()
	{
		String output = "";
		for(Map.Entry<String,String> entry : acronymTable.entrySet()){
			output += entry.getKey() + " = " + entry.getValue() + "\n";
		}
		return output;
	}
}