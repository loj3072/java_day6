package test;

public abstract class Car { //클래스도 미완성!!
	String num;
	int price;
	
	public abstract void start(); //세미콜론(;)으로 마무리해야 미완성 메서드. 괄호({})로 끝나면 완성된 메서드임. 메서드가 미완성이면
	public void stop( ) {
		System.out.println("멈춤");
	} 
	
}
