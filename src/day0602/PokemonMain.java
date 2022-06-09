package day0602;

import java.util.Scanner;

public class PokemonMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		GrowPokemon gp = null;
		int num = 0;
		int choice = 0;
		
		Pokemon[] p = new Pokemon[3];
		
		while(true) {
			System.out.println("---------------------------");
			System.out.println("포켓몬을 선택하세요");
			System.out.println("1.피카츄 2.꼬북이 3.이상해씨");
			System.out.println("---------------------------");
			
			num = s.nextInt();
			
			switch(num) {
			case 1:
				p[num - 1] = new Pikachu();
				break;
			case 2:
				p[num - 1] = new Squirtle();
				break;
			case 3:
				p[num - 1] = new Bulbasaur();
				break;
			}
			
			while(true) {
				System.out.println("------------------------------------");
				System.out.println("1.밥먹기 2.잠자기 3.놀기 4.연습하기 5.종료하기");
				System.out.println("------------------------------------");
				
				choice = s.nextInt();
				
				switch(choice) {
				case 1:
					p[num - 1].eating();
					break;
				case 2:
					p[num - 1].sleeping();
					break;
				case 3:
					p[num - 1].enjoying();
					break;
				case 4:
					p[num - 1].exercise();
					break;
				}
				
				if(choice == 5) {
					System.out.println("종료");
					break;
				} else if(p[num - 1].energy <= 0) {
					System.out.println("에너지 소진으로 종료");
					break;
				}
				
				p[num - 1].checkEnergy();
				p[num - 1].printInfo();
			}
			
			break;
		}
		
//		switch(num) {
//		case 1:
//			Pokemon p = new Pikachu();
//			p.printInfo();
//			break;
//		case 2:
//			Pokemon s = new Squirtle();
//			s.printInfo();
//			break;
//		case 3:
//			Pokemon b = new Bulbasaur();
//			b.printInfo();
//			break;
//		}
//		if(pokemon == null) {
//			System.out.println("게임 종료");
//			return;
//		} else {
//			gp = new Pokemon(pokemon);
//		}
	}

}
