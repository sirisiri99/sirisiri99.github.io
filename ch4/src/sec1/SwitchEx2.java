package sec1;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		
		// 본인의 월을 숫자 정수로 입력하면, 해당하는 월의 탄생석을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 월을 입력[1~12] : ");
		int num = sc.nextInt();
		switch(num) {
			case 1 :
				System.out.println("석류석");
				break;
			case 2 :
				System.out.println("자수정");
				break;
			case 3 :
				System.out.println("남옥");
				break;
			case 4 :
				System.out.println("다이아몬드");
				break;
			case 5 :
				System.out.println("에메랄드");
				break;
			case 6 :
				System.out.println("진주");
				break;
			case 7 :
				System.out.println("루비");
				break;
			case 8 :
				System.out.println("감람석");
				break;
			case 9 :
				System.out.println("사파이어");
				break;
			case 10 :
				System.out.println("오팔");
				break;
			case 11 :
				System.out.println("토파즈");
				break;
			default :
				System.out.println("터키석");
				break;
			}
		
	}

}
