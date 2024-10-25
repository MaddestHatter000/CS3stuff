//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

// package BlackJack;

public class BlackJackCard extends Card
{
  	//constructors
	public BlackJackCard()
	{
		super();
	}
	public BlackJackCard(int f, String s)
	{
		super(f,s);
	}

  	public int getValue()
  	{
		if(getFace() == 1)
			return 11;
		if(getFace() > 10)
			return 10;
		return getFace();
  	}
  	
	public String toString()
	{
		return super.toString() + " | value = " + getValue();
	}
 }