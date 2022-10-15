package practice;

import java.util.Random;

public class Producerconsumer {
	public static class Consumer{
		public int availability() {
			Random rand = new Random();
			int av = rand.nextInt(10);
			System.out.println("Consumption is "+av);
		return av;
			
		}
	}
	public static  class Market {
			public int stock() {
				Random rand = new Random();
				int a = rand.nextInt(5);
				System.out.println("Stock in market is "+a);
			return a;
				
			}
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
