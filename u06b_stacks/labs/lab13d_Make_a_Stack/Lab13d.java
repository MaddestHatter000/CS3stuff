//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import static java.lang.System.*;

public class Lab13d
{
	public static void main ( String[] args )
	{
		IntStack test = new IntStack();
		test.push(5);
		test.push(7);
		test.push(9);
		System.out.println(test);
		System.out.println(test.isEmpty());
		System.out.println(test.pop());
		System.out.println(test.peek());
		System.out.println(test.pop());
		System.out.println(test.pop());
		System.out.println(test.isEmpty());
		System.out.println(test);

		//expand the test cases to test the class more thoroughly
		out.println();


		test = new IntStack();
		test.push(55);
		test.push(7);
		test.push(98);
		test.push(56);
		test.push(75);
		test.push(4);
		System.out.println(test);
		System.out.println(test.isEmpty());
		System.out.println(test.pop());
		System.out.println(test.peek());
		System.out.println(test.pop());
		System.out.println(test.pop());
		System.out.println(test.isEmpty());
		System.out.println(test);

	}
}