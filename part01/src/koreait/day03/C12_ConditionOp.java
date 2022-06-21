package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {

	public static void main(String[] args) {
		// 조건식의 결과에 따라 명령을 선택하는 조건 연산자 : 조건식? 값/수식T(참) : 값/수식F(거짓)
		int korean, math; 	// 국어점수, 수학점수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수는? ");
		korean = sc.nextInt();
		
		System.out.println("수학 점수는? ");
		math = sc.nextInt();
		
		// 국어점수와 수학점수 모두 80점 이상인가? -> 모범학생
		System.out.println("모범학생 ? " + ((korean>=80 && math>=80 )? "맞습니다." : "아닙니다."));
		
		// if : 처리할 명령을 제어하는 조건문 
		// { } 는 명령문 블록(block) 이고 여러개의 명령들을 감싸는 역할의 기호,
		// 	{ } 안에 들어가는 명령이 1개일 때는 생략할 수 있다.
		if(korean>=80 && math>=80) {  
			// 조건식이 참일 때 실행하는 명령문 
			System.out.println("맞습니다.");
		} else {
			// else는 거짓일 때 실행하는 명령문
			System.out.println("아닙니다.");
		}	
		
		// System.out.println("특기학생?" (korean>=90 || math>=90));
		// { } 안에 들어가는 명령이 1개일 때는 생략 가능
		if(korean>=90 || math>=90)
			System.out.println("맞습니다.");
		else 
			System.out.println("아닙니다.");
		
		
		// 프로그램의 처리 조건이 else { } 에 해당하는 내용이 없을 수 도 있다. 내용이 없으면 작성 안함.
			if (!(korean>=20 && math>=80))
				System.out.println("표준 편차값이 큰 점수 입니다.");
			
	}	

}
	
