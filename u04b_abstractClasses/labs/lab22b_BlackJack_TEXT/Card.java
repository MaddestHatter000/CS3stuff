//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

// package BlackJack;

public abstract class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;

  	//constructors
	Card(){
		setSuit("");
		setFace(0);
	}
	Card(int f, String s){
		setSuit(s);
		setFace(f);
	}


	// modifiers
	public void setSuit(String s){
		suit = s;
	}

	public void setFace(int f){
		face = f;
	}


 

  	//accessors
	public String getSuit(){
		return suit;
	}

	public int getFace(){
		return face;
	}

	public abstract int getValue();



	public boolean equals(Object obj)
	{
		if(!(obj instanceof Card))
			return false;
		return ((Card)obj).getSuit().equals(suit) && ((Card)obj).getFace() == face;
	
	}

  	//toString
	public String toString(){
		return FACES[face] + " of " + suit;
	}
  	
 }