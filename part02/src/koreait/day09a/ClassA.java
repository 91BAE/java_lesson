package koreait.day09a;

/*
 * Ŭ������ ���
 * -> Ŭ���� ���� �θ�(����, super) �ڽ�(����Ŭ����)���谡 �������
 * -> �θ��� Ŭ���� ������Ҹ� �ڽ��� ����� �� ����. ��ӵǴ� ��Ҵ� �ʵ�, �޼ҵ�
 * -> extends ��� Ű���带 ����ؼ� �θ� Ŭ������ ������. ����Ŭ������ ���� 1��.
 * -> private ���� �����ڴ� ����� �ȵȴ�.
 * -> protected �� �ٸ� ��Ű���� �ڽ� Ŭ������ ��ӹ��� �� �ֵ��� �Ѵ�.
 * -> ���Ǽ��迡�� �ݷ������� �. �����ͷ� �����ϱ� ���� Ŭ������ ���ؾ� ��. ���� ������ ��, �����, �ܽ���, ������, �䳢, �����...
 * -> �ϳ��� �׷����� animal Ŭ���� �����ϰ� ������ ��Ҹ� ����
 * -> �������� ��Ұ� �ƴϸ� ��ü���� Ŭ������ ���� (ex , cat,dog,rabbit, ...) �׸��� animal Ŭ������ ��ӹ���.
 * 
 */

public class ClassA {			//�θ� Ŭ����
	int ab;
	String name;
	protected String title;			
	//protected ����Ʈ ���� �������̳� �ڽ�Ŭ������ ���ܷ� ��� ����.
	
	
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
