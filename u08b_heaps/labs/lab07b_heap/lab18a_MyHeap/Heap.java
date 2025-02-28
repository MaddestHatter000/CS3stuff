//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.ArrayList;
import static java.lang.System.*;

public class Heap
{
	private ArrayList<Integer> list;

	public Heap()
	{
      list = new ArrayList<Integer>();

	}

	public void add(int value)
	{
      //Add the new value to the array:
      list.add(value);

		//Reheapify!
      swapUp();
      
	}

   //Note that if you want to implement swapUp recursively,
   //you'll need to add a parameter to keep track of where you
   //are in the heap.
   private void swapUp()
   {
      int x = list.size()-1;
      while(x > 0)
      {
         if(list.get(x) > list.get((x-1)/2))
         {
            swap(x, (x-1)/2);
            x = (x-1)/2;
         }
         else
         {
            break;
         }
      }
	}

	public void remove( )
	{
      //Replace the root with the last element
      list.set(0, list.get(list.size()-1));
      
      //Remove the last element
      list.remove(list.size()-1);
      
      //Reheapify!
      swapDown();

	}

   //Note that if you want to implement swapDown recursively,
   //you'll need to add a parameter to keep track of where you
   //are in the heap.
	private void swapDown()
{
    int x = 0;
    int size = list.size();
    while (x * 2 + 1 < size) {
        int leftChild = x * 2 + 1;
        int rightChild = x * 2 + 2;
        int largerChild = leftChild;

        if (rightChild < size && list.get(rightChild) > list.get(leftChild)) {
            largerChild = rightChild;
        }

        if (list.get(x) >= list.get(largerChild)) {
            break;
        }

        swap(x, largerChild);
        x = largerChild;
    }
}
	
	private void swap(int start, int finish)
	{
      int temp = list.get(start);
      list.set(start, list.get(finish));
      list.set(finish, temp);	
	}

   public void print()
   {
      //out.println("PRINTING THE HEAP!\n");
      int x=0;
      for(int i=1; i<list.size(); i *= 2)
      {
         for(int s=1; s<list.size()-i; s++)
         {
            out.print(" ");
         }
         for(int j=0; j<=i-1 && x<list.size(); j++)
         {
            out.print(list.get(x++) + "  ");
         }
         out.println();
         if(x == list.size()-1)
         {
            out.print(list.get(x++) + "  ");
         }
      }
      out.println("\n");
   }

	public String toString()
	{
		return list.toString();
	}
}