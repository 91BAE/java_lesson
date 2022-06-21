package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 10;		// 시도 횟수
		int[] triallst = new int[max];
				// 최대 10개 기록을 저장하기
		
 		
		System.out.println("숫자 맞추기 게임 시작합니다. 나 컴퓨터는 숫자를 결정했습니다.");
		System.out.println("너, 휴먼은 맞춰보세요. (101~299)");
		int numComputer = r.nextInt(199) + 101;		
		int numHuman;
		int i = 0;
		
		do {
			System.out.println("생각한 숫자 입력 (기회 : " + (max- i ) + ") -> ");
			numHuman = sc.nextInt();
			if (numComputer > numHuman ) {
				triallst[i] = numHuman;
				i++;
				System.out.println("아니다. 더 큰 값이다.");
			} else if (numComputer < numHuman) {
				triallst[i] = numHuman;
				i++;
				System.out.println("아니다. 더 작은 값이다.");
				
			}
			if (i == max) break; // 휴먼이 숫자를 입력한 숫자가 max랑 같아지면 빠져나옴
		}
		while (numComputer != numHuman);
		// numComputer = numHuman 이면 답을 맞춘걸로 처리 -> do~while 문 종료
		if(i==max) {
			System.out.println("너 휴먼 입력 내용 : " + Arrays.toString(triallst));
			System.out.println("주어진 기회를 다 썻다. 게임 다시 하고 싶냐?");
		} else {
			System.out.println("제법인데? 정답! 성공까지 시도 횟수 : " + (i+1));
		}
		sc.close();
		
	}

}
