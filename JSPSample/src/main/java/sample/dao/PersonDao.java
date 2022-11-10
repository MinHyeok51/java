package sample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sample.dto.PersonInfo;

public class PersonDao {
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
	public List<PersonInfo> selectPersonInfoList(){
		String sql = "SELECT id , name FROM t_person_info2 ORDER BY id";
		List<PersonInfo> personInfoList = null;
		
		try {
			connect();
			
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			personInfoList = new ArrayList<PersonInfo>();
			while(rs.next()) {
				PersonInfo personInfo = new PersonInfo();
				personInfo.setId(rs.getInt("id"));
				personInfo.setName(rs.getString("name"));
				
				personInfoList.add(personInfo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return personInfoList;
	}
	
	public PersonInfo selectPersonInfoBYId(int id){
		String sql = "SELECT id , name FROM t_person_info2 WHERE id = ?";
		PersonInfo personInfo = null;
		
		try {
			connect();
			
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			rs = psmt.executeQuery();
			
			personInfo = new PersonInfo();
			if(rs.next()) {
				personInfo.setId(rs.getInt("id"));
				personInfo.setName(rs.getString("name"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return personInfo;
	}
	
	public int insertPersonInfo(String name) {
		String sql = "INSERT INTO t_person_info2"
				+ " VALUES( (SELECT NVL(max(id),0) +1 from t_person_info2), ?)";
		int result = 0;
		
		try {
			connect();
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			
			result = psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnect();
		}
		
		return result;
	}
	
	public int updatePersonInfo(PersonInfo personInfo) {
		String sql = "UPDATE t_person_info2"
				+ " SET name = ?"
				+ " WHERE id =? ";
		int result = 0;
		
		try {
			connect();
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, personInfo.getName());
			psmt.setInt(2, personInfo.getId());
			
			result = psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnect();
		}
		
		return result;
	}
	
	public int deletePersonInfo(int id) {
		String sql = "DELETE FROM t_person_info2"
				+ " WHERE id =? ";
		int result = 0;
		
		try {
			connect();
			
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1,id);
			
			result = psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConnect();
		}
		
		return result;
	}
}
