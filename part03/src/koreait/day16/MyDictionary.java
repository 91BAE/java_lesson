package koreait.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class MyDictionary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		List<Word> mywords = new ArrayList<>(); // mydic�� myword�� �ٲ㼭 �����غ���
	
		String sel, eng, kor;
		int level;
		System.out.println("���ñ�� -> 1. �ܾ� ���� 2. �ܾ� �˻�  3. �ܾ��� ���� 4. ������ �˻� 5. ���α׷� ����");
		boolean run = true;
		while (run) {		
			System.out.println("���� ->");
			sel = sc.nextLine();
			switch (sel) {
			case "1":		
				System.out.print("English -> ");
				eng = sc.nextLine();
				System.out.print("�ѱ� �� -> ");
				kor = sc.nextLine();
				System.out.println("���� -> " );
				level = Integer.parseInt(sc.nextLine());
				Word temp = new Word(eng,kor);
				temp.setLevel(level);
				mywords.add(temp);		
				break;
			case "2":
				System.out.println("�˻� �ܾ� English -> ");
				eng = sc.nextLine();
				for (Word w : mywords)
					if(w.getEnglish().equals(eng))
						System.out.println("�ܾ��� �˻� �߽��ϴ�. ��� ->" + w);
				break;
			case "3":
				//System.out.println("�ܾ��� ��ü���� : " + mywords);
				all(mywords);
				break;
			case "4":
			System.out.print("�˻��� ���� �Է� (1~3) -> ");
			int no = Integer.parseInt(sc.nextLine());
			level(mywords, no);
			break;
			case "5":
				run = false;
				break;
				default:
					System.out.println("�߸� �Էµ� �����Դϴ�. 1~4 �Է��Դϴ�.");
					break;
			}
		}// while end
		System.out.println("::::::�ܾ��� ����:::::::");
		
	}	

	private static void level(List<Word> mywords, int no) {
		for (Word w : mywords)
			if (w.getLevel()==no)
				System.out.println(w);
		
		
	}

	private static void all(List<Word> mywords) {	// mywords �� ������ ���� �޾� ������ ��ü�� ����Ų��.
		mywords.sort(new Comparator<Word>() {
			@Override
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
		
		System.out.println(String.format("%-20% %-20s\t %10s" , "English","Korean","Level"));
		System.out.println("-----------------------------------------------------------");
		for(Word w : mywords) {
			System.out.println(String.format("%-20% %-20s %10d" , w.getEnglish(),w.getKorean(),w.getLevel()));
		}
		
	}

}