package sec2;

public class Example123 {

	public static void main(String[] args) {
		
		// 1.
		// 1) 조건문 : if, switch
		// 2) 반복문 : for, while, do while
		
		// 2. 2)
		
		// 3. for문을 이용 1~100까지의 정수중 3의배수의 총합
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}	
		}
		System.out.println("3의 배수의 합: " + sum);
		
		

	}

}
