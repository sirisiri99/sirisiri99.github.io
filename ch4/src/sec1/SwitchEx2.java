package sec1;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		
		// ������ ���� ���� ������ �Է��ϸ�, �ش��ϴ� ���� ź������ ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�¾ ���� �Է�[1~12] : ");
		int num = sc.nextInt();
		switch(num) {
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
				System.out.println("���̾Ƹ��");
				break;
			case 5 :
				System.out.println("���޶���");
				break;
			case 6 :
				System.out.println("����");
				break;
			case 7 :
				System.out.println("���");
				break;
			case 8 :
				System.out.println("������");
				break;
			case 9 :
				System.out.println("�����̾�");
				break;
			case 10 :
				System.out.println("����");
				break;
			case 11 :
				System.out.println("������");
				break;
			default :
				System.out.println("��Ű��");
				break;
			}
		
	}

}
