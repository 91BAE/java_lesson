package koreait.day08;

public class MyClass1Test {
	
	public static void main (String[] arge) {
	
	//MyClass1 ��ü����
	MyClass1 my = new MyClass1();
	
	// MyClass1 Ŭ������ �ʵ� �� ����� �� �ִ°���?
	my.name="momo";
	my.point=1.234;
//	my.age=23;	//	���� : �����̺� ������ �ʵ��
	my.setAge(23);	// private �ʵ尪 ����(����) �ϴ� �޼ҵ� : setter
//	System.out.println("age = " + my.zage);		// ���� : private ������ �ʵ��
	System.out.println("age = " +	my.getAge());		//  private �� �о���� �޼ҵ� : getter
	my.setAge(-100);
	System.out.println("age = " +	my.getAge());		//  private �� �о���� �޼ҵ� : getter
	System.out.println("point = " + my.point);       	// public ������ �ʵ�
	System.out.println("point = " + my.name);       	// package �⺻ ������ �ʵ�
}
	// ���� ������ �׽�Ʈ�� �ڹٿ��� �����Ǵ� Ŭ�������� �����ϰ� �츮�� ���� Ŭ�������� ���.
	
}
