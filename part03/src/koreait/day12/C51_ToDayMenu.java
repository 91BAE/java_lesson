package koreait.day12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class C51_ToDayMenu {

	public static void main(String[] args) {
		
		System.out.println("오늘의 저녁를 투표합니다.");
		String foods = "치맥, 떡볶이, 곱창, 불고기, 햄버거, 오징어물회";
		System.out.println(foods);
		
		// key : 메뉴이름 value : 투표수
		// 초기화
		HashMap<String, Integer> map = new HashMap<>();
		map.put("치맥" ,0 );
		map.put("떡볶이" , 0 );
		map.put("곱창" , 0);
		map.put("불고기" ,0 );
		map.put("햄버거" , 0);
		map.put("오징어물회" , 0);
		
		Scanner sc = new Scanner(System.in);
		// 메뉴 선택 반복
		
		while(true) {
			System.out.println(foods);
			System.out.println("선택 메뉴 음식을 입력하세요.(종료는 end 입력) ->");
			String menu = sc.nextLine();
			if (menu.equals("end")) break;
			
			if(!map.containsKey(menu)) {		// map의 key값에 menu 입력 문자열이 없으면
//				System.out.println("없는 메뉴입니다. 다른것을 투표해 주세요");
				System.out.println("없는 메뉴입니다. 메뉴에 추가합니다.");
				map.put(menu, 1);
				continue;
			}
			
			// 입력 받은 메뉴의 벨류 값을 가져오기 -> +1 하기 -> 결과 저장하기.
			int temp = map.get(menu);
		//	++temp;
		//	map:put(menu,temp);
			map:put(menu, ++temp);	// 증가 -> put
		//	map.put(menu, temp++);	// put -> 힘 증가
			System.out.println(map);
		}
		
		System.out.println("투표 종료");
		System.out.println(map);
		System.out.println("최대 득표 :" + Collections.max(map.values()));
		System.out.println("참고 : " + Collections.max(map.keySet()));
	}

	private static void put(String menu, int temp) {
		// TODO Auto-generated method stub
		
	}

}
