package sec2;

public class ForEx2 {

	public static void main(String[] args) {
		// 1~100���� 3�� ����� �հ�
		
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3�� ����� ��1 : " + sum);
		
		for(int i = 0; i <= 100; i++) {
			if(i % 3 != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("3�� ����� ��2 : " + sum);
		
		for(int i = 0; i <= 100; i+=3) {
			
		}
	}

}
