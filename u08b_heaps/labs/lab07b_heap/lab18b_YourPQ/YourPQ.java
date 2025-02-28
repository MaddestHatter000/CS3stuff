//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;

public class YourPQ
{
	private Queue<Monster> pQueue;

	public YourPQ()
	{
		pQueue = new PriorityQueue<>();
	}

   //Use delegation to get the PriorityQueue object to actually
   //do the work for the add, getMin, & removeMin methods.
   public void add(Object obj)
	{
		pQueue.add((Monster)obj);

	}
	
	public Object getMin()
	{
		return pQueue.peek();
	}
	
	public Object removeMin()
	{
		return pQueue.remove();
	}
	
   //Be sure not to destroy the queue.
   //Make a copy using the PriorityQueue class's 
   //copy constructor and iterate through that.
	public String getNaturalOrder()
	{
      Queue<T> copy = pQueue;
		String output="";



		return output;		
	}

   @Override
	public String toString()
	{
		return pQueue.toString();
	}	
}