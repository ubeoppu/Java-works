package ex03;

public class FLACPlayer implements MediaPlayer {
	
	String file;
	int time;
	String fileSize;
	String playStop;

	FLACPlayer(String file, int time, String fileSize, String playStop) {
		this.file = file;

	}

	@Override
	 public void play() {
		if(true)
		System.out.println("FLAC 파일 재생중");
	}

	@Override
	public void pause() {
		System.out.println("FLAC 파일 일시정지");
	}

	@Override
	public void stop() {
			System.out.println("FLAC파일 정지");
		
	}

	@Override
	public void loadFile(String file) {
		System.out.println("파일이름:" + file);
		
	}

}
