package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;

// member ��ü�� sort : �� ������ ������ �ʵ� �� �ϳ��� �����ؼ� ����(comparator) ����ü �����.
public class MemberNameDescending implements Comparator<Member> {
	
	@Override
	public int compare(Member o1, Member o2) {
	// name �ʵ� ��
		
		return o1.getName().compareTo(o2.getName());	// �������� : 
	}
	
	
	

}
