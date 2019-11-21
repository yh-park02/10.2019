package java1022DesignPattern;

public class SingleTon {
	//생성자를 private으로 만들어서 
	//외부에서 객체를 생성할 수 없도록 한다. 
	private SingleTon() {}
	
	//객체의 참조를 저장할 변수를 생성
	private static SingleTon singleTon;
	
	//객체를 생성해서 참조를 넘겨주는 메소드
	//객체를 사용하고자 할 때는 이 메소드만 이용
	public static SingleTon sharedInstance() {
		if(singleTon == null) {
			singleTon = new SingleTon();
		}
		return singleTon;
	}

}
