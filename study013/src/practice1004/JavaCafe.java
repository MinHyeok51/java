package practice1004;

public class JavaCafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPay(10.00, 40);
		printPay(10.00, 50);
		printPay(7.50, 38);
		printPay(8.50, 66);
	}
	// 시급과 일한 시간을 입력받아, 주급을 출력
	public static void printPay(double basePay, int hours) {
		//10달러 * 50시간 => 40시간 *10달러 + 10시간*15달러
		
		if(hours >60) {
			System.out.println("초과근무 에러");
			return;
		}
		if(basePay<8) {
			System.out.println("최저시급 에러");
			return;
		}
			
		double pay;
		//실제 수행해야 하는 부분(주급계산)
		
		if(hours >40) {
			//초과수당
			pay= (basePay*40) + (hours-40) * (basePay*1.5);
		}else if(hours >0 && hours <=40) {
			pay = basePay*hours;
		}else {
			pay =0;
		}
			System.out.printf("$ %.2f\n", pay);
		}
		
		
		/* 해당 메소드를 완성하세요. */
		
	}




