package koreait.day10;

public class ConstuctorTest2 {

	public static void main(String[] args) {

	}

}

class Product2 {
	int price;
	
	// �θ� Ŭ���� ����Ʈ ������ �����ؼ� �ڽ� Ŭ������
	// ��� �� �� �ֵ��� �Ѵ�.
	public Product2() {	
	}
	
	public Product2(int price) {
		this.price=price;
	}
	
}

class Food2 extends Product2 {			
	// food2 ����Ʈ �����ڴ� 	�ڵ����� ���۵˴ϴ�.
	// �� �ȿ��� �θ� Ŭ���� product2 ����Ʈ ������ super()�� ȣ��.

	
}

class Electronics2 extends Product2{	
	
	public Electronics2(int Price) {
		super(Price); // �θ� Ŭ���� Ŀ���� ������ ����
	}
}
