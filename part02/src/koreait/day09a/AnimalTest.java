package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("----------------------------");
		
		Dog dog = new Dog();
		dog.run();
		dog.print();	// ��Ӹ޼ҵ�
		System.out.println("----------------------------");
		Crow crow = new Crow();
		crow.fly();
		crow.print();
		
		System.out.println(":::::::::::::::::::::::::::::");
		Animal temp = dog;				// �ڽ� ��ü�� �θ� Ŭ���� Ÿ������ ���� �� �� �ִ�. (�ڽ� Ŭ������ �θ� Ŭ���� Ÿ������ �ڵ�ĳ����)
		temp.print();
		//temp.run();						// ���� : �θ� Ÿ���϶��� �ڽ� �޼ҵ带 ������ �� ����.
		temp = crow;						// �ڽ� ��ü�� �θ�Ŭ���� Ÿ������ ���� �� �� �ִ�.
		temp.print();
		//temp.fly();						// ���� : �θ� Ÿ���϶��� �ڽ� �޼ҵ带 ������ �� ����.
		System.out.println("------------------------------");
		Animal puppy = new Dog();		// �ڽ� ��ü�� �θ� Ŭ���� Ÿ������ ���� �� �� �ִ�.
		puppy.print();
		//puppy.run();					// ���� : �θ� Ÿ���϶��� �ڽ� �޼ҵ带 ������ �� ����.
		
		Dog puddle = (Dog)puppy; 		// Animal Ÿ���� Dog Ÿ������ casting(�ڽ�Ŭ���� Dog ��ü�̹Ƿ� ����)
		puddle.run();					//		puppy ������ �����ϴ� ��ü�� Dog Ÿ���϶��� ����.
		puddle.print();
	}

}
