/* Thanks to metajungle:  https://gist.github.com/metajungle/62bddff55708bf7a3da7  */
import java.util.Arrays;
import static java.lang.System.*;

public class QuickSortArray {

   static int[] count = new int[1];
   
    /* Quick sort the given array in ascending order */
   public static void sort(int[] array) {
      sort(array, 0, array.length - 1);
   }


   public static void sort1a(int array[], int start, int end)
   {
      int bot = start;                          // index of left-to-right scan
      int top = end;                            // index of right-to-left scan
   
      if (end - start >= 1)                     // check that there are at least two elements to sort
      {                                         // could’ve been written as if (end > start)
         int pivot = array[bot];              // set the pivot as the first element in the partition
      
         while (bot < top) {                    // while the scan indices from left and right have not met,
            while (bot < top && array[bot] <= pivot)  // from the left, look for the first
               bot++;                                  // element greater than the pivot
            while (bot <= top && array[top] >= pivot) // from the right, look for the first
               top--;                                  // element not greater than the pivot
            if (bot < top)                             // if the left seek index is still smaller than
               swap(array, bot, top);                  // the right index, swap the corresponding elements
         }
         swap(array, start, top);          // after the indices have crossed, swap the last element in
                                        // the left partition with the pivot 
         System.out.println("pivot = " + pivot + "\t" + Arrays.toString(array)); 
         count[0]++;                                       
         sort(array, start, top - 1); // quicksort the left partition
         sort(array, top + 1, end);   // quicksort the right partition
      }
   }
   
   public static void sort1b(int array[], int low, int high)
   {
      int i = low;                          // index of left-to-right scan
      int j = high;                            // index of right-to-left scan
   
      if (low < high)                     // check that there are at least two elements to sort
      {                                         // could’ve been written as if (end > start)
         int pivot = array[low];              // set the pivot as the first element in the partition
      
         while (i < j) {                    // while the scan indices from left and right have not met,
            while (i < j && array[i] <= pivot)  // from the left, look for the first
               i++;                                  // element greater than the pivot
            while (i <= j && array[j] >= pivot) // from the right, look for the first
               j--;                                  // element not greater than the pivot
            if (i < j)                             // if the left seek index is still smaller than
               swap(array, i, j);                  // the right index, swap the corresponding elements
         }
         swap(array, low, j);          // after the indices have crossed, swap the last element in
                                        // the left partition with the pivot 
         System.out.println("pivot = " + pivot + "\t" + Arrays.toString(array)); 
         count[0]++;                                       
         sort(array, low, j - 1); // quicksort the left partition
         sort(array, j + 1, high);   // quicksort the right partition
      }
   }
   
         
    /**
     * Quick sort the given array starting from index {@code low} to {@code high} 
     * Uses the first element in the array as the pivot 
     */
   private static void sort(int[] array, int low, int high) {
      if (low < high) {
         //System.out.print("pivot = " + array[low] + "\t");
         int p = partition(array, low, high);
         //System.out.println(Arrays.toString(array));
         // sort partitions 
         sort(array, low, p - 1);
         sort(array, p + 1, high);
      }
   }
     
   //Doesn't move elements equal to pivot. Much faster!
   private static int partition(int[] array, int low, int high) {
      int pivot = array[low]; // select pivot element (left-most)
      int i = low;
      int j = high;
      // partition and shuffle around pivot
      while (i < j) {
         // scan right: find elements greater than pivot 
         while (i < j && array[i] <= pivot) {  i += 1;  }                                 // out.print("i=" + i + " ");
         // scan left: find elements smaller than pivot
         while (i <= j && array[j] >= pivot) {  j -= 1;  }                               // out.print("j=" + j + " ");
         if (i < j) {
            swap(array, i, j);  // swap around pivot
         }
      }
      swap(array, low, j); // put pivot in correct place
      count[0]++;
      return j; // return location of pivot
   }
   
   private static int partition2(int[] array, int low, int high) {
      int pivot = array[low]; // select pivot element (left-most)
      int i = low;
      int j = high;
      // partition and shuffle around pivot
      while (i < j) {
         i += 1;  // advance past the pivot. 
         // scan right: find elements NOT SMALLER THAN the pivot 
         while (i < j && array[i] < pivot) { i += 1; } 
         // scan left: find elements NOT GREATER THAN the pivot
         while (i < j && array[j] > pivot) { j -= 1; }  
         if (i < j) {   
            swap(array, i, j);  // swap around pivot
         }
      }
      swap(array, low, j); // put pivot in correct place
      count[0]++;
      return j; // return location of pivot
   }
    
   
   private static int partition3(int[] array, int low, int high) {
      int pivot = array[low]; // select pivot element (left-most)
      int i = low;
      int j = high;
      // partition and shuffle around pivot
      while (i < j) {
         // scan right: find elements greater than pivot 
         while (i < j && array[i] <= pivot) { i += 1; }
         // scan left: find elements smaller than pivot
         while (i <= j && array[j] > pivot) { j -= 1; }
         if (i < j) {
            swap(array, i, j);  // swap around pivot
         }
      }
      swap(array, low, j); // put pivot in correct place
      count[0]++;
      return j; // return location of pivot
   }
     
   /**
    * Swap elements at indexes {@code i} and {@code j} in the give array 
    */
   private static void swap(int[] array, int i, int j) {
      if (i >= 0 && j >= 0 && i < array.length && j < array.length) {
         int tmp = array[i];
         array[i] = array[j];
         array[j] = tmp;
      }
   }

    /** Main method */
   public static void main(String[] args) {
      //int[] array = {8, 7, 6, 5, 4, 1}; 
      //int[] array = new int[] {26, 48, 12, 92, 28,  6, 33};
      //int[] array = new int[] {1, 12, 5, 26, 7, 14, 3, 7, 2};
      //int[] array = new int[] {26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26,
      //                         26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 
      //                         26, 26, 94, 94, 94, 94, 94}; //contains duplicates
      int[] array = new int[] {26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 
               26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 
               94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 
               9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 
               26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 
               94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 
               4, 9, 8, 7, 94, 94, 94, 94, 94}; //contains duplicates
      //int[] array = new int[] {14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7};
      //int[] array = new int[] {14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 64, 57, 29, 28, 74, 12, 32, 67, 98, 39, 71, 78, 79, 10, 21};
      System.out.println("Original: " + Arrays.toString(array));
      sort(array);
      System.out.println("count = " + count[0]);
      System.out.println("Sorted:   " + Arrays.toString(array) + "\n");
      count[0] = 0;
      sort(array);
      System.out.println("count = " + count[0]);
      System.out.println("Sorted:   " + Arrays.toString(array));
   }

}