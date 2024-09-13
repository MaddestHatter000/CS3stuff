import static java.lang.System.*;
import java.util.*;

public class QuickSortListTester
{
   public static void main(String... args) {
      //Integer[] array = {8, 7, 6, 5, 4, 1}; 
      //Integer[] array = {26, 48, 12, 92, 28,  6, 33};
      //Integer[] array = {1, 12, 5, 26, 7, 14, 3, 7, 2};
      //Integer[] array = {26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26,
      //              26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 
      //              26, 26, 94, 94, 94, 94, 94}; //contains duplicates
      Integer[] array = {26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 
                  26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 
                  94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 
                  9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 
                  26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 
                  94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 
                  4, 9, 8, 7, 94, 94, 94, 94, 94}; //contains duplicates
      //Integer[] array = {14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7};
      //Integer[] array = {14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 64, 57, 29, 28, 74, 12, 32, 67, 98, 39, 71, 78, 79, 10, 21};
      ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
      System.out.println("Original: " + list);
      QuickSortList.sort(list);
      System.out.println("count = " + QuickSortList.count[0]);
      System.out.println("Sorted:   " + list + "\n");
      QuickSortList.count[0] = 0;
      QuickSortList.sort(list);
      System.out.println("count = " + QuickSortList.count[0]);
      System.out.println("Sorted:   " + list);
   }
}