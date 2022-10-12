package study018;

import java.util.ArrayList;
import java.util.Scanner;

public class Al_main {

	public static void main(String[] args) {
		//<Integer, Double, String, 클래스명> 단일 형태의 리스트로 만들어버리기
		//정수만 들어가는 것으로 만듦
		Scanner s = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		
		//ArryList 타입제한이 없이 값 추가가능
		//ArrayList al = new ArrayList();
		//일반적으론 한가지 타입만 넣는 경우가 많다. 그럴경우 Generic 사용
//		al.add(10);
//		al.add(5);
//		al.add("hello");
//		al.add("World");
//		al.add(3.14);
		
		/*Quiz
		 * 학생 이름을 읽어들인다.
		 * "x"가 들어오면 반복을 종료.
		 * 그렇지 않으면 ArrayList에 저장
		 * nextLine(), while() 이용
		 * 
		 * 반복문 만들기 tip
		 * if문 기준으로 반복패턴을 찾은후에
		 * if를 while로 바꾸고
		 * 조건을 뒤집는다.	!쓰기
		 */
			String name=s.nextLine();
				
				while(!name.equals("x")) {
					al.add(name);
					name=s.nextLine();
				}
		//추가한 값 읽어오기
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

}
