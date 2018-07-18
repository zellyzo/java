package zelly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCon {
	public static void main(String[] args) {
		Connection con;
		String url = "jdbc:mariadb://127.0.0.1:3306/oreo";
		String id = "root";
		String pwd = "12345678";

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pwd);
			Statement stnt = con.createStatement(); // mariaDB 접속
			String sql = "select * from user_info"; // Query로 이동
			ResultSet rs = stnt.executeQuery(sql); // Ctrl + Shift + F9
			while (rs.next()) { // next 하기 전 까지 다음 값이 절대 안 나옴
				int uNum = rs.getInt("uNum");
				int uAge = rs.getInt("uAge");
				String uName = rs.getString("uName");
				String uAddress = rs.getString("uAddress");
				String uEtc = rs.getString("uEtc");
				System.out.println(uNum + ". " + uName + " / " + uAge + "00원/ " + uAddress + uEtc);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("연결 실패");
		}
		System.out.println("완료");
	}
}