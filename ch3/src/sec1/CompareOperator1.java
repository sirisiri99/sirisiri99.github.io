package sec1;

public class CompareOperator1 {
	public static void main(String[] args) {
		//�񱳿����� Ȱ��
		int a=30;
		int b=20;
		String name="�����";
		System.out.println("a>b -> "+(a>b));	// t
		System.out.println("a>=40 -> "+(a>=40));	// f
		System.out.println("a<b -> "+(a<b));	// f
		System.out.println("a<=40 -> "+(a<=40));	// t 
		System.out.println("a==b -> "+(a==b));	// f
		System.out.println("b!=30 -> "+(b!=30));	// t
		System.out.println("name==\"������\" -> "+(name=="������"));	// f
	}
}