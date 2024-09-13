//� A+ Computer Science
// www.apluscompsci.com

//selection sort example

import static java.lang.System.*;

public class SelectionSortObjects
{
	public static void selectionSort(Comparable[] ray)
	{
	   //this loop includes the first term, since your first step is to find the smallest term,
	   //and it may or may not be in the first spot.
		for(int i=0; i< ray.length-1; i++)
		{
         //this loop finds the minimum of the unsorted part of the array
			int min = i;
			for(int j = i+1; j< ray.length; j++)
			{
			   if(ray[j].compareTo(ray[min])<0)  //flip the symbol - what happens??
					min = j;    //find location of smallest
			}

         //if the minimum isn't at the current spot it gets swapped to this spot.   
			if( min != i)	{
				Comparable temp = ray[min];
				ray[min] = ray[i];
				ray[i] = temp;   //put smallest in pos i
			}
		}
	}
}