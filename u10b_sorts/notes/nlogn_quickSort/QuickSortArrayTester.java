//© A+ Computer Science
// www.apluscompsci.com

//selection sort tester

import static java.lang.System.*;
import java.util.Arrays;

public class QuickSortArrayTester
{
   public static void main(String... args) {
      int[] array = {8, 7, 6, 5, 4, 1}; 
      //int[] array = {26, 48, 12, 92, 28,  6, 33};
      //int[] array = {1, 12, 5, 26, 7, 14, 3, 7, 2};
      //int[] array = {26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26,
      //              26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 
      //              26, 26, 94, 94, 94, 94, 94}; //contains duplicates
//       int[] array = new int[] {26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 
//                26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 
//                94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 
//                9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 
//                26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 
//                94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 
//                4, 9, 8, 7, 94, 94, 94, 94, 94}; //contains duplicates
      //int[] array = new int[] {14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7};
      //int[] array = new int[] {14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 64, 57, 29, 28, 74, 12, 32, 67, 98, 39, 71, 78, 79, 10, 21};
      System.out.println("Original: " + Arrays.toString(array));
      QuickSortArray.sort(array);
      System.out.println("count = " + QuickSortArray.count[0]);
      System.out.println("Sorted:   " + Arrays.toString(array) + "\n");
      QuickSortArray.count[0] = 0;
      QuickSortArray.sort(array);
      System.out.println("count = " + QuickSortArray.count[0]);
      System.out.println("Sorted:   " + Arrays.toString(array));
	}
}