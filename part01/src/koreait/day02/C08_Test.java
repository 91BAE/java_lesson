package koreait.day02;

public class C08_Test {
	// �ۼ��� : ���ȯ

	public static void main(String[] args) {
		
		int a = 23 , b = 19; // a=���� b=����
		int c = a * b;
		
		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		System.out.println("���� : " + a + "��");
		System.out.println("���� : " + b + "��");
		System.out.printf("���̸� ���߽��ϴ�. -> %d�� \n ",  c );
		
		System.out.println("-----------------------");
		
		
		double half = 23.23; // ������
		final double PI = 3.14;
		double round = 2 * PI * half; // �ѷ�
		double area = PI * half * half; // ����
		System.out.println("[[�� ������ ���̿� �ѷ� ���ϱ�]]");
		System.out.println("������ : " + half + "��" );
		System.out.printf("�ѷ��� ���߽��ϴ�. -> %.3f��  \n" , round);
		System.out.printf("���̸� ���߽��ϴ�. -> %.3f��  \n" , area);
		
		
		// final �׽�Ʈ
		// ���� ���� �տ� final Ű���带 ���̸� ���� �������� ���մϴ�.
		
		final int test = 123;		//	���� ���� ���ϴ� ��� (final) �� ����
		System.out.println("test = " + test);
		
		// test = 456; 		// ���� : final�� �����ؼ�
		
	}

}
