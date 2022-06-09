package day0602;

public class AutoCar implements OperateCar {
	
	public void start() {
		System.out.println("출발");
	}
	public void stop() {
		System.out.println("정지");
	}
	public void setSpeed(int speed) {
		System.out.println("속도 재설정 : " + speed + "km/h");
	}
	public void turn(int degree) {
		System.out.println(degree + "만큼 회전");
	}
	
}
