package koreait.day03;

import java.util.Scanner;

public class C08_KeyInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a; //����
		int b; //����
		double half, round, cricle_area;
		final double PI = 3.14;
		
		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		System.out.println("�簢�� �ʺ� �Է� ->");
		a = sc.nextInt();
		System.out.println("�簢�� ���� �Է� ->");
		b = sc.nextInt();
		
		int c = a * b;
		System.out.println("ó�����");
		System.out.println("���� " + a + "cm");
		System.out.println("���� " + b + "cm");
		System.out.println("���̸� ���߽��ϴ�. " + c + "��");
		
		
		System.out.println("[[�� ������ ���̿� �ѷ� ���ϱ�]]");
		System.out.println("���� ������ �Է� -> ");
		half = sc.nextDouble();
		
		round = 2 * PI * half; // �ѷ�
		cricle_area = PI * half * half; // ����
		System.out.println("ó�����");
		System.out.printf("�ѷ��� ���߽��ϴ�. -> %.3f��  \n" , round);
		System.out.printf("���̸� ���߽��ϴ�. -> %.3f��  \n" , cricle_area);
	
	}

}
