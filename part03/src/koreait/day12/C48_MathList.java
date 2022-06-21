package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//C43번 예제 리스트로 변경하기 // 작성자 : 배명환
public class C48_MathList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size=5;		// 문제 갯수
		ArrayList<MathProblem> problems = new ArrayList<>();
		int ans; int cnt=0;
		
		System.out.println("----------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("----------------------------");
		System.out.println("시작한다.");
		for(int i=0; i<size; i++){
			MathProblem temp = new MathProblem('+');
			temp.makeProb();
			System.out.println("문제" + (i+1) + ". " + temp.problem() + "답 입력 ->");
			ans = sc.nextInt();
			
			if (ans==temp.showAnswer()) {
				cnt++; temp.setCorrect(true);
			}
			// problems[i]= temp; 		//?????			// 비열 인덱스 i 에 temp 객체 참조값을 저장해라
			problems.add(i,temp);
		}
		System.out.println("----------------------------------------------------");
		System.out.println("채점한다. 맞은 갯수" + cnt + " (" + (cnt*100/size) + "점)");
		System.out.println("::::::틀린정답 보기::::::");
		
		for(int i = 0; i<problems.size();i++)
			if(!problems.get(i).isCorrect())
				System.out.println("문제 " + (i+1) + ". " + problems.get(i).problem() +
						problems.get(i).showAnswer());
		//????
		//for(int i = 0; i<problems.lenth; i++)
		//	if(!problems[i].isCorrect())	// problems[i].isCorrect이 거짓이면 !연산으로 참으로 바뀐다
		//	system.out.println("문제 + " (i+1) + " . "
		//						+ problems[i].problem() + problems[i].showAnswer());
	}

}		// 리스트의 메소드 1) add  2) get   3) remove  4) size
