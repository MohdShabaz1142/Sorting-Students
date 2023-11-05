package com;

public class Student
{
	 
	int id;
	int age;
	String name;
	
	Student( int id,int age,String name)
	{
		this.id= id;
		this.age= age;
		this.name= name;
	}
	
	
	public String toString()
	{
		return "age:"+age+"   id:"+id+"  name:"+name;
	}

}
