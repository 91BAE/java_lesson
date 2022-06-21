package koreait.day11;

public class ClassX extends ClassAbs{
	private int num;
	
	// 추상 클래스 상속받은 자식(하위) 클래스는 반드시 추상메소드 재정의 해야 한다.
	@Override
	public void test() {
		System.out.println("ClassX 의 test()");
		System.out.println("num =" + num);
	}
	
	public void setNum(int num) {
		this.num = num;
	}

}
