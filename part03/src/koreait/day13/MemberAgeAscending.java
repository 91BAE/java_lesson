package koreait.day13;

import java.util.Comparator;

import koreait.day12.Member;

// member 객체의 sort : 비교 가능한 값으로 필드 중 하나를 선택해서 비교자(comparator) 구현체 만든다.
public class MemberAgeAscending implements Comparator<Member> {
	
	@Override
	public int compare(Member o1, Member o2) {
		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();
		return age1.compareTo(age2);	// 오름차순
	}
	
	
	

}
