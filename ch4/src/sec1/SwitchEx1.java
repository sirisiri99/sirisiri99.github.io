package sec1;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		
		// switch ���� {
		//	case ����Ǽ� 1:
		//		���๮1;
		//		break;
		//		....
		//	case ����Ǽ� n:
		//		���๮n:
		//		break;
		//	default:
		//		���๮default;
		// }
		
		System.out.println("1.�Ա�, 2.���, 3.��ȸ, 0.����");
		System.out.println("�۾��� ��ȣ�� �Է� [0~3] : ");
		Scanner sc = new Scanner(System.in);
		int mode = sc.nextInt();
		
		switch(mode) {
			case 1 :
				System.out.println("�Ա��� �մϴ�.");
				break;
			case 2 :
				System.out.println("����� �մϴ�.");
				break;
			case 3 :
				System.out.println("�ܾ��� ��ȸ�մϴ�..");
				break;
			default :
				System.out.println("�۾��� �����մϴ�.");
				break;
		}

	}

}
