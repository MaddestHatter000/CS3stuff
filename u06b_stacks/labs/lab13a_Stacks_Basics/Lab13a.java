//package lab13a_Stacks_Basics;


//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab13a
{
	public static void main ( String[] args )
	{
		StackTester test;

		test = new StackTester("a b c d e f g h i");
		out.println(test);
		out.println("Popping all items from the stack");
		test.popEmAll();
		out.println("\n");

		test = new StackTester("1 2 3 4 5 6 7 8 9 10");
		out.println(test);
		out.println("Popping all items from the stack");
		test.popEmAll();
		out.println("\n");

		test = new StackTester("# $ % ^ * ( ) ) _");
		out.println(test);
		out.println("Popping all items from the stack");
		test.popEmAll();
	}
}
