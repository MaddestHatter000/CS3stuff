import static java.lang.System.*;
import java.util.*;

public class InsertionSort
{
   // Linear search to find insertion point, and shift to place element.
   // Both a are simultaenously. O(n) comparisons and moves
   public static void insertionSort( int[] ray)
   {
      for(int i=1; i< ray.length; ++i)
      {
           //out.println("i = "+i+"\tray["+i+"] = "+ray[i]);       
         int val = ray[i];
         int j=i;
         while(j>0 && val<ray[j-1])
         {         
            ray[j]=ray[j-1];
            j--;
         }
         ray[j]=val;
           //out.println("ray = "+Arrays.toString(ray)+"\n");         
      }
   }	
   
   // Naive Swap
   public static void insertionSort2( int[] ray)
   {
      for(int i=1; i< ray.length; ++i)
      {
           //out.println("i = "+i+"\tray["+i+"] = "+ray[i]);       
         int val = ray[i];
         int j=i;
         while(j>0 && val<ray[j-1])
         {  int temp=ray[j];       
            ray[j]=ray[j-1];
            ray[j-1]=temp;
            j--;
         }
           //out.println("ray = "+Arrays.toString(ray)+"\n");         
      }
   }
   
   // Uses BinarySearch to find insertion point, then shifts to insert
   // O(log n) comparisons and O(n) shifts makes it more efficient
   public static void insertionSort3( int[] ray)
   {
   	  //This loop starts by adding the second entry to the sorted part of the array
   	  //Then it Inserts it in the appropriate spot in the array by finding that
   	  //spot using binary search, storing entry that is to be inserted in a temporary
   	  //variable, then shifting every entry to the right that needs to be moved, 
   	  //and then inserting the value by copying it from the temporary variable into 
   	  //its proper location.
      for (int i=1; i< ray.length; ++i){
      	 //this is the binary search
         int bot=0, top=i-1;
            //out.println("i = "+i+"\tray["+i+"] = "+ray[i]);
            //out.println("before while loop, bottom = "+bot+"\ttop = "+top);       
         while (bot<=top){
            int mid=(bot+top)/2;
            if (ray[mid]<ray[i])
               bot=mid+1;
            else top=mid-1;
         }
           //out.println("after while loop, bottom = "+bot+"\ttop = "+top);
         
         //store the value temporarily
         int temp = ray[i];
         //shift values over
         for (int j=i; j>bot; --j)
            ray[j]=ray[j-1];
         //ArrayCopy is actually faster:
         //System.arraycopy(ray,bot,ray,bot+1,i-bot);
         
         //insert the value
         ray[bot]=temp;
            //out.println("ray = "+Arrays.toString(ray)+"\n");
      }
   }
   
   
   // Uses BinarySearch to find insertion point, then shifts to insert
   // O(log n) comparisons and O(n) shifts makes it more efficient
   public static void insertionSort4( int[] ray)
   {
   	  //This loop starts by adding the second entry to the sorted part of the array
   	  //Then it Inserts it in the appropriate spot in the array by finding that
   	  //spot using binary search, storing entry that is to be inserted in a temporary
   	  //variable, then shifting every entry to the right that needs to be moved, 
   	  //and then inserting the value by copying it from the temporary variable into 
   	  //its proper location.
      for (int i=1; i< ray.length; ++i){
      	 //this is the binary search
         int bot=0, top=i-1;
            //out.println("i = "+i+"\tray["+i+"] = "+ray[i]);
            //out.println("before while loop, bottom = "+bot+"\ttop = "+top);       
         while (bot<=top){
            int mid=(bot+top)/2;
            if (ray[mid]<ray[i])
               bot=mid+1;
            else top=mid-1;
         }
           //out.println("after while loop, bottom = "+bot+"\ttop = "+top);
         
         //store the value temporarily
         int temp = ray[i];
         //shift values over
         //ArrayCopy is actually faster:
         System.arraycopy(ray,bot,ray,bot+1,i-bot);
         
         //insert the value
         ray[bot]=temp;
            //out.println("ray = "+Arrays.toString(ray)+"\n");
      }
   }

}
