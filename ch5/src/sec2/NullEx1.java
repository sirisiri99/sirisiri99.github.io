package sec2;

public class NullEx1 {

	public static void main(String[] args) {
		
		// int a = null; - �⺻���� null���� ���� �� ����.
		String b = null;
		int c = 20;	// �⺻���� ==�� != ���� �� �ִ�.
		int d = 20;	// �⺻���� �ּҷκ�x ���� ��o
		System.out.println("c == d : " + (c == d));
		System.out.println("c != d : " + (c != d));
		
		System.out.println("***************************");
		int[] e = {10, 20, 30};	// �������� ==�� != ���� �� ����
		int[] f = {10, 20, 30};	// �������� �ּҿ� �ּҸ� ���ϰ� �ǹǷ� ���� ��������.
		System.out.println("e == f : " + (e == f));
		System.out.println("e != f : " + (e != f));
		
		System.out.println("e == f : " + e.equals(f));
		// �� �������� �� �� �� �Ϸ��� equals�� �ؾ��Ѵ�.
		
		String g = "�̱���"; // �������� ������ ��� ������ ������ ����
		String h = "�̱���"; 
		System.out.println("g == h : " + (g == h));
		System.out.println("g != h : " + (g != h));
		
		String i = new String("�̱���"); // new�� Ȱ���� ��� �������� ��
		String j = new String("�̱���"); // �̋��� �ּҸ� ���ϰ� ��
		System.out.println("i == j : " + (i == j));
		System.out.println("i != j : " + (i != j));
		
		System.out.println("i == j : " + i.equals(j));
		// �������� �� ���Ϸ��� equals�� ���
	}

}