import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class Dao {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	public void connect() throws Exception {
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl"; // 접속 DB정보
		String db_id = "scott"; // 접속 아이디
		String db_pw = "tiger"; // 접속 아이디의 비밀번호

		Class.forName("oracle.jdbc.driver.OracleDriver");

		if(conn != null) {
			conn.close();
		}
		conn = DriverManager.getConnection(db_url, db_id, db_pw);
	}

	public void disConnect() {
		try {
			if(rs != null) {
				rs.close();	
			}
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  void insertJsonUser(JsonUser ju) {

		String sqlQuery = "INSERT INTO json_users VALUES( ?, ?, ?,?,?,?)";
		try {
			connect();
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, ju.userId);
			psmt.setString(2, ju.firstName);
			psmt.setString(3, ju.lastName);
			psmt.setString(4, ju.emailAddress);
			psmt.setString(5, ju.phoneNumber);
			psmt.setString(6, ju.homepage);

			int resultCnt = psmt.executeUpdate(); // executeQuery -> Select -> ResultSet
			System.out.println(resultCnt);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
	}
	public void insertCovid19Status(Covid19Status covid19Status) {
		// 연결 부분

		String sqlQuery = "INSERT INTO t_covid19_status VALUES( ?, ?, ?, ?, ?, "
				+ " (SELECT NVL(MAX(no), 0) + 1 from t_covid19_status "
				+ " WHERE TO_CHAR(status_date, 'YYYY-MM-DD') = TO_CHAR(SYSDATE, 'YYYY-MM-DD')))";
		//sql 쿼리에서 현재 시간 처리하기
//		String sqlQuery = "INSERT INTO t_covid19_status VALUES( SYSDATE, ?, ?, ?, ?)";
		try {
			connect();

			psmt = conn.prepareStatement(sqlQuery);
			
			//1번 String 으로 그냥 넣기
			//psmt.setString(1, covid19Status.status_date);
			
			//2번 현재시간으로 변경해서 Date에 넣기
			//3번 mmddhh 에서 추출해서 Date에 넣기
			psmt.setTimestamp(1, Timestamp.valueOf(covid19Status.status_date));  //Date 경우
			psmt.setInt(2, covid19Status.cnt_deaths);
			psmt.setInt(3, covid19Status.cnt_severe_symptoms);
			psmt.setInt(4, covid19Status.cnt_hospitalizations);
			psmt.setInt(5, covid19Status.cnt_confirmations);

			int resultCnt = psmt.executeUpdate();
			if(resultCnt > 0) {
				System.out.println("Insert 성공");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disConnect();
		}
	}
}
