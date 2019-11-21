package java1011empuse;

import javax.swing.JOptionPane;

import dao.EMPDAO;

public class Main {

	public static void main(String[] args) {
		EMPDAO dao = new EMPDAO();
		int r = JOptionPane.showConfirmDialog(
			null, "정말로 삭제", "데이터 삭제?",
			JOptionPane.YES_NO_OPTION);
		if(r == JOptionPane.YES_OPTION) {
			dao.deleteEMP(9999);
			JOptionPane.showMessageDialog(
					null, "삭제 성공");
		}else {
			JOptionPane.showMessageDialog(
				null, "삭제하지 않음");
		}
		
	}
}






