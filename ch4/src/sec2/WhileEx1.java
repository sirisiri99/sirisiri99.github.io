package sec2;

public class WhileEx1 {

	public static void main(String[] args) {
		//카운트변수 초기화; while(조건식) { 반복실행문장; 증감식; }
		//조건과 결과누적, 카운트변수의 증감식 위치에 따라 그 결과가 완전 달라짐
		
		int i = 0, sum = 0;	// 카운트변수 초기화
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("sum = " + sum);
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("sum = " + sum);
	}

}
