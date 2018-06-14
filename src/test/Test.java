package test;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		/*
		//정석적인 클래스 사용
		Abc a=new Abc();
		a.m();
		a.m2();
		
		Abc.m2(); //static은 new하지 않아도 부를 수 있음
		Abc.k=10; //static은 new하지 않아도 부를 수 있음
		System.out.println(Abc.k);
		System.out.println(a.k);
		
		Abc a2=new Abc();
		a2.k=40;
		System.out.println(Abc.k); //왜 40이 나오지???
		*/
		
		
		//static 변수나 메서드만 불러도 메모리에 올라온다.
		Class.forName("test.Abc"); //new의 세 가지 동작 중에 메모리 로딩만 실행하는 명령어. 패키지명까지 전부 다 써야 함.
		//메모리를 읽어오면 static block이 실행됨
		
		System.out.println(Math.round(34.56)); //Math는 static   (f3누르기-Attach Source-External-C:/Program Files/Java/jdk1.8.0_74/src.zip)
		//private Math <-new 못함
		//public static final double E = 2.7182818284590452354; <- final:값이 안 바뀜. 상수. 어차피 값을 못 바꾸니까 public으로 공개. static: 클래스가 메모리에 로딩될 때 한 번 만들어지고 더 이상 안만들어짐.
		//상수 정의: public static final
	}

}
