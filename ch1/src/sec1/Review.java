package sec1;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int english;
		int math;
		int korean;
		
		System.out.println("국어 점수 입력 : ");
		korean = sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		english = sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		math = sc.nextInt();
		
		System.out.println("국어 점수 : " + korean + "\n" + "영어 점수 : " + english + "\n" + "수학 점수 : " + math);
		System.out.println("당신의 총점은 " + (korean + math + english) + "점 이며, " + "평균은 " + (korean + math + english) /3 + "점 입니다.");
		

	}

}
