package koreait.day05;

public class C22_AssignTest {

	public static void main(String[] args) {
		
		// 참고 : (감소)증가 연산자, 축약 연사자( +=, -=, *=, /=, ...)
			int i = 10, sum = 0;
			i=i+1;	// i=11
			i += 1;		// i=12
			i++;	// i=13	(후치 : postfix)
			++i;	// i=14	(전치 : prefix)
			// 전치, 후치는 다른 명령어(또는 연산자)들과 같이 쓸때 차이가 있다.
			System.out.println("i++ ? " + i++); // 출력은 14, i값은 15
			System.out.println("++i ? " + (++i));	//출력 16, i값도 16
			
			sum = sum + i;	// sum = 16
			sum += i;		// sum = 32
			System.out.println("sum ? " + sum);	//32
			
			
			//
			i--;
			--i;
			sum = sum - 10;
			sum -=10;
			
		
	}

}
