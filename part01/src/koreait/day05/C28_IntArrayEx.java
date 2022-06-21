package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;
// ���ȯ
public class C28_IntArrayEx {

	/* 1. int �迭ũ�� 5�� �����ϼ���. �̸��� nums
	 * 2. �迭 ����� ���� ����� �Է����� �����մϴ�.
	 * 3. �Էµ� ���� �հ�, ����� ���մϴ�. -> �հ�� 2������ �Է¹޴� for�� �ȿ��� ���� �ۼ��ض�.
	 * 4. �Էµ� ���� �ִ밪, �ּҰ��� ���ϴ� �޼ҵ带 �����.
	 * 			�� �޼ҵ� �̸� : maxOfArray, minOfArray : ���ڴ� int �迭, ��ȯ�� ���� int
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg;
		int number;
		int [] nums = new int [5];
		
		for (int i = 0; i < nums.length; i++ ) {
			System.out.println("����� ���� ����ϼ���. -> ");
			number = sc.nextInt();
			nums[i] = number;
			sum += nums[i];
		}
		
		avg = (double)sum / nums.length;
		System.out.println(Arrays.toString(nums));
		System.out.println("�Է��� ����� �� : " + sum);
		System.out.println("�Է��� ����� ��� : " + avg);
		System.out.println();
		
		System.out.println("���� max : " + maxOfArray(nums));
		System.out.println("���� min : " + minOfArray(nums));
		
		sc.close();
		
		int max	= maxOfArray(nums);
		System.out.println("�迭 nums �ִ밪 max = " + max);
		
	}
	
	// 1. max, min ������ �迭�� 0�� ��Ұ����� �ʱ�ȭ �Ѵ�.
	// 2. �迭 ��� 1������ ������ ��ұ��� max, min�� ������� ���ؼ� -> for ��
	// 3. max�� �� ������ ������ (min�� �� ������ ũ��) max(min) ���� �迭��� ������ �����Ѵ�.
	// 4. -> �񱳰� ������ max, min ������ �ȴ�.

	private static String minOfArray(int[] array) {
		
		// TODO Auto-generated method stub
		return null;
	}

	public static int maxOfArray(int [] array) {
		int max =array[0];	//1
		for(int i=1; i<array.length; i++) { //2
			if (max < array[i])	// �񱳰��� max���� �� Ŭ��
				max = array[i];
			
		}
		
		// ���� : ����� main ���� ���� ��ų�� ���Ѵ� �������� �ϵ��� �Ѵ�.
		return max;	//4
	}

}
