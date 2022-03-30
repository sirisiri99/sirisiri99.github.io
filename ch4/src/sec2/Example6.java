package sec2;

public class Example6 {

	public static void main(String[] args) {
		
		// n번째 줄은 n개가 출력
		for(int i = 1; i <= 5; i++) { // i = 1, 2, 3, 4, 5
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		//	System.out.print("\n");
		}

	}

}
	