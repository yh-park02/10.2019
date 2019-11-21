package delegate;

public class Button {
	private OnclickListener onClickListener;
	public void setOnClickListener(OnclickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
	
	
	public Button() {
		System.out.printf("버튼을 출력\n");
	}
	
	public void onClick() {
		if(onClickListener == null) {
			return;
		}
		onClickListener.onClick();
	}
}
