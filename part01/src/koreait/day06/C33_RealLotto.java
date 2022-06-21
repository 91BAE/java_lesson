package koreait.day06;

import java.util.Arrays;
import java.util.Random;
// 배명환
public class C33_RealLotto {

	public static void main(String[] args) {
		
		int [] numbers = new int[45];			// 로또 번호 갯수
		Random r = new Random();			
		int [] lotto = new int[6];	// 선택된 6개의 값 (로또 번호) 저장하는 배열

		
		for (int i = 0; i<45; i++) {		// 인덱스 범위 : 0~44	-> 난수로 뽑히는 값
			numbers[i] = i+1;			// 값 범위 : 1~45	-> 로또 배열에 저장되는 값
		}
		
		System.out.println("numbers 배열 초기값 ---------------------");
		System.out.println(Arrays.toString(numbers));	// 로또 번호가 되는 번호들 나열
		System.out.println("--------------------------------------");
			
		int k;		// 뽑힐 값의 인덱스 -> 난수로 정함
		for (int cnt = 0; cnt<6;cnt++) {	// 로또 번호 6개를 구하는 for문
			
			k=r.nextInt(45-cnt);
			// cnt = 0, 1, 2, 3, 4, 5, 에 대해 난수의 bound 값은 45, 44, 43, 42, 41, 40 -> 중복방지(확률적인 범위를 줄임)
			// k의 난수 범위는 0~44 , 0~43, 0~42, 0~41, 0~40, 0~39...
			
			
			System.out.println("k= " + k + "number = " + numbers[k]);
			
			lotto[cnt] = numbers[k];	//numbers 배열에서 난수로 뽑힌 인덱스 k의 값이 저장.
			
			// k 위치의 값을 제거(삭제) : 인덱스 k + 1 부터 마지막요소까지 감소하는 방향으로 하나씩 이동
			for (int i = k; i < numbers.length-1; i++) {	// 선택된 로또 번호를 제외 -> 중복방지
				numbers[i] = numbers[i+1];
				
			}
			System.out.println(Arrays.toString(lotto));
		}
		System.out.println("최종 선택 숫자 : ");
		System.out.println(Arrays.toString(lotto));	// 최종 선택 숫자 출력
		
		Arrays.sort(lotto);		// 로또 배열값의 크기의 순서대로 위치를 변경	(정렬 = sort)
		System.out.println(Arrays.toString(lotto));		// 오름차순으로 출력
			
	}

}
