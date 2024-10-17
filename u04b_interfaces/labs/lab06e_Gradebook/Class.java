//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
		studentList = new Student[stuCount];
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum] = s;
	}
	
	public void sort()
	{
		Arrays.sort(studentList);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		int stuCount = 0;
			for(int i = 0; i < studentList.length; i++){
				if(studentList[i] != null)
					classAverage += getStudentAverage(i);
					stuCount += 1;
			}
		return classAverage/stuCount;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		for(int i = 0; i < studentList.length; i++){
			if(stuName.equals(studentList[i].getName())){
				return studentList[i].getAverage();
			}
		}
		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = 0;
		String nameHighest = "";
		for(int i = 0; i < studentList.length; i++){
			if(studentList[i].getAverage() > high){
				high = studentList[i].getAverage();
				nameHighest = studentList[i].getName();
			}
		}
		return nameHighest;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Integer.MAX_VALUE;
		String nameLowest = "";
		for(int i = 0; i < studentList.length; i++){
			if(studentList[i].getAverage() < low){
				low = studentList[i].getAverage();
				nameLowest = studentList[i].getName();
			}
		}
		return nameLowest;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for(int i = 0; i < studentList.length; i++){
			if(studentList[i].getAverage() <= failingGrade)
				output += studentList[i].getName() + " ";
		}
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		for(int i = 0; i < studentList.length; i++){
			output += studentList[i] + "\n";
		}
		return output;
	}  	
}