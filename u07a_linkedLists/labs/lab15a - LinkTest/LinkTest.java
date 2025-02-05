//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.LinkedList;
import static java.lang.System.*;

public class LinkTest
{
	private LinkedList<Integer> list;

	public LinkTest()
	{
		list = new LinkedList<Integer>();
	}

	public LinkTest(int[] nums)
	{
		list = new LinkedList<Integer>();
		for(int num : nums)
		{
			list.add(num);
		}
	}

	public double getSum(  )
	{
		double total=0;
		for(int i : list)
		{
			total += i;
		}
		return total;
	}

	public double getAvg(  )
	{
		return getSum()/list.size();
	}

	public int getLargest()
	{
		int largest=Integer.MIN_VALUE;
		for(int i : list)
		{
			if(i>largest)
			{
				largest=i;
			}
		}
		return largest;
	}

	public int getSmallest()
	{
		int smallest=Integer.MAX_VALUE;
		for(int i : list)
		{
			if(i<smallest)
			{
				smallest=i;
			}
		}
		return smallest;
	}

	public String toString()
	{
		String output="";
		output += "Sum :: " + getSum() + "\n";
		output += "Avg :: " + getAvg() + "\n";
		output += "Smallest :: " + getSmallest() + "\n";
		output += "Largest :: " + getLargest() + "\n";
		return output;
	}
}