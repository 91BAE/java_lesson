package koreait.day06;

public class C32_ArrayManipulation {

	public static void main(String[] args) {
		// �迭����� ���԰� ����
		int [] test = {11,22,33,44,55,66,77};
		
		for (int i=0; i<test.length; i++)
			System.out.print(test[i] + "\t");
		System.out.println();
		
		// �ε��� k�� �����Ҷ� - ������ �ε����� �����ϴ� �������� �̵�
		int k = 2;
		for(int i=test.length-2; i>=2; i--) {
		//	for(int i=2; i<test.length-1; i++) {	// ���۵�
			test [i+1] = test[i];	//	���� test[6]= test[5]; , test[5] = test[4]; ....
		}
		test[k]=23;
		
		for (int i=0; i<test.length; i++)
			System.out.print(test[i] + "\t");
		
		//������ ����
		int []test2 = {11,22,33,44,55,66,77};
		System.out.println("\n----------------------------------");
		for (int i=0; i<test2.length; i++)
			System.out.print(test2[i] + "\t");
		
		// �������� 2�� �����Ҷ� - ���� �ε������ҹ������� �̵�
		for(int i=k+1; i<test2.length; i++)
			test2[i-1] = test2[i];
		
		System.out.println();
		for (int i=0; i<test2.length; i++)
			System.out.print(test2[i] + "\t");
		
	}

}