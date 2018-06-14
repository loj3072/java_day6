package test;

public class Bus extends Car {

	//abstract클래스를 상속하면 abstract메서드가 자동으로 나옴. 강제 오버라이딩
	@Override
	public void start() { 
		System.out.println("버스 출발~~");

	}

}
