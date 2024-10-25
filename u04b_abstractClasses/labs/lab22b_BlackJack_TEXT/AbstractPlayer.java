//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//package BlackJack;

//import java.util.ArrayList;
//import BlackJack.Card;

import java.util.ArrayList;

public abstract class AbstractPlayer implements Playerable
{
   private ArrayList<Card> hand;
   private int winCount;

   public AbstractPlayer()
   {
      hand = new ArrayList<>();
      winCount = 0;
   }


   public  void addCardToHand( Card temp )
   {
      hand.add(temp);
   }

   public  void resetHand( )
   {
      hand.removeAll(hand);

   }

   public  void setWinCount( int numwins )
   {
      winCount = numwins;

   }

   public int getWinCount() { return winCount; }

   public int getHandSize() { return hand.size(); }

   public int getHandValue()
   {
		//great example of polymorphism
      int total=0;
      for(int i = 0; i < hand.size(); i++){
         total += hand.get(i).getValue();
      }
      return total;
   }

   public String toString()
   {
      return "hand = " + hand.toString(); //+ " \n-  # wins " + winCount;
   }
}