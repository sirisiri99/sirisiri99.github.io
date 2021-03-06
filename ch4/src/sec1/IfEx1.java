package sec1;

// 제어문 : 프로그래밍에서 프로그램의 흐름을 제어하는 것
// 조건분기문 : 조건에 따라 실행내용이 달라지게 하는것
// if : if, if/else, if/else/else
// switch : switch/case
// 반복문 : 프로그래밍상 같은 실행문으로 여러 번 실행하게 하는 것
// for, while, do~while
// 기타 제어문
// break, continue

public class IfEx1 {

	public static void main(String[] args) {
		
		String name = "이규진";
		int kor = 80;
		int eng = 70;
		int mat = 100;
		int tot = kor + eng + mat;
		String pass = "불합격";
		// if(조건식) {실행문}
		if(tot >= 200) {
			pass = "합격";
		}
		// if (tot>=200) pass="합격"; - 한 줄로 if문 기술
		// pass = (tot>=200) ? "합격" : "불합격"; - 삼항 연산자
		System.out.println("합격여부 : " + pass);
		// if (조건식) { 참실행문장; } else { 거짓실행문장; }
		if(kor>=90 || eng>=90 || mat>=90) {
			System.out.println("과목우수자");
		} else {
			System.out.println("대상 아님");
		}
		if(kor>=90 && eng>=90 && mat>=90) {
			System.out.println("장학생");
		} else {
			System.out.println("일반학생");
		}
		System.out.print("학점 : ");
		// if(조건식1) {  실행문1; } else if(조건식2) { 실행문2;]
		// else if(조건식3) { 실행문3; }
		if(tot >= 270) {
			System.out.println("A");
		} else if(tot >= 240) { // 269~240
			System.out.println("B");
		} else if(tot >= 210) {	// 239~210
			System.out.println("C");
		} else if(tot >= 180) { // 209~180
			System.out.println("D");
		} else {
			System.out.println("go home");
		}
		System.out.println();
		// System.out.print("\n");
		
	}

}
