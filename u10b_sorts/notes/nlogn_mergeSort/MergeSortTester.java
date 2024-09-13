//selection sort tester

import static java.lang.System.*;
import java.util.Arrays;

public class MergeSortTester
{
   public static void main( String args[] )
   {
		int[] array = {39,6,11,23,18,3,20,5,57,15};

		out.println("before merge sort");
		out.println(Arrays.toString(array));

		MergeSortRecursive.mergeSort(array);

		out.println("\n\nafter merge sort");
		out.println(Arrays.toString(array));
	}
}