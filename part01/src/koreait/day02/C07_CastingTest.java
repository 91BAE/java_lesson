package koreait.day02;

public class C07_CastingTest {

	public static void main(String[] args) {
		
//		 대입문 : 오른쪽 값(리터럴)/수식/변수 가 왼쪽 변수로 대입. 수식에 사용되는 연산자는 다음과 같습니다.
//				산술연산 + , - , * , /(나누기 몫) , %(나눗셈 나머지, 정수연산에서만 가능)
//				관계연산 ==(동등, 같다) , !=(같지않다) , >, <, >= , <=
//				논리연산 &&(and, 그리고) , ||(or, 또는) , !(not, 아닌, 반대)
		//		참고 : ++, --, +=, -=, *=, /=, 과 같은 축약 연산자 진도 예정
		
		//정수 형식의 연산은 int
		
		int a = 123, b = 13;
		double c=10.99;
		
		//연산에 사용되는 피연산자가(123,13)가 모두 정수라면 정수
		//				피연산자가 정수,실수 경우라면 결과는 실수
		//				-> 연산결과를 변수에 저장할때 데이터 형식을 고려한다.
		
		int isum;
		double dsum;
		
		isum = a+b;
		dsum = a+c;
		
		System.out.println("a + b = " + isum);
		System.out.println("a + c = " + dsum);
		
//		isum = a + c;  //오류 : 결과가 실수이므로 정수형식 변수에 저장 못함. 
		
//		형변환 (캐스팅, casting) : 정수 + 실수 결과를 꼭 정수 변수에 저장해야 한다면. 실수를 정수로 변환해서 연산을 함.
//			-> 프로그래머가 결정해서 강제로 형변환 -> ()안에 변환시킬 형식 작성
		
		isum = a+(int)c;  // c변수의 실수값을 정수로 변환 (소수점 아래는 버린다)
		
		System.out.println("a +(int)c = " + isum);
		
		b=10;
		System.out.println(" a / b = " + (a/b)); // 정수끼리 나누면 결과는 정수
		System.out.println(" a % b = " + (a%b)); // 정수끼리 나누기의 나머지
		
		System.out.printf("%d / %d = %d\n", a,b,a/b);
		System.out.printf("%d %% %d = %d\n", a,b,a%b);
		
		// 강제 형변환(강제 캐스팅) 예시 : 정수끼리 나눗셈 결과를 실수로 구하는 요구조건일 때.
		// 					-> 정수 1개를 실수로 변환
		
		System.out.println("정수 / 정수 = 실수 형식값으로 결과내기");
		System.out.printf("%d / %d = %f\n", a, b, (double)a / b); // 실수 형식 문자는 %f를 넣어야 한다.
																  // 기본 소수점 이하 6자리
		
		b=11;
		System.out.printf("%d / %d = %.14f\n", a, b, (double)a / b); // 소수점 이하 14자리로 변경(반올림)
		
		double test = 12.34567890123;
		System.out.println("test =" + test);
		System.out.printf("test = %f\n" ,test);
		System.out.printf("test = %.20f\n" ,test);
		
	}

}
