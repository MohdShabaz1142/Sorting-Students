package com;

import java.util.Comparator;

public  class SortStudentBYName implements Comparator<Student> 
{
	public int compare(Student x,Student y) 
	{

		return x.name.compareTo(y.name);
	}



}
