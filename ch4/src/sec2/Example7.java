package sec2;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;	// �ܰ�
		Scanner sc = new Scanner(System.in);
		int code;
		int money;
		while(run) {
		System.out.println("--------------------------");
		System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
		System.out.println("--------------------------");
		System.out.println("����> ");
		code = sc.nextInt();
		
		switch(code) {
			case 1 :  
				System.out.println("���ݾ�>");
				money = sc.nextInt();
				if(money)
				break;
			case 2 :
				System.out.println("��ݾ�>");
				break;
			case 3 :
				System.out.println("�ܰ�>");
				break;
			case 4 :
				System.out.println("����");
		}
		System.out.println("���α׷� ����");
		
		}
		
	}

}