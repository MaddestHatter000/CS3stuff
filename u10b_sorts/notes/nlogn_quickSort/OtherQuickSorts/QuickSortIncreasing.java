import java.util.Arrays;
import static java.lang.System.*;

//Which lines of code would have to change to switch the sort from increasing to decreasing?
public class QuickSortIncreasing
{
   public static void quickSort(int[] a) {
      quickSort(a,0,a.length-1);
   }
   public static void quickSort(int[] a, int lo, int hi) {
   	  //statement 1
   	  if(lo>=hi) return;
   	  int left=lo;
   	  int right=hi;
   	  //statement 2   	  
   	  int pivot=a[(lo+hi)/2];
   	  
   	  while(left<right) {
   	    //statement 3   	  	
   	  	while(a[left]<pivot) left++;
   	    //statement 4   	  	
   	  	while(pivot<a[right]) right--;
   	    //statement 5   	  	
   	  	if(left<=right) {
   	  		swap(a,left,right);
   	  		left++;
   	  		right--;
   	  	}
   	  }
      //statement 6      	  
   	  quickSort(a, lo, right);
   	  quickSort(a, left, hi);
   }
   
   public static void swap(int a[], int i, int j) {
   	  int tmp=a[i];
   	  a[i]=a[j];
   	  a[j]=tmp;
   }
   
   public static void outputList(int[] list) {
      for(int num : list)
   	     out.print(num+" ");
   	  out.println();
   }
   
   public static void main(String[] args) {
      int[] list = {5,7,3,9,4,6};
      quickSort(list);
      outputList(list);
   }
}