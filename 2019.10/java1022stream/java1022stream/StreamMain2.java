package java1022stream;

import java.util.LinkedList;
import java.util.stream.Stream;

public class StreamMain2 {
	public static void working(Student student) {
		try {
			Thread.sleep(5000);
			System.out.println(student);
		}catch(Exception e) {
			
		}
	}

	public static void main(String[] args) {
		
		LinkedList<Student> list = new LinkedList<>();
		list.add(new Student(1, "마빈해글러", "남자", 98));
		list.add(new Student(2, "나브라틸로바", "여자", 78));
		list.add(new Student(3, "조몬타나", "남자", 86));
		list.add(new Student(4, "카타리나비트", "여자", 85));
		list.add(new Student(5, "웨인그레츠키", "남자", 89));
		list.add(new Student(6, "그리피스조이너", "여자", 93));

		long start = System.currentTimeMillis();
		//빠른 열거를 이용해서 작업 
		/*
		for(Student student : list) {
			working(student);
		}
		*/
		
		//일반 스트림을 이용한 처리 
		//list.stream().forEach(student -> working(student));
		
		//병렬 스트림을 이용해서 처리 
		//
		list.parallelStream().forEach(student -> working(student));
		
		long end =System.currentTimeMillis();
		System.out.printf("걸린시간:%d\n", end-start);

		
	}

}
