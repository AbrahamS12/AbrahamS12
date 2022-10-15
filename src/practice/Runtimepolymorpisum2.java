package practice;

public class Runtimepolymorpisum2 extends Runtimepolymorpisum {
	void run() {
		System.out.println("safely with 50km");
	}

	public static void main(String[] args) {
		Runtimepolymorpisum s = new Runtimepolymorpisum2();
       s.run();
	}

}
