package sec1;

public class Assignment1 {

	public static void main(String[] args) {
		//���� ������
		int a = 30;
		int b;
		b = a; 
		a+=1;	//a=a+1 // 31
		a+=3;	//a=a+3 // 34
		System.out.println("a = "+a);	// 34
		a-=2;	//a=a-2
		System.out.println("a = "+a);	//	32
		a/=3;
		System.out.println("a = "+a);	//	10
		a*=4;
		System.out.println("a = "+a);	// 40
		a%=7;
		System.out.println("a = "+a);	//	5
		//a&=b, a|=b, a^=b, a>>=2, a<<=2, a>>>=2
	}

}