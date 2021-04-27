package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Ex05 {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet	rs = null;
		int result = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/ test01?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test02" ;
			String password = "1111";
			
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "Create table student_tb (	No int primary key not null, name char(10),	det char(20), addr char(80), tel char(20))";
			
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			if(result > 0) {
				System.out.println("생성 성공");
				
				sql = "select * from student_tb";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getInt("학번")+"\t");
					System.out.print(rs.getString("성명")+"\t");
					System.out.print(rs.getString("전공")+"\t");
					System.out.print(rs.getString("주소")+"\t");
					System.out.println(rs.getString("전화번호"));
				}
			}else {
				System.out.println("생성실패1");
			}
			
		} catch (Exception e) {
			System.out.println("생성실패2");
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
