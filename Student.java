package com.sonata;

public class Student {
	
    int stdid;
	String stdname;
	String stdclass;
	
	Student()
	{
		
	}
	Student(int i,String s,String c)
	{
		this.stdid=i;
		this.stdname=s;
		this.stdclass=c;
	}
	
 public void display()
	{
		System.out.println(stdid);
		System.out.println(stdname);
		System.out.println(stdclass);
		
	}

public static void main(String args[])
{
	Student s = new Student();
	s.stdid = 01;
	s.stdname="Abhi";
	s.stdclass="Bsc";
	s.display();
 Student s1 = new Student(02,"Deepak","Degree");
  s1.display();
}

}


