//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab13c
{
	public static void main ( String[] args )
	{
		PostFix test;
		
		test = new PostFix("27+12++");
		test.solve();
		out.println(test);

		test = new PostFix("1234++-");
		test.solve();
		out.println(test);

		test = new PostFix("93*8/4+");
		test.solve();
		out.println(test);

		test = new PostFix("33+7*92/+");
		test.solve();
		out.println(test);

		test = new PostFix("93/2*79*+4-");
		test.solve();
		out.println(test);

		test = new PostFix("55+2*4/9+");
		test.solve();
		out.println(test);
	}
}