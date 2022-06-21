package koreait.day02;

public class C08_Test {
	// 작성자 : 배명환

	public static void main(String[] args) {
		
		int a = 23 , b = 19; // a=가로 b=세로
		int c = a * b;
		
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.println("가로 : " + a + "㎝");
		System.out.println("높이 : " + b + "㎝");
		System.out.printf("넓이를 구했습니다. -> %d㎠ \n ",  c );
		
		System.out.println("-----------------------");
		
		
		double half = 23.23; // 반지름
		final double PI = 3.14;
		double round = 2 * PI * half; // 둘레
		double area = PI * half * half; // 넓이
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		System.out.println("반지름 : " + half + "㎝" );
		System.out.printf("둘레를 구했습니다. -> %.3f㎠  \n" , round);
		System.out.printf("넓이를 구했습니다. -> %.3f㎠  \n" , area);
		
		
		// final 테스트
		// 변수 선언 앞에 final 키워드를 붙이면 값을 변경하지 못합니다.
		
		final int test = 123;		//	값을 변경 못하는 상수 (final) 이 들어가면
		System.out.println("test = " + test);
		
		// test = 456; 		// 오류 : final로 선언해서
		
	}

}
