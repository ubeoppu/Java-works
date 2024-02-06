package ex02;

import java.util.regex.*;

public class ReqularExam01 {

	public static void main(String[] args) {
		String[]data = {"ab","bat", "baby", "bonus", "cA", "ca", "co", "c.",
				"cO", "car", "combat","count","date","disc"};
		Pattern p = Pattern.compile("c.");
		
		for(int i =0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.println(data[i] + ",");
		}

	}

}
