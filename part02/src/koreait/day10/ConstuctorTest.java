package koreait.day10;

public class ConstuctorTest {

	public static void main(String[] args) {

	}

}

class Product {
	int price;
	
	// 디폴트 생성자는 동작을 안한다.
	
	public Product(int price) {
		this.price=price;
	}
}

class Food extends Product {			
	//product() 디폴트 생성자 실행하므로 없으면 오류 
	// -> 자식 클래스도 커스텀 생성자를 정의해서 부모클래스
	// 커스텀 생성자를 호출
	
	public Food(int Price) {
		super(Price);
	}
}

class Electronics extends Product{		
	//Product() 디폴트 생성자 실행하면 오류
	
	public Electronics(int Price) {			
		super(Price);				
		// super() 디폴트 생성자 대신에 커스텀 생성자 호출
	}
	
}
