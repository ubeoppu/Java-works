package ex02;

import java.util.Random;

public class RandomEx01 {

	public static void main(String[] args) {
		Random rand = new Random(1);
		Random rand2 = new Random(1);
		
		System.out.println(" = rand = ");
		for(int i =0; i < 5; i++)
			System.out.println(i + ":" + rand.nextInt());
		
	}

}
