package sec2;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		//for�� ���ѷ��� : �׻� ������ �����Ǿ� ��� �ݺ������ϰԵ�
		int i = 0;
		int sum = 0;
		for(;;) {
			i++;	// ī��Ʈ ����
			if(i >= 10) {
				break;
			}
			sum+=i;
		}
		
		sum = 0;
		for(int a = 1;;) {
			if(a >= 10) {
				break;
			}
			sum += a;
		}
		
		sum = 0;
		for(int b = 1; b > 0; b++) {
			if(b >= 10) {
				break;
			}
			sum += b;
		}
		
		Scanner sc = new Scanner(System.in);
		
		int c;
		sum = 0;
		for(;;) {
			System.out.println("���� �Է� : ");
			c = sc.nextInt();
			if(c == 0) {
				break;
			}
			sum += c;
		}
		System.out.println("�ѱݾ� : " + sum);
	}

}
