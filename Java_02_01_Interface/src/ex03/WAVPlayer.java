package ex03;

public class WAVPlayer implements MediaPlayer {
	
	String file;
	int time;
	String fileSize;
	String playStop;

	WAVPlayer(String file, int time, String fileSize, String playStop){
		
	}

	@Override
	 public void play() {
		if(true)
		System.out.println("WAVP 파일 재생중");
	}

	@Override
	public void pause() {
		System.out.println("WAVP 파일 일시정지");
	}

	@Override
	public void stop() {
			System.out.println("WAVP파일 정지");
		
	}

	@Override
	public void loadFile(String file) {
		System.out.println("파일이름:" + file);

	}
}
