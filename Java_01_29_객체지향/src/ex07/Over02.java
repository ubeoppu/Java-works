package ex07;

public class Over02 {

	public static void main(String[] args) {
		Over over1 = new Over();
		
		Over over2 = new Over("샴");
		
		Over over3 = new Over("러시안 블루", "회색");
		
		System.out.println("첫번째 고양이 종:" + over1.breed + "\t//색상:" + over1.color);
		System.out.println("첫번째 고양이 종:" + over2.breed + "\t//색상:" + over2.color);
		System.out.println("첫번째 고양이 종:" + over3.breed + "\t//색상:" + over3.color);

	}

}
