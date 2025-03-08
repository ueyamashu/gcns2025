import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 */
public class JavaSQLStudy2025 {
	/**
	 * 
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:mariadb://ueyamaNAS.synology.me:3307/user", "user", "gcnsDB123!");
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String SQL = "insert into user.calendarlog (input_dt,kbn,msg,detail_msg) values(?,?,?,?);";

		pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1, "202505");
		pstmt.setString(2, "INFO");
		pstmt.setString(3, "ログテストです。");
		pstmt.setString(4, "SQL教育");

		// update, delete, insert文で使われる。
		pstmt.executeUpdate(); 
//		// select文で使われる。
//		rs = pstmt.executeQuery(); 
		conn.close();

	}
}
