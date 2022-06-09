package day0602;

public class Pikachu extends Pokemon{
	Pikachu() {
		hp = 30;
		energy = 50;
		System.out.println("가라 피카츄!!!");
		printInfo();
	}
	
	public void eating() {
		System.out.println("밥먹음");
		this.energy += 10;
	}
	public void sleeping() {
		System.out.println("잔다");	
		this.energy += 5;
	}
	public void enjoying() {
			System.out.println("논다");
			this.energy -= 20;
			this.hp += 5;
	};
	public void exercise() {
			System.out.println("운동한다");
			this.energy -= 15;
			this.hp += 20;
	}
	public void levelUp() {
		if(hp >= 40) {
			level++;
			hp -= 40;
		} 
	}
	public void checkEnergy() {
		if(this.hp >= 40) levelUp();
	};
	void printInfo() {
		System.out.println("피카츄의 기본 정보");
		super.printInfo();
	};
}
