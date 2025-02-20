//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class ThingCount implements Comparable
{
	private int count;
	private Object thing;
	
	public ThingCount()
	{
		this(null, 0);
	}
	
	public ThingCount(Object thang, int cnt)
	{
		setThing(thang);
		setCount(cnt);
	}

	public void setThing(Object obj)
	{
		thing = obj;
	}
	
	public void setCount(int cnt)
	{
		count = cnt;
	}
	
	public Object getThing()
	{
		return thing;
	}

	public int getCount()
	{
		return count;
	}
	
	public boolean equals(Object obj)
	{
		ThingCount other = (ThingCount)obj;
		if (thing.equals(other.getThing()) && count == other.getCount())
			return true;
		return false;
	}
	
	public int compareTo(Object obj)
	{
		ThingCount other = (ThingCount)obj;
		if (thing.equals(other.getThing()) && count == other.getCount())
			return 0;
		if (count > other.getCount())
			return 1;
		return -1;		
	}
	
	public String toString()
	{
		return ""+thing + " - " + count;
	}
}