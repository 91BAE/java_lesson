package koreait.day16;

import java.io.File;		// io:input, output ����� ���õ� ��ɵ��� Ŭ����
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
// Exception ó�� ����� ���� �޼ҵ忡�� ���� �� �� �ٸ� ��� : 1/ 2)
public class C68_FileReadWrite {
	// main �޼ҵ尡 throws Exception �Ѵٸ� JVM ���� �ѱ��. ó�� ������ priStackTrace ����� ����.
	public static void main(String[] args) {
		
		String filename = "D:\\Iclass05\\�ڹ��׽�Ʈ.txt";
	
		try {
		fileWrite2(filename);
	//	filename = "D:\\Iclass05\\�ڹ��׽�Ʈ3.txt";	// ���� ���� �׽�Ʈ ��
		fileRead(filename);
		} catch (FileNotFoundException e) {
			System.out.println("����� ���� ���� : " + e.getMessage());
			System.out.println("������ ���� �ϴ��� Ȯ���ض�.");
		}
	
	}
		
	// ��� 1 : Exception�� try~catch �� ���� ó��.
	public static void fileWrite(String filename) {
		
	File file = new File(filename);
	
		PrintWriter pw = null;
		// ������ �޼ҵ� java.io.PrintWriter.PrintWriter(File file) throws FileNotFoundException 
		try {
			pw = new PrintWriter(file);	// file �� ������ ��ġ�� ����� ���� ��ü
			pw.println("��� 90 89 82");
			pw.println("���� 89 82 90");
			pw.println("���� 82 90 89");
			System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");		// System.out : ǥ�� ���(�ܼ� ���)
		} catch (FileNotFoundException e) {			
			// ��� ��ɿ��� ������ ������ �ڵ����� ������ ��������ϴ�.
			System.out.println("����� ���� �߻� : " + e.getMessage());
		} finally {
			pw.close();
		}
	}
	// ��� 2 : throws Ű����� �ش� Exception �� ȣ���� ��(���⼭�� main �޼ҵ�)���� �ѱ��. (�� �ѱ��)
	//			throws �ڿ� , �� �����ؼ� �������� ������ �� �ִ�.
	//			Exception ó���ؾ� �� �޼ҵ尡 ���� ���� �ǰ� ��� �� �� �� ������ ��� ó�� �� �� �ִ�.
	public static void fileWrite2(String filename) throws FileNotFoundException {
		
		File file = new File(filename);
			
			PrintWriter pw = null;
				pw = new PrintWriter(file);	// file �� ������ ��ġ�� ����� ���� ��ü
				pw.println("��� 90 89 82");
				pw.println("���� 89 82 90");
				pw.println("���� 82 90 89");
				System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");		// System.out : ǥ�� ���(�ܼ� ���)
				pw.close();
				
		}
	
	public static void fileRead(String filename) throws FileNotFoundException{
		
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}
