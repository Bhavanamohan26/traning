package com.sonata;
import java.util.ArrayList;
import java.util.List;

public class Student {
	String name;
	int id;
	int Marks;
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getMarks() {
		return Marks;
	}
	Student(String n,int i,int m){
		name=n;
		id=i;
		Marks=m;
	}

	@Override
	public String toString() {
		return "LambdaExpression ["+"Name:"+this.getName()+"Id:"+this.getId()+"Marks:"+this.Marks;
	}
  public class Example{
	  public static void main(String[] args) {
		  List<Student>studentlist=new ArrayList<Student>();
		   studentlist.add(new Student("Anu",01,78));
		   studentlist.add(new Student("Abhi",02,98));
		   studentlist.add(new Student("Deepa",03,89));
		   studentlist.add(new Student("Shyamla",04,67));
		   System.out.println("before sorting the student data:");
		
	  
      studentlist.forEach((s)->System.out.println(s));
      
      System.out.println("After Sorting the student data by Marks:");        
    
      studentlist.sort((Student s1, Student s2)->s1.getMarks()-s2.getMarks()); 
      studentlist.forEach((s)->System.out.println(s)); 
	  }
}}

