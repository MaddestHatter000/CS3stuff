import java.util.Arrays;

public class CountSort {
   public static int[] countSort(int[] inputArray) {
      int len = inputArray.length;
      int max = max(inputArray);
      int[] countArray = new int[max + 1];
   
      //Make a histogram:
      for (int i = 0; i < len; i++) {
         int num = inputArray[i];
         countArray[num]++;
      }
   
      //Compute the prefix sums for the counts in countArray.
      //I.e. calculate the partial sums, starting at the 2nd spot.
      for (int i = 1; i <= max; i++) {
         countArray[i] += countArray[i - 1];
      }
   
      int[] outputArray = new int[len];
   
      for (int i = len - 1; i >= 0; i--) {
         int num = inputArray[i];
         outputArray[countArray[num] - 1] = num;  //These two lines could be combined into:  outputArray[--countArray[num]] = num;
         countArray[num]--;
      }
   
      return outputArray;
   }

   private static int max(int[] inputArray)
   {
      int max = inputArray[0];
      for (int i = 0; i < inputArray.length; i++) {
         max = Math.max(max, inputArray[i]);
      }
      return max;
   }
      
   public static void main(String[] args) {
      int[] inputArray = {4, 3, 12, 1, 5, 5, 3, 9};
      int[] outputArray = countSort(inputArray);
   
      for (int i = 0; i < inputArray.length; i++) {
         System.out.print(outputArray[i] + " ");
      }
   }
}
