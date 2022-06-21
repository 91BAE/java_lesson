package koreait.day03;

import java.util.Scanner;

public class C14_IfElseIf {

	public static void main(String[] args) {
		//if 조건식{ .. } else if(조건식) { .. } else if(조건식) { ... } ~else
		
		/*	나의 쇼핑물 마켓컬리 이벤트 
		 * 	오늘 구입한 금액이 100000원 이상이면 적립금을 구매금액의 10% = (10/100)
		 * 					70000원 						9% = 9/100
		 * 					40000원						7% = 7/100
		 * 					그 이하는						3% 3= 3/100
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int money;	// 적립금 : % 적용하면 결과값은 실수 -> 정수로 변환.
		int pay;	// 구매금액
		double rate; // 적립율 : 0.1 0.09 등
		
		System.out.println("구매 금액은 -> ");
		pay = sc.nextInt();
		
		if(pay >= 100000)
			rate = 0.1;
		else if (pay >= 70000)		// pay < 100000 일때만 실행한다. 
			rate = 0.09;
		else if (pay >= 40000)
			rate = 0.07;
		else 
			rate = 0.03;
		
		money = (int)(pay * rate);
		
		System.out.printf("고객님! 오늘 구매하신 금액의 적립금은 %d원 입니다.\n",money);
		System.out.printf("이벤트 기간 적립율은 %d %%가 적용 되었습니다.",(int)(rate*100));
		
		sc.close();
		
	}

}
