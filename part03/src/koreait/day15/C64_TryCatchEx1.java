package koreait.day15;

import java.util.Scanner;

public class C64_TryCatchEx1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		try {
			
			String message = null;
			int cnt = message.length();
			
			System.out.println("정수 입력 -> " );
			//int n = sc.nextInt(); // 123 입력, abc 입력 결과 비교
			int a = Integer.parseInt(sc.nextLine());
			System.out.println("입력한 값: " + a);
			
		//} catch (Exception e) {	// 오류 원인에 따른 Exception 종류를 검사한다.
		//	} catch (NullPointerException e) {	
			//  | 기호는 bit 단위 or 연산 : Exception이 비트 값으로 설정
			} catch (NullPointerException | NumberFormatException e) {	
		// 발생한 오류 정보를 Exception 객체로 관리하고 이에 대한 참조 변수는 e 입니다.
			System.out.println("오류 발생 : " + e.getMessage());
			System.out.println("사용자 기능에 문제 발생!");
		} finally {
			sc.close();
		}
		
		System.out.println("프로그램 끝");
	}

}
