package sec1;

import java.util.Scanner;

public class SwitchEx2_Review {

	public static void main(String[] args) {
		
		// ������ ���� ���� ������ �Է��ϸ�, �ش��ϴ� ���� ź������ ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�¾ ���� �Է�[1 ~ 12] : ");
		int month = sc.nextInt();
		
		switch(month) {
			case 1 :
				System.out.println("������");
				break;
			case 2 :
				System.out.println("�ڼ���");
				break;
			case 3 :
				System.out.println("����");
				break;
			case 4 :
				System.out.println("�ݰ���");
				break;
			case 5 :
				System.out.println("���");
				break;
			case 6 :
				System.out.println("����");
				break;
			case 7 :
				System.out.println("ȫ��");
				break;
			case 8 :
				System.out.println("������");
				break;
			case 9 :
				System.out.println("û��");
				break;
			case 10 :
				System.out.println("�ܹ鼮");
				break;
			case 11 :
				System.out.println("Ȳ��");
				break;
			default :
				System.out.println("��Ű��");
				break;
				
		}

	}

}
