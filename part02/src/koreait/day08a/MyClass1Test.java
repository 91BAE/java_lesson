package koreait.day08a;

import koreait.day08.MyClass1;
import koreait.day08.Score;

public class MyClass1Test {
	
	public static void main (String[] arge) {
	
	//MyClass1 ��ü����
	MyClass1 my = new MyClass1();	// public Ŭ���� ������ import �ʿ�
	
	// ��Ű���� �ٸ� MyClass1 Ŭ������ �ʵ� �� ����� �� �ִ°���? �� : point
	// 						default(��Ű��) ������ �ʵ� name, �޼ҵ� getAge, setAge ��� ����
//	my.name="momo";
	my.point=1.234;
//	my.age=23;	//	���� : �����̺� ������ �ʵ��
//	my.setAge(23);
//	System.out.println("age = " + my.zage);		// ���� : private ������ �ʵ��
//	System.out.println("age = " +	my.getAge());		
//	my.setAge(-100);
//	System.out.println("age = " +	my.getAge());		
	System.out.println("point = " + my.point);       	// public ������ �ʵ�
//	System.out.println("point = " + my.name);       	
	
	
	// Score Ŭ���� �ʵ�, �޼ҵ��� �����ڰ� ��� default �Դϴ�.
	//		�� new ��ü������ �ɱ��?
	Score score = new Score();
	
	
}
	// ���� ������ �׽�Ʈ�� �ڹٿ��� �����Ǵ� Ŭ�������� �����ϰ� �츮�� ���� Ŭ�������� ���.
}
