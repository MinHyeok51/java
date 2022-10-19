package study022;

import java.util.Date;

public class Factorial_main {

	public static void main(String[] args) {
//		Factorial f = new Factorial();
//		int n=5;
//		int k=f.doFact(n);
//		System.out.println(n+"! = "+ k);
//		
//		int i=100;
//		k= f.doAccum(i);
//		System.out.println(k);
//		
//		Date obj = new Date();
//		System.out.println(obj.toLocaleString());
		
		
		
		
		
		//이문자열안에 i가 몇개있늦지 찾는코드 (indexOf)
		
//		String str="Lorem ipsum dolor sit, amet consectetur adipisicing elit. Odit nesciunt minima debitis placeat, unde quo ratione ipsa aperiam blanditiis praesentium. Tempore praesentium quam iusto dolores cum molestiae illum quis est!";
//		int total=0 ;
////		System.out.println(str.length());
//		for(int i=0; i<=str.length(); i++) {
//			if(str.indexOf("i",i) == i) {
//				total++;
//			}
//		}
//		System.out.println("total="+total);
//		
//		int count =0;
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i)=='i') {
//				count++;
//			}
//		}
//		System.out.println("count="+count);
//		
//		int count2=0;
//		int start_ndx=0;
//		while((start_ndx=str.indexOf("i",start_ndx))>=0) {
//			count2++;
//			start_ndx++;
//		}
//		System.out.println("count2="+count);
//		
//		System.out.println(String.valueOf(total));
//		String str1 =String.valueOf(total);
//		System.out.println(str1.equals(total));
		
//		System.out.println("Ceil="+Math.ceil(3.14));	//큰 정수 중에서 가장 작은 정수
//		System.out.println("Floor="+Math.floor(3.14));	//작은 정수 중에서 가장 큰 정수
		
//		Date now  = new Date();
////		now.setYear(1666);
//		System.out.println(now.getYear());
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
//		String strNow = sdf.format(now);
//		System.out.println(strNow);
		
//		Calendar now = Calendar.getInstance();	//추상클래스 new연산자로 생성 불가
//		System.out.println(now.get(Calendar.YEAR));
//		System.out.println(now.get(Calendar.MONTH)); //월이 현재보다 1작은값으로 나옴. 인덱스번호라 그럼
//		System.out.println(now.get(Calendar.DAY_OF_MONTH));
//		System.out.println(now.get(Calendar.DAY_OF_WEEK));//일월화 순으로 1,2,3...
		
		
		
		//이번달의 달력을 출력
		// 일 월 화 수 목 금 토 
		//                1
		// 2  3  4 5 6  7 8
		// 9 10 11 12 13 14 15
		//16 17 18 19 20 21 22
		//23 24 25 26 27 28 29 
		//30 31
		Date now  = new Date(2022,10,0);
		System.out.println(now.getDate()); 
		}
}
