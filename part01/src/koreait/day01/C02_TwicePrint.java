package koreait.day01;

public class C02_TwicePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ʈ���̽�");
		System.out.println("�̸�\t�������\t\t����");
		System.out.println("---------------------------"); 
		System.out.println("�糪\t1996.12.29\t27"); //�Ѱ��� ���ڿ��� ���
		System.out.println("��ȿ\t1997.02.01\t26");
		System.out.println("�̳�\t1998.03.24\t25");
		
		// printf() �޼ҵ� ����ؼ� ��������� ������.
		// 12ĭ ���ڿ� + �ڸ��� �������� ���� ���ڿ� + 5ĭ ����
		// %s�� ������ ĭ���� ������ ����, -��ȣ�� ���� ����
		
		System.out.printf("%-12s %s %5d\n","dayon","1998.05.28",25);
		System.out.printf("%-12s %s %5d\n","momo","1999.04.23",24);
		System.out.printf("%-12s %s %5d\n","nayon","1997.06.14",27);
		
		// printf �޼ҵ忡�� ���Ĺ��� ������ŭ �ڿ� ���󳪿��� ������ ������ ��ġ�ؾ� ��.
		// System.out.printf("%-12s%s%5d\n","nayon","1997.06.14");
		// printf �޼ҵ忡�� ���Ĺ��ڿ� �ڿ� ������ ������ ������ ��ġ���� �ʾ� �����߻�.
		// System.out.printf("%-12s%5d\n","nayon","1997.06.14");
		
		// ���� : System.out.printf("%-12s %s %5d\n","dayon","1998.05.28",25);
		// 							�� ���� ������ ���� ����(������)�� ����ϵ��� ������ ���ô�.
		
		System.out.println("/////����//////");
		System.out.printf("%-12s %4d.%02d.%2d %5d\n","dayon",1998,5,28,25);
		System.out.printf("%-12s %4d.%02d.%2d %5d\n","momo",1999,4,23,24);
		System.out.printf("%-12s %4d.%02d.%2d %5d\n","nayon",1997,6,14,27);
		// ��������� �����͸� ���� ���ͷ�("momo", 1998, true...) �� ǥ���ؼ� ����ߴ�.
		
		// ���� ���� : ����(�����͸� �����ϰ� �ִ� ������ �̸�) ���
		// System.out.printf("%-12s %4d.%02d.%2d %5d\n",name,year,month,day,age);

	}
	
	/*
	 *��¿� ���Ǵ� ����
	 *
	 *\(��������) ����ϴ� �̽������� ���� : \n (�ٹٲ�) , \t(tab)
	 *������������ %��ȣ ��� : %s(����) �ڸ����� �����ؼ� �� �� �ִ�.
	 *						�� ���� �ڸ� 0���� ä�ﶧ���� %03d �� ���� �մϴ�.
	 *""�ȿ� ���ִ� ���ڴ� ������ �ƴϴ� ������ ���ڷ� �д´�.
	 */

}
