package test;

public class Abc {
	static int k=5;
	
	public void m() {
		System.out.println("mm");
	}

	public static void m2() { //static은 new 하지 않아도 됨
		System.out.println("m2222");
	}
	
	static { //static block. 메모리에 올렸을 때 해야 하는 일을 미리 저장한다던가.. 작업 순서를 미리 저장해둔다던가...
		Abc a=new Abc();
		a.m();
		a.m2();
		a.m();
		System.out.println("ss");
	}

}
