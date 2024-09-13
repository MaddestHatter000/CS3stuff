import static java.lang.System.*;
import java.util.*;

public class HeapSortComparableRunner
{
   public static void main ( String[] args )
   {
      Comparable[] nums = {99,2,8,75,10,7}; //,9,17,5,3,4,1,11,1};
      System.out.println(Arrays.toString(nums));
      HeapSortComparable.heapSort(nums);
      System.out.println(Arrays.toString(nums) + "\n");
   	/*
      nums = new Comparable[] {-3,28,18,5,3,17,29,6,5,3,4,1,11,1};
      System.out.println(Arrays.toString(nums));
      HeapSort.heapSort(nums);
      System.out.println(Arrays.toString(nums));
      */
   }
}