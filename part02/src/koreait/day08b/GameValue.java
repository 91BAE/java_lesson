package koreait.day08b;

import java.util.Random;

public class GameValue {
		
		private String player;		//���������� �̸�	�⺻ �ʱⰪ null
		private int count; 			//���̸� �õ�Ƚ��, �ʱⰪ 0
		private boolean Success;	//���߱� �������� , �⺻ �ʱⰪ false
		
		
		//Ŀ���� ������ : player �ʱⰪ ���� -> �⺻ �����ڴ� ��� ����.
		public GameValue(String player) {
				this.player=player;
		}
		
		//��ü�� ����ϴ� �ν��Ͻ� �޼ҵ� 
		public void print() {
			System.out.println("player : " + player + ", �õ�Ƚ�� : " + count + ",���� : " + Success);
		}
		
		//static - ��ü�� �ν��Ͻ� �ʵ尪�� ������� �ʴ� ���. ��, ��ü�� ������� �޼ҵ� ����.
		public static int makeNumber(int min, int max) {	//min101, max299 : ������ �ּҰ�,�ִ밪 ���ڷ� �ް� ���� ��ȯ
			Random r = new Random();
			return r.nextInt(max-min+1)+min;    //r.nextInt(199)+101;  -> 0~198 + 101
		}// ���� : r.nextInt(100) ��  0~99 ������ ����

		
		
		// getter �� setter : boolean Ÿ���� getter �޼ҵ� �̸��� isxxx() �̴�.
		public String getGamer() {
			return player;
		}

		public void setGamer(String player) {
			this.player = player;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public boolean isSuccess() {
			return Success;
		}

		public void setSuccess(boolean isSuccess) {
			this.Success = isSuccess;
		}


		//getter �� setter : boolean Ÿ���� �޼ҵ� �̸��� �޶�����.
		
		
	
		
		
}