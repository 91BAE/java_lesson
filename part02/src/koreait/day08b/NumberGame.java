package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 10;		// �õ� Ƚ��
		int[] triallst = new int[max];
				// �ִ� 10�� ����� �����ϱ�
		
 		
		System.out.println("���� ���߱� ���� �����մϴ�. �� ��ǻ�ʹ� ���ڸ� �����߽��ϴ�.");
		System.out.println("��, �޸��� ���纸����. (101~299)");
		int numComputer = r.nextInt(199) + 101;		
		int numHuman;
		int i = 0;
		
		do {
			System.out.println("������ ���� �Է� (��ȸ : " + (max- i ) + ") -> ");
			numHuman = sc.nextInt();
			if (numComputer > numHuman ) {
				triallst[i] = numHuman;
				i++;
				System.out.println("�ƴϴ�. �� ū ���̴�.");
			} else if (numComputer < numHuman) {
				triallst[i] = numHuman;
				i++;
				System.out.println("�ƴϴ�. �� ���� ���̴�.");
				
			}
			if (i == max) break; // �޸��� ���ڸ� �Է��� ���ڰ� max�� �������� ��������
		}
		while (numComputer != numHuman);
		// numComputer = numHuman �̸� ���� ����ɷ� ó�� -> do~while �� ����
		if(i==max) {
			System.out.println("�� �޸� �Է� ���� : " + Arrays.toString(triallst));
			System.out.println("�־��� ��ȸ�� �� ����. ���� �ٽ� �ϰ� �ͳ�?");
		} else {
			System.out.println("�����ε�? ����! �������� �õ� Ƚ�� : " + (i+1));
		}
		sc.close();
		
	}

}
