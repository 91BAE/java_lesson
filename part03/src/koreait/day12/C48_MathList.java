package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//C43�� ���� ����Ʈ�� �����ϱ� // �ۼ��� : ���ȯ
public class C48_MathList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size=5;		// ���� ����
		ArrayList<MathProblem> problems = new ArrayList<>();
		int ans; int cnt=0;
		
		System.out.println("----------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("----------------------------");
		System.out.println("�����Ѵ�.");
		for(int i=0; i<size; i++){
			MathProblem temp = new MathProblem('+');
			temp.makeProb();
			System.out.println("����" + (i+1) + ". " + temp.problem() + "�� �Է� ->");
			ans = sc.nextInt();
			
			if (ans==temp.showAnswer()) {
				cnt++; temp.setCorrect(true);
			}
			// problems[i]= temp; 		//?????			// �� �ε��� i �� temp ��ü �������� �����ض�
			problems.add(i,temp);
		}
		System.out.println("----------------------------------------------------");
		System.out.println("ä���Ѵ�. ���� ����" + cnt + " (" + (cnt*100/size) + "��)");
		System.out.println("::::::Ʋ������ ����::::::");
		
		for(int i = 0; i<problems.size();i++)
			if(!problems.get(i).isCorrect())
				System.out.println("���� " + (i+1) + ". " + problems.get(i).problem() +
						problems.get(i).showAnswer());
		//????
		//for(int i = 0; i<problems.lenth; i++)
		//	if(!problems[i].isCorrect())	// problems[i].isCorrect�� �����̸� !�������� ������ �ٲ��
		//	system.out.println("���� + " (i+1) + " . "
		//						+ problems[i].problem() + problems[i].showAnswer());
	}

}		// ����Ʈ�� �޼ҵ� 1) add  2) get   3) remove  4) size
