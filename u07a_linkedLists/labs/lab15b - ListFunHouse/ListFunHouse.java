//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class ListFunHouse
{
	//this method will print the entire list on the screen
   public static void print(ListNode list)
   {
		ListNode i = list;
		while (i != null)
		{
			out.print(i.getValue() + " ");
			i = i.getNext();
		}
   }		
	
	//this method will return the number of nodes present in list
	public static int nodeCount(ListNode list)
	{
		int count = 0;
		ListNode i = list;
		while (i != null)
		{
			count++;
			i = i.getNext();
		}
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list)
	{
		ListNode first = new ListNode(list.getValue(), list.getNext());
		list.setNext(first);
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public static void doubleLast(ListNode list)
	{
   		ListNode prev=null;
		ListNode i = list;
		while (i != null)
		{
			prev = i;
			i = i.getNext();
		}
		prev.setNext(new ListNode(prev.getValue(), null));
	}
		
	//method skipEveryOther will remove every other node
	public static void skipEveryOther(ListNode list)
	{
		ListNode prev = null;
		ListNode i = list;
		while (i != null)
		{
			if (prev != null)
			{
				prev.setNext(i.getNext());
			}
			prev = i;
			i = i.getNext();
		}
	}

	//this method will set the value of every xth node in the list
	public static void setEveryXthNode(ListNode list, int x, Comparable value)
	{
		int count=1;
		ListNode temp = null;
		ListNode i = list;
		while(i != null)
		{
			if(count % x == 0)
			{
				temp.setNext(new ListNode(value, i.getNext()));
			}
			else
			temp = i;
			i = i.getNext();
			count++;
		}
	}	

	//this method will remove every xth node in the list
   //Assume x > 1
	public static void removeEveryXthNode(ListNode list, int x)
	{
		int count=1;
		ListNode temp = null;
		ListNode i = list;
		while(i != null)
		{
			if(count % x == 0)
			{
				temp.setNext(i.getNext());
			}
			temp = i;
			i = i.getNext();
			count++;
		}
	}		
}