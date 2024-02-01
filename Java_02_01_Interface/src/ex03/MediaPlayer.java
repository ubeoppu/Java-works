package ex03;

public interface MediaPlayer {
	
	
	
	
	  void play();
	  
	  void pause();
	  
	  void stop();
	  
	  default void loadFile(String file) {
		  System.out.println("파일 로딩중.." + file);
	  }
	  
	  
	  
	  
		  
	  


}