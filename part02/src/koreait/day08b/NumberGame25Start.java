package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame25Start {

	public static void main(String[] args, String gamer) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 10;		// 시도 횟수
		int[] triallst = new int[max];
		GameValue[] history = new GameValue[10];		// 최대 10개 기록을 저장하기
		int k = 0;			// 히스토리 배열의 인덱스 변수
		
		System.out.println("숫자 맞추기 게임 시작합니다.");
		System.out.print("이름을 써라");
		String player = sc.nextLine();
		int rmin = 11, rmax = 29;
		do	{
			// 여기서 부터
		GameValue temp = new GameValue(player);
		System.out.println("숫자 맞추기 게임 시작합니다. 나 컴퓨터는 숫자를 결정했습니다.");
		System.out.println(String.format("너, 휴먼은 맞춰보세요. (범위 %d ~ %d)", rmin, rmax));
		int numComputer = GameValue.makeNumber(rmin, rmax);	
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
			
			
			if (i == max) break; 
		
		}while (numComputer != numHuman);
		// numComputer = numHuman 이면 답을 맞춘걸로 처리 -> do~while 문 종료
		if(i==max) {
			System.out.println("너 휴먼 입력 내용 : " + Arrays.toString(triallst));
			System.out.println("주어진 기회를 다 썻다. 게임 다시 하고 싶냐? [답은" + numComputer + " "]);
			temp.setCount(max);
		} else {
			System.out.println("제법인데? 정답! 성공까지 시도 횟수 : " + (i+1));
			temp.setCount(i+1);
			temp.setSuccess(true);
		}
		// 여기까지
		
		// 위의 게임 결과를(GameValue객체에 저장)을 history 배열에 저장
		history[k] = temp;		// temp는 GameValue 객체의 참조값 (주소)
		k++;	// 다음 인텍스 값, 카운트 값 (게임한 횟수)
		
		System.out.println("한판 더 콜? 종료하려면 0을 입력 -> " );
		}while(sc.nextInt()==0); 
		
		System.out.println(":::::::::게임 스코어:::::::::");
		// for 반복으로 history 배열에 저장된 값 출력하기
		for (int j = 0; j<k; j++)
		history[j].print(); 	//history[j]의 타입은 GameValue
		
		
		
		System.out.println(":::::::::The End::::::::::");
			sc.close();
		
	}

}

