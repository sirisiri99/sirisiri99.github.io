package sec1;

import java.util.Scanner;

//Ű����� �� ���� edps(����), pl(���α׷���), db(�����ͺ��̽�) �� Ű����� �Է¹޾�
//����(tot), ���(avg), �հݿ���(pan), ����(hak), ���л� ����(dv)�� ����ϴ� ���α׷����� �ϼ��Ͻÿ�.
//
//�հݿ��� : ��հ� �� ������ ������ ��� 70�� �̻��̸�, "�հ�", �ƴϸ� "���հ�" (if~else ���)
//����(��ձ��Ͽ� ��øif Ȱ��)
//�����
//A+ : 98~100
//A0 : 94~97
//A- : 90~93
//B+ : 88~89
//B0 : 84~87
//B- : 80~83
//C+ : 78~79
//C0 : 74~77
//C- : 70~73
//D+ : 68~69
//D0 : 64~67
//D- :  60~63
//F : 60 �̸�
//
//���л� ����(if~elseif~else Ȱ��)
//��� ������ 95�� �̻��̸� "Ư���л�"
//�� �����̶� 95�� �̻��̸� "�������л�"
//�ƴϸ� "�Ϲ��л�"
public class IfEx2 {
	public static void main(String[] args) {
		int edps, pl, db;
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է� : ");
		edps = sc.nextInt();
		System.out.println("���α׷������� �Է� : ");
		pl = sc.nextInt();
		System.out.println("�����ͺ��̽����� �Է� : ");
		db = sc.nextInt();
		int tot = edps + pl + db;	//����
		float avg = tot / 3.0f;		//���
		
		String pan = "";		//�հݿ��� 
		if(edps>=70 && pl>=70 && db>=70 && avg>=70) pan = "�հ�";
		else pan = "���հ�";
		
		String hak = "";
		if(avg>=90) {
			hak = "A";
			if(avg>=98) {
				hak = hak + "+";
			} else if(avg>=94) {
				hak = hak + "0";
			} else {
				hak = hak + "-";
			}
		} else if(avg>=80) {
			hak = "B";
			if(avg>=88) {
				hak = hak + "+";
			} else if(avg>=84) {
				hak = hak + "0";
			} else {
				hak = hak + "-";
			}
		} else if(avg>=70) {
			hak = "C";
			if(avg>=78) {
				hak = hak + "+";
			} else if(avg>=74) {
				hak = hak + "0";
			} else {
				hak = hak + "-";
			}
		} else if(avg>=60) {
			hak = "D";
			if(avg>=68) {
				hak = hak + "+";
			} else if(avg>=64) {
				hak = hak + "0";
			} else {
				hak = hak + "-";
			}
		} else {
			hak = "F";
		}
		
		String dv = "";
		if(edps>=95 && pl>=95 && db>=95) {
			dv = "Ư���л�";
		} else if(edps>=95 || pl>=95 || db>=95) {
			dv = "�������л�";
		} else {
			dv = "�Ϲ��л�";
		}
		System.out.println("����\t���\t�հݿ���\t����\t���л�����");
		System.out.println(tot+"\t"+avg+"\t"+pan+"\t"+hak+"\t"+dv);
	}
}
