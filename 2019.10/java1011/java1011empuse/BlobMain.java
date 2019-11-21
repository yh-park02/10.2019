package java1011empuse;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class BlobMain {

	public static void main(String[] args) {
		//1.blob 저장하기
		/*
		try {
			Connection con = 
				DriverManager.getConnection(
				"jdbc:oracle:thin:"
				+ "@192.168.0.13:1521:xe",
				"user30", "user30");
			PreparedStatement pstmt = 
				con.prepareStatement(
				"insert into blobsample("
				+ "filename, filecontent) "
				+ "values(?,?)");
			
			String filepath = 
				"/Users/a503_18/Documents/"
				+ "teacher/javaapplication/"
				+ "idol1.png";
			FileInputStream fis = 
				new FileInputStream(filepath);
			
			//파일 경로에서 이름만 가져오기
			///로 분할 한 후 가장 마지막 문자열
			String [] ar = filepath.split("/");
			String filename = ar[ar.length-1];
			
			pstmt.setString(1, filename);
			//blob 바인딩
			pstmt.setBinaryStream(2, fis);
			//실행
			pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
			
			
		}catch(Exception e) {
			System.out.printf(
				"blob 저장 예외:%s\n", 
				e.getMessage());
			e.printStackTrace();
			
		}
		*/
		
		//2.blob 읽어오기
		try {
			Connection con = 
				DriverManager.getConnection(
				"jdbc:oracle:thin:"
				+ "@192.168.0.13:1521:xe",
				"user30", "user30");
			//프로시저를 실행할 수 있는 객체를 생성
			CallableStatement call = 
				con.prepareCall(
					"{call myproc(?,?,?)}");
			call.setInt(1, 77);
			call.setString(2, "회계");
			call.setString(3, "영월");
			
			call.executeUpdate();
			
			call.close();
			con.close();
			

		}catch(Exception e) {
			System.out.printf(
				"프로시저 실행 예외:%s\n", 
				e.getMessage());
			e.printStackTrace();
		}

	}

}








