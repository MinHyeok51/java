package study023;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Calendar_main {

	public static void main(String[] args) {
//		YEAR	년도를 나타냅니다.
//		MONTH	월을 나타내는데, 이때 1월을 상수 0으로 대응이 됩니다. 그래서 실제 월을 구할때는 +1을 해주어야합니다.
//		DATE, DAY_OF_MONTH	월의 날짜를 의미합니다.
//		DAY_OF_WEEK	일주일에 해당되는 요일을 의미합니다. 일요일부터 시작이며 일요일은 1입니다. 수요일은 4의 값을 갖습니다.
//		HOUR	시간을 표시하는데 12시간 단위의 시간을 의미합니다.
//		HOUR_OF_DAY	시간을 표시하는데 24시간 단위의 시간을 의미합니다.
//		MINUTE	분을 의미하는 필드입니다.
//		SECOND	초를 의마하는 필드입니다.
//		MILLISECOND	밀리 세건드 단위를 의미하는 필드입니다
//		JANUARY	1월을 나타냅니다. 0의 값을 갖고 있습니다.
//		월을 나타내는 필드는 전부 대문자입니다. 2월을 FEBURARY, 3월은 MARCH입니다. 각 숫자는 월-1에 값을 갖습니다.
//		SUNDAY	일요일에 해당하는 값이며 1을 가집니다. 요일을 나타내는 상수도 마찬가지로 전부 대문자로 표시할 수 있으며 
//		SUNDAY의 1부터 SATURDAY의 7까지 나타낼 수 있습니다.
		
		//Scanner로 연월 읽어들이기(199810)
		//이번달의 달력을 출력
		// 일 월 화 수 목 금 토 
		//                1
		// 2  3  4 5 6  7 8
		// 9 10 11 12 13 14 15
		//16 17 18 19 20 21 22
		//23 24 25 26 27 28 29 
		//30 31
//		Date now  = new Date(2022,10,0);//이번달 마지막날 나오고
//		Date now  = new Date(2022,10,1);//다음달 1일 나오고
//		Date now  = new Date(2022,9,1);
//		System.out.println(now); 
//		for(int i=0; i<now.getMonth(); i++) {
//			System.out.print(String.format("%02d ",now.getDate()+i));
//		}
//		for(int i=0; i<now.getDay(); i++) {
//			System.out.print(String.format("%02d ",now.getDay()));
//		}
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.MONTH));
		
		Scanner s = new Scanner(System.in);
		System.out.println("연월(6자리)를 입력하시오:");
		String oneday=s.nextLine(); //YYYYMM
		int nYear = Integer.parseInt(oneday.substring(0, 4));
		int nMonth = Integer.parseInt(oneday.substring(4))-1;
		
		Calendar firstday = Calendar.getInstance();
		firstday.set(Calendar.YEAR, nYear);
		firstday.set(Calendar.MONTH, nMonth);
		firstday.set(Calendar.DAY_OF_MONTH, 1);
		int nDOW = firstday.get(Calendar.DAY_OF_WEEK);
		System.out.println("Entered Date["+firstday.get(Calendar.YEAR)+"/"+(firstday.get(Calendar.MONTH)+1)+
				"/"+firstday.get(Calendar.DAY_OF_MONTH)+"] nDOW="+nDOW);
		
		Calendar lastday = Calendar.getInstance();
		lastday.set(Calendar.YEAR, nYear);
		lastday.set(Calendar.MONTH, nMonth+1);
		lastday.set(Calendar.DAY_OF_MONTH,0);
		int lastNum=lastday.get(Calendar.DAY_OF_MONTH);
		System.out.println("Entered Date["+lastday.get(Calendar.YEAR)+"/"+(lastday.get(Calendar.MONTH)+1)+
				"/"+lastday.get(Calendar.DAY_OF_MONTH)+"] lastNum="+lastNum);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		
		for(int i=1; i < nDOW; i++) {
			System.out.print("    ");
		}
//		for(int i=1, n= nDOW; i <= lastNum; i++, n++) {
//			System.out.print((i < 10)? "   "+ i : "  " + i);
//			if(n%7 == 0) System.out.println();
//		}
		for(int i=1; i<=lastNum; i++) {
			System.out.print(String.format(" %02d ", i));
			if(nDOW%7==0) System.out.println("");
			nDOW++;
			
		}
	}
}
