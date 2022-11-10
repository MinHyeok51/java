import java.sql.Date;
import java.time.LocalDateTime;

public class Covid19Status {
//	String mmddhh;				//조회 기준일시
	LocalDateTime status_date;
	int cnt_deaths;				//일일 사망
	int cnt_severe_symptoms;	//일일 재원 위중증
	int cnt_hospitalizations;	//일일 신규입원
	int cnt_confirmations;		//일일 확진자
	
	@Override
	public String toString() {
		return "Covid19Status [status_date=" + status_date + ", cnt_deaths=" + cnt_deaths + ", cnt_severe_symptoms="
				+ cnt_severe_symptoms + ", cnt_hospitalizations=" + cnt_hospitalizations + ", cnt_confirmations="
				+ cnt_confirmations + "]";
	}
}

/*
 * CREATE 
--DROP 
TABLE t_covid19_status(
    status_date varchar2(16),
    cnt_deaths number,
    cnt_severe_symptoms number,
    cnt_hospitalizations number,
    cnt_confirmations number
);
--추가 옵션용
CREATE TABLE t_covid19_status(
    status_date date,
    cnt_deaths number,
    cnt_severe_symptoms number,
    cnt_hospitalizations number,
    cnt_confirmations number,
    no number
);
 */
