import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;



public class MyDataDao { //DB에 접근 및 처리하는 기능 클래스

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


	public List<ArriveItem> selectArriveList() {
		// 연결 부분


		List<ArriveItem> arriveItemList = null;
		String sqlQuery = "select * from t_arrive_list";
		try {
			connect();
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			arriveItemList = new ArrayList<ArriveItem>();
			while (rs.next()) {
				ArriveItem ai = new ArriveItem();

				ai.name = rs.getString("name");
				ai.arivDate = rs.getTimestamp("ariv_date").toLocalDateTime();
				ai.arivTs = rs.getTimestamp("ariv_ts").toLocalDateTime();

				arriveItemList.add(ai);
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

		return arriveItemList;
	}

	public  void insertArriveList(ArriveItem ai) {
		// TODO Auto-generated method stub
		// 연결 부분
		/*
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl"; // 접속 DB정보
		String db_id = "scott"; // 접속 아이디
		String db_pw = "tiger"; // 접속 아이디의 비밀번호


		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/


		// 사용하는 부분
		// String sqlQuery = "select * from t_person_info";
		// select empno, ename, hiredate from emp;
		//		String sqlQuery = "INSERT INTO t_arrive_list VALUES( ?, SYSDATE, SYSTIMESTAMP)";
		String sqlQuery = "INSERT INTO t_arrive_list VALUES( ?, ?, ?)";
		try {
			connect();
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setString(1, ai.name);
			psmt.setTimestamp(2, Timestamp.valueOf(ai.arivDate));
			psmt.setTimestamp(3, Timestamp.valueOf(ai.arivTs));

			int resultCnt = psmt.executeUpdate(); // executeQuery -> Select -> ResultSet
			// executeUpdate -> insert, delete, update -> int
			System.out.println(resultCnt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disConnect();
			//			try {
			//				if (rs != null) {
			//					rs.close();
			//				}
			//				if (psmt != null) {
			//					psmt.close();
			//				}
			//				if (conn != null) {
			//					conn.close();
			//				}
			//			} catch (SQLException e) {
			//				// TODO Auto-generated catch block
			//				e.printStackTrace();
			//			}

		}
	}

	public List<EmpInfo> selectEmpInfoList() {
		// 사용하는 부분
		// String sqlQuery = "select * from t_person_info";
		// select empno, ename, hiredate from emp;
		List<EmpInfo> empInfoList = null;
		String sqlQuery = "select empno, ename, hiredate from emp";
		try {
			connect();
			psmt = conn.prepareStatement(sqlQuery);

			rs = psmt.executeQuery();
			empInfoList = new ArrayList<EmpInfo>();
			while (rs.next()) {
				EmpInfo ei = new EmpInfo();
				ei.empno = rs.getInt("empno");
				ei.ename = rs.getString("ename");
				ei.hiredate = rs.getTimestamp("hiredate").toLocalDateTime();
				empInfoList.add(ei);
				//				System.out.println(rs.getInt("empno") + " - " + rs.getString(2) + " - " + rs.getDate("hiredate"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return empInfoList;

	}

	public  List<HobbyItem> selectHobbyList() {
		// 연결 부분
		List<HobbyItem> hobbyItemList = null;

		// 사용하는 부분
		// String sqlQuery = "select * from t_person_info";
		String sqlQuery = "select id, hobby, no, prefer from t_hobby_list";
		try {
			connect();
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			hobbyItemList = new ArrayList<HobbyItem>();

			while (rs.next()) {
				HobbyItem hobbyItem = new HobbyItem();
				hobbyItem.id = rs.getInt("id");
				hobbyItem.no = rs.getInt("no");
				hobbyItem.hobby = rs.getString("hobby");
				hobbyItem.prefer = rs.getInt("prefer");

				hobbyItemList.add(hobbyItem);

				//				System.out.println(rs.getInt("id") + " - " + rs.getInt("no") + " - " + rs.getString("hobby") + " - "
				//						+ rs.getInt("prefer"));
				//
				//				System.out
				//						.println(rs.getInt(1) + " - " + rs.getInt(3) + " - " + rs.getString(2) + " - " + rs.getInt(4));

				// System.out.println(rs.getInt("id"));
				// System.out.println(rs.getString("name"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return hobbyItemList;
	}

	public void updateHobbyList(HobbyItem hi) {
		//주어진 id와 no에 일치하는 hobby와 prefer업데이트
		//1.connection
		//2. update 쿼리준비
		//UPDATE 기준은 매개변수 Hobby Item
		//3.업데이트 실행 executeUpdate
		//4.close
		String sqlQuery = "update t_hobby_list set hobby = ? , prefer=? where id = ? and no = ?";
		try {
			connect();
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setString(1, hi.hobby);
			psmt.setInt(2, hi.prefer);
			psmt.setInt(3, hi.id);
			psmt.setInt(4, hi.no);

			int resultCnt = psmt.executeUpdate(); // executeQuery -> Select -> ResultSet
			// executeUpdate -> insert, delete, update -> int
			System.out.println(resultCnt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disConnect();
	}
}
	
	public void deleteHobbyList(HobbyItem hi) {
		//주어진 id와 no에 해당하는 Row 삭제
		//1.connection
		//2. delete 쿼리준비
		//DELETE 기준은 매개변수 Hobby Item
		//3.업데이트 실행 executeUpdate
		//4.close
		String sqlQuery = "delete  from t_hobby_list where id = ? and no = ?";
		try {
			connect();
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, hi.id);
			psmt.setInt(2, hi.no);

			int resultCnt = psmt.executeUpdate(); // executeQuery -> Select -> ResultSet
			// executeUpdate -> insert, delete, update -> int
			System.out.println(resultCnt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disConnect();
	}
	}


	public List<Professor>  selectProfessorListByDeptno(int deptno){
		List<Professor> proflist = null;
		String sqlQuery = "select profno, name, id, position, pay, hiredate, deptno from professor where deptno =?";
		try {
			connect();
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, deptno);
			//			setInt(물음표가 나오는 순서가 몇번째인지,deptno);
			rs = psmt.executeQuery();

			proflist = new ArrayList<Professor>();
			while (rs.next()) {
				Professor prof = new Professor();

				prof.profno = rs.getInt("profno");
				prof.name = rs.getString("name");
				prof.id = rs.getString("id");
				prof.position= rs.getString("position");
				prof.pay= rs.getInt("pay");
				prof.hiredate= rs.getTimestamp("hiredate").toLocalDateTime();
				prof.hiredate2= rs.getDate("hiredate");
				prof.deptno = rs.getInt("deptno");

				proflist.add(prof);
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

		return proflist;
	}
}
/*
 * ------------------------------------------------------------------------------------
private static List<ArriveItem> selectArriveList() {
	// TODO Auto-generated method stub
	// 연결 부분
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String db_url = "jdbc:oracle:thin:@localhost:1521:xe"; // 접속 DB정보
	String db_id = "scott"; // 접속 아이디
	String db_pw = "tiger"; // 접속 아이디의 비밀번호

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	List<ArriveItem> arriveItemList = null;

	try {
		conn = DriverManager.getConnection(db_url, db_id, db_pw);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	// 사용하는 부분
	// String sqlQuery = "select * from t_person_info";
	// select empno, ename, hiredate from emp;
	String sqlQuery = "select * from t_arrive_list";
	try {

		psmt = conn.prepareStatement(sqlQuery);

		rs = psmt.executeQuery();

		arriveItemList = new ArrayList<ArriveItem>();
		while (rs.next()) {
			ArriveItem ai = new ArriveItem();

			ai.name = rs.getString("name");
			ai.arivDate = rs.getTimestamp("ariv_date").toLocalDateTime();
			ai.arivTs = rs.getTimestamp("ariv_ts").toLocalDateTime();

			arriveItemList.add(ai);

//			System.out.println(rs.getString("name") + " - " + rs.getTimestamp("ariv_date") + " - " 
//						+ rs.getTimestamp("ariv_ts"));
		}

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {

		try {
			rs.close();
			psmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	return arriveItemList;
}
 */
