import java.util.ArrayList;
import static java.lang.System.*;

public class HeapSortNonStatic
{
   private ArrayList<Integer> list;

   public HeapSort()
   {
      list = new ArrayList<Integer>();
   }

   public void heapSort(int[] nums)
   {
      for(int item : nums)
      {
         list.add(item);
      }
      for(int i = 1; i<nums.length; i++)
      {
         swapUp(i);            // <--specifies the bottom,
                              //    i.e. where to START swapping up.
      }
      out.println("After swapUp: " + list);
      for(int i=list.size()-1; i>=1; i--)
      {
         swap(0, i);
         swapDown(i-1);        // <--specifies the bottom,
         out.println(list);    //    i.e. where to STOP swapping down.
      }   	
   }

   public void swapUp(int bot)
   {
      int parent = (bot - 1) / 2;
      while(bot > 0   &&   list.get(parent) <= list.get(bot))
      {
         swap(parent, bot);
         bot = parent;
         parent = (bot - 1) / 2;
      }
   }
   
   public void swapUp2(int bot)
   {
      while(bot > 0)
      {
         int parent = (bot - 1) / 2;
         if(list.get(parent) < list.get(bot))
         {
            swap(parent, bot);
            bot=parent;
         }
         else{
            break;
         }
      }
   }

   public void swapDown(int bot)
   {
      int root=0;
      while(root < bot)
      {
         int max=0;
         int left = root * 2 + 1;
         int right = root * 2 + 2;
      
         if(left < bot)
         {
            if(right < bot)
            {
               if (list.get(left) <= list.get(right))
               {
                  max = right;
               }
               else{
                  max = left;
               }
            }
            else
               max = left;
         }
         else 
            break;
      
         if (list.get(root) < list.get(max))
         {
            swap(root, max);
            root = max;
         }
         else 
            break;
      }
   }
   
   private void swap(int first, int last)
   {
      Integer temp = list.get(first);
      list.set(first, list.get(last));
      list.set(last, temp);
   }

   public String toString()
   {
      return list.toString();
   }
}