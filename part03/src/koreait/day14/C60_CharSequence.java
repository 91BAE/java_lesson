package koreait.day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class C60_CharSequence {
	
	//CharSequence 인터페이스 구현체 : String, StringBuffer, StringBulider.....
	public static void main(String[] args) {
		
		String result = new String();		// result = "test"; result = new String("test");
		System.out.println("result : " + result);	// ""
		System.out.println("1. String 타입 테스트");
		for(int i=2; i<6; i++) {
			// 문자열 내용이 바뀌면 문자열 객체 위치가 달라진다
			result += i + "/";			// result = result + (i + "/");
			System.out.println("result : " + result);
		} 
				
		StringBuffer sb = new StringBuffer();		// StringBuilder와 함께 많이 사용되는 클래스
		System.out.println("2. StringBuffer 타입 테스트");
		for(int i=2; i<6; i++) {
			// StringBuffer 객체의 문자열 내용이 바뀌어도 기존 객체에 추가되는 동작을 한다.
			// 반복되는 연결 연산이 많은 경우 String?x StringBuffer가 더 효율적
			sb.append(i).append(":");		// 문자열 연결 연산 + 와 같은 동작
			System.out.println("sb : " + sb);
		}
		
		//charSequence 인터페이스 사용 : contains 메소드의 매개변수 타입
		//boolean java.lang.String.contains(CharSequence s)
		String sample = "abc2/3/4/5/xyz";
		
		System.out.println("3. contains 메소드 확인");
		System.out.println("contains(result) : "+sample.contains(result));		// 참
		System.out.println("contains(sb) : "+sample.contains(sb));		// 거짓
		
		// 메소드의 형식 또는 다른 여러 형식들을 확인 할 때 : 1) 클래스 of 인터페이스 2) 인터페이스일때 구현체는 무엇인가?
		
		
		// 참고 : ArrayList 선언할때 변수 선언 List 인터페이스 타입으로 한다.
		// 		HashMap		" 		Map			"
		List<String> names = new ArrayList<>();
		names = new Vector<>();
		
		Map<String,Integer> map = new HashMap<String, Integer>();	// 객체 생성시 제너릭 타입 생략 가능.
		map = new TreeMap<String, Integer>();
		
		

	}

}
