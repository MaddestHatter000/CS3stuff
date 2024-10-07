//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class Lab05a
{
	public static void main ( String[] args )
	{
		IteratorTest test = new IteratorTest("abcabca", "a");
		test.remove();
		out.println(test);
		out.println();

		test.setTest("abcdefghijxxxx", "x");
		test.remove();
		out.println(test);
		out.println();

		test.setTest("123456abcabc", "b");
		test.remove();
		out.println(test);
		out.println();
	}
}