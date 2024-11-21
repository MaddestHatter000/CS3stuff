//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab14a
{
	public static void main ( String[] args )
	{
		PalinList test;

		test = new PalinList("one two three two one");
		System.out.println(test);
		System.err.println();

		test = new PalinList("1 2 3 4 5 one two three four five");
		System.out.println(test);
		System.err.println();

		test = new PalinList("a b c d e f g x y z g f h");
		System.out.println(test);
		System.err.println();

		test = new PalinList("racecar is racecar");
		System.out.println(test);
		System.err.println();

		test = new PalinList("1 2 3 a b c c b a 3 2 1");
		System.out.println(test);
		System.err.println();

		test = new PalinList("chicken is a chicken");
		System.out.println(test);
		System.err.println();


	}
}