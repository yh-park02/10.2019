package java1021stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ReduceMain3 {

	public static void main(String[] args) {
		String [] ar = {"C&C++", "JAVA", "C#", 
				"JavaScript", "Python", "R", "Kotiln", 
				"Swift", "SQL", "Haskell", "Closure", 
				"Scala", "Ruby", "Php"};
		//배열을 가지고 스트림을 생성 
		Stream <String> stream = Arrays.stream(ar);
		
		//String클래스는 Comparable 인터페이스를 implements해서 정렬이 가능하다. 
		//stream.sorted().forEach(lang -> System.out.println(lang));
		
		//내림차순 정렬 
		//stream.sorted(Comparator.reverseOrder()).forEach(lang -> System.out.println(lang));
		
		//Student의 배열을 생성 
		Student [] students = { 
				new Student(1, "아이린", "여자", 90),
				new Student(2, "차범근", "남자", 88),
				new Student(3, "박정숙", "여자", 90),
				new Student(4, "이종범", "남자", 91),
				new Student(5, "선동렬", "남자", 76),
				new Student(6, "보아", "여자", 92),
		};
		//배열을 스트림으로 생성
		Stream <Student> st = Arrays.stream(students);
		
		//st.forEach(student -> System.out.println(student)); 
		
		//이 형태를 예외없이 사용하고자 하면 Student클래스(DTO)에 Comparable 인터페이스를 구현 
		//st.sorted().forEach(student -> System.out.println(student));
		
		/*
		//Comparator 인터페이스를 이용한 정렬 
		//score의 내림차순 정렬
		//.reversed()를 생략하면 오름차순 정렬 
		//score가 같으면 이름의 오름차순 .thenComparing
		
		st.sorted(Comparator.comparing(Student::getScore)
				.reversed().thenComparing(Student::getName))
		.forEach(student -> System.out.println(student));
		*/
		
		//Comparator 객체 직접 생성
		Comparator<Student> comp = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				//return o1.getScore() - o2.getScore();
				
				//점수가 같으면 이름의 내림차순 
				if(o1.getScore() > o2.getScore()) {
					return 1;
				}else if(o1.getScore() == o2.getScore()) {
					return o2.getName().compareTo(o1.getName());
				}else {
					return -1;
				}
			}
		};
		st.sorted(comp).forEach(
				student -> System.out.println(student));
		
	}
}
