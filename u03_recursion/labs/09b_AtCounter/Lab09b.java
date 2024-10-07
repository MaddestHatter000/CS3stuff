//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09b
{
	public static void main(String args[])
	{
		//add test cases
		AtCounter test = new AtCounter();

		test.countAts(0, 0);
		out.println(test + "\n");

		test.countAts(2, 5);
		out.println(test + "\n");

		test.countAts(5, 0);
		out.println(test + "\n");

		test.countAts(9, 9);
		out.println(test + "\n");

		test.countAts(3, 9);
		out.println(test + "\n");
	}
}