package sec1;

public class Crease1 {

	public static void main(String[] args) {
		//���� ����(����/���� ���� ����)
		int a = 5;
		int b = 5;
		//a+=1 => a=a+1 => ++a, a++
		System.out.println("(��������) ++a : "+(++a));	// 6
		System.out.println("(��������) b++ : "+(b++));	// 5
		System.out.println("a = "+a);	// 6
		System.out.println("b = "+b);	// 6
		System.out.println("(��������) --b : "+(--b));	// 5
		System.out.println("(��������) a-- : "+(a--));	// 6
		System.out.println("a = "+a);	// 5
		System.out.println("b = "+b);	// 5
	}
}