package com;

import java.util.Comparator;

public class SortStudentByid  implements Comparator<Student>
{


	public int compare(Student x,Student y)
	{
		return x.id-y.id;
	}

}