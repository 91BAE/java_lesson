package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;
// 배명환
public class C28_IntArrayEx {

	/* 1. int 배열크기 5를 선언하세요. 이름은 nums
	 * 2. 배열 요소의 값은 사용자 입력으로 저장합니다.
	 * 3. 입력된 값에 합계, 평균을 구합니다. -> 합계는 2번에서 입력받는 for문 안에서 수식 작성해라.
	 * 4. 입력된 값에 최대값, 최소값을 구하는 메소드를 만든다.
	 * 			ㄴ 메소드 이름 : maxOfArray, minOfArray : 인자는 int 배열, 반환값 형식 int
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg;
		int number;
		int [] nums = new int [5];
		
		for (int i = 0; i < nums.length; i++ ) {
			System.out.println("요소의 값을 출력하세요. -> ");
			number = sc.nextInt();
			nums[i] = number;
			sum += nums[i];
		}
		
		avg = (double)sum / nums.length;
		System.out.println(Arrays.toString(nums));
		System.out.println("입력한 요소의 합 : " + sum);
		System.out.println("입력한 요소의 평균 : " + avg);
		System.out.println();
		
		System.out.println("최종 max : " + maxOfArray(nums));
		System.out.println("최종 min : " + minOfArray(nums));
		
		sc.close();
		
		int max	= maxOfArray(nums);
		System.out.println("배열 nums 최대값 max = " + max);
		
	}
	
	// 1. max, min 변수를 배열의 0번 요소값으로 초기화 한다.
	// 2. 배열 요소 1번부터 마지막 요소까지 max, min과 순서대로 비교해서 -> for 문
	// 3. max가 그 값보다 작으면 (min이 그 값보다 크면) max(min) 값을 배열요소 값으로 변경한다.
	// 4. -> 비교가 끝나면 max, min 결정이 된다.

	private static String minOfArray(int[] array) {
		
		// TODO Auto-generated method stub
		return null;
	}

	public static int maxOfArray(int [] array) {
		int max =array[0];	//1
		for(int i=1; i<array.length; i++) { //2
			if (max < array[i])	// 비교값이 max보다 더 클때
				max = array[i];
			
		}
		
		// 권장 : 출력은 main 에서 실행 시킬때 원한는 형식으로 하도록 한다.
		return max;	//4
	}

}
