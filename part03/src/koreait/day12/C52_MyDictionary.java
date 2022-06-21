package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// 키보드 입력시 nextLine()과 nextInt() 등을 같이 쓰면 입력이 정상 실행 안된다.
//		HashMap<String, String> mydic = new HashMap<>();	// 단어장 저장할 자료구조
		TreeMap<String, String> mydic = new TreeMap<String, String>();
		// key : 영어단어, value : 한글의 뜻
		String sel, eng, kor;
		System.out.println("선택기능 -> 1. 단어 저장 2. 단어 검색  3. 단어장 보기 4. 프로그램 끝내기");
		boolean run = true;
		while (run) {		// while 반복안에 switch로 종료조건을 동시에 동작 시킬때 break로 못한다. -> 변수 사용했다.
			System.out.println("선택 ->");
			sel = sc.nextLine();
			switch (sel) {
			case "1":		// switch문에서 case 문자열 형식 가능. if문에서는 sel.equals("1")로 해야함.
				System.out.println("English -> ");
				eng = sc.nextLine();
				System.out.println("Korean -> ");
				kor = sc.nextLine();
				mydic.put(eng, kor);	// 저장
				
				break;
			case "2":
				System.out.println("검색 단어 English -> ");
				eng = sc.nextLine();
				System.out.println("단어장 검색 했습니다. 결과 ->" + mydic.get(eng));
				break;
			case "3":
				System.out.println("단어장 전체보기 : " + mydic);
				break;
			case "4":
				run = false;
				break;
				default:
					System.out.println("잘못 입력된 선택입니다. 1~4 입력입니다.");
					break;
			}
		}// while end
		System.out.println("::::::단어장 종료:::::::");
	}	// 참고 : 정수 데이터 입력을 받아야 한다면 문자열 넥스트라인() 받아서 정수로 변환함
		// int score = integer.parseInt(sc.nextLine());
		// 이유 : nextInt()는 엔터를 처리 하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해가 됩니다.
		// 결론 : 한 소스 파일에서 nextInt()만 사용 또는 nextLine()만 사용하거나 합니다.

}
