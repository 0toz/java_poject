package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex06_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<VO> list = new ArrayList<VO>();
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
			esc:
			while(true) {
				System.out.print("학번 : ");
				int no = sc.nextInt();
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("학과 : ");
				String det = sc.next();
				System.out.print("주소 : ");
				String addr = sc.next();
				System.out.print("전화 : ");
				String tel = sc.next();
				
				list.add(new VO(no, name, det, addr, tel));
				
				
				while(true) {
					System.out.print("계속할까요? (y/n) ");
					String msg = sc.next();
					if(msg.equalsIgnoreCase("y")) {
						continue esc;
					}else if(msg.equalsIgnoreCase("n")) {
						break esc;
					}else {
						continue;
					}
				}
			}
			for (int i = 0; i < list.size(); i++) {
				String sql = "insert into student_db(no, name, det, addr , tel ) values("
						+ list.get(i).getNo()+ ", '"
						+ list.get(i).getName() +"', '"
						+ list.get(i).getDet() +"', '"
						+ list.get(i).getAddr() + "', '"
						+ list.get(i).getTel() + "')";
				stmt = conn.createStatement();
				// select 문이 아닌경우.
				result = stmt.executeUpdate(sql);
				if(result<0) {
					System.out.println("오류발생");
				}
			}

			System.out.println("번호\t이름\t학과\t주소\t전화");
			while(rs.next()) {
				System.out.println(rs.getInt("no")+ "\t");
				System.out.println(rs.getString("name")+ "\t");
				System.out.println(rs.getString("det")+ "\t");
				System.out.println(rs.getString("addr")+ "\t");
				System.out.println(rs.getString("tel")+ "\t");
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
