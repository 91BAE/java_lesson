package koreait.day14;

import java.util.Random;

public class C61_FunctionATest {

	public static void main(String[] args) {
		
		//1) 익명클래스 : 추상 메소드의 개수 상관없다.
		FunctionA fa = new FunctionA() {
			@Override
			public int methodA(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println("a*b=");
				return a*b;
			}
		};
		
		System.out.println(fa.methodA(23, 11));
		
		//2) 람다식 : 추상 메소드가 1개일 때만 가능. 즉 함수형 인터페이스만 표현 가능함. (메소드 이름을 생략한 형식)
		fa = (int a, int b) -> {
			System.out.println("a+b= ");
				return a+b;
		};
		
		System.out.println(fa.methodA(23, 11));
		
		fa = (int max, int min) -> {
			// min ~ max 범위의 난수를 만들어서 리턴해봐.
			Random r = new Random();
			System.out.println("난수 = ");
			return r.nextInt(max-min-1)+min;
		};
		System.out.println(fa.methodA(99,11));
	}

}
