package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex01 {
	public static void main(String[] args) {
		
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			// 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 로컬 호스트로 생성시 ㅁ 
			String url = "jdbc:mysql://localhost/ test01?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01" ;
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
		
					
					// 쿼리문 작성. 
			// String sql = "select * from customer";
			String sql = "insert into customer(custid, name, address, phone) values(6, '손흥민', '영국런던','000-9000-0001')";
			
			stmt = conn.createStatement();
			// 5. Statement 클래스에 쿼리 저장후  DB에 결과를 받아서 처리.
			// 이떄 두가지로 나눠짐. select문일때와 select문이 아닐때로.
			//stmt.execute(sql);
			
			//rs = stmt.executeQuery(sql);
			
			//select 문이 아닌경우. 
			// result = stmt.executeUpdate
			result = stmt.executeUpdate(sql);
			
			// 결과보기.
//			while (rs.next()) {
//				System.out.print(rs.getInt("custid"+"\t"));
//				System.out.print(rs.getString("name"+"\t"));
//				System.out.print(rs.getString("address"+"\t"));
//				System.out.print(rs.getString("phone"));
//			}
			
			
			if(result > 0) {
				System.out.println("삽입 성공");
				
				sql = "select * from customer";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getInt("custid"+"\t"));
					System.out.print(rs.getString("name"+"\t"));
					System.out.print(rs.getString("address"+"\t"));
					System.out.print(rs.getString("phone"));
				}
			}
			else {
				System.out.println("삽입 실패-1");
			}
			
		} catch (Exception e) {
			System.out.println("삽입 실패-2");
			
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
