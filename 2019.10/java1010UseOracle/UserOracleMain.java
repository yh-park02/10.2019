

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserOracleMain {

	public static void main(String[] args) {
		try {
		// 데이터베이스 드라이버 클래스 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//데이터베이스 연결
		Connection con = 
				DriverManager.getConnection(
						"jdbc:oracle:thin:@192.168.0.13:1521:xe",
						"user04","user04");
		con.setAutoCommit(false);
		
		/*
		Statement stmt = con.createStatement();
		int r = stmt.executeUpdate("update dept " 
				+ "set loc = '종로' "
				+ "where deptno = 10");
		if(r > 0) {
			System.out.printf("수정성공\n");
		}else {
			System.out.printf("10번이 없음\n");
		}
		stmt.close();
		*/	
		
	
		/*
		Statement stmt = con.createStatement();
		
		int r = stmt.executeUpdate("insert into dept(deptno, dname, loc) "
				+ "values(99, '비서', '서울')");
		//삽입 일 때는 0이면 실패, 0보다 커야 성공
		if(r>0) {
			System.out.printf("삽입성공\n");
		}else {
			System.out.printf("삽입실패\n");
		}
		stmt.close();
		*/
		
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from sample ");
		while(rs.next()) {
			String cname = rs.getString("cname");
			String vname = rs.getString("vname");
			System.out.printf("%b\n", cname.trim().equals("HELLO"));
			System.out.printf("%b\n", vname.equals("HELLO"));
		}
		rs.close();
		stmt.close();
		
		
		con.close();
		
		}catch(Exception e) {
			System.out.printf(e.getMessage());
			e.printStackTrace();
		}
	}
}
