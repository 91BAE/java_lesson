package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("----------------------------");
		
		Dog dog = new Dog();
		dog.run();
		dog.print();	// 상속메소드
		System.out.println("----------------------------");
		Crow crow = new Crow();
		crow.fly();
		crow.print();
		
		System.out.println(":::::::::::::::::::::::::::::");
		Animal temp = dog;				// 자식 객체는 부모 클래스 타입으로 참조 할 수 있다. (자식 클래스는 부모 클래스 타입으로 자동캐스팅)
		temp.print();
		//temp.run();						// 오류 : 부모 타입일때는 자식 메소드를 실행할 수 없다.
		temp = crow;						// 자식 객체는 부모클래스 타입으로 참조 할 수 있다.
		temp.print();
		//temp.fly();						// 오류 : 부모 타입일때는 자식 메소드를 실행할 수 없다.
		System.out.println("------------------------------");
		Animal puppy = new Dog();		// 자식 객체는 부모 클래스 타입으로 참조 할 수 있다.
		puppy.print();
		//puppy.run();					// 오류 : 부모 타입일때는 자식 메소드를 실행할 수 없다.
		
		Dog puddle = (Dog)puppy; 		// Animal 타입을 Dog 타입으로 casting(자식클래스 Dog 객체이므로 가능)
		puddle.run();					//		puppy 변수가 참조하는 객체가 Dog 타입일때만 가능.
		puddle.print();
	}

}
