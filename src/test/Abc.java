package test;

public class Abc {
	static int k=5;
	
	public void m() {
		System.out.println("mm");
	}

	public static void m2() { //static�� new ���� �ʾƵ� ��
		System.out.println("m2222");
	}
	
	static { //static block. �޸𸮿� �÷��� �� �ؾ� �ϴ� ���� �̸� �����Ѵٴ���.. �۾� ������ �̸� �����صдٴ���...
		Abc a=new Abc();
		a.m();
		a.m2();
		a.m();
		System.out.println("ss");
	}

}
