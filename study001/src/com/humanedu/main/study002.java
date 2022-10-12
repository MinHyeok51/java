package com.humanedu.main;

public class study002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//실수값 저장
//		float var1 =3.14;
//		float var2 = 3.14f;
//		double var3 =3.14;
//			//정밀도 테스트
//		float var4 = 0.1234567890123456789f; //소수점 8번째자리까지 나옴
//		double var5=0.1234567890123456789;	 //소수점 16번째 자리까지 나옴
//		
//		System.out.println("var2: "+var2);
//		System.out.println("var3: "+var3);
//		System.out.println("var4: "+var4);
//		System.out.println("var5: "+var5);
		
//		boolean isChecked = false;
//		boolean stop = false;
//		if(stop) {
//			System.out.println("중지");
//		} else { System.out.println("시작");}
//	
//	 float var =1e2f;
//	 System.out.println(var);
//	 System.out.println("자바는");
//	 System.out.println("\n재미있는 \"프로그래밍\" 언어\n");
//	 System.out.println("입니다.");
	 
//	 double value =2e-350;
//	 System.out.println(value);
	 
//	 int score1=0;
//			 int score2=1;
//	 System.out.println(score1+score2);
//	 System.out.println();
	 
//	 byte byteValue =10;
//	 int intValue = byteValue;
//	 System.out.println(intValue);
	 
//	 char charValue ='A';
//	 int intValue = charValue;
//	 System.out.println(intValue);
		
//		double result = 1.5+2.3;
//		System.out.println(result);
		
//		int x =1;
//		int y= 2;
//		double result =x/y; //(double) 붙이면 값이 0.5 가 됨
//		System.out.println((int)result); //더블이라 0.0인데 int붙어서 강제로 0으로 만듦
		
//		//숫자연산
//		int value = 10+2+8;
//		System.out.println("value: " + value);
//		
//		//문자열 결합연산
//		String str1 =10+2+"8";
//		System.out.println("str1: " +str1);
//		
//		String str2 =10+"2"+8;
//		System.out.println(str2);
//		
//		String str3="10"+2+8;
//		System.out.println("str3: "+str3);
//		
//		String str4="10"+(2+8);
//		System.out.println(str4);
		
//		String str="10"; 		//문자열 기본타입으로 변환
//		String str2="3";
//		byte value=Byte.parseByte(str+str2);
//		System.out.println(value);
//		
//		int value1= Integer.parseInt("10");
//		double value2=Double.parseDouble("3.14");
//		boolean value3 = Boolean.parseBoolean("true");
//		
//		System.out.println("value1: "+value1+65);
//		System.out.println("value2: "+value2);
//		System.out.println("value3: "+value3);
//		
//		String str1 = String.valueOf(10);
//		String str2 = String.valueOf(3.14);
//		String str3 = String.valueOf(true);
//		
//		System.out.println("str1: "+str1+5);
//		System.out.println("str2: "+str2);
//		System.out.println("str3: "+str3);
//		
//		String str4 = 3 +"" ;
//		System.out.println(str4);
		
		/* Q1
			byte a =10;
			byte b=20;
			int c = a+b;
			byte d= (byte)(a+b);
			System.out.println(c);
			System.out.println(d);
		*/
		/* Q2
			long l = 3000l*3000l*(long)3000;
		System.out.println(l);
		*/
		/* Q3
			float f = 3/2f;
		System.out.println(f);
		*/
		/* Q4
			float f1=0.0f;
			int x= 0;
			long l2=0l;
//			char e='b'; //따옴표 안에 하나씩만 적어야함ab안돼
//			char ee="ab"; //char 은'랑 씀 "는 string에
			*/
		/* Q5
			String str="10";
			int y =10;
			int result = Integer.parseInt(str)*y;
			System.out.println(result);
//			int str1 = Integer.parseInt(str);
//			System.out.println(str1*y);
		 */
//		char c1='a';
//		char c2 = (char)(c1+1);
//		System.out.println(c2);
		
//		int x =5;
//		int y=2;
//		double result = (double) x/y;
//		System.out.println(result);
//		
//		double var1 = 3.5;
//		double var2 = 2.7;
//		double result =(int)(var1+var2);
//		System.out.println(result);
		
		/** 어렵
		long var1 =2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 ="3.9";
		int result = (int)var1+(int)(var2+var3)+(int)Double.parseDouble(var4);
		System.out.println(result);
		*/
		
		/**
		 * 학원생 관리
		 * 이름: String
		 * 나이: int
		 * 생년월일 : int or String "51365135"
		 * 폰번호:"123245938"
		 * 이메일:String
		 * 우편번호 "13213" String :int 123123
		 * 주소:String
		 * 전공: String
		 * 책수령여부:boolean
		 */
		
//		System.out.printf("이름: %1$s, 나이: %2$d 성별: %3$s 번호: %4$d 소수: %5$f", "감자바", 234, "남", 3872,5.8);
		
//		int value =123;
//		System.out.printf("상품의 가격:%d원\n", value);
//		System.out.printf("상품의 가격:%6d원\n", value);
//		System.out.printf("상품의 가격:%-6d원\n", value);
//		System.out.printf("상품의 가격:%06d원\n", value);
//		
//		double area = 3.14159 * 10 * 10;
//		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n",10,area);
//		
//		String name = "홍길동";
//		String job ="도적";
//		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		//1.

//		int x = 10;
//
//		int y=4;
//
//		int result = x/y;
//
//		System.out.println(result); //2
//
//		 //2.
//
//		int x = 10;
//
//		int y=4;
//
//		double result = (double)x/y;
//
//		System.out.println(result); //2.5
//
//		 //3.
//		double a= 3.5;
//	double b= 4.7;
//	double result = a+(int)b;
//	System.out.println(result); //7.5
//
//		 //4.
//		String a = "3.4";
//		String b = "4";
//		int result = (int)Double.parseDouble(a)*Integer.parseInt(b);
//		System.out.println(result); //12

		 //5.

//		String a="10";
//
//		int b =3;
//
//		double c =4.5;
//
//		String result = a+(int)(b*c);
//
//		System.out.println(result); //1013
		
		//Q.
		String str ="10";
		int intValue =3;
		double doubleValue =4.5;
		
		System.out.println(str +intValue);
		System.out.println(str+doubleValue);
		System.out.println(intValue*doubleValue);
		System.out.println(intValue*(int)doubleValue);
		System.out.println(Integer.parseInt(str)+doubleValue);
		
		String result = String.valueOf(doubleValue)+str+String.valueOf(intValue);
		System.out.println("결과 : "+result);
		
	}
}
