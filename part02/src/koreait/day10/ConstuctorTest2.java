package koreait.day10;

public class ConstuctorTest2 {

	public static void main(String[] args) {

	}

}

class Product2 {
	int price;
	
	// 부모 클래스 디폴트 생성자 정의해서 자식 클래스가
	// 사용 할 수 있도록 한다.
	public Product2() {	
	}
	
	public Product2(int price) {
		this.price=price;
	}
	
}

class Food2 extends Product2 {			
	// food2 디폴트 생성자는 	자동으로 동작됩니다.
	// 그 안에서 부모 클래스 product2 디폴트 생성자 super()가 호출.

	
}

class Electronics2 extends Product2{	
	
	public Electronics2(int Price) {
		super(Price); // 부모 클래스 커스텀 생성자 실행
	}
}
