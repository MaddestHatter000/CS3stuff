import java.util.ArrayList;
import static java.lang.System.*;

public class HeapSort
{
   /* This is to prevent creation of a HeapSort object.
    * This is because all methods are static methods and 
    * should be called using the class name and not an 
    * object reference.
    */
   private HeapSort() { }
	
   public static void heapSort(int[] nums)
   {
      for(int i = 1; i<nums.length; i++)
      {
         swapUp(nums, i);  // <--specifies the BOTTOM, which is
      }                    //    where swapping up STARTs.
      for(int i=nums.length-1; i>=1; i--)
      {
         swap(nums, 0, i);     
         swapDown(nums, i-1); // <--specifies the BOTTOM, which is  		
      }	                     //    where swapping down STOPs.
   }
   
   private static void swapUp1(int[] nums, int bot)
   {
      int parent = (bot - 1) / 2;
      while(bot > 0   &&   nums[parent] < nums[bot])
      {
         swap(nums, parent, bot);
         bot = parent;
         parent = (bot - 1) / 2;
      }
   }
      
   private static void swapUp(int[] nums, int bot)
   {
      while(bot > 0)
      {
         int parent = (bot - 1) / 2;
         if(nums[parent] < nums[bot])
         {
            swap(nums, parent, bot);
            bot = parent;
         }
         else{
            break;
         }
      }
   }
   
   private static void swapDown(int[] nums, int bot)
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
         if (right >= bot || nums[left] > nums[right])
            max = left;
         else
            max = right;
      
         if (nums[root] < nums[max])
         {
            swap(nums, root, max);
            root = max;
         }
         else 
            break;
      }
   }
   
   private static void swap(int[] nums, int first, int last)
   {
      Integer temp = nums[first];
      nums[first] = nums[last];
      nums[last] = temp;
   }
}