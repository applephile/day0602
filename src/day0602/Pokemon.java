package day0602;

abstract public class Pokemon {
	int hp;
	int energy;
	int level = 0;
	
	static int num = 0;
	
//	Pokemon(int hp, int energy, int level) {
//		this.hp = hp;
//		this.energy = energy;
//		this.level = level;
//	}
	
	public abstract void eating();
	public abstract void sleeping();
	public abstract void enjoying();
	public abstract void exercise();
	public abstract void checkEnergy();
	public abstract void levelUp();
	
//	pubclic void checkEnergy() {
//		if(energy <= 0) {
//			return false;
//		} else if(energy > 0) {
//			return true;
//		}
//	}
	
	void printInfo() {
		System.out.println("hp = " + hp);
		System.out.println("energy = " + energy);
		System.out.println("level = " + level);
	};
}
