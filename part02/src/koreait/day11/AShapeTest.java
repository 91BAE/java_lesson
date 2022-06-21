package koreait.day11;

public class AShapeTest {
// main �޼ҵ�� Ŭ������ ������� ���ø����̼� �̴�. �߻�Ŭ������ �ϼ��� ���ø����̼ǿ��� ���ο� �߻� �޼ҵ带 �߰��ϸ�?
	// 
	public static void main(String[] args) {
		Triangle tri = new Triangle(100,84);
		tri.shapName = "���� �ﰢ��";
		System.out.println(tri);
		System.out.println("���� = " + tri.getArea());
		
		Circle cir = new Circle();
		cir.setRadius(89); 
		cir.shapName="��";
		System.out.println(cir);
		System.out.println("���� = " + cir.getArea());
	}
}	// AShapeTest
/*
 * ���� : �޼ҵ� ������ �Ҷ� ���� ������
 * �θ� public -> �ڽ� default : ����
 * �θ� default -> �ڽ� public : ����
 */

abstract class AShape{	// ����
	protected String shapName;
	protected int width;
	protected int height;
	
	public AShape() {	// AShape() ��ü�� ���� �� ����� �ڽ� ��ü ����� ���� ����
		System.out.println("AShpae ���� ������ �����մϴ�.");
	}
	
	// �߻� Ŭ������ Ŀ���� ������ ���峪?
	public AShape (int width, int height) {
		System.out.println("AShape ������ �����մϴ�.");
		this.width=width;
		this.height=height;
	}
	
	
	public abstract double getArea();	// ������ ����
	
	// �߻� Ŭ������ �ν��Ͻ� �޼ҵ� �����ؼ� �ڽ� Ŭ������ ������ �� �� �ִ�.
	public Object explain() {		// ���ø�ĳ�̼� �Ϸ� �� �߻�޼ҵ� �߰� ���� �߻��ϹǷ� �ν��Ͻ� �޼ҵ� �߰�
		return null;
	}

	@Override
	public String toString() {
		return "AShape [���� ����=" + shapName + 
				", width=" + width + ", height=" + height + "]";
	}
	
}	// AShape

class Triangle extends AShape{		// ���� * ���� /2
	
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
	private int radius; // ������
						// ������ * ������ * 3.14
	@Override
	public double getArea() {
		return radius*radius*3.14;
	}

	@Override
	public String toString() {
		return "Circle [������=" + radius + ", ���� ����=" + shapName + 
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
	}						// ���� * ����
	
	
}
