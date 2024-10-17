//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookRunner
{
   public static void main( String args[] ) throws Exception
   {	
		/*
		out.println("Welcome to the Class Stats program!");					//User Input
		Scanner scan = new Scanner(in);
		out.print("\nWhat is the name of this class? ");
		String name  = scan.nextLine();
		out.print("\nHow many studnets are in this class? ");
		int stuCount = scan.nextInt();
		Class class1 = new Class(name, stuCount);
		
		//out.println("\n" + class1);
		scan.nextLine();
		for(int i = 0; i < stuCount; i++){
			out.print("\nEnter the name of student " + (i + 1) +  " : ");
			String stuName = scan.nextLine();
			out.print("Enter the grades for " + stuName + "\nUse the format x - grades ( 2 - 100 100) : ");
			String stuGrades = scan.nextLine();
			class1.addStudent(i, new Student(stuName, stuGrades));
		}
		out.println("\n" + class1);
		out.println("Failure List = " + class1.getFailureList(70));
		out.println("Highest Average = " + class1.getStudentWithHighestAverage());
		out.println("Lowest Average = " + class1.getStudentWithLowestAverage());
		out.println("class Average = " + class1.getClassAverage());
		scan.close();
		 */



		Scanner file = new Scanner(new File("gradebook.dat"));
		String name  = file.nextLine();
		int stuCount = file.nextInt();
		Class class1 = new Class(name, stuCount);
	
		file.nextLine();
		for(int i = 0; i < stuCount; i++){
			String stuName = file.nextLine();
			String stuGrades = file.nextLine();
			class1.addStudent(i, new Student(stuName, stuGrades));
		}

		out.println("\n" + class1);
		out.println("Failure List = " + class1.getFailureList(70));
		out.println("Highest Average = " + class1.getStudentWithHighestAverage());
		out.println("Lowest Average = " + class1.getStudentWithLowestAverage());
		out.println("class Average = " + class1.getClassAverage());
		file.close();
	}		
}