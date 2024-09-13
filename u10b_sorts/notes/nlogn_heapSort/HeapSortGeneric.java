import java.util.ArrayList;
import static java.lang.System.*;

public class HeapSortGeneric
{
   private HeapSortGeneric() { }
	
   @SuppressWarnings("unchecked")
   public static <T extends Comparable<? super T>> void heapSort(T[] values)
   {
      for(int i = 1; i<values.length; i++)
      {
         swapUp(values, i);
      }
      for(int i=values.length-1; i>=1; i--)
      {
         swap(values, 0, i);
         swapDown(values, i-1);   		
      }	
   }
   
   public static <T extends Comparable<? super T>> void swapUp(T[] values, int bot)
   {
      int parent = (bot - 1) / 2;
      while(bot > 0   &&   values[parent].compareTo(values[bot]) < 0)
      {
         swap(values, parent, bot);
         bot = parent;
         parent = (bot - 1) / 2;
      }
   }
   
   private static <T extends Comparable<? super T>> void swapDown(T[] values, int bot)
   {
      int root = 0;
      while(root < bot)
      {
         int max = 0;
         int left = root * 2 + 1;
         int right = root * 2 + 2;
      
         if(left >= bot)  //it's a leaf
            break;
         //there's only a left child OR the left child is bigger
         if (right >= bot || values[left].compareTo(values[right]) > 0)
            max = left;
         else
            max = right;
      
         if (values[root].compareTo(values[max]) < 0)
         {
            swap(values, root, max);
            root = max;
         }
         else 
            break;
      }
   }
   
   private static <T extends Comparable<? super T>> void swap(T[] values, int first, int last)
   {
      T temp = values[first];
      values[first] = values[last];
      values[last] = temp;
   }
}