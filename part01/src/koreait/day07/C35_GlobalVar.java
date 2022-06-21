package koreait.day07;

public class C35_GlobalVar {
	/*	
	 * 	[������ ���� �� ��ġ ����] 
	 * 	�������� (local variable) : �޼ҵ� , for, if , while ��� { } �ȿ��� ����� ���� - ����� ����� ������ ��� �� ��
	 * 	��������(global variable) : Ŭ���� { } �� ����� ����
	 * 
	 * 	[���������� static ���η� ����]
	 * 	Ŭ���� �̸�. ������	(�� �� ������ ���� ����)
	 * 	��ü�� ���� ����ϴ� this. ������	(�̶� ������ �ν��Ͻ� ����)
	 */
	
	int count;		// ��������
	String message;
	static int num;
	static double point;
	static final int TEST = 9999;		// static fianl �� ���. �����Ҷ� �ʱ�ȭ ���� ������ ����
	
	public static void main(String[] args) {	// static �� static �� �����Ѵ�. �ء�
		int num = 10; // main �޼ҵ� ������ ���
		System.out.println("num " + num);	// 10�� ����
//		System.out.println("message = " + message);			// ���� : static �� �ƴ� ������ ��� ����
		methodB();
//		methodA();  	// static�� �ƴ� �޼ҵ�
	}
	
	public void methodA() {		// static �޼ҵ尡 �ƴϹǷ� ��ü�� ���� ����ϴ� �޼ҵ�
		int num=99; 	// methodA ������ ���
		System.out.println("num " + num);		// 99
		System.out.println("message = " + message);		// ���� ������ ���� �� message
	}
	
	// ** �߿�
	public void methodC (int count) {
		this.count=count;		// this�� new �� ������� ��ü. methodC �޼ҵ带 �����Ű�� ��ü
	}
	
	public static void methodB() {
		int num=77; 	// methodB ������ ���
		// ���������� �������� �̸��� ���� ��� . ���������� �����´�.
		System.out.println("num " + num);		// 99
		System.out.println("num = " + C35_GlobalVar.num);	// Integer. BYTES �� ���� ����
		// ���� ������ ���� �� num. static �϶��� Ŭ���� �̸�. �������̰� static �� �ƴҶ��� this. ������
	}
	

}
