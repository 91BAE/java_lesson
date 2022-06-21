package koreait.day11;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {

	public static void main(String[] args) {
		// 현재 시간 : ms, ns (1970년 1월 1일 자정을 기준으로 단위마다 카운트한 값.)
		
		
		// 1일, 1년은 각각 몇 ms 인가. 1초는 = 1000ms(1ms= 0.001초)
		// 1일 = 24시간 * 60분 * 60초 * 1000		= result 변수에 저장해 보기.
		// 1년 = 365일 * 24시간 * 60분 * 60초 * 1000
		
		int result = 24*60*60*1000;
		System.out.println("1일은 " + result + "ms 입니다.");
		// int 범위 벗어나면 overflow 된다. long으로 변환 시켜줘야 함.
		System.out.println("1년은 " + result*365L + "ms 입니다.");
		
		DecimalFormat df = new DecimalFormat("###,###,###,###");
		System.out.println("1일은 " + df.format(result) + "ms 입니다.");
		System.out.println("1년은 " + df.format(result*365L) + "ms 입니다.");
		// String.format("%15s" , ~) 으로 하면 자리 정렬 위치 맞출 수 있다.
		
		
		/*날짜와 시간형식을 다루는 자바클래스를 연습합니다.
			1) java.util.Date 클래스  2)java.util.Calendar 클래스 -> 이 2개 클래스는 구 (old) 버전 클래스
			3) java 8 버전  java.time.LocalDate(날짜) , LocalTime(시간) , LocalDateTime(날짜와 시간) 클래스
			4) java.sql.Date 클래스 - 데이터베이스 다룰때 사용
		*/
		
		// now() 메소드로 현재 시간 날짜 확인 객체 생성
		LocalDate currenDate = LocalDate.now();			//static 메소드로 객체를 생성
		System.out.println("날짜 확인 : " + currenDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("시간 확인 : " + currentTime);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("날짜와 시간 확인 : " + current);
		
		// of() 메소드로 특정 시간 및 날짜 객체 생성
		LocalDate mybirth = LocalDate.of(1991, 10, 29);
		System.out.println("내 생일 확인 : " + mybirth);
		
		LocalTime mybirth_time = LocalTime.of(6, 30);
		System.out.println("내 탄생 시간 : " + mybirth_time);
		
		// 새 버전 클레스는 날짜 사이의 간격 계산 클레스가 있다. (내가 태어난지 몇일? 몇달? 몇년?)
		Period between = Period.between(mybirth, currenDate);
		System.out.println("내가 엄마 뱃속에서 나온지" + between.getYears() + " 년(year)");
		System.out.println("" + between.getMonths() + " 개월(months)");
		System.out.println("" + between.getDays() + " 일(day)");
		
		System.out.println("내가 태어난지 : " + ChronoUnit.DAYS.between(mybirth, currenDate) + "일");
		
		
		//Duration 클래스
		//ChronoUnit 클래스
		
	}

}
