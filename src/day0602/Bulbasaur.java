package day0602;

public class Bulbasaur extends Pokemon{
	Bulbasaur() {
		hp = 40;
		energy = 40;
		System.out.println("가라 이상해씨!!!");
		printInfo();
	}
	
	public void eating() {
		System.out.println("밥먹음");
		this.energy += 15;
	}
	public void sleeping() {
		System.out.println("잔다");
		this.energy += 15;
	}
	public void enjoying() {
			System.out.println("논다");
			this.energy -= 10;
			this.hp += 5;
	};
	public void exercise() {
			System.out.println("운동한다");
			this.energy -= 15;
			this.hp += 30;
	}
	public void levelUp() {
		if(hp >= 60) {
			level++;
			hp -= 60;
		} 
	}
	public void checkEnergy() {
		if(this.hp >= 60) levelUp();
	};
	void printInfo() {
		System.out.println("이상해씨의 기본 정보");
		super.printInfo();
	};
}
