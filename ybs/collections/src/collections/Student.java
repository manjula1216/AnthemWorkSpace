package collections;

import java.util.ArrayList;
import java.util.List;

class Student {
	String name; 
	int age; 
    int id; 
    
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	

	public Student(String n, int a, int i) {
		super();
		this.name = n;
		this.age = a;
		this.id = i;
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
	public static class Example{ 

	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Jon", 22, 1001));
		list.add(new Student("manju", 19, 1002));
		list.add(new Student("venkat", 23, 1003));
		list.add(new Student("akshit", 23, 1005));
		
		System.out.println("Before Sorting the student data:" ); 
		 
	      //java 8 forEach for printing the list 
	      list.forEach((s)->System.out.println(s));

	      System.out.println("After Sorting the student data by Age:"); 

	      //Lambda expression for sorting by age 
	         list.sort((Student s1, Student s2)->s1.getAge()-s2.getAge()); 
	         list.forEach((s)->System.out.println(s));
	           

	      System.out.println("After Sorting the student data by Name:"); 
	      //Lambda expression for sorting the list by student name       
	      list.sort((Student s1, Student s2)->s1.getName().compareTo(s2.getName())); 
	      list.forEach((s)->System.out.println(s));        
	      System.out.println("After Sorting the student data by Id:");        
	      //Lambda expression for sorting the list by student id 
	      list.sort((Student s1, Student s2)->s1.getId()-s2.getId()); 
	      list.forEach((s)->System.out.println(s)); 
	}
		 

	}

}
