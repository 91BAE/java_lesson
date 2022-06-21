package koreait.day17;

public class Score {
	private String name;
	private int korean;
	private int english;
	private int science;
	private String grade;	// getter setter 작성해보기
					// 값 예시 : A+, A, B+, B ...
	
	// 기본 생성자가 숨어있다. 어떤 코드일까? 접근 한정자는 public
	public Score() { 
	}
	
	public Score(String name, int english, int science, int korean) {
		this.name= name;
		this.korean= korean;
		this.english=english;
		this.science=science;
	}
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", korean=" + korean + ", english=" + english + ", science=" + science
				+ ", grade=" + getGrade() + "]";
	}
	
	// 인스턴스 메소드
	public int sum() {
		int result = this.korean+this.english+this.science;
		return result;
	}
	
	public double average() {
		return (double)sum()/3;
	}
	
	// setter 를 변경하기 : 실행내용 접근한정자	필요에 따라서는 접근 한정자를 private 로도 할 수 있다.
		private void setGrade() {
			if(average() >= 90) this.grade="A";
			else if(average() >= 80) this.grade="B";
			else if(average() >= 70) this.grade="C";
			else if(average() >= 60) this.grade="D";
			else this.grade="F";
		}
		
		String getGrade() {
			setGrade();
			return grade;
		}
		

	// getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void setScience(int science) {
		this.science = science;
	}
	
	int getScience() {
		return science;
	}
	
	void setkorean(int korean) {
		this.korean=korean;
		// 메소드 인자로 전달받은 값을 클래스 전역 변수 korean에 저장.(대입)
		// this 는 setkorean 을 실행시키는 객체
	}
	
	int getKorean() {
		return korean;
		
	}
	
	void setEnglish(int english) {
		this.english=english;
		
	}
	
	int getenglish() {
		return english;
	}	
	
}


