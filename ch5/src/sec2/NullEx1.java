package sec2;

public class NullEx1 {

	public static void main(String[] args) {
		
		// int a = null; - 기본형은 null값을 가질 수 없다.
		String b = null;
		int c = 20;	// 기본형은 ==나 != 비교할 수 있다.
		int d = 20;	// 기본형은 주소로비교x 값을 비교o
		System.out.println("c == d : " + (c == d));
		System.out.println("c != d : " + (c != d));
		
		System.out.println("***************************");
		int[] e = {10, 20, 30};	// 참조형은 ==나 != 비교할 수 없다
		int[] f = {10, 20, 30};	// 참조형은 주소와 주소를 비교하게 되므로 같을 수가없다.
		System.out.println("e == f : " + (e == f));
		System.out.println("e != f : " + (e != f));
		
		System.out.println("e == f : " + e.equals(f));
		// ※ 참조형은 각 각 비교 하려면 equals로 해야한다.
		
		String g = "이규진"; // 참조형의 성격을 띄고 있지만 각각비교 가능
		String h = "이규진"; 
		System.out.println("g == h : " + (g == h));
		System.out.println("g != h : " + (g != h));
		
		String i = new String("이규진"); // new를 활용한 경우 참조형이 됨
		String j = new String("이규진"); // 이떄는 주소를 비교하게 됨
		System.out.println("i == j : " + (i == j));
		System.out.println("i != j : " + (i != j));
		
		System.out.println("i == j : " + i.equals(j));
		// 참조형을 값 비교하려면 equals를 사용
	}

}
