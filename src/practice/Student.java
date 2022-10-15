package practice;

import java.io.Serializable;

public class Student implements Serializable{
	int Id;
	String name;
	
	public Student(int Id,String name) {
		this.Id = Id;
		this.name= name;
		
	}

}
