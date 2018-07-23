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
				System.out.println("1�� ���� �Ϸ�");
			} else {
				System.out.println("1�� ����");
			}
			sql = "insert into user_info(uName,uAge,uAddress,uEtc)";
			sql = "values('�����۽�',30,'�ؿ�','����')";

			cnt = stm.executeUpdate(sql);
			if (cnt == 1) {
				System.out.println("1�� ��� �Ϸ�");
			} else {
				System.out.println("1�� ��� ����");
			}
			sql = "update user_info set uName = '��������Ĩ' where uNum=2";
			cnt = stm.executeUpdate(sql);
			if (cnt == 1) { 
				System.out.println("���� �Ϸ�");
			} else {
				System.out.println("���� ����");
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
			System.out.println("���ӿ���");
		}
		System.out.println("END");
	}
}