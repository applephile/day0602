package day0602;

public class Squirtle extends Pokemon{
	Squirtle() {
		hp = 35;
		energy = 45;
		System.out.println("가라 꼬북이!!!");
		printInfo();
	}
	
	public void eating() {
		System.out.println("밥먹음");
		this.energy += 15;
	}
	public void sleeping() {
		System.out.println("잔다");
		this.energy += 10;
	}
	public void enjoying() {
			System.out.println("논다");
			this.energy -= 15;
			this.hp += 10;
	};
	public void exercise() {
			System.out.println("운동한다");
			this.energy -= 20;
			this.hp += 25;
	}
	public void levelUp() {
		if(hp >= 55) {
			level++;
			hp -= 55;
		} 
	}
	public void checkEnergy() {
		if(this.hp >= 55) levelUp();
	};
	void printInfo() {
		System.out.println("꼬북이의 기본 정보");
		super.printInfo();
	};
}