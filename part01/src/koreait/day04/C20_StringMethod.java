package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {
		
		String message ="hello~"; 		// java.lang.String (기본 패키지 클래스)
	
		int len = message.length();
		char temp = message.charAt(3);	// 0부터 시작해서 3번 문자가 무엇인지 리턴.
		boolean isState = message.equals("Hello~");		// 문자열이 같은지 (위에는 소문자라 다르게 나온다)
		
		System.out.println("length() = " + len);		//6
		System.out.println("charAt(3) = " + temp);		// l
		System.out.println("equals(\"Hello\") = " + isState);		//false
		
		
		
		System.out.println("indexOf('e')" + message.indexOf('e'));		// 1번위치
		System.out.println("indexOf(\"lo\")" + message.indexOf("lo"));	// 3번 위치
		System.out.println("indexOf(\"lo\")" + message.indexOf("ol"));	// -1 : 찾는 문자열이 없을때
		
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\")" + test.indexOf("lo"));	// 3
		System.out.println("test.indexOf(\"lo\")" + test.lastIndexOf("lo"));	// 일치하는 마지막 위치 9번
		
		System.out.println("substring(2)" +message.substring(2));	// 부분추출 : llo~
		System.out.println("substring(2, 4)" +message.substring(2, 4));	// ll, 2번 부터 2개(4-2)
		// substring 에서 지정할 수 있는 숫자는 0 ~ 6(length())까지  그 외의 값을 쓰면 IndexOutOfBounds 오류 발생함.
		
		
		System.out.println("substring(1, 4)" +message.substring(1, 4));	// e11, 3번 부터 2개(4-1)
		
		System.out.println("replace(\"ll\",\"*@\")" +message.replace("ll","*@"));	// 치환 : he*@o~
		System.out.println("startsWith(\"H\") =" + message.startsWith("H"));	//false
		System.out.println("endsWith(\"~\") =" + message.endsWith("~"));	//ture
		
	}
		// "를 출력할때는 \역슬래쉬가 필요하다. -> "기호는 문자열 시작으로 해석되기 때문.
}


// String 클래스의 메소드는 많다. 다 외우고 사용하는 것이 아니라 메소드의 이름, 인자, 리턴형식을 참조해서 사용한다.


 /*	message.length(); 		// public int length() : 같이
	message.charAt(0);		// public char charAt(int index)

	message.equals("Hello~");		// public boolean equals(object anObject), Object는 모든 타입
								// message 가 String 타입이므로 Object는 String으로 해석한다.
	리턴 값 형식은?

	message.indexOf('e');	// int 
	message.indexOf("lo");
	message.substring(2);		// String
	message.substring(2, 4);		
	message.replace("11","*@");		// String
 */
	// 메소드 오버 리로딩 (overloading) : 메소드 이름과 리턴형식은 같고 인자값의 형식이 다르게 정의된 것.

