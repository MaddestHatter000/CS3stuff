//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;

public class Lab18b
{
	public static void main ( String[] args )
	{
		YourPQ test = new YourPQ();

		Scanner scan = new Scanner(System.in);



		System.out.print("How many monsters did you wish to enter? :: ");
		int size = scan.nextInt();
		//loop to read in values and instantiate your Objects
		for(int i = 0; i < size; i++){
			Monster nextMonster = new Monster();
			System.out.print("\nEnter the ht :: ");
			nextMonster.setHeight(scan.nextInt());

			System.out.print("Enter the wt :: ");
			nextMonster.setWeight(scan.nextInt());

			System.out.print("Enter the age :: ");
			nextMonster.setAge(scan.nextInt());
			
			test.add(nextMonster);
		}
	
	
	
		System.out.println();
		System.out.println(test);
		System.out.println("getMin() - " + test.getMin());
		System.out.println("removeMin() - " + test.removeMin());		
		System.out.println(test);
		
		
		//add more test cases
		
			
	}
}