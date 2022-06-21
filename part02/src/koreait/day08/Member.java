package koreait.day08;


// 배명환
public class Member {
	private String name;
	private String email;
	private int age;
	private int level;
	
	// 커스텀 생성자 : 
	public Member(String name, String email){ // ()안에는 실행할때 전달받을 인자
		this.name=name;
		this.email=email;
	}
	
	// 기본생성자 : 출력문 추가
	public Member(){
		System.out.println("name, email, age, level 필드는 기본값입니다.");
		System.out.println("name = " + this.name);
		System.out.println("age = " + this.age);
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	


}
