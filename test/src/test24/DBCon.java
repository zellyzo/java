package test24;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DBCon {
	public static void main(String[] args) {
		Connection con;
		String url = "jdbc:mariadb://127.0.0.1:3306/biscuit";
		String id = "root";
		String pwd = "12345678";
 
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pwd);
			Statement stm = con.createStatement();
			String sql = "delete from user_info where uNum=1";
			int cnt = stm.executeUpdate(sql);
			stm.executeUpdate(sql);
			if (cnt == 1) {
				System.out.println("1번 삭제 완료");
			} else {
				System.out.println("1번 없음");
			}
			sql = "insert into user_info(uName,uAge,uAddress,uEtc)";
			sql = "values('프링글스',30,'해외','과자')";

			cnt = stm.executeUpdate(sql);
			if (cnt == 1) {
				System.out.println("1번 등록 완료");
			} else {
				System.out.println("1번 등록 에러");
			}
			sql = "update user_info set uName = '포테이토칩' where uNum=2";
			cnt = stm.executeUpdate(sql);
			if (cnt == 1) { 
				System.out.println("수정 완료");
			} else {
				System.out.println("수정 에러");
			}
			sql = "select * from user_info";
			
			
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt("uNum"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver ");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("접속오류");
		}
		System.out.println("END");
	}
}