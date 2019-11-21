package java1021stream;

public class Store {
	//가게번호, 이름, 댓글 수를 저장할 변수
	private int num;
	private String name;
	private int replyCnt;
	private String address;
	
	public Store() {
		super();
	}

	public Store(int num, String name, int replyCnt, String address) {
		super();
		this.num = num;
		this.name = name;
		this.replyCnt = replyCnt;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Store [num=" + num + ", name=" + name + ", replyCnt=" + replyCnt + ", address=" + address + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReplyCnt() {
		return replyCnt;
	}

	public void setReplyCnt(int replyCnt) {
		this.replyCnt = replyCnt;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}