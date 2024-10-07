//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorTest
{
	private ArrayList<String> list;
	private String toRemove;

	public IteratorTest(String line, String rem)
	{
		setTest(line, rem);
	}

	public void setTest(String line, String rem)
	{
		list = new ArrayList<>();
		while(line.length() > 0){
			list.add(line.substring(0, 1));
			line = line.substring(1);
		}
		toRemove = rem;
	}

	public void remove()
	{
		Iterator<String> it = list.listIterator();
		while(it.hasNext()){
			if(it.next().equals(toRemove)){
				it.remove();
			}
		}
	}

	public String toString()
	{
		String output = "";
		Iterator<String> it = list.listIterator();
		while(it.hasNext()){
			output += it.next();
		}
		return output;
	}
}