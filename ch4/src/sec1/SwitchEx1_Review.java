package sec1;

import java.util.Scanner;

public class SwitchEx1_Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.�Ա�\t2.���\t3.��ȸ\4.����");
		System.out.println("�۾��� ��ȣ�� �Է� [0~3]");
		int num = sc.nextInt();
		
		switch(num) {
			case 1 : 
				System.out.println("�Ա��� �մϴ�.");
				break;
			case 2 :
				System.out.println("����� �մϴ�.");
				break;
			case 3 :
				System.out.println("��ȸ�� �մϴ�.");
				break;
			case 4 :
				System.out.println("���� �մϴ�.");
		}
	}

}