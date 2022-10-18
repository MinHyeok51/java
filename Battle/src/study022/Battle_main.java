package study022;

import java.util.Scanner;

public class Battle_main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Warrior conan = new Warrior();
		Soldier commando = new Soldier();
		
		System.out.println("Conan의 체력: ");
		int n = s.nextInt(); // conan's physical
		conan.setnPhysical(n);
		System.out.println("Conan의 파워: ");
		n=s.nextInt(); //conan's max attack power
		conan.setnMaxpower(n);
		System.out.println("Commando의 체력: ");
		n=s.nextInt();
		commando.setnPhysical(n); //commando's physical
		System.out.println("Commando의 파워: ");
		n=s.nextInt();
		commando.setnMaxpower(n); // commando's max attack power
		
		while(conan.getnPhysical()>0 && commando.getnPhysical()>0) {
			if(conan.getnPhysical()<=0) break;
			if(conan.nPhysical<30) {
				commando.getDamage(conan.skill()*4);
				System.out.println("conan의 스킬로인해 comman도의 체력이"+conan.skill()*4+"만큼 깎였습니다. commado's 체력: "+commando.nPhysical);
			}else {
				conan.attack();
				commando.getDamage(conan.attack());
			System.out.println("conan의 공격"+", commando 체력:"+commando.nPhysical);
//			System.out.println("conan의 공격, commando 체력:["+commando.nPhysical+"]");
			}
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			if(commando.getnPhysical()<=0) break;
			commando.attack();
			conan.getDamage(commando.attack());
			System.out.println("commado의 공격"+", conan의 체력:"+conan.nPhysical);
			
			if(conan.nPhysical<=0) {
				System.out.println("Commando's Win");
			}else if(commando.nPhysical<=0) {
				System.out.println("Conan's Win");
			}
			if(conan.nPhysical<0||commando.nPhysical<0) {
				System.out.println("죽음 게임끝");
				break;
			}
		}
		s.close();
	}

}
