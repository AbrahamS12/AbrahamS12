package firstmonth;

public class Producerconsumer {
	public static void main(String[] args) {
		Shop c = new Shop();
		Producer p = new Producer(c,1);
		Consumer co = new Consumer(c,1);
		p.start();
		co.start();
		
	}

}
class Shop {
	private int materials;
	private boolean available = false;
	
	public synchronized  int get() {
		while(available == false);
		try {
			wait();
		}
			catch(Exception ie) {
				
			}
		}
		return materials;
	}

public synchronized void put(int value) {
	while(available == true) {
		try {
			wait();
		}
		catch(Exception ie) {
			ie.printStackTrace();
		}
		}
	materials = value;
	available = true;
	notifyAll();
	}
}
class Consumer extends Thread{
	private Shop shop;
	private int number;
	
	public Consumer(Shop c, int nuber){
		shop = c;
		this.number = number;
	}
	public void run() {
		int value = 0;
		for(int i=0;i<10;i++) {
			value = Shop.get();
			System.out.println("product value" +this.number+ "=" +value);
			
		}
	}
}
class Producer extends Thread{
	private Shop shop;
	private int number;
	
	public Producer(Shop c,int number) {
		shop = c;
		this.number = number;
	}
	public void run() {
		for(int i = 0; i<10; i++);
		Shop.put();
		System.out.println("product value" +this.number+ "=" +i);
		try {
			sleep((int)(Math.random()*100));
		}
		
	}
	
}
