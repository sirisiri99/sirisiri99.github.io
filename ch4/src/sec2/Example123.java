package sec2;

public class Example123 {

	public static void main(String[] args) {
		
		// 1.
		// 1) ���ǹ� : if, switch
		// 2) �ݺ��� : for, while, do while
		
		// 2. 2)
		
		// 3. for���� �̿� 1~100������ ������ 3�ǹ���� ����
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}	
		}
		System.out.println("3�� ����� ��: " + sum);
		
		

	}

}