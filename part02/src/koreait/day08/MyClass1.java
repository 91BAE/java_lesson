package koreait.day08;

public class MyClass1 {
	
	private int age;	// �ڹ��� Ư�� : ���м�
	String name;
	public double point;
	
	// private �ʵ�� setter, getter �� �־�� �ٸ� Ŭ�������� �� ����/ �б� �� �� ����
	void setAge(int age) {	
		if (age>1 && age <=150)	// age �ʵ尪�� �˻�
		this.age=age;		//age Ŭ������ ���� Ŭ���������� ���� ����.
		else
			System.out.println("�߸��� �� �Դϴ�.");
	}

	int getAge() {	//getAge�� ��Ű�� ������
		return age;
	}
}

/*
 * private int age; // private : �ٸ� Ŭ�������� ��� ���մϴ�. ��(���� Ŭ����)������ ����Ѵ�.
 * String name; 	// default(package) : �ٸ� ��Ű������ ��� ���մϴ�. �̿��̸� ���̾���.
 * public double point // public: ��𼭳� ����մϴ�. ������ , ������ ... �ٰ��� ����.
 * 
 * 
 * private, default, protected(���), public��
 * ���� (�ʵ�), �޼ҵ�, ������, Ŭ���� � ���Ǵ� ���� ������ �Դϴ�. (Ŭ������ ���� ������ ����Ʈ, �ۺ� �� ����Ѵ�.)
 * 
 */
