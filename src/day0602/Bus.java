package day0602;

public class Bus extends Driver implements Vehicle{
	
	public void stop(Vehicle v) {
		System.out.println(v + "정류장에 멈춤");
	}
	public void stop() {
		System.out.println("버스 멈춤");
	}
	public void run(int x, int y) {
		System.out.println(x + ", " + y + "위치로 버스 이동");
	}
	
	public String toString() {
		return "A";
	}
	
}
