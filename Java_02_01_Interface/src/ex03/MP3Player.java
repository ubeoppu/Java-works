package ex03;

public class MP3Player implements MediaPlayer {
	
	private String file;
	private int runTime;
	private String fileSize;
	
    public static int state; //-1(정지), 0(일지정지), 1(실행)
	

	@Override
	 public void play() {
		if(state == 1)
		System.out.println("MP3 파일 재생중");
	}

	@Override
	public void pause() {
		if(state == 0)
		System.out.println("MP3 파일 일시정지");
	}

	@Override
	public void stop() {
		if(state == -1)
			System.out.println("MP3파일 정지");
		
	}

	@Override
	public void loadFile(String file) {
		System.out.println("lodaing...");
		
	}

}
