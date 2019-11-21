package java1022DesignPattern;

import adapter.NewSystem;
import adapter.OldSystem;
import dao.Dao;
import dao.DaoFactory;
import delegate.Button;
import delegate.OnclickListener;
import service.CustomerService;
import service.CustomerServiceImpl;

public class DesignMain {

	public static void main(String[] args) {
		SingleTon s1 = SingleTon.sharedInstance();
		SingleTon s2 = SingleTon.sharedInstance();
		
		System.out.printf("s1:%d\n", s1.hashCode()); //s1:2018699554
		System.out.printf("s2:%d\n", s2.hashCode()); //s2:2018699554
		
		//java.lang.Runtime 클래스 
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		
		System.out.printf("r1:%d\n", r1.hashCode()); //r1:21685669
		System.out.printf("r2:%d\n", r2.hashCode()); //r2:21685669
		
		//팩토리 메소드 패턴이 적용된 클래스의 객체 생성 
		Dao dao = DaoFactory.create();
		
		//템플릿 메소드 패턴이 적용된 경우의 객체 생성
		//변수는 인터페이스 타입으로 만든다.
		CustomerService service = new CustomerServiceImpl();
		service.delete();
		
		new OldSystem().oldMethod();
		new NewSystem().newMethod();
	
		Button btn = new Button();
		btn.setOnClickListener(new OnclickListener() {
			@Override
			public void onClick() {
				System.out.printf("버튼 클릭\n");
			}
		});
		btn.onClick();
		
		
	}
}
