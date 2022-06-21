package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame25Start {

	public static void main(String[] args, String gamer) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 10;		// �õ� Ƚ��
		int[] triallst = new int[max];
		GameValue[] history = new GameValue[10];		// �ִ� 10�� ����� �����ϱ�
		int k = 0;			// �����丮 �迭�� �ε��� ����
		
		System.out.println("���� ���߱� ���� �����մϴ�.");
		System.out.print("�̸��� ���");
		String player = sc.nextLine();
		int rmin = 11, rmax = 29;
		do	{
			// ���⼭ ����
		GameValue temp = new GameValue(player);
		System.out.println("���� ���߱� ���� �����մϴ�. �� ��ǻ�ʹ� ���ڸ� �����߽��ϴ�.");
		System.out.println(String.format("��, �޸��� ���纸����. (���� %d ~ %d)", rmin, rmax));
		int numComputer = GameValue.makeNumber(rmin, rmax);	
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
			
			
			if (i == max) break; 
		
		}while (numComputer != numHuman);
		// numComputer = numHuman �̸� ���� ����ɷ� ó�� -> do~while �� ����
		if(i==max) {
			System.out.println("�� �޸� �Է� ���� : " + Arrays.toString(triallst));
			System.out.println("�־��� ��ȸ�� �� ����. ���� �ٽ� �ϰ� �ͳ�? [����" + numComputer + " "]);
			temp.setCount(max);
		} else {
			System.out.println("�����ε�? ����! �������� �õ� Ƚ�� : " + (i+1));
			temp.setCount(i+1);
			temp.setSuccess(true);
		}
		// �������
		
		// ���� ���� �����(GameValue��ü�� ����)�� history �迭�� ����
		history[k] = temp;		// temp�� GameValue ��ü�� ������ (�ּ�)
		k++;	// ���� ���ؽ� ��, ī��Ʈ �� (������ Ƚ��)
		
		System.out.println("���� �� ��? �����Ϸ��� 0�� �Է� -> " );
		}while(sc.nextInt()==0); 
		
		System.out.println(":::::::::���� ���ھ�:::::::::");
		// for �ݺ����� history �迭�� ����� �� ����ϱ�
		for (int j = 0; j<k; j++)
		history[j].print(); 	//history[j]�� Ÿ���� GameValue
		
		
		
		System.out.println(":::::::::The End::::::::::");
			sc.close();
		
	}

}

