package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.Buy;

public class BuyDAO {
	//클래스를 처음 사용할 때 한 번만 수행하는 로드 
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			System.out.printf("클래스 로드 예외:%s\n", e.getMessage());
			e.printStackTrace();
		}
	}
	//데이터베이스 연동에 필요한 변수 
	//데이터베이스 연결 변수 
	Connection con;
	//SQL실행 변수 
	PreparedStatement pstmt;
	//select 구문의 결과 사용 변수 
	ResultSet rs;
	
	
	//데이터를 삽입하는 메소드 
	public int insertBuy(Buy buy) {
		int result = -1;
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.0.13:1521:xe",
					"user30","user30");
		pstmt = con.prepareStatement(
				"insert into buy(buycode, itemname, customerid,count) values(buyseq.nextval,?,?,?)");
		
		//SQL에 물음표가 있으면 실제 데이터로 바인딩 
		pstmt.setString(1, buy.getItemname());
		pstmt.setString(2, buy.getCustomerid());
		pstmt.setInt(3, buy.getCount());
		
		//SQL 실행 
		result = pstmt.executeUpdate();
		
		//정리
		pstmt.close();
		con.close();
			
		}catch(Exception e) {
			System.out.printf("데이터 삽입 예외:%s\n", e.getMessage());
			e.printStackTrace();
			}
		
		return result;
	}
	
	
	//데이터를 수정하는 메소드 
			public int updateBuy(Buy buy) {
				int result = -1;
				try {
					Connection con = DriverManager.getConnection(
							"jdbc:oracle:thin:@192.168.0.13:1521:xe",
							"user30","user30");
				pstmt = con.prepareStatement(
						"update buy "
						+"set itemname=?, customerid=?, count=? "
						+ " where buycode=?");
				
				//SQL에 물음표가 있으면 실제 데이터로 바인딩 
				pstmt.setString(1, buy.getItemname());
				pstmt.setString(2, buy.getCustomerid());
				pstmt.setInt(3, buy.getCount());
				pstmt.setInt(4, buy.getBuycode());
				
				//SQL 실행 
				result = pstmt.executeUpdate();
				
				//정리
				pstmt.close();
				con.close();
					
				}catch(Exception e) {
					System.out.printf("데이터 삽입 예외:%s\n", e.getMessage());
					e.printStackTrace();
					}
				return result;
			}
			
			
			
			
			//데이터를 삭제하는 메소드
			public int deleteBuy(int buycode) {
				int result = -1;
				try {
					Connection con = DriverManager.getConnection(
							"jdbc:oracle:thin:@192.168.0.13:1521:xe",
							"user30","user30");
				pstmt = con.prepareStatement(
						"delete from buy where buycode=?");
						
				
				//SQL에 물음표가 있으면 실제 데이터로 바인딩 
				pstmt.setInt(1, buycode);
				
				//SQL 실행 
				result = pstmt.executeUpdate();
				
				//정리
				pstmt.close();
				con.close();
					
				}catch(Exception e) {
					System.out.printf("데이터 삭제 예외:%s\n", e.getMessage());
					e.printStackTrace();
					}
				
				
				return result;
	}		
			
			
			//전체 데이터를 조회하는 메소드 
			public List<Buy> getList(){
				List<Buy> list = new ArrayList<>();
				try {
					Connection con = DriverManager.getConnection(
							"jdbc:oracle:thin:@192.168.0.13:1521:xe",
							"user30","user30");
				pstmt = con.prepareStatement(
						"select * from buy");
				//select 구문 실행
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Buy buy = new Buy();
					buy.setBuycode(rs.getInt("buycode"));
					buy.setItemname(rs.getString("itemname"));
					buy.setCustomerid(rs.getString("customerid"));
					buy.setCount(rs.getInt("count"));
					buy.setBuydate(rs.getDate("buydate"));
					list.add(buy);
				}
				
				//정리
				pstmt.close();
				con.close();
					
				}catch(Exception e) {
					System.out.printf("데이터 삭제 예외:%s\n", e.getMessage());
					e.printStackTrace();
					}
				
				return list;
			}		
			
			
			
			
			//기본키를 가지고 조회하는 메소드
			public Buy getBuy(int buycode) {
				Buy buy = null;
				try {
					Connection con = DriverManager.getConnection(
							"jdbc:oracle:thin:@192.168.0.13:1521:xe",
							"user30","user30");
				pstmt = con.prepareStatement(
						"select * from buy where buycode=?");
				pstmt.setInt(1, buycode);
				//select 구문 실행
				rs = pstmt.executeQuery();
				if(rs.next()) {
					buy = new Buy();
					buy.setBuycode(rs.getInt("buycode"));
					buy.setItemname(rs.getString("itemname"));
					buy.setCustomerid(rs.getString("customerid"));
					buy.setCount(rs.getInt("count"));
					buy.setBuydate(rs.getDate("buydate"));
				}
				
				//정리
				pstmt.close();
				con.close();
					
				}catch(Exception e) {
					System.out.printf("데이터 삭제 예외:%s\n", e.getMessage());
					e.printStackTrace();
					}
				
				return buy;
			}	
			
}

			
