package service;
//C언어나 objective-c에서는 .h 파일의 역할 
public interface CustomerService {
	//삽입을 위한 메소드
	public void insert();
	
	//삭제를 위한 메소드
	public void delete();
	
	//갱신을 위한 메소드
	public void update();
	
	//조회를 위한 메소드
	public void select();

}
