package koreait.day11;

public class AShapeTest {
// main 메소드는 클레스로 만들어진 애플리케이션 이다. 추상클래스로 완성된 애플리케이션에서 새로운 추상 메소드를 추가하면?
	// 
	public static void main(String[] args) {
		Triangle tri = new Triangle(100,84);
		tri.shapName = "직각 삼각형";
		System.out.println(tri);
		System.out.println("넓이 = " + tri.getArea());
		
		Circle cir = new Circle();
		cir.setRadius(89); 
		cir.shapName="원";
		System.out.println(cir);
		System.out.println("넓이 = " + cir.getArea());
	}
}	// AShapeTest
/*
 * 참고 : 메소드 재정의 할때 접근 한정자
 * 부모 public -> 자식 default : 오류
 * 부모 default -> 자식 public : 가능
 */

abstract class AShape{	// 도형
	protected String shapName;
	protected int width;
	protected int height;
	
	public AShape() {	// AShape() 객체는 직접 못 만들고 자식 객체 만들어 질때 실행
		System.out.println("AShpae 디폴 생성자 동작합니다.");
	}
	
	// 추상 클래스는 커스텀 생성자 만드나?
	public AShape (int width, int height) {
		System.out.println("AShape 생성자 동작합니다.");
		this.width=width;
		this.height=height;
	}
	
	
	public abstract double getArea();	// 도형의 넓이
	
	// 추상 클래스도 인스턴스 메소드 정의해서 자식 클래스가 재정의 할 수 있다.
	public Object explain() {		// 어플리캐이션 완료 후 추상메소드 추가 오류 발생하므로 인스턴스 메소드 추가
		return null;
	}

	@Override
	public String toString() {
		return "AShape [도형 종류=" + shapName + 
				", width=" + width + ", height=" + height + "]";
	}
	
}	// AShape

class Triangle extends AShape{		// 넓이 * 높이 /2
	
	public Triangle(int width, int height) {
		super(width,height);
//		this.width=width	;	
//		this.height=height	;	
	}
	
	@Override
	public double getArea() {
		return width*height/2;
	}
}

class Circle extends AShape{
	private int radius; // 반지름
						// 반지름 * 반지름 * 3.14
	@Override
	public double getArea() {
		return radius*radius*3.14;
	}

	@Override
	public String toString() {
		return "Circle [반지름=" + radius + ", 도형 종류=" + shapName + 
				", width=" + width + ", height=" + height + "]";
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}

class Rectangle extends AShape{

	private int radius;

	@Override
	public double getArea() {
		return width*height;
	}						// 넓이 * 높이
	
	
}
