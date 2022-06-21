package koreait.day09a;

/*
 * 클래스의 상속
 * -> 클래스 간의 부모(상위, super) 자식(하위클래스)관계가 만들어짐
 * -> 부모의 클래스 구성요소를 자식이 사용할 수 있음. 상속되는 요소는 필드, 메소드
 * -> extends 라는 키워드를 사용해서 부모 클래스를 지정함. 슈퍼클래스는 오직 1개.
 * -> private 접근 한정자는 상속이 안된다.
 * -> protected 는 다른 패키지의 자식 클래스가 상속받을 수 있도록 한다.
 * -> 현실세계에서 반려동물을 운영. 데이터로 저장하기 위해 클래스를 정해야 함. 동물 종류는 개, 고양이, 햄스터, 도마뱀, 토끼, 열대어...
 * -> 하나의 그룹으로 animal 클래스 정의하고 공통적 요소를 정의
 * -> 공통적인 요소가 아니면 구체적인 클래스로 정의 (ex , cat,dog,rabbit, ...) 그리고 animal 클래스를 상속받음.
 * 
 */

public class ClassA {			//부모 클래스
	int ab;
	String name;
	protected String title;			
	//protected 디폴트 접근 한정자이나 자식클래스만 예외로 허용 가능.
	
	
	void print() {
		System.out.println("ab = " + ab);
		System.out.println("name = " + name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		

}
