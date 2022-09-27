package firstmonth;

public class Probability {

	public static void main(String[] args) {
		String array[]= {"Black","red","Blue","Blue","Black","red","Blue","Blue","Black","red"};
		double C1 = 0;
		double C2 = 0;
		double C3 = 0;
		for(int i=0;i<=array.length;i++) {
			if(array[i]=="red") {
				C1++;
			}
			if(array[i]=="Black") {
				C2++;
			}
			if(array[i]=="Blue") {
				C3++;
			}
		}
		System.out.println("probability of winning red is: " +C1/10+",probability of winning Black is: " +C2/10+",probability of winning Blue is: " +C3/10);
        int rand = (int)(Math.random());
        System.out.println("the winner is: "+array[rand]);
	}

}
