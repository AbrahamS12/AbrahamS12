package practice;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
	
	public static void main(String[] args) {
	try {
		Student op = new Student(25,"ravi");
		
		FileOutputStream po = new FileOutputStream("t.txt");
		ObjectOutputStream oos = new ObjectOutputStream(po);
		oos.writeObject(oos);
		oos.flush();
		oos.close();
		
		System.out.println("Success");
	}catch(Exception e) {System.out.println(e);}
	
	
		
	}

	}

}
