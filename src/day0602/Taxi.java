package day0602;

public class Taxi extends Driver implements Vehicle{
	
	public void stop(Vehicle v) {
		System.out.println("손님 목적지 " + v + "도착");
	}
	public void stop() {
		System.out.println("택시 멈춤");
	}
	public void run(int x, int y) {
		System.out.println(x + ", " + y + "위치로 택시 이동");
	}
	public String toString() {
		return "A";
	}
	
	Vehicle getVehicle() {
		Bus b = new Bus();
		return b;
	}
}
