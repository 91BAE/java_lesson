package koreait.day08a;

import koreait.day08.MyClass1;
import koreait.day08.Score;

public class MyClass1Test {
	
	public static void main (String[] arge) {
	
	//MyClass1 객체생성
	MyClass1 my = new MyClass1();	// public 클래스 이지만 import 필요
	
	// 패키지가 다른 MyClass1 클래스의 필드 중 사용할 수 있는것은? 답 : point
	// 						default(패키지) 한정자 필드 name, 메소드 getAge, setAge 사용 못함
//	my.name="momo";
	my.point=1.234;
//	my.age=23;	//	오류 : 프라이빗 한정자 필드라서
//	my.setAge(23);
//	System.out.println("age = " + my.zage);		// 오류 : private 한정자 필드라서
//	System.out.println("age = " +	my.getAge());		
//	my.setAge(-100);
//	System.out.println("age = " +	my.getAge());		
	System.out.println("point = " + my.point);       	// public 한정자 필드
//	System.out.println("point = " + my.name);       	
	
	
	// Score 클래스 필드, 메소드의 한정자가 모두 default 입니다.
	//		ㄴ new 개체생성은 될까요?
	Score score = new Score();
	
	
}
	// 접근 한정자 테스트는 자바에서 제공되는 클래스들을 이해하고 우리가 만들 클래스에도 사용.
}
