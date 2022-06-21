package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		/*
		 * 학생 성적(국어) 분포 보고서를 작성하려 함
		 * 학생 인원은 100명 - 점수는 랜덤값으로 테스트(0<= 난수 <=100)
		 * 
		 * 90~ : ~명 (소수점 1자리 %)		카운트 (횟수) 변수가 5개 필요 (cntA, cntB, cntC, cntD, cntE)
		 * 80~89 : ~명 (소수점 1자리 %)			ㄴ counts[5] : counts[0], counts[1]
		 * 70~79 : ~명 (소수점 1자리 %)		counts[2]
		 * 60~69 : ~명 (소수점 1자리 %)		counts[3]
		 * 60점 미만 : ~명 (소수점 1자리 %)		counts[4]
		 */
		
		int[] koreans = new int [100];
		int[] counts = new int [5];
		Random r = new Random();
		
		for (int i = 0; i<koreans.length; i++) {
			koreans[i] = r.nextInt(101);
		} // 국어 점수 저장
		
		System.out.println(Arrays.toString(koreans));
		//점수 분포 counts 하기 : 0 <= 100 범위로 만들었으므로 100보다 크거나 같다는
		//					  조건식에서 검사하지 않아도 됩니다.
		for (int i = 0; i<koreans.length; i++) {
			if(koreans[i] >= 90)	counts[0]++;
			else if(koreans[i] >= 80) counts[1]++;
			else if(koreans[i] >= 70) counts[2]++;
			else if(koreans[i] >= 60) counts[3]++;
			else counts[4]++;
			
		}
		
		// 점수 분포 결과 출력하기
		
		System.out.printf("%8s %8s %8s %8s %8s\n","90~100","80~89","70~79","60~69","60미만");
		System.out.println("---------------------------------------------------");
		for (int i=0; i<counts.length; i++)
			// counts 배열값 출력
			System.out.printf("%8d ", counts[i]);
		
		System.out.println();
		for (int i = 0; i < counts.length; i++)
		// counts 배열값으로 백분율 구하고 출력하기
			System.out.printf("%8.1f%%" , (double)counts[i]/koreans.length*100);
	}

}

// 배열에서 기능이 향상(데이터 삭제/삽입, 크기도 동적으로 변경) 된 것이 자바 ArrayList
// 배열에서는 직접 데이터 추가/삭제 구현함 -> 메소드 정의
