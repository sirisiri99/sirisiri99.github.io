package sec1;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int english;
		int math;
		int korean;
		
		System.out.println("���� ���� �Է� : ");
		korean = sc.nextInt();
		System.out.println("���� ���� �Է� : ");
		english = sc.nextInt();
		System.out.println("���� ���� �Է� : ");
		math = sc.nextInt();
		
		System.out.println("���� ���� : " + korean + "\n" + "���� ���� : " + english + "\n" + "���� ���� : " + math);
		System.out.println("����� ������ " + (korean + math + english) + "�� �̸�, " + "����� " + (korean + math + english) /3 + "�� �Դϴ�.");
		

	}

}