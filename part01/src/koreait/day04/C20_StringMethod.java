package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {
		
		String message ="hello~"; 		// java.lang.String (�⺻ ��Ű�� Ŭ����)
	
		int len = message.length();
		char temp = message.charAt(3);	// 0���� �����ؼ� 3�� ���ڰ� �������� ����.
		boolean isState = message.equals("Hello~");		// ���ڿ��� ������ (������ �ҹ��ڶ� �ٸ��� ���´�)
		
		System.out.println("length() = " + len);		//6
		System.out.println("charAt(3) = " + temp);		// l
		System.out.println("equals(\"Hello\") = " + isState);		//false
		
		
		
		System.out.println("indexOf('e')" + message.indexOf('e'));		// 1����ġ
		System.out.println("indexOf(\"lo\")" + message.indexOf("lo"));	// 3�� ��ġ
		System.out.println("indexOf(\"lo\")" + message.indexOf("ol"));	// -1 : ã�� ���ڿ��� ������
		
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\")" + test.indexOf("lo"));	// 3
		System.out.println("test.indexOf(\"lo\")" + test.lastIndexOf("lo"));	// ��ġ�ϴ� ������ ��ġ 9��
		
		System.out.println("substring(2)" +message.substring(2));	// �κ����� : llo~
		System.out.println("substring(2, 4)" +message.substring(2, 4));	// ll, 2�� ���� 2��(4-2)
		// substring ���� ������ �� �ִ� ���ڴ� 0 ~ 6(length())����  �� ���� ���� ���� IndexOutOfBounds ���� �߻���.
		
		
		System.out.println("substring(1, 4)" +message.substring(1, 4));	// e11, 3�� ���� 2��(4-1)
		
		System.out.println("replace(\"ll\",\"*@\")" +message.replace("ll","*@"));	// ġȯ : he*@o~
		System.out.println("startsWith(\"H\") =" + message.startsWith("H"));	//false
		System.out.println("endsWith(\"~\") =" + message.endsWith("~"));	//ture
		
	}
		// "�� ����Ҷ��� \���������� �ʿ��ϴ�. -> "��ȣ�� ���ڿ� �������� �ؼ��Ǳ� ����.
}


// String Ŭ������ �޼ҵ�� ����. �� �ܿ�� ����ϴ� ���� �ƴ϶� �޼ҵ��� �̸�, ����, ���������� �����ؼ� ����Ѵ�.


 /*	message.length(); 		// public int length() : ����
	message.charAt(0);		// public char charAt(int index)

	message.equals("Hello~");		// public boolean equals(object anObject), Object�� ��� Ÿ��
								// message �� String Ÿ���̹Ƿ� Object�� String���� �ؼ��Ѵ�.
	���� �� ������?

	message.indexOf('e');	// int 
	message.indexOf("lo");
	message.substring(2);		// String
	message.substring(2, 4);		
	message.replace("11","*@");		// String
 */
	// �޼ҵ� ���� ���ε� (overloading) : �޼ҵ� �̸��� ���������� ���� ���ڰ��� ������ �ٸ��� ���ǵ� ��.

