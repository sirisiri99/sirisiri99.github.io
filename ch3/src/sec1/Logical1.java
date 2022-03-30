package sec1;

public class Logical1 {
	public static void main(String[] args) {
		//&&, ||, !, &, |, ^
		//32	16	8	4	2	1
		//a		1	1	1	1	0
		//b		1	0	1	0	0
		//		-31 -30 -29	-28 ~ -1
		//		30	29	28	~	 0
		//NOT(Complement)	30 -> -31
		//XOR	0	1	0	1	0 => 10	
		//OR	1	1	1	1	0 => 30
		//AND	1	0	1	0	0 => 20
		int a = 30;	//11110
		int b = 20;	//10100
		int c = 10;	
		
		System.out.println("a�� b�� AND ���� : "+(a & b));
		System.out.println("a�� b�� OR ���� : "+(a | b));
		System.out.println("a�� b�� XOR ���� : "+(a ^ b));
		System.out.println("~a -> a�� ���� : "+(~a));
		
		boolean d = true;
		boolean e = true;
		boolean f = false;
		//&&(AND)������ �Է°��� ��� ���� ���� ����� ��
		//�Է�1		�Է�2	���
		//true		true	true
		//true		false	false
		//false		true	false
		//false		false	false
		System.out.println("&& => AND������ ���1 : "+(d && e));	// t
		System.out.println("&& => AND������ ���2 : "+(d && f));	// f
		System.out.println("&& => AND������ ���3 : "+(f && d));	// f 
		System.out.println("&& => AND������ ���4 : "+(f && f));	// f
		//||(OR)���� : ��� �ϳ��� �Է��� ���� ������, ��(true)
		//�Է�1		�Է�2	���
		//true		true	true
		//true		false	true
		//false		true	true
		//false		false	false
		System.out.println("|| => OR������ ���1 : "+(d || e));		// t
		System.out.println("|| => OR������ ���2 : "+(d || f));		// t
		System.out.println("|| => OR������ ���3 : "+(f || d));		// t
		System.out.println("|| => OR������ ���4 : "+(f || f));		// f
		//!(not) : �Էµ� ������ true�� false��, false�� true�� �ݴ�� ��ȯ
		//�Է�		���
		//true		false
		//false		true
		System.out.println(d+" ! => NOT������ ���1 : "+(!d));	// f
		System.out.println(f+" ! => NOT������ ���2 : "+(!f));	// t
	}
}