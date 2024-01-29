package ex06;

public class Student {
	
	private String name;
    private String studentId;
	private String major;
	
	
	
//	    Student(String n, int n2, String n3){ //생성자 생성
//		name = n;
//		studentId = n2;
//		major = n3;
//}

	Student(){
	}//디폴트 생성자 생성
	
	void setName(String n){
	  name = n;
	  }
	  void setStudentId(String n2){
	  studentId = n2;
	  }
	  void setMajor(String n3){
	  major = n3;
	  }

	void displayInformation(){ //반환값 void
		System.out.println("학생 이름:" + name);
		System.out.println("학번:" + studentId);
		System.out.println("전공:" + major);
	}

}
