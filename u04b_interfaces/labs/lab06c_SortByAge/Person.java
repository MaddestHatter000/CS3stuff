//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Person implements Comparable<Person>
{
  private int myYear;
  private int myMonth;
  private int myDay;
  private String myName;

  public Person( int y, int m, int d, String n)
  {
    myYear = y;
    myMonth = m;
    myDay = d;
    myName = n;
  }

  public int getYear()
  {
    return myYear;
  }

  public int getMonth()
  {
    return myMonth;
  }

  public int getDay()
  {
    return myDay;
  }

  public int compareTo( Person other )
  {
  	if(other.getYear() == this.getYear()){
      if(other.getMonth() == this.getMonth()){
        return other.getDay() - this.getDay();
      }
      return other.getMonth()- this.getMonth();
    }
    return other.getYear() - this.getYear();
  }

  public String toString( )
  {
     return myName + "  DOB:" + myYear + "-" + myMonth + "-" + myDay;
  }
}