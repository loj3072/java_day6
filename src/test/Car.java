package test;

public abstract class Car { //Ŭ������ �̿ϼ�!!
	String num;
	int price;
	
	public abstract void start(); //�����ݷ�(;)���� �������ؾ� �̿ϼ� �޼���. ��ȣ({})�� ������ �ϼ��� �޼�����. �޼��尡 �̿ϼ��̸�
	public void stop( ) {
		System.out.println("����");
	} 
	
}
