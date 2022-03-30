package sec1;

public class Crease1 {

	public static void main(String[] args) {
		//증감 연산(전위/후위 연산 포함)
		int a = 5;
		int b = 5;
		//a+=1 => a=a+1 => ++a, a++
		System.out.println("(전위증가) ++a : "+(++a));	// 6
		System.out.println("(후위증가) b++ : "+(b++));	// 5
		System.out.println("a = "+a);	// 6
		System.out.println("b = "+b);	// 6
		System.out.println("(전위감소) --b : "+(--b));	// 5
		System.out.println("(후위감소) a-- : "+(a--));	// 6
		System.out.println("a = "+a);	// 5
		System.out.println("b = "+b);	// 5
	}
}