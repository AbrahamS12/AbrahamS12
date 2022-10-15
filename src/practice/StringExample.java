package practice;

public class StringExample {

	public static void main(String[] args) {
	String s= "java";
	
	char ch[]= {'s','k','l','m','g','t'};
	String s2 = new String(ch);
	String s3 = new String("EXAMPLE");
	
	System.out.println(s=s2);
	System.out.println(s2=s3);
	System.out.println(s3=s);
	

	}

}
