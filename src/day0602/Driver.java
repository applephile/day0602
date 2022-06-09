package day0602;

abstract public class Driver {
	
	int x, y;
	abstract void run(int x, int y);
	
	void checkPass() {
		System.out.println("손님 탑승");
	}
	
}
