//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import static java.lang.System.*;

public class Lab05b
{
	public static void main ( String[] args )
	{
		ListIteratorTest test = new ListIteratorTest("abcabc", "a", "+");
		test.replace();
		out.println(test);

		test.setTest("abcdefghijxxxx", "x", "7");
		test.replace();
		out.println(test);


		test.setTest("123456abcabc", "b", "#");
		test.replace();
		out.println(test);

	}
}