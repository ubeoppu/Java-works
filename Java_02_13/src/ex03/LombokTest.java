package ex03;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter          //setter생성
@Getter          //getter생성
@AllArgsConstructor //모든 변수를 받아주는 생성자
@ToString
public class LombokTest {

	int a;
	int b;
	int c;
	int d;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
