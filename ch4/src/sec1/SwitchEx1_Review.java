package sec1;

import java.util.Scanner;

public class SwitchEx1_Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.입금\t2.출금\t3.조회\4.종료");
		System.out.println("작업할 번호를 입력 [0~3]");
		int num = sc.nextInt();
		
		switch(num) {
			case 1 : 
				System.out.println("입금을 합니다.");
				break;
			case 2 :
				System.out.println("출금을 합니다.");
				break;
			case 3 :
				System.out.println("조회를 합니다.");
				break;
			case 4 :
				System.out.println("종료 합니다.");
		}
	}

}
