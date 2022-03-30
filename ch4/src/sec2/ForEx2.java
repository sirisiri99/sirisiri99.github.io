package sec2;

public class ForEx2 {

	public static void main(String[] args) {
		// 1~100까지 3의 배수의 합계
		
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합1 : " + sum);
		
		for(int i = 0; i <= 100; i++) {
			if(i % 3 != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("3의 배수의 합2 : " + sum);
		
		for(int i = 0; i <= 100; i+=3) {
			
		}
	}

}
