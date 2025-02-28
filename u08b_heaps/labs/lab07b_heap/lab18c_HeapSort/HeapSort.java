//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

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
      for(int i = nums.length / 2 - 1; i >= 0; i--)
      {
         swapDown(nums, i, nums.length);
      }
      
      for(int i = nums.length - 1; i > 0; i--)
      {
         swap(nums, 0, i);
         swapDown(nums, 0, i);
      }
   }
   
   private static void swapUp(int[] nums, int bot)
   {
      int parent = (bot - 1) / 2;
      if(nums[bot] > nums[parent])
      {
         swap(nums, bot, parent);
         swapUp(nums, parent);
      }
   }

   private static void swapDown(int[] nums, int bot, int size)
   {
      int left = 2 * bot + 1;
      int right = 2 * bot + 2;
      int max = bot;
      
      if(left < size && nums[left] > nums[max])
      {
         max = left;
      }
      
      if(right < size && nums[right] > nums[max])
      {
         max = right;
      }
      
      if(max != bot)
      {
         swap(nums, bot, max);
         swapDown(nums, max, size);
      }
   }
   
   private static void swap(int[] nums, int first, int last)
   {
      int temp = nums[first];
      nums[first] = nums[last];
      nums[last] = temp;
   }
}