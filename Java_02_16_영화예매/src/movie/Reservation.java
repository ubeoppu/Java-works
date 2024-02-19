package movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Reservation {
	
	private long id;
	private long movieId;
	private String movieTitle;
	private String seatName;
	
	private static final File file = new File("src/movie/revervations.txt");

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

	@Override
	public String toString() {
		return "[예약번호:" + id + ", 영화번호:" + movieId + ", 영화제목:" + movieTitle + ", 좌석번호:"
				+ seatName + "]";
	}
}
