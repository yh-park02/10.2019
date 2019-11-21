package pattern;

public class PatternMain {

	public static void main(String[] args) {
		/*
		Dao dao1 = new Dao();
		Dao dao2 = new Dao();
		
		//2개의 객체 동일성 여부 확인
		System.out.printf("%d\n",dao1.hashCode()); //2018699554
		System.out.printf("%d\n",dao2.hashCode()); //21685669
		*/
		
		//getInstance를 몇 번 호출하더라도 
		//모두 동일한 객체를 리턴한다. 
		Dao dao1 = Dao.getInstance();
		Dao dao2 = Dao.getInstance();
		
		System.out.printf("%d\n",dao1.hashCode()); //2018699554
		System.out.printf("%d\n",dao2.hashCode()); //2018699554
	
	}
}
