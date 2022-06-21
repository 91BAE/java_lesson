package koreait.day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C63_TryCatchTest {

	public static void main(String[] args) {
		// try ����
		Scanner sc = new Scanner(System.in);
		try {
			// Exception ���ɼ��� �ִ� ����� �ۼ�. => ������ ����� catch�� ����
			// �� ��ġ���� ���� �����ϸ� try { } �� ���� ����
			
			
		} catch (NullPointerException e) { // ���� ���ο� ���� Exception ������ �˻��Ѵ�.
			// NullpointerException �϶��� �Ʒ� ��ɵ� ó���Ѵ�.
			e.printStackTrace(); 	// ������ �����ϴ� ������ ��� (���� Exception ��� ����)
			
		} catch (NumberFormatException e) {
			// catch�� ������ �ۼ� ����
		} finally { // ����������, ���������� : ���� �߻� ������� ����Ǵ� �κ��̴�.
			// �ַ� �ڿ��� �����ϴ� �ڵ� �ۼ��մϴ�.
			sc.close();
		}
		// try ���� ��� �Ǵ� catch ���� ����� ������ ������ ��� �ȴ�.
		
		
	}

}
