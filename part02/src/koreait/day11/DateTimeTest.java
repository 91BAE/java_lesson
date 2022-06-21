package koreait.day11;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {

	public static void main(String[] args) {
		// ���� �ð� : ms, ns (1970�� 1�� 1�� ������ �������� �������� ī��Ʈ�� ��.)
		
		
		// 1��, 1���� ���� �� ms �ΰ�. 1�ʴ� = 1000ms(1ms= 0.001��)
		// 1�� = 24�ð� * 60�� * 60�� * 1000		= result ������ ������ ����.
		// 1�� = 365�� * 24�ð� * 60�� * 60�� * 1000
		
		int result = 24*60*60*1000;
		System.out.println("1���� " + result + "ms �Դϴ�.");
		// int ���� ����� overflow �ȴ�. long���� ��ȯ ������� ��.
		System.out.println("1���� " + result*365L + "ms �Դϴ�.");
		
		DecimalFormat df = new DecimalFormat("###,###,###,###");
		System.out.println("1���� " + df.format(result) + "ms �Դϴ�.");
		System.out.println("1���� " + df.format(result*365L) + "ms �Դϴ�.");
		// String.format("%15s" , ~) ���� �ϸ� �ڸ� ���� ��ġ ���� �� �ִ�.
		
		
		/*��¥�� �ð������� �ٷ�� �ڹ�Ŭ������ �����մϴ�.
			1) java.util.Date Ŭ����  2)java.util.Calendar Ŭ���� -> �� 2�� Ŭ������ �� (old) ���� Ŭ����
			3) java 8 ����  java.time.LocalDate(��¥) , LocalTime(�ð�) , LocalDateTime(��¥�� �ð�) Ŭ����
			4) java.sql.Date Ŭ���� - �����ͺ��̽� �ٷ궧 ���
		*/
		
		// now() �޼ҵ�� ���� �ð� ��¥ Ȯ�� ��ü ����
		LocalDate currenDate = LocalDate.now();			//static �޼ҵ�� ��ü�� ����
		System.out.println("��¥ Ȯ�� : " + currenDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("�ð� Ȯ�� : " + currentTime);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("��¥�� �ð� Ȯ�� : " + current);
		
		// of() �޼ҵ�� Ư�� �ð� �� ��¥ ��ü ����
		LocalDate mybirth = LocalDate.of(1991, 10, 29);
		System.out.println("�� ���� Ȯ�� : " + mybirth);
		
		LocalTime mybirth_time = LocalTime.of(6, 30);
		System.out.println("�� ź�� �ð� : " + mybirth_time);
		
		// �� ���� Ŭ������ ��¥ ������ ���� ��� Ŭ������ �ִ�. (���� �¾�� ����? ���? ���?)
		Period between = Period.between(mybirth, currenDate);
		System.out.println("���� ���� ��ӿ��� ������" + between.getYears() + " ��(year)");
		System.out.println("" + between.getMonths() + " ����(months)");
		System.out.println("" + between.getDays() + " ��(day)");
		
		System.out.println("���� �¾�� : " + ChronoUnit.DAYS.between(mybirth, currenDate) + "��");
		
		
		//Duration Ŭ����
		//ChronoUnit Ŭ����
		
	}

}
