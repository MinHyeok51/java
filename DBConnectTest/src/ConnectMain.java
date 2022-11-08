import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConnectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDataDao myDataDao = new MyDataDao();
		
//		List<ArriveItem> arriveItemList = myDataDao.selectArriveList();
//		
//		for(ArriveItem ai : arriveItemList) {
//			System.out.println(ai.toString());
//		}
		
//		List<EmpInfo> empInfoList = myDataDao.selectEmpInfoList();
//		for(int i=0; i<empInfoList.size(); i++) {
//			System.out.println(empInfoList.get(i).toString());
//		}
		
		
//		List<Professor> proflist = myDataDao.selectProfessorListByDeptno(203);
//		for(int i=0; i<proflist.size(); i++) {
//			System.out.println(proflist.get(i).toString());
//		}
		
		HobbyItem hi1 = new HobbyItem();
		hi1.id =44;
		hi1.no =2;
		hi1.hobby = "헬스";
		hi1.prefer = 10;
		myDataDao.updateHobbyList(hi1);
		
		HobbyItem hi2 = new HobbyItem();
		hi2.id = 45;
		hi2.no = 3;
		myDataDao.deleteHobbyList(hi2);
		
		
		//클래스
		//DAO - 속성, 생성자, 메소드
		//DTO, VO - 속성, 생성자, getter/setter
		
		//DAO, DTO, VO 구조로 개발
		//Data Access Object
		//Data Transfer Object
		//자바 -> 데이터 요청(page, rowsNum, type) -> DB 
		//Value Object -> 특정 데이터를 담든 용도
		
//		selectHobbyList();

//		selectEmpInfo();

//		String name = "강수림";
//		ArriveItem ai = new ArriveItem();
//		ai.name = "이다연";
//		ai.arivDate = LocalDateTime.of(2022, 11, 4, 8, 45);
//		ai.arivTs = LocalDateTime.of(2022, 11, 4, 8, 45, 30);
//		insertArriveList(ai);


		
//		List<HobbyItem> hobbyItemList  = myDataDao.selectHobbyList();
		//HobbyList 테이블에 있는 데이터 한 줄(ROW) 를 담을수 있는 Class 생성 
		//selectHobbyList 메소드 -> Return 타입 변경. void -> 어떤 객체 리스트
		//select 이후 넘어온 ResultSet 을 잘 읽어서 
		//                       -> 데이터를 객체 형태로 만들어서
		//						 -> List에 잘 Add 추가해서 -> Return
		//데이터가 Return으로 넘어온걸 차례대로 출력.
		
//		for(int i=0; i<hobbyItemList.size(); i++ ) {
//			System.out.println(hobbyItemList.get(i).toString());
//		}
	}
}
