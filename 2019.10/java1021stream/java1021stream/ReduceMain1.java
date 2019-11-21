package java1021stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReduceMain1 {

	public static void main(String[] args) {
		//문자열 배열 생성 
		String [] ar = {"SES", "핑클", "원더걸스", "소녀시대", 
				"레드벨벳", "트와이스", "itzy", "소녀시대"};
	
		//배열을 이용해서 Stream을 생성 
		Stream <String> stream = Arrays.stream(ar);
		
		//중복을 제거 
		//stream.distinct().forEach(name -> System.out.println(name));
		
		//stream.skip(2).limit(2).forEach(name -> System.out.println(name));
		
		//원하는 개수만큼 건너뛰어 보기 
		int len = ar.length/4 +1;
		for(int i=0; i<len; i=i+1) {
			Stream <String> imsi = Arrays.stream(ar);
			imsi.skip(i*4).limit(4).forEach(name -> System.out.println(name));
			try {
				Thread.sleep(3000);
			}catch(Exception e) {}	
		}
		
		
	}

}
