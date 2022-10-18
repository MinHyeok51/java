package study022;

public class Warrior implements Human {
	int nPhysical;
	int nMaxpower;
	
	public int getnPhysical() {
		return nPhysical;
	}

	public void setnPhysical(int nPhysical) {
		this.nPhysical = nPhysical;
	}

	public int getnMaxpower() {
		return nMaxpower;
	}

	public void setnMaxpower(int nMaxpower) {
		this.nMaxpower = nMaxpower;
	}
	public int skill() {
		int skill = this.nMaxpower/2;
		return skill;
	}
	@Override
	public int attack() {
		return (int)(Math.random()*this.nMaxpower-1)+1;
	}

	@Override
	public void getDamage(int i) {
		this.nPhysical -= i;
	}

}
