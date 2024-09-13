/* Thanks to metajungle:  https://gist.github.com/metajungle/62bddff55708bf7a3da7  */
import java.util.*;

public class QuickSortList {

   static int[] count = new int[1];

    /* Quick sort the given array in ascending order */
   public static <T extends Comparable<T>> void sort(List<T> list) {
      sort(list, 0, list.size() - 1);
   }
    
    /**
     * Quick sort the given array starting from index {@code low} to {@code high} 
     * Uses the first element in the array as the pivot 
     */
   private static <T extends Comparable<T>> void sort(List<T> list, int low, int high) {
      if (low < high) {
         int p = partition(list, low, high);
         System.out.println("pivot = " + list.get(p) + "\t" + list);
         // sort partitions 
         sort(list, low, p - 1);
         sort(list, p + 1, high);
      }
   }
    
   private static <T extends Comparable<T>> int partition(List<T> list, int low, int high) {
      T pivot = list.get(low); // select pivot element (left-most)
      int i = low;
      int j = high;
      // partition and shuffle around pivot
      while (i < j) {
         // scan right: find elements greater than pivot 
         while (i < j && list.get(i).compareTo(pivot) <= 0) { i += 1; }
         // scan left: find elements smaller than pivot
         while (i <= j && list.get(j).compareTo(pivot) >= 0) { j -= 1; }
         if (i < j) {
            swap(list, i, j);  // swap around pivot
         }
      }
      swap(list, low, j); // put pivot in correct place
      count[0]++;
      return j; // return location of pivot
   }
    
    /**
     * Swap elements at indexes {@code i} and {@code j} in the give array
     */
   private static <T extends Comparable<T>> void swap(List<T> list, int i, int j) {
      if (i >= 0 && j >= 0 && i < list.size() && j <  list.size()) {
         T temp = list.get(i);
         list.set(i, list.get(j));
         list.set(j, temp);
      }
   }

    /**
     * Main method 
     * 
     * @param args
     */
   public static void main(String[] args) {
      //int[] array = new int[] {14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7};
      Integer[] array = new Integer[] {14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 64, 57, 29, 28, 74, 12, 32, 67, 98, 39, 71, 78, 79, 10, 21};
      ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
      System.out.println("Original: " + list);
      sort(list);
      System.out.println("count = " + count[0]);
      System.out.println("Sorted:   " + list + "\n");
      sort(list);
      System.out.println("count = " + count[0]);
      System.out.println("Sorted:   " + list);
   }

}