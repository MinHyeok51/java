import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Dao {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	public void connect() throws Exception {
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe"; // 접속 DB정보
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
	
	
	public void mergeCovid19Status(Covid19Status cs) {
		
		String sqlQuery = "MERGE "
				+ " INTO t_covid19_status2 c"
				+ " USING dual"
				+ " ON (c.status_date = to_char(sysdate,'YY-MM-DD'))"
				+ " WHEN MATCHED THEN"
				+ "      UPDATE"
				+ "         SET c.cnt_deaths =? , c.cnt_severe_symptoms=? , c.cnt_hospitalizations =?"
				+ "				,c.cnt_confirmations =?"
				+ " WHEN NOT MATCHED THEN"
				+ "      INSERT (c.status_date,c.cnt_deaths , c.cnt_severe_symptoms , c.cnt_hospitalizations "
				+ "				,c.cnt_confirmations )"
				+ "      VALUES (to_char(sysdate,'YY-MM-DD'), ?, ?,?,?)";
		try {
			connect();
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, cs.cnt_deaths);
			psmt.setInt(2, cs.cnt_severe_symptoms);
			psmt.setInt(3, cs.cnt_hospitalizations);
			psmt.setInt(4, cs.cnt_confirmations);
			
			psmt.setInt(5, cs.cnt_deaths);
			psmt.setInt(6, cs.cnt_severe_symptoms);
			psmt.setInt(7, cs.cnt_hospitalizations);
			psmt.setInt(8, cs.cnt_confirmations);

			int resultCnt = psmt.executeUpdate(); // executeQuery -> Select -> ResultSet
			// executeUpdate -> insert, delete, update -> int
			if(resultCnt>0) {
			System.out.println("merge 성공");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disConnect();
	}
	}
	
	
	
		
	public List<Covid19Status> selectCovid19Status() {
		String sqlQuery = "select * from t_covid19_status";
		List<Covid19Status> covidInfo = null;
		try {
			connect();
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			covidInfo = new ArrayList<Covid19Status>();
			while (rs.next()) {
				Covid19Status cs = new Covid19Status();
				cs.status_date =rs.getTimestamp("status_date").toLocalDateTime();
				cs.cnt_deaths =rs.getInt("cnt_deaths");
				cs.cnt_severe_symptoms = rs.getInt("cnt_severe_symptoms");
				cs.cnt_hospitalizations = rs.getInt("cnt_hospitalizations");
				cs.cnt_confirmations = rs.getInt("cnt_confirmations");
				
				covidInfo.add(cs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return covidInfo;
	}
	
	/*
	 * update t_covid19_status2 set cnt_deaths = 10 , cnt_severe_symptoms=10 , cnt_hospitalizations =10
				,cnt_confirmations =10
				where status_date = (select c.status_date from t_covid19_status2 c)  ;*/
	public void updateCovid19Status(Covid19Status cs) {
		String sqlQuery = "update t_covid19_status2 set cnt_deaths = ? , cnt_severe_symptoms=?  ,cnt_hospitalizations =?"
				+ " ,cnt_confirmations =? "
				+ " where status_date = to_char(sysdate,'YY-MM-DD')";
		try {
			connect();
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, cs.cnt_deaths);
			psmt.setInt(2, cs.cnt_severe_symptoms);
			psmt.setInt(3, cs.cnt_hospitalizations);
			psmt.setInt(4, cs.cnt_confirmations);

			int resultCnt = psmt.executeUpdate(); // executeQuery -> Select -> ResultSet
			// executeUpdate -> insert, delete, update -> int
			if(resultCnt >0) {
			System.out.println("update성공");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disConnect();
	}
	}
	
	
	public void insertCovid19Status(Covid19Status covid19Status) {
		// 연결 부분
//		String sqlQuery = "INSERT INTO t_covid19_status VALUES( ?, ?, ?, ?, ?, "
//				+ " (SELECT NVL(MAX(no), 0) + 1 from t_covid19_status "
//				+ " WHERE TO_CHAR(status_date, 'YYYY-MM-DD') = TO_CHAR(SYSDATE, 'YYYY-MM-DD')))";
		//sql 쿼리에서 현재 시간 처리하기
		String sqlQuery = "INSERT INTO t_covid19_status2 VALUES( ?, ?, ?, ?, ?)";
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
	

	public void insertMovieInfo(TmdbData tmdb) {
	
		String sqlQuery = "INSERT INTO movie_info VALUES( ?, ?)";
		try {
			connect();
			psmt = conn.prepareStatement(sqlQuery);
		
			psmt.setString(1, tmdb.title);  
			psmt.setString(2, tmdb.poster_path);

			int resultCnt = psmt.executeUpdate();
			if(resultCnt > 0) {
				System.out.println("Insert 성공");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
	}
	public List<TmdbData> selectTmdbStatus() {
		String sqlQuery = "select * from movie_info";
		List<TmdbData> tmdbList = null;
		try {
			connect();
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			tmdbList = new ArrayList<TmdbData>();
			while (rs.next()) {
				TmdbData tmdb = new TmdbData();
				tmdb.title = rs.getString("title");
				tmdb.poster_path = rs.getString("poster_path");
				
				tmdbList.add(tmdb);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return tmdbList;
	}
}

/*	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class DataDao {

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
	
	public void insertJsonUser(JsonUser jUser) {
		// 연결 부분

		String sqlQuery = "INSERT INTO json_users VALUES( ?, ?, ?, ?, ?, ?)";
		try {
			connect();

			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, jUser.userId);
			psmt.setString(2, jUser.firstName);
			psmt.setString(3, jUser.lastName);
			psmt.setString(4, jUser.emailAddress);
			psmt.setString(5, jUser.phoneNumber);
			psmt.setString(6, jUser.homepage);

			int resultCnt = psmt.executeUpdate(); 
			System.out.println(resultCnt);
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
	
	//selectCovid19Status
	//insertCovid19Status
	//deleteCovid19Status
	//updateCovid19Status
	public Covid19Status selectCovid19StatusByDate(Covid19Status covid19Status) {
		String sqlQuery = "SELECT * FROM t_covid19_status "
						+ " WHERE TO_CHAR(status_date, 'YYYYMMDD') = TO_CHAR(? , 'YYYYMMDD')";
		
		Covid19Status result = null;
		try {
			connect();
			
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setTimestamp(1, Timestamp.valueOf(covid19Status.status_date));
			
			rs = psmt.executeQuery();
			if(rs.next()) {
				result = new Covid19Status();
				result.status_date = rs.getTimestamp(1).toLocalDateTime();
				result.cnt_deaths = rs.getInt(2);
				result.cnt_severe_symptoms = rs.getInt(3);
				result.cnt_hospitalizations = rs.getInt(4);
				result.cnt_confirmations = rs.getInt(5);
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
		return result;
	}
	
	public void updateCovid19Status(Covid19Status covid19Status) {
		String sqlQuery = " UPDATE t_covid19_status"
					+ " SET cnt_deaths = ?,"
					+ "    cnt_severe_symptoms = ?,"
					+ "    cnt_hospitalizations = ?,"
					+ "    cnt_confirmations = ?"
					+ " WHERE TO_CHAR(status_date, 'YYYYMMDD') = TO_CHAR(? , 'YYYYMMDD')";
		try {
			connect();

			psmt = conn.prepareStatement(sqlQuery);
			
			psmt.setInt(1, covid19Status.cnt_deaths);
			psmt.setInt(2, covid19Status.cnt_severe_symptoms);
			psmt.setInt(3, covid19Status.cnt_hospitalizations);
			psmt.setInt(4, covid19Status.cnt_confirmations);
			psmt.setTimestamp(5, Timestamp.valueOf(covid19Status.status_date));  //Date 경우

			int resultCnt = psmt.executeUpdate();
			if(resultCnt > 0) {
				System.out.println("Update 성공");
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
	
	public void mergeCovid19Status(Covid19Status covid19Status) {
		// 연결 부분

		
//	MERGE INTO t_covid19_status2 A
//USING (SELECT SYSDATE status_date
//            , 90 cnt_deaths
//            , 90 cnt_severe_symptoms
//            , 90 cnt_hospitalizations
//            , 110 cnt_confirmations
//            from dual) B 
//    ON (TO_CHAR(A.status_date, 'YYYYMMDD') = TO_CHAR(B.status_date, 'YYYYMMDD'))
//WHEN MATCHED THEN
//    UPDATE SET A.cnt_deaths = B.cnt_deaths
//              ,A.cnt_severe_symptoms = B.cnt_severe_symptoms
//              ,A.cnt_hospitalizations = B.cnt_hospitalizations
//              ,A.cnt_confirmations = B.cnt_confirmations
//WHEN NOT MATCHED THEN
//    INSERT VALUES (B.status_date
//                , B.cnt_deaths
//                , B.cnt_severe_symptoms
//                , B.cnt_hospitalizations
//                , B.cnt_confirmations); 
		 
	
		
		
		String sqlQuery = "MERGE INTO t_covid19_status A "
				+ " USING (SELECT SYSDATE status_date "
				+ "            , ? cnt_deaths "
				+ "            , ? cnt_severe_symptoms "
				+ "            , ? cnt_hospitalizations "
				+ "            , ? cnt_confirmations "
				+ "            from dual) B  "
				+ "    ON (TO_CHAR(A.status_date, 'YYYYMMDD') = TO_CHAR(B.status_date, 'YYYYMMDD')) "
				+ " WHEN MATCHED THEN "
				+ "    UPDATE SET A.cnt_deaths = B.cnt_deaths "
				+ "              ,A.cnt_severe_symptoms = B.cnt_severe_symptoms "
				+ "              ,A.cnt_hospitalizations = B.cnt_hospitalizations "
				+ "              ,A.cnt_confirmations = B.cnt_confirmations "
				+ " WHEN NOT MATCHED THEN "
				+ "    INSERT VALUES (B.status_date "
				+ "                , B.cnt_deaths "
				+ "                , B.cnt_severe_symptoms "
				+ "                , B.cnt_hospitalizations "
				+ "                , B.cnt_confirmations) ";
		//sql 쿼리에서 현재 시간 처리하기
//		String sqlQuery = "INSERT INTO t_covid19_status VALUES( SYSDATE, ?, ?, ?, ?)";
		try {
			connect();

			psmt = conn.prepareStatement(sqlQuery);
			
			//1번 String 으로 그냥 넣기
			//psmt.setString(1, covid19Status.status_date);
			
			//2번 현재시간으로 변경해서 Date에 넣기
			//3번 mmddhh 에서 추출해서 Date에 넣기
//			psmt.setTimestamp(1, Timestamp.valueOf(covid19Status.status_date));  //Date 경우
			psmt.setInt(1, covid19Status.cnt_deaths);
			psmt.setInt(2, covid19Status.cnt_severe_symptoms);
			psmt.setInt(3, covid19Status.cnt_hospitalizations);
			psmt.setInt(4, covid19Status.cnt_confirmations);

			int resultCnt = psmt.executeUpdate();
			if(resultCnt > 0) {
				System.out.println("Merge 성공");
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

	public void insertCovid19Status(Covid19Status covid19Status) {
		// 연결 부분

		//no 가 있는 버전
//		String sqlQuery = "INSERT INTO t_covid19_status VALUES( ?, ?, ?, ?, ?, "
//				+ " (SELECT NVL(MAX(no), 0) + 1 from t_covid19_status "
//				+ " WHERE TO_CHAR(status_date, 'YYYY-MM-DD') = TO_CHAR(SYSDATE, 'YYYY-MM-DD')))";
		String sqlQuery = "INSERT INTO t_covid19_status VALUES( ?, ?, ?, ?, ?)";
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
 
 */
