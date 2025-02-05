//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class ListFunHouseTwo
{
	private ListNode theList;
	
	public ListFunHouseTwo()
	{
		theList = null;
	}
	
	public void add(Comparable data)
	{
		theList = new ListNode(data, theList);
	}
	
	//this method will return the number of nodes present in list
	public int nodeCount()
	{
		int count = 0;
		ListNode list = theList;
		while(list != null)
		{
			list = list.getNext();
			count++;
		}
   		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node at the front of the list.  Once finished, the first node will occur twice.
	public void doubleFirst()
	{
		theList = new ListNode(theList.getValue(), theList);
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public void doubleLast()
	{
		ListNode current = theList;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(new ListNode(current.getValue(), null));
	}
	
	//method skipEveryOther will remove every other node
	public void skipEveryOther()
	{
		int counter = 0;
		ListNode prev = null;
		while(theList != null)
		{
			if(counter % 2 == 1)
			{
				prev.setNext(theList.getNext());
			}
			prev = theList;
			theList = theList.getNext();
			counter++;
		}
	}

	//this method will set the value of every xth node in the list
	public void setXthNode(int x, Comparable value)
	{



	
	}	

	//this method will remove every xth node in the list
	public void removeXthNode(int x)
	{


	
	}		
	//this method will return a String containing the entire list
   public String toString()
   {
   	String output="";
	ListNode list = theList;
	while(list != null)
   	{
	   output += list.getValue() + " ";
	   list = list.getNext();
   	}
   	return output;
   }			
	
}