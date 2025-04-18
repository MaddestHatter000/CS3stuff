//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

// package BlackJack;

// import BlackJack.Card;

public interface Playerable
{
   public void addCardToHand( Card temp );

   public void resetHand();

   public boolean hit();

   public void setWinCount( int numWins );

   public int getWinCount();

   public int getHandSize();

   public int getHandValue();
}