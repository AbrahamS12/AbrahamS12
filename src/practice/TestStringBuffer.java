package practice;

public class TestStringBuffer {

	private static long startTime;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       startTime = System.currentTimeMillis();
       StringBuffer op = new StringBuffer("java");
       for(int i = 0;i<10000;i++);
       op.append("vtatalent");
       String ms ="";
	System.out.println("time taken by StringBuffer:"+(System.currentTimeMillis()-startTime)+ms);
	}

}
