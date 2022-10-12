package study010;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Singleton obj1 = new Singleton();	생성자를 프라이빗으로 막아둠
		Singleton obj2 = new Singleton();		컴파일 에러
		*/
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1==obj2) {	// 얘들은 참조타입 변수 // 참조는 주소
						//참조타입에서 == 은 가리키고있는 주소가 같으냐고 묻는것.
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		
		}
		
	}

}
