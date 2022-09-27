package practice;

import java.util.ArrayList;

public class Probabulity {
	String []r = {"abraham1","abraham2","abraham3","abraham4"};
	int randNum=(int)(Math.random()*3);
	String deva = r[randNum];
	public static void main(String[] args) {
		Probabulity k = new Probabulity();
		ArrayList <String> po = new ArrayList<String>();
		po.add(k.deva);
		System.out.println(po);
	}

}