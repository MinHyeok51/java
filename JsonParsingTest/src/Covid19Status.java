import java.sql.Date;
import java.time.LocalDateTime;

public class Covid19Status {
//	String mmddhh;				//조회 기준일시
	LocalDateTime status_date;
	int cnt_deaths;				//일일 사망
	int cnt_severe_symptoms;	//일일 재원 위중증
	int cnt_hospitalizations;	//일일 신규입원
	int cnt_confirmations;		//일일 확진자
	
}
