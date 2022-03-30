package sec1;

import java.util.Scanner;

public class SwitchEx2_Review {

	public static void main(String[] args) {
		
		// 본인의 월을 숫자 정수로 입력하면, 해당하는 월의 탄생석을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 달을 입력[1 ~ 12] : ");
		int month = sc.nextInt();
		
		switch(month) {
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
				System.out.println("금강석");
				break;
			case 5 :
				System.out.println("취옥");
				break;
			case 6 :
				System.out.println("진주");
				break;
			case 7 :
				System.out.println("홍옥");
				break;
			case 8 :
				System.out.println("감람석");
				break;
			case 9 :
				System.out.println("청옥");
				break;
			case 10 :
				System.out.println("단백석");
				break;
			case 11 :
				System.out.println("황옥");
				break;
			default :
				System.out.println("터키석");
				break;
				
		}

	}

}
