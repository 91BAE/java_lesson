package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;

// member 객체의 sort : 비교 가능한 값으로 필드 중 하나를 선택해서 비교자(comparator) 구현체 만든다.
public class MemberNameDescending implements Comparator<Member> {
	
	@Override
	public int compare(Member o1, Member o2) {
	// name 필드 비교
		
		return o1.getName().compareTo(o2.getName());	// 내림차순 : 
	}
	
	
	

}
