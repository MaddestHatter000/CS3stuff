//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class HistoList
{
	private ListNode front;

	public HistoList( )
	{
		front = null;
	}


	//ADDS NEW NODE TO THE FRONT OF THE LIST FOR LET IF IT DOES NOT EXIST.
	//IF IT EXISTS, IT BUMPS UP LET'S COUNT BY ONE
	public void add(Object obj)
	{
		ListNode current = front;
		while(current != null)
		{
			if(new ThingCount(obj, 0).equals(current.getValue()))
			{
				((ThingCount)current.getValue()).setCount(((ThingCount)current.getValue()).getCount() + 1);
				return;
			}
			current = current.getNext();
		}
		front = new ListNode(new ThingCount(obj, 1), front);
	}

	//RETURNS THE INDEX POSITION OF LET IN THE LIST
	public int indexOf(Object obj)
	{
		ThingCount thisThing = new ThingCount(obj, 0);
		int spot=0;
		ListNode current = front;
		while(current != null)
		{
			if(((ThingCount)current.getValue()).equals(thisThing))
			{
				return spot;
			}
			spot++;
			current = current.getNext();
		}
		return -1;
	}

	//RETURNS A REFERENCE TO THE NODE AT SPOT
	private ListNode nodeAt(int spot)
	{
		ListNode current=front;
		for(int i = 0; i <= spot; i++)
		{
			current = current.getNext();
		}
		return current;
	}

	//RETURNS THE LIST AS A BIG STRING
	public String toString()
	{
		String output = "";
		ListNode current = front;
		while(current != null)
		{
			output += current.getValue().toString() + " ";
			current = current.getNext();
		}
		return output;
	}
}