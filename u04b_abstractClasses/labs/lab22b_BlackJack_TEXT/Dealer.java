//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

// package BlackJack;

// import BlackJack.Card;
// import BlackJack.AbstractPlayer;
// import BlackJack.Deck;

import java.util.ArrayList;

public class Dealer extends AbstractPlayer
{
	
	
	
	
	//instance variable - Deck 
	private Deck deck;




	//constructors

	public Dealer()
	{
		deck = new Deck();
	}



	//method to shuffle
	public void shuffle()
	{
		deck.shuffle();
	}


	//method to deal a card

	public void deal()
	
	{
	}



	//hit method goes here
	public boolean hit()
	{

	}
}
