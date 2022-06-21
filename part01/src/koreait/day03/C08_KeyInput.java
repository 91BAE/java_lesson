package koreait.day03;

import java.util.Scanner;

public class C08_KeyInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a; //가로
		int b; //세로
		double half, round, cricle_area;
		final double PI = 3.14;
		
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.println("사각형 너비 입력 ->");
		a = sc.nextInt();
		System.out.println("사각형 높이 입력 ->");
		b = sc.nextInt();
		
		int c = a * b;
		System.out.println("처리결과");
		System.out.println("가로 " + a + "cm");
		System.out.println("세로 " + b + "cm");
		System.out.println("넓이를 구했습니다. " + c + "㎠");
		
		
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		System.out.println("원의 반지름 입력 -> ");
		half = sc.nextDouble();
		
		round = 2 * PI * half; // 둘레
		cricle_area = PI * half * half; // 넓이
		System.out.println("처리결과");
		System.out.printf("둘레를 구했습니다. -> %.3f㎠  \n" , round);
		System.out.printf("넓이를 구했습니다. -> %.3f㎠  \n" , cricle_area);
	
	}

}
