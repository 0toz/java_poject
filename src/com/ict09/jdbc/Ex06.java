package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex06 {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			// 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 로컬 호스트로 생성시 ㅁ
			String url = "jdbc:mysql://127.0.0.1/ test02?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test02";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);

	
			String sql = "insert into student_db(no, name, det, addr , tel ) values(1, '홍길동', '정통','서울', '000-0000-0000')";

			stmt = conn.createStatement();
			// select 문이 아닌경우.
			result = stmt.executeUpdate(sql);

			if (result > 0) {
				System.out.println("삽입 성공");

				sql = "select * from student_db";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getInt("no") + "\t");
					System.out.print(rs.getString("name") + "\t");
					System.out.print(rs.getString("det") + "\t");
					System.out.print(rs.getString("addr") + "\t");
					System.out.println(rs.getString("tel"));
				}
			} else {
				System.out.println("삽입 실패-1");
			}

		} catch (Exception e) {
			System.out.println("삽입 실패-2");

		} finally {
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
