package koreait.day08;

public class Score {
	private int korean;
	private int english;
	private int science;
	private String grade;	// getter setter �ۼ��غ���
					// �� ���� : A+, A, B+, B ...
	
	// �⺻ �����ڰ� �����ִ�. � �ڵ��ϱ�? ���� �����ڴ� public
	public Score() { 
	}
	
	
	
	
	void setScience(int science) {
		this.science = science;
	}
	
	int getScience() {
		return science;
	}
	
	
	void setkorean(int korean) {
		this.korean=korean;
		// �޼ҵ� ���ڷ� ���޹��� ���� Ŭ���� ���� ���� korean�� ����.(����)
		// this �� setkorean �� �����Ű�� ��ü
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
	
	void setGrade(String grade) {
		this.grade=grade;
		
	}
	
	String getGrade() {
		return grade;
	}
	
}


