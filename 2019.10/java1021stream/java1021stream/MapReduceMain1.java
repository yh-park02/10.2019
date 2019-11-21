package java1021stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class MapReduceMain1 {

	public static void main(String[] args) {
		// Student의 배열을 생성
		Student[] students = { 
				new Student(1, "아이린", "여자", 90), 
				new Student(2, "차범근", "남자", 88),
				new Student(3, "박정숙", "여자", 90), 
				new Student(4, "이종범", "남자", 91), 
				new Student(5, "선동렬", "남자", 76),
				new Student(6, "보아", "여자", 92), 
				};
				
		// 배열을 스트림으로 생성
		Stream<Student> stream = Arrays.stream(students);
		
		//Map-Reduce Programming
		/*
		stream.filter((Student student) ->{
			return student.getGender().equals("여자");
		}).forEach((Student student) -> {
			System.out.println(student);
		});
		*/
		
		stream.filter((student) ->{
			return student.getGender().equals("여자");
		}).forEach((student) -> {
			System.out.println(student);
		});

		
	}
}
