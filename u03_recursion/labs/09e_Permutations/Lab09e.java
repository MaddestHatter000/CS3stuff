//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.*;
import static java.lang.System.*;

public class Lab09e
{
   public static void main( String args[] )
   {
	Permutation test = new Permutation("ABC");
      test.permutation();
      out.println(test);

      test = new Permutation("boat");
      test.permutation();
      out.println(test);

      test = new Permutation("it");
      test.permutation();
      out.println(test);
   }
}