package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {

	public static void main(String[] args) {
		// ���ǽ��� ����� ���� ����� �����ϴ� ���� ������ : ���ǽ�? ��/����T(��) : ��/����F(����)
		int korean, math; 	// ��������, ��������
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������? ");
		korean = sc.nextInt();
		
		System.out.println("���� ������? ");
		math = sc.nextInt();
		
		// ���������� �������� ��� 80�� �̻��ΰ�? -> ����л�
		System.out.println("����л� ? " + ((korean>=80 && math>=80 )? "�½��ϴ�." : "�ƴմϴ�."));
		
		// if : ó���� ����� �����ϴ� ���ǹ� 
		// { } �� ��ɹ� ���(block) �̰� �������� ��ɵ��� ���δ� ������ ��ȣ,
		// 	{ } �ȿ� ���� ����� 1���� ���� ������ �� �ִ�.
		if(korean>=80 && math>=80) {  
			// ���ǽ��� ���� �� �����ϴ� ��ɹ� 
			System.out.println("�½��ϴ�.");
		} else {
			// else�� ������ �� �����ϴ� ��ɹ�
			System.out.println("�ƴմϴ�.");
		}	
		
		// System.out.println("Ư���л�?" (korean>=90 || math>=90));
		// { } �ȿ� ���� ����� 1���� ���� ���� ����
		if(korean>=90 || math>=90)
			System.out.println("�½��ϴ�.");
		else 
			System.out.println("�ƴմϴ�.");
		
		
		// ���α׷��� ó�� ������ else { } �� �ش��ϴ� ������ ���� �� �� �ִ�. ������ ������ �ۼ� ����.
			if (!(korean>=20 && math>=80))
				System.out.println("ǥ�� �������� ū ���� �Դϴ�.");
			
	}	

}
	
