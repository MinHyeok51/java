package school;

import java.util.Scanner;

public class School_main {

	public static void main(String[] args) {
		//학생이름 읽는다
		//이름이 ""이 아닌 동안
		//		영어점수를 읽는다
		//		국어점수를 읽는다
		//		수학점수를 읽는다
		//		영어/국어/수학점수를 각 ArrayList에 저장
		//		다음 학생이름을 읽는다.
		
		//모든 학생의 이름/영어/국어/수학점수를 출력
		//모든 학생의 영어총합, 국어총합, 수학총합을 출력
		//모든 학생의 영어평균, 국어평균, 수학평균 점수를 출력
		//전체 학생 숫자를 출력.
		//메인코드 최소화하기. 메소드화 
		Student st = new Student();
		
//		st.inputData();
//		----------------------------------선생님꺼---------------------------------
		st.getScore();
		st.showScore();
		st.showStatistic();
	}
}
