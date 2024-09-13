//� A+ Computer Science
// www.apluscompsci.com

//selection sort tester

import static java.lang.System.*;
import java.util.Arrays;

public class SelectionSortTester
{
   public static void main( String args[] )
   {
		int[] array1 = {39,6,11,23,18,3,20,5,57,15}; //len=10

		out.println("array1 before selection sort");
		out.println(Arrays.toString(array1));

		SelectionSort.selectionSort(array1);

		out.println("\n\narray1 after selection sort");
		out.println(Arrays.toString(array1));
		out.println("\n\n");		
		
		Integer[] array2 = {39,6,11,23,18,3,20,5,57,15};

		out.println("array2 before selection sort");
		out.println(Arrays.toString(array2));

		SelectionSort.selectionSort(array2);

		out.println("\n\narray2 after selection sort");
		out.println(Arrays.toString(array2));
		out.println("\n\n");
		
		String[] array3 = {"art","zen","plus","Carl","Antler","question"};

		out.println("array3 before selection sort");
		out.println(Arrays.toString(array3));

		SelectionSort.selectionSort(array3);

		out.println("\n\narray3 after selection sort");
		out.println(Arrays.toString(array3));
		out.println("\n\n");						
	}
}