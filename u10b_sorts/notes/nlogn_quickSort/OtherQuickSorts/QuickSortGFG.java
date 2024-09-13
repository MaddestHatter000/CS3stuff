import java.util.Arrays;
import static java.lang.System.*;

class QuickSortGFG {
   private static int[] count = new int[1];

   public static void quickSort(int[] arr) {
      int n = arr.length;
      quickSort(arr, 0, n - 1);
   }

	/* The main function that implements QuickSort
	arr[] --> Array to be sorted,
	low --> Starting index,
	high --> Ending index */
   static void quickSort(int arr[], int low, int high)
   {
   	// If low is lesser than high
      if (low < high) {
      	// idx is index of pivot element which is at its
      	// sorted position
         int idx = partition(arr, low, high);
      
      	// Separately sort elements before
      	// partition and after partition
         quickSort(arr, low, idx - 1);
         quickSort(arr, idx + 1, high);
      }
   }
     
	/* This function takes first element as pivot, the
	function places the pivot element(first element) on its
	sorted position and all the element lesser than pivot
	will placed left to it, and all the element greater than
	pivot placed right to it.*/
   static int partition(int arr[], int low, int high)
   {
   	// First element as pivot
      int pivot = arr[low];
      int k = high;
      for (int i = high; i > low; i--) {
         if (arr[i] > pivot)
            swap(arr, i, k--);
      }
      swap(arr, low, k);
      count[0]++;
      //out.println(Arrays.toString(arr)+" pivot= "+pivot);      
   	// As we got pivot element index is end
   	// now pivot element is at its sorted position
   	// return pivot element index (end)
      return k;
   }

	// Function to swap two elements
   public static void swap(int[] arr, int i, int j)
   {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }

	/* Function to print an array */
   static void printArray(int arr[])
   {
      int size = arr.length;
      int i;
      for (i = 0; i < size; i++)
         System.out.print(arr[i] + " ");
      System.out.println();
   }

	// Driver Code
   public static void main(String args[])
   {
      //int[] array = { 7, 6, 10, 5, 9, 2, 1, 15, 7 }; //GFG
      int[] array = new int[] {26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 
               26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 
               94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 
               9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 
               26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 
               94, 94, 14, 5, 2, 1, 15, 6, 16, 4, 9, 8, 7, 94, 94, 94, 94, 94, 26, 26, 26, 26, 26, 26, 94, 94, 94, 94, 94, 14, 5, 2, 1, 15, 6, 16, 
               4, 9, 8, 7, 94, 94, 94, 94, 94}; //contains duplicates
      System.out.println("Original array");
      System.out.println(Arrays.toString(array));
      quickSort(array);
      System.out.println("count = " + count[0]);
      System.out.println("Sorted array");
      System.out.println(Arrays.toString(array));
      count[0] = 0;
      quickSort(array);
      System.out.println("count = " + count[0]);
      System.out.println("Sorted array");
      System.out.println(Arrays.toString(array));   }
}
