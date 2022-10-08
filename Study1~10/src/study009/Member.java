package study009;

public class Member {
	//필드 : 이 객체의 속성( 나이 숫자 이름 등등)
	int memberNumber;
	int age;
	String name;
	String loginId;
	String signUpDate;
	//생성자 : Member객체가 만들어질때(생성) 초기화
	Member(){	}
	Member(int age, String name){
		this.age =age;
		this.name =name;
	}
	Member(int _age, String _name, String _loginId, String _signUpDate){
		age = _age;
		name =_name;
		loginId =_loginId;
		signUpDate = _signUpDate;
	}
	//메소드(함수) : 기능(동작)을 수행시키는 코드가 정의 되어 있는 것.
	public void setMemberNumber(int input) {
		memberNumber = input;
	}
	public void setIdAndSignUpDate(String _id, String inputDate) {
		this.loginId = _id;
		this.signUpDate =inputDate;
	}
	public void printInfo() {
		System.out.println("회원 정보를 출력합니다.");
		System.out.println(memberNumber + " " + age + " " + name + " " + loginId + " " + signUpDate);
	}

}
