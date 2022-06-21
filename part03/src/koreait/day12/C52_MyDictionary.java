package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// Ű���� �Է½� nextLine()�� nextInt() ���� ���� ���� �Է��� ���� ���� �ȵȴ�.
//		HashMap<String, String> mydic = new HashMap<>();	// �ܾ��� ������ �ڷᱸ��
		TreeMap<String, String> mydic = new TreeMap<String, String>();
		// key : ����ܾ�, value : �ѱ��� ��
		String sel, eng, kor;
		System.out.println("���ñ�� -> 1. �ܾ� ���� 2. �ܾ� �˻�  3. �ܾ��� ���� 4. ���α׷� ������");
		boolean run = true;
		while (run) {		// while �ݺ��ȿ� switch�� ���������� ���ÿ� ���� ��ų�� break�� ���Ѵ�. -> ���� ����ߴ�.
			System.out.println("���� ->");
			sel = sc.nextLine();
			switch (sel) {
			case "1":		// switch������ case ���ڿ� ���� ����. if�������� sel.equals("1")�� �ؾ���.
				System.out.println("English -> ");
				eng = sc.nextLine();
				System.out.println("Korean -> ");
				kor = sc.nextLine();
				mydic.put(eng, kor);	// ����
				
				break;
			case "2":
				System.out.println("�˻� �ܾ� English -> ");
				eng = sc.nextLine();
				System.out.println("�ܾ��� �˻� �߽��ϴ�. ��� ->" + mydic.get(eng));
				break;
			case "3":
				System.out.println("�ܾ��� ��ü���� : " + mydic);
				break;
			case "4":
				run = false;
				break;
				default:
					System.out.println("�߸� �Էµ� �����Դϴ�. 1~4 �Է��Դϴ�.");
					break;
			}
		}// while end
		System.out.println("::::::�ܾ��� ����:::::::");
	}	// ���� : ���� ������ �Է��� �޾ƾ� �Ѵٸ� ���ڿ� �ؽ�Ʈ����() �޾Ƽ� ������ ��ȯ��
		// int score = integer.parseInt(sc.nextLine());
		// ���� : nextInt()�� ���͸� ó�� ���� �ʾƼ� ������ ������ nextLine()���� ���޵Ǿ� �Է� �帧�� ���ذ� �˴ϴ�.
		// ��� : �� �ҽ� ���Ͽ��� nextInt()�� ��� �Ǵ� nextLine()�� ����ϰų� �մϴ�.

}
