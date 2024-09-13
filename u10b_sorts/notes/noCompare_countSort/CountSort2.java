import java.util.*;

public class CountSort2 {
   public static void countSort(ArrayList<Integer> list) {
      int max_val = Collections.max(list);
      int[] counts = new int[max_val + 1];
   
      while (list.size() > 0) {
         int num = list.remove(list.size()-1);
         counts[num] += 1;
      }
   
      for (int i=0; i<counts.length; ++i) {
         while (counts[i] > 0) {
            list.add(i);
            counts[i] -= 1;
         }
      }
   }
      
   public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      Collections.addAll(list, 4, 3, 12, 1, 5, 5, 3, 9);
      countSort(list);
   
      for (Integer num : list) {
         System.out.print(num + " ");
      }
   }
}
