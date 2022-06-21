package koreait.day02;

public class C06_DoubleVar {

	public static void main(String[] args) {
		/* 1. main 메소드 안에서만 사용하는 지역변수를 선언합니다.
		 * 2. 기본형 (primitive) 데이터 타입 : 
 		 * 		실수형식 float, double
		 */
		
		//변수선언
		float p1;
		double p2;
		
		//변수선언과 초기화
		float q1 = 3.14f;	 // float 리터럴은 f(대문자F도 가능)로 표시함.
							 
	//	float q1 = 3.14;	 // 오류터짐	f를 뒤에 안넣었으니까	
	//  						3.14는 double 형식의 리터럴. 8바이트를 4바이트에 대입에 대입하는것이 자동으로 안됨.
		double q2 = 3.14; 
		
		System.out.println("실수 q1 = " + q1);
		System.out.println("실수 q2 = " + q2);
		

	}

}
