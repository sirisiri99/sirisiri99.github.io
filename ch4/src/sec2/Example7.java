package sec2;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;	// 잔고
		Scanner sc = new Scanner(System.in);
		int code;
		int money;
		while(run) {
		System.out.println("--------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("--------------------------");
		System.out.println("선택> ");
		code = sc.nextInt();
		
		switch(code) {
			case 1 :  
				System.out.println("예금액>");
				money = sc.nextInt();
				if(money)
				break;
			case 2 :
				System.out.println("출금액>");
				break;
			case 3 :
				System.out.println("잔고>");
				break;
			case 4 :
				System.out.println("종료");
		}
		System.out.println("프로그램 종료");
		
		}
		
	}

}
