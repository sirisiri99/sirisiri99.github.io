package sec1;

public class Array3 {
	public static void main(String[] args) {
		String[] names = {"�̱���", "������", "���", "�޸�", "�Ͼ���"}; 
		//5���� 3���� ���� ���� jum[][] -> 2���� �迭 ��(��),��(ĭ)
		int[][] jum = {{80,70,50}, {100,100,100}, {90,80,70}, {80,70,60}, {50,40,30}};
		//��ü����(hap), ��ü���(py), ��������(tot), �������(avg)
		/*
		 ����		����		����		���� 
		 ---	---		---		---
		 ---	---		---		---
		 **************************
		 ����		XX		XX		XX
		 ��� 	XX.X	XX.X	XX.X
		 ��ü���� : XXX	��ü��� : XX.X
		 */
		System.out.println("****************************");
		System.out.println("����\t����\t����\t����");
		System.out.println("****************************");
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
			for(int j = 0; j < 3; j++) {
				System.out.print("\t" + jum[i][j]);
			}
			System.out.println();
			
		
		}
		int[] tot = new int[3];
		System.out.println("****************************");
		System.out.print("��������\t");
		for(int i = 0; i <= 4; i++) {
			for(int j = 0; j <= 4; j++) {
				System.out.println();
			}
		}
	}
}