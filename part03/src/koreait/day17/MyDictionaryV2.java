package koreait.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import koreait.day16.Word;

public class MyDictionaryV2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		Scanner ssc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>();
		try {
			System.out.println("���Ͽ��� �о��? ( y or n) -> ");
			if(ssc.nextLine().equals("y"))
			// ���Ͽ��� ���� ���� �о���� �� ������ mywords ����Ʈ�� �����ϱ�
			read(mywords, "D:\\Iclass05\\���� ���� ����.txt");
			else
				System.out.println("������ ���� ����.");
		} catch (FileNotFoundException e1) {
			System.out.println("���� �д� �߿� ���� �߻�. " + e1.getMessage());
		}		

		
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
				mywords.add(temp);			// ����
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
				all(mywords);		// �����ϰ� ����ϱ�
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
		
		try {	
			
			System.out.println("���Ͽ� �����Ұ���? ( y or n) -> ");
			if(ssc.nextLine().equals("y"))
				// mywords ����Ʈ�� ���� ���Ͽ� �����ϱ�
			save(mywords, "D:\\Iclass05\\���� ���� ����.txt");
			else
				System.out.println("������ ������� �ʾҴ�.");
		} catch (FileNotFoundException e) {
			System.out.println("���� �����߿� ������ �����. - " + e.getMessage());
		}		
		
		System.out.println("::::::�ܾ��� ����:::::::");
		
	}	

	private static void save(List<Word> mywords, String filename) throws FileNotFoundException{
		// ���Ͽ� ����ϱ�
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for (Word w : mywords)
			pw.println(w);
		
		pw.close();
		System.out.println("���� ������ �Ϸ� �Ǿ����ϴ�.");
		
	}
	
	private static void read(List<Word> mywords, String filename) throws FileNotFoundException {
			File file = new File(filename);
			Scanner sc = new Scanner(file);
			StringTokenizer stk = null;
			while (sc.hasNext()) {
				String temp = sc.nextLine();	// ���Ͽ��� 1�� �о�°� ����
				System.out.println(temp.substring(0, temp.indexOf("(")));
				// ���� ����� ����� StringTokenizer �� Word ��ü ����� mywords ����Ʈ�� �߰��ϱ�
				// ?? �ڵ� �ϼ��Ǹ� 3�� ��ü���� �����غ���
				stk = new StringTokenizer(temp.substring(0, temp.indexOf("(")));
				
				mywords.add(new Word(stk.nextToken(),	// ���� �ʵ尪
									 stk.nextToken(),	// �ѱ� �ʵ尪
									 Integer.parseInt(stk.nextToken())));	// ���� �ʵ尪
			}
			sc.close();
			System.out.println("������ �о� �Խ��ϴ�.");
	}

	private static void level(List<Word> mywords, int no) {
		for (Word w : mywords)
			if (w.getLevel()==no)
				System.out.println(w);
		
		
	}

	private static void all(List<Word> mywords) {		// mywords ������ ���޹޾� ������ ��ü�� ����Ų��.
		mywords.sort(new Comparator<Word>() {
			@Override
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
		
		System.out.println(String.format("%-20s %-20s\t %10s" , "English","Korean","Level"));
		System.out.println("-----------------------------------------------------------");
		for(Word w : mywords) {
			System.out.println(String.format("%-20s %-20s\t %10d" , w.getEnglish(),w.getKorean(),w.getLevel()));
		}
		
	}

}
