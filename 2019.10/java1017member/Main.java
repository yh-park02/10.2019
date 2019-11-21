/*import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
*/
import java.util.Scanner;

import com.naver.yh_park02.dao.MemberDao;
import com.naver.yh_park02.dao.MemberDaoImpl;
import com.naver.yh_park02.service.MemberServiceImpl;
/*
import com.naver.yh_park02.dao.MemberDao;
import com.naver.yh_park02.dao.MemberDaoImpl;
import com.naver.yh_park02.domain.Member;
*/
public class Main {

	public static void main(String[] args) {
		//1번이면 회원가입 2번이면 로그인 3번이면 종료를 할 수 있도록 메뉴를 구성
		Scanner sc = new Scanner(System.in);
		
		MemberDao dao = MemberDaoImpl.getInstance();
		MemberServiceImpl service = new MemberServiceImpl();
		//service의 dao에 여기서 만든 dao를 주입 
		service.setDao(dao);
		
		while(true) {
			System.out.printf("메뉴입력(1.회원가입 2.로그인 3.종료):");
			String menu = sc.nextLine();
			switch(menu) {
			case "1":
				boolean x = service.insertMember(sc);
				String msg = null;
				if(x == true) {
					msg = "회원가입 성공\n";
				}else {
					msg = "회원가입 실패\n";
				}
				System.out.printf(msg);
				break;
				
			case "2":
				boolean y = service.login(sc);
				if(y == true) {
					System.out.printf("로그인 성공\n");
				}else {
					System.out.printf("아이디 또는 비밀번호가 맞지 않습니다.\n");
			}
				break;
				
			case "3":
				System.out.printf("프로그램 종료\n");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.printf("잘못된 메뉴 선택\n");
				break;
			}
		}
		
		
		
		
		//MemberDao dao = MemberDaoImpl.getInstance();
		//System.out.printf("%s\n", dao.idCheck("jhhi")); - 아이디 중복 확인
		
		/* 회원가입
		Member member = new Member();
		member.setId("hell");
		member.setPw("1234");
		member.setName("이영애");
		member.setAlias("산소");
		
		Calendar cal = new GregorianCalendar();
		Date regdate = new Date(cal.getTimeInMillis());
		member.setRegdate(regdate);
		
		int r = dao.insertMenmber(member);
		System.out.printf("결과:%d\n", r);
		 */
		
		/*
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", "jhhi");
		map.put("pw", "kk");
		//로그인을 처리할 때 id와 pw가 일치하면 id에 해당하는 회원정보를 저장
		//일치하는 데이터가 없으면 null을 리턴 
		System.out.printf("결과:%s\n", dao.login(map));
		*/
	}
}
