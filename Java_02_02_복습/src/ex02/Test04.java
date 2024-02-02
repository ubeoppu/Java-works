package ex02;

class Test04 {
	String color;
	String gearType;
	int door;
	
	Test04(){
		this("white", "auto", 4); //this()생성자는 같은 클래스의 다른 생성자를 호출 할 때 사용한다
	}
	
	Test04(Test04 t){
		color = t.color;
		gearType = t.gearType;
		door = t.door;
	}
	Test04(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}


