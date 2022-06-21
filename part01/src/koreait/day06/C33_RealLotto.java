package koreait.day06;

import java.util.Arrays;
import java.util.Random;
// ���ȯ
public class C33_RealLotto {

	public static void main(String[] args) {
		
		int [] numbers = new int[45];			// �ζ� ��ȣ ����
		Random r = new Random();			
		int [] lotto = new int[6];	// ���õ� 6���� �� (�ζ� ��ȣ) �����ϴ� �迭

		
		for (int i = 0; i<45; i++) {		// �ε��� ���� : 0~44	-> ������ ������ ��
			numbers[i] = i+1;			// �� ���� : 1~45	-> �ζ� �迭�� ����Ǵ� ��
		}
		
		System.out.println("numbers �迭 �ʱⰪ ---------------------");
		System.out.println(Arrays.toString(numbers));	// �ζ� ��ȣ�� �Ǵ� ��ȣ�� ����
		System.out.println("--------------------------------------");
			
		int k;		// ���� ���� �ε��� -> ������ ����
		for (int cnt = 0; cnt<6;cnt++) {	// �ζ� ��ȣ 6���� ���ϴ� for��
			
			k=r.nextInt(45-cnt);
			// cnt = 0, 1, 2, 3, 4, 5, �� ���� ������ bound ���� 45, 44, 43, 42, 41, 40 -> �ߺ�����(Ȯ������ ������ ����)
			// k�� ���� ������ 0~44 , 0~43, 0~42, 0~41, 0~40, 0~39...
			
			
			System.out.println("k= " + k + "number = " + numbers[k]);
			
			lotto[cnt] = numbers[k];	//numbers �迭���� ������ ���� �ε��� k�� ���� ����.
			
			// k ��ġ�� ���� ����(����) : �ε��� k + 1 ���� ��������ұ��� �����ϴ� �������� �ϳ��� �̵�
			for (int i = k; i < numbers.length-1; i++) {	// ���õ� �ζ� ��ȣ�� ���� -> �ߺ�����
				numbers[i] = numbers[i+1];
				
			}
			System.out.println(Arrays.toString(lotto));
		}
		System.out.println("���� ���� ���� : ");
		System.out.println(Arrays.toString(lotto));	// ���� ���� ���� ���
		
		Arrays.sort(lotto);		// �ζ� �迭���� ũ���� ������� ��ġ�� ����	(���� = sort)
		System.out.println(Arrays.toString(lotto));		// ������������ ���
			
	}

}
