package com;

import java.util.Comparator;

public class SortStudentByage  implements Comparator<Student>
{

	@Override
	public int compare(Student x, Student y)
	{

		return x.age-y.age;
	}

}
