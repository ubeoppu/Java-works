package movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

public class Reservation {
	
	private long id;
	private long movieId;
	private String movieTitle;
	private String seatName;
	
	private static final File file = new File("src/movie/revervations.txt");

	public Reservation(long movieId, String movieTitle, String seatName) {
		this(Instant.now().toEpochMilli(),movieId,movieTitle,seatName);
	}
	
	public void save()throws IOException{
		FileWriter fw = new FileWriter(file,true);
		
		fw.write(this.toFileString()+ "\n");
		fw.close();
		
	}
	private String toFileString() {
		return String.format("%d,%d,%s,%s", id, movieId, movieTitle, seatName);
		
	}

	public Reservation(long id, long movieId, String movieTitle, String seatName) {
		this.id = id;
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.seatName = seatName;
	}
	
	public static Reservation findById(String reservationId) {
		Reservation reservation = null;
		BufferedReader br = null;
		String line = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null) {
				
				String[]temp = line.split(",");
				if(reservationId.equals(temp[0])) {
					reservation = new Reservation(
							Long.parseLong(temp[0]),
							Long.parseLong(temp[1]),
							temp[2],
							temp[3]
							);
					break;
				}
				
			}
			br.close();
			return reservation;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;

		
	}

	public static Reservation cancel(String reservationId) {
		Reservation caceled = null;
	    BufferedReader bf = null;
		try {
		bf = new BufferedReader(new FileReader(file)); // new File("src/movie/revervations.txt");경로를 읽어온다
		String text ="";
        String line = null;
		
		while((line = bf.readLine())!= null){
			String[]temp = line.split(",");
			
			if(reservationId.equals(temp[0])) {
				caceled = new Reservation(
						Long.parseLong(temp[0]),
						Long.parseLong(temp[1]),
						temp[2],
						temp[3]
						 );
				continue;
			}
			text += line + "\n";
			
		}

		bf.close();
		//new File("src/movie/revervations.txt"); 이 경로에
		//cancel(String reservationId) 예약번호를 제외한 파일을 다시 reservations.txt 덮어쓴다
		FileWriter fw = new FileWriter(file); 
		fw.write(text);
		fw.close();
		
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		return caceled;
	}
	@Override
	public String toString() {
		return "[예약번호:" + id + ", 영화번호:" + movieId + ", 영화제목:" + movieTitle + ", 좌석번호:"
				+ seatName + "]";
	}

	public static ArrayList<Reservation> findMovieId(String movieId)throws Exception{ //에외를 던짐
		ArrayList<Reservation> reservations = new ArrayList<Reservation>();
		BufferedReader bf = new BufferedReader(new FileReader(file));
		
		String line = null;
		
		while((line = bf.readLine()) != null){
			String[]temp = line.split(",");
			
			if(movieId.equals(temp[1])) { //영화 ID
				long id = Long.parseLong(temp[0]); //예매 ID
				long mId = Long.parseLong(temp[1]);//영화ID
				String movieTitle = temp[2];       //영화 제목
				String seatName = temp[3];         //좌석 명
				
				Reservation reserve = new Reservation(id, mId, movieTitle, seatName);
				reservations.add(reserve);
			}
		}
		bf.close();
		return reservations;
		
	}

	public String getSeatName() {
		return seatName;
	}

//	public void setSeatName(String seatName) {
//		this.seatName = seatName;
//	}
	
}
