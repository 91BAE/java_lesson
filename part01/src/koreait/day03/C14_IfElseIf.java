package koreait.day03;

import java.util.Scanner;

public class C14_IfElseIf {

	public static void main(String[] args) {
		//if ���ǽ�{ .. } else if(���ǽ�) { .. } else if(���ǽ�) { ... } ~else
		
		/*	���� ���ι� �����ø� �̺�Ʈ 
		 * 	���� ������ �ݾ��� 100000�� �̻��̸� �������� ���űݾ��� 10% = (10/100)
		 * 					70000�� 						9% = 9/100
		 * 					40000��						7% = 7/100
		 * 					�� ���ϴ�						3% 3= 3/100
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int money;	// ������ : % �����ϸ� ������� �Ǽ� -> ������ ��ȯ.
		int pay;	// ���űݾ�
		double rate; // ������ : 0.1 0.09 ��
		
		System.out.println("���� �ݾ��� -> ");
		pay = sc.nextInt();
		
		if(pay >= 100000)
			rate = 0.1;
		else if (pay >= 70000)		// pay < 100000 �϶��� �����Ѵ�. 
			rate = 0.09;
		else if (pay >= 40000)
			rate = 0.07;
		else 
			rate = 0.03;
		
		money = (int)(pay * rate);
		
		System.out.printf("����! ���� �����Ͻ� �ݾ��� �������� %d�� �Դϴ�.\n",money);
		System.out.printf("�̺�Ʈ �Ⱓ �������� %d %%�� ���� �Ǿ����ϴ�.",(int)(rate*100));
		
		sc.close();
		
	}

}
