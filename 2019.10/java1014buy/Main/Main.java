package Main;

import dao.BuyDAO;
import dto.Buy;

public class Main {

	public static void main(String[] args) {
		
		BuyDAO dao = new BuyDAO();
		
	
		//기본키를 가지고 조회
		System.out.printf("%s\n", dao.getBuy(1));
		
		
		//전체데이터조회
		//System.out.printf("%s\n", dao.getList());
		
		/*
		Buy buy = new Buy();
		buy.setItemname("커피");
		buy.setCustomerid("sinis");
		buy.setCount(3);
		
		int r = dao.insertBuy(buy);
		if(r > 0) {
			System.out.printf("삽입 성공\n");
		}else {
			System.out.printf("삽입 실패\n");
		}
		
		*/
		
		/*
		Buy buy = new Buy();
		buy.setBuycode(1);
		buy.setItemname("과일");
		buy.setCustomerid("inis");
		buy.setCount(3);
		
		int r = dao.updateBuy(buy);
		if(r > 0) {
			System.out.printf("수정 성공\n");
		}else {
			System.out.printf("수정 실패\n");
		}
	
		 */

	}
}
		
		
