//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import static java.lang.System.*;

public class ListIteratorTest
{
	private ArrayList<String> list;
	private String toRemove, replaceWith;

	public ListIteratorTest(String line, String rem, String rep)
	{
		setTest(line, rem, rep);
	}

	public void setTest(String line, String rem, String rep)
	{
		list = new ArrayList<>();
		while(line.length() > 0){
			list.add(line.substring(0, 1));
			line = line.substring(1);
		}
		toRemove = rem;
		replaceWith = rep;
	}

	public void replace()
	{
		ListIterator<String> it = list.listIterator();
		while(it.hasNext()){
			if(it.next().equals(toRemove)){
				it.set(replaceWith);
			}
		}
	}

	public String toString()
	{
		return list.toString()+"\n\n";
	}
}