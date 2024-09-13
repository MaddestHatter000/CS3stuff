//© A+ Computer Science
// www.apluscompsci.com

//quick sort example

import static java.lang.System.*;
import java.util.Arrays;

public class QuickSort2
{
   public static void quickSort(Comparable[] ray) {
      quickSort(ray, 0, ray.length-1);
   }
   
   private static void quickSort(Comparable[] stuff, int low, int high)
   {
      if (low < high)
      {
         int p = partition(stuff, low, high);
         quickSort(stuff, low, p);
         quickSort(stuff, p+1, high);
      }
   }

   private static int partition(Comparable[] stuff, int low, int high) 
   {
      Comparable pivot = stuff[low]; 
      int bot = low-1; 
      int top = high+1;		
      while(bot<top) {	
         while (stuff[--top].compareTo(pivot) > 0) out.print(top+" "); 
         while (stuff[++bot].compareTo(pivot) < 0) out.print(bot+" ");
         out.println();
         if(bot >= top)
            return top;
         swap(stuff, bot, top);
      }
      return bot;
   }

   private static void swap(Comparable[] arr, int i, int j) {
      Comparable temp = arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
   }
}