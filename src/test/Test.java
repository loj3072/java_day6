package test;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		/*
		//�������� Ŭ���� ���
		Abc a=new Abc();
		a.m();
		a.m2();
		
		Abc.m2(); //static�� new���� �ʾƵ� �θ� �� ����
		Abc.k=10; //static�� new���� �ʾƵ� �θ� �� ����
		System.out.println(Abc.k);
		System.out.println(a.k);
		
		Abc a2=new Abc();
		a2.k=40;
		System.out.println(Abc.k); //�� 40�� ������???
		*/
		
		
		//static ������ �޼��常 �ҷ��� �޸𸮿� �ö�´�.
		Class.forName("test.Abc"); //new�� �� ���� ���� �߿� �޸� �ε��� �����ϴ� ��ɾ�. ��Ű������� ���� �� ��� ��.
		//�޸𸮸� �о���� static block�� �����
		
		System.out.println(Math.round(34.56)); //Math�� static   (f3������-Attach Source-External-C:/Program Files/Java/jdk1.8.0_74/src.zip)
		//private Math <-new ����
		//public static final double E = 2.7182818284590452354; <- final:���� �� �ٲ�. ���. ������ ���� �� �ٲٴϱ� public���� ����. static: Ŭ������ �޸𸮿� �ε��� �� �� �� ��������� �� �̻� �ȸ������.
		//��� ����: public static final
	}

}
