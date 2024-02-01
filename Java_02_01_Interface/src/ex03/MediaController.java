package ex03;
import java.util.Scanner;
public class MediaController {

	public static void main(String[] args) {
		
		MediaPlayer mp3 = new MP3Player();
		
		Scanner sc = new Scanner(System.in);

		System.out.print("1: 재생, 0:일시정지, -1:중지 ==>");
		MP3Player.state = sc.nextInt();
	/*	while(MP3Player.state != -1) { //-1이면 반복 중지
		System.out.print("1: 재생, 0:일시정지, -1:중지 ==>");
		switch(sc.nextInt()){ //정수 입력받음
		case 1:            //1이면 mp3.play()메소드 실행
			mp3.play();
			break;
		case 0:
			mp3.pause();   //0이면 mp3.pause()메소드 실행
			break;
		case -1:
			mp3.stop();    //-1이면 mp3.pause()메소드 실행
			break;
		}
		}
		  System.out.println("playstop");
		*/
     
	}
}
			
//		MediaPlayer wav = new WAVPlayer("JAVA", 5, "50", "재생");
//		MediaPlayer flac = new FLACPlayer("JAVA", 5, "50", "재생");
		
		
		
		
		
		
		
		
		
		
		
		
		
//		MediaPlayer mp3 = new MP3Player();
//		MediaPlayer flac = new FLACPlayer();
//		MediaPlayer wavp = new WAVPlayer();

//		mp3.play();
//		flac.play();
//		wavp.play();

	
