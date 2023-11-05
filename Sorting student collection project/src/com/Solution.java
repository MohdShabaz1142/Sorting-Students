package com;
import java.util.*;
public class Solution 
{
	public static void main(String[] args)
	{
		Student s=new Student(101,21,"shabaz");
		Student s1=new Student(106,26,"nandan");
		Student s2=new Student(107,22,"gowth");

		/*
		 * -->multiLine comment
		 */

		/**
		 * -->documentation comment
		 */
		//adding student objects into a map-->key is id(Integer) and value is (student objects)
		Map<Integer,Student>m= new LinkedHashMap<Integer,Student>();

		//here "id" is declared as keys ..so used the student object references s,s1,s2 to get their id
		m.put(s.id, s);      //s.id--> is key
		m.put(s1.id, s1);    //s1.id--> is key
		m.put(s2.id, s2);    //s2.id--> is key

		/*
        MAP CANNOT BE SORTED based on values so we are getting the values from map and adding 
		into arraylist so that we can sort the list using Collections.sort();
		 */


		//reference variable of list & object of arrylist  and  to store student objects
		
		List <Student>l=new ArrayList<Student>(); //(UPCASTING)



		//converting map into set of keys using keySet()
		Set<Integer> k = m.keySet();

		//Traversing keys using for-each loop
		for(Integer key:k)
		{
//			//getting value (student objects)from map
//			Student std=m.get(key);

			//adding value (student object)into list
			l.add(m.get(key));

			//printing the value(student objects)-->toSting
			System.out.println(m.get(key));
		}
		System.out.println("--------------------------");

		Scanner sc=new Scanner(System.in);
		System.out.println("1.SortStudent By id/n2.SortStudent By age/n3.SortStudent By name");

		System.out.println("enter the choice:");
		int choice= sc.nextInt();
		sc.close();

		switch(choice)
		{
		case 1:
			Collections.sort(l,new SortStudentByid());
			for(Student a:l) 
			{
				System.out.println(a);
			}
			break;


		case 2:
			Collections.sort(l,new SortStudentByage());
			for(Student b:l)
			{
				System.out.println(b);
			}
			break;


		case 3:
			Collections.sort(l,new SortStudentBYName());
			for(Student c:l)
			{
				System.out.println(c);
			}
			break;

		}
	}
}

