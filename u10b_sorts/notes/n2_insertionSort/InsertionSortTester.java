//insertion sort tester

import static java.lang.System.*;
import static java.lang.System.*;
import java.util.*;

public class InsertionSortTester
{
    public static int[] generateNewArray(int size) {
    	int[] ray = new int[size];
		Set<Integer> values = new HashSet<Integer>();
		Random rand = new Random(size*100);
		while(values.size()<size){
			values.add(rand.nextInt());
		}
		Iterator<Integer> iterator = values.iterator();
		int i=0;
		while(iterator.hasNext()){
			ray[i++]=iterator.next();
		} 
		return ray;   	
    }
    
   public static void main( String args[] )
   {  
      int[] array1 = generateNewArray(10000);
      //int[] array1 = {39,6,11,23,18,3,20,5,57,15,4,54,4,32,66,7766,8,76,55,44,333344,443,677,88,8,7,90};
      int[] array2 = new int[array1.length];
      for(int i=0; i<array2.length; i++)
         array2[i]=array1[i];
      int[] array3 = new int[array1.length];
      for(int i=0; i<array3.length; i++)
         array3[i]=array1[i];
      int[] array4 = new int[array1.length];
      for(int i=0; i<array4.length; i++)
         array4[i]=array1[i];
         
      StopWatch s = new StopWatch();
      s.start();                  
      out.println("before insertion sort using Binary Search paired with System.arrayCopy");
      //out.println(Arrays.toString(array1));
      InsertionSort.insertionSort4(array1);
      out.println("\nafter insertion sort using Binary Search paired with System.arrayCopy");
      //out.println(Arrays.toString(array1));     
      out.println();	
      s.stop();
      System.out.println("elapsed time in milliseconds: " + s.getElapsedTime());



      s = new StopWatch();
      s.start();
      out.println();
      out.println("before insertion sort using Binary Search and manual shifting");
      //out.println(Arrays.toString(array2));
      InsertionSort.insertionSort3(array2);
      out.println("\nafter insertion sort using Binary Search and manual shifting");
      //out.println(Arrays.toString(array2));     
      out.println();    
      s.stop();
      System.out.println("elapsed time in milliseconds: " + s.getElapsedTime());

      s = new StopWatch();
      s.start();
      out.println();
      out.println("before insertion sort using just manual shifting");
      //out.println(Arrays.toString(array3));
      InsertionSort.insertionSort(array3);
      out.println("\nafter insertion sort using just manual shifting");
      //out.println(Arrays.toString(array3));     
      out.println();    
      s.stop();
      System.out.println("elapsed time in milliseconds: " + s.getElapsedTime());

      s = new StopWatch();
      s.start();
      out.println();
      out.println("before insertion sort by swapping of the insertion term all the way down to its intended position");
      //out.println(Arrays.toString(array4));
      InsertionSort.insertionSort2(array4);
      out.println("\nafter insertion sort by swapping of the insertion term all the way down to its intended position");
      //out.println(Arrays.toString(array4));     
      out.println();    
      s.stop();
      System.out.println("elapsed time in milliseconds: " + s.getElapsedTime());

      //                                      n=1,000  n=10,000  n=100,000  n=1,000,000
      //InsertionSortBinarySearchArrayCopy    2 ms     12 ms       420 ms     65,998 ms
      //InsertionSortBinarySearchShift        6 ms     18 ms     1,080 ms    127,130 ms
      //InsertionSortShift                    5 ms     17 ms     1,300 ms    150,297 ms
      //InsertionSortNaiveSwapping            5 ms     31 ms     2,600 ms    400,000 ms
	}
}