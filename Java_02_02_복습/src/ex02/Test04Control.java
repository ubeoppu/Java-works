package ex02;

class Test04Control{
	
	public static void main(String[] args) {
		Test04 t1 = new Test04(); //Test04객체 생성
		Test04 t2 = new Test04(t1);//Test04를 참조하고있는 t1참조변수
//		Test04 t3 = t1;

		System.out.println("t1의 color=" + t1.color + ",  gearType =" + t1.gearType + ",  door =" + t1.door);
		
		System.out.println("t2의 color=" + t2.color + ",  gearType=" +t2.gearType + ",  door=" + t2.door);
		t1.door=100;
		System.out.println("t1.door=100;수행후");
		System.out.println("t1의 color=" + t1.color + ",  gearType =" + t1.gearType + ",  door =" + t1.door);
		
		System.out.println("t2의 color=" + t2.color + ",  gearType=" +t2.gearType + ",  door=" + t2.door);
		}
		
	}
