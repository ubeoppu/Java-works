package movie;

import java.io.BufferedReader;
import java.io.File; //파일 연결 import문
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Movie {

	private long id; // 영화 고유 번호
	private String title; // 영화 제목
	private String genre; // 영화 장르

	private static final File file = new File("src/movie/movies.txt"); // 지정한 file자체를 참조한다

//	public Movie(long id, String title, String genre) {
//		this.id = id;
//		this.title = title;
//		this.genre = genre;

	public static ArrayList<Movie> findAll() {

		ArrayList<Movie> movies = new ArrayList<Movie>();
		BufferedReader br = null;
		String line = null;

		try {
			br = new BufferedReader(new FileReader(file));

			while ((line = br.readLine()) != null) { //한 줄 씩
//			한 줄 읽어 오는 부분
				String[] temp = line.split(",");
//				System.out.println(line);
				
				/*
				 * temp[0]: 영화 고유번호 temp[1]: 영화 제목 temp[2]: 영화 장르
				 */
				// 파일에서 읽어온 데이터는 문자로 인식한다. 따라서
				// 1627175707 이것도 문자다 그러므로 id저장하기 위해서는
				// 문자열을 Long형으로 변환하는 작업이 필요하다.
				Movie m = new Movie(Long.parseLong(temp[0]), temp[1], temp[2]);
				movies.add(m); // ArrayList에 파일에 저장된 영화 목록 추가
//			new Movie(0, line, line)
			}

			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return movies; //영화 객체가 담긴 ArrayList 반환
	}
	
	@Override
	public String toString() {
//		return String.format("[%d]: %s(%s)", id, title, genre);
//		                    정수형   문자열
		return "[" + id + "]:" + "[" + title + "]" + "[" + genre + "]";
	}
	
	
}
