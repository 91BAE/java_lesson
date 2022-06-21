package koreait.day03;

import java.util.Scanner;

	public class C13_MaxMinEx  {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		int max;
		int min;
		
		//n1, n2, n3 임시값 넣기
		System.out.print("n1 -> ");
		n1 = sc.nextInt();
		System.out.print("n2 -> ");
		n2 = sc.nextInt();
		System.out.print("n3 -> ");
		n3 = sc.nextInt();
		System.out.printf("n1=%d\t n2=%d\t n3=%d\n" ,n1 ,n2 ,n3);
		
		// n1, n2, n3 에서 최대값 구하기
		if(n1>n2) {
			max = n1;   //max는 임시값
			min = n2;
		} else {
			max = n2; 	//max는 임시값
			min = n1;
		}
		
		if (max < n3) max = n3;	// 임시 max 남은 1개 값 보다 남은 n3이 더 클때만.
		if (min > n3) min = n3;	// 임시 min 남은 1개 값 보다 남은 n3이 더 작을때만.
		System.out.println("max = " + max + ",min = " + min);
		
		}
}
