package koreait.day10;

public class ConstuctorTest {

	public static void main(String[] args) {

	}

}

class Product {
	int price;
	
	// ����Ʈ �����ڴ� ������ ���Ѵ�.
	
	public Product(int price) {
		this.price=price;
	}
}

class Food extends Product {			
	//product() ����Ʈ ������ �����ϹǷ� ������ ���� 
	// -> �ڽ� Ŭ������ Ŀ���� �����ڸ� �����ؼ� �θ�Ŭ����
	// Ŀ���� �����ڸ� ȣ��
	
	public Food(int Price) {
		super(Price);
	}
}

class Electronics extends Product{		
	//Product() ����Ʈ ������ �����ϸ� ����
	
	public Electronics(int Price) {			
		super(Price);				
		// super() ����Ʈ ������ ��ſ� Ŀ���� ������ ȣ��
	}
	
}
