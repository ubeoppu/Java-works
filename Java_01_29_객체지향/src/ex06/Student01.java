package ex06;

public class Student01 {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
		
		 stu1.setName("임재현");       //setter을 이용한 방법
		 stu1.setStudentId("22011085");
		 stu1.setMajor("컴공");
		 
		
//	Student stu1 = new Student(
//		 "임재현",    //인자값
//		 22011085,  //인자값
//		 "컴공"      //인자값
//		 ); //객체 생성생성자 호출 및 값 대입

		stu1.displayInformation(); //stu1


		 
		 
		 
		 
		
	}

}
