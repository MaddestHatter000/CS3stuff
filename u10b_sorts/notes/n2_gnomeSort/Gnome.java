// Java Program to implement Gnome Sort 

import java.util.Arrays; 
public class Gnome { 
	static void gnomeSort(int arr[], int n) 
	{ 
		int index = 0; 

		while (index < n) { 
			if (index == 0 || arr[index] >= arr[index - 1]) 
				index++; 
			else { 
            swap(arr, index, index - 1);
				index--; 
			} 
		} 
		return; 
	} 
   
   private static void swap(int arr[], int left, int right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
   }

	// Driver program to test above functions. 
	public static void main(String[] args) 
	{ 
		int arr[] = { 34, 2, 10, -9 }; 

		gnomeSort(arr, arr.length); 

		System.out.print("Sorted sequence after applying Gnome sort: "); 
		System.out.println(Arrays.toString(arr)); 
	} 
} 

// Code Contributed by Mohit Gupta_OMG 
