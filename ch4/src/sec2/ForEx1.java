package sec2;

public class ForEx1 {

	public static void main(String[] args) {
		//for(초기값;조건식;증감식) { 반복실행할문장; }
		
		for(int i = 1; i <= 10; i++) {	// 1씩 증가
			System.out.println(i);
		}
		
		for(int i = 0; i <= 10; i++) {
//			if(i % 2 == 0) {	// 짝수일 경우 건너띄기
//              continue;	// 건너띄기
//      }
			if(i % 2 == 1) {	// 홀수일때 수행
				System.out.println("i = " + i);
			}
		}
		System.out.println("-----------------");
		for(int i =1; i <= 10; i += 2) {	// 2씩 증가
			System.out.println("i = " + i);
		}
		System.out.println("------------------");
		
		// i++ = i+=1
		// sum = sum + i = sum += i
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;
			//sum += i;
			System.out.println(sum);
		}
	}

}
