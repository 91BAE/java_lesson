package koreait.day16;

import java.util.Scanner;

public class C69_MyExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̸� �Է� -> ");
		try {
			int age = Integer.parseInt(sc.nextLine());
			if (age < 0  || age > 100) 
				throw new AgeException("������ ������ 0~100 �Դϴ�.");		// Ŭ�������� �߰����� ������ ���� ��
			// throw new Exception("������ ������ 0~100 �Դϴ�.");		// �޼����� �ٲܶ�
			// throw �� ������ Exception�� �߻� ��ŵ�ϴ�.
			
			if (age == 0) throw new NullPointerException();
			
			System.out.println("����� ���̴� " + age + " �� �½��ϱ�?");
			
		} catch(NumberFormatException e) {
			System.out.println("���� �Է��� ���ڷθ� �ϼ���! ");
		} catch (Exception e) {
			System.out.println("����� ���� ����  : " + e.getMessage());
		}
		
	}

}	// class end

// ����� Exception�� ����� : Exception ��� 
class AgeException extends Exception{

	// Serializable �������̽��� ���õ� ��
	private static final long serialVersionUID = 1L;
	
	// ����ڰ� ���Ƿ� �޼����� ���� �� �ִ�.
	public AgeException(String message) {
		// TODO Auto-generated constructor stub
		super(message);		// Exception�� message �ʵ带 ����
	}
}