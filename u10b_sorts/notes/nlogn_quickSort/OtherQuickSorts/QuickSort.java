//© A+ Computer Science
// www.apluscompsci.com

//quick sort example

import static java.lang.System.*;
import java.util.Arrays;

public class QuickSort
{
   private static int[] count = new int[1];

   public static void sort(int[] ray) {
      sort(ray, 0, ray.length);
   }

   public static void sort(int arr[], int beginIdx, int len) {
      if ( len <= 1 )
         return;
   
      final int endIdx = beginIdx+len-1;
   
       // Pivot selection
      final int pivotPos = beginIdx;  //+len/2;
      final int pivot = arr[pivotPos];
      swap(arr, pivotPos, endIdx);
   
       // partitioning
      int p = beginIdx;
      for(int i = beginIdx; i != endIdx; ++i) {
         if ( arr[i] <= pivot ) {
            swap(arr, i, p++);
            out.println(Arrays.toString(arr));
         }
      }
      swap(arr, p, endIdx);
      count[0]++;
      out.println(Arrays.toString(arr)+" pivot= "+pivot);
        // recursive calls
      sort(arr, beginIdx, p-beginIdx);
      sort(arr, p+1,  endIdx-p);
   }

   private static void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
   }
   
   /** Main method */
   public static void main(String[] args) {
      int[] array = { 7, 6, 10, 5, 9, 2, 1, 15, 7 }; //GFG
      //int[] array = {8, 7, 6, 5, 4, 1}; 
      int[] array = new int[] {26, 48, 12, 92, 28,  6, 33};
      //int[] array = new int[] {1, 12, 5, 26, 7, 14, 3, 7, 2};
      //int[] array = new int[] {26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26,
      //                         26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 
      //                         26, 26, 94, 94, 94, 94, 94}; //contains duplicates
   //          int[] array = new int[] {26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 
   //             26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 
   //             94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 
   //             9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 
   //             26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 
   //             94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 
   //             4, 9, 8, 7, 94, 94, 94, 94, 94}; //contains duplicates
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