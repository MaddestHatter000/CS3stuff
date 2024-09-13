import static java.lang.System.*;
import java.util.Arrays;

// Merge method uses a new temp array for each merge which is just 
// large enough to store the elements being merged in that step.
public class MergeSortRecur_SmallTempArray
{
   public static void sort(int[] a)
   { sort(a, 0, a.length - 1); }
   
   private static void sort(int[] a, int low, int high)
   {
      if (low < high)
      {
         int mid = (low + high) / 2;
         sort(a, low, mid);
         sort(a, mid + 1, high);
         merge(a, low, high);
      }
   }

   /** Precondition: a[low]...a[mid] is sorted && a[mid+1]...a[high] is sorted
    *  Postcondition: a[low]...a[high] is sorted */
   private static void merge(int[] a, int low, int high)
   {
      int mid = (low + high) / 2; //This was a parameter in CB version.
      int[] b = new int[mid + 1 - low];
      for(int i = 0; i < b.length; i++)
         b[i] = a[i + low];
   
      int aLowerIndex = low, bIndex = 0, aHigherIndex = mid + 1;
      while (aLowerIndex < aHigherIndex && aHigherIndex <= high)
      {
         if (a[aHigherIndex] < b[bIndex])
            a[aLowerIndex++] = a[aHigherIndex++];
         else
            a[aLowerIndex++] = b[bIndex++];
      }
   
      while (aLowerIndex < aHigherIndex)
         a[aLowerIndex++] = b[bIndex++];
   }
}