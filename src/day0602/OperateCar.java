package day0602;

public interface OperateCar {
	
	public abstract void start(); //기존 클래스에서 추상 메서드를 선언할 때 방식
	void stop();// == public abstract void stop();, 인터페이스에서는 기본적으로 앞에 public abstract가 붙은 거로 간주한다
	void setSpeed(int speed);
	void turn(int degree);
	
	
}
