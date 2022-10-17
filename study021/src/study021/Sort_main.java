package study021;

public class Sort_main {

	public static void main(String[] args) {
		//숫자를 읽는다.
		//숫자가 ""이 아닌동안
		//	ArrayList에 추가
		//  다음 숫자를 읽는다.
		//Ascending()
		//ArrayList를 출력
		//Descending()
		//ArrayList 출력
		Sort st = new Sort();
		st.readNumbers();
		st.ascending();
		st.descending();
	}
}
