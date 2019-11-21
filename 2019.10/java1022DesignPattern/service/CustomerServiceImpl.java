package service;
//C언어에서는 c 
//c++에서는 cpp 
//objective-c에서는 m
public class CustomerServiceImpl implements CustomerService {

	@Override
	public void insert() {
		System.out.printf("데이터 삽입\n");

	}

	@Override
	public void delete() {
		System.out.printf("데이터 삭제\n");

	}

	@Override
	public void update() {
		System.out.printf("데이터 수정\n");

	}

	@Override
	public void select() {
		System.out.printf("데이터 조회\n");

	}

}
