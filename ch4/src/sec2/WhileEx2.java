package sec2;

public class WhileEx2 {

	public static void main(String[] args) {
		// 1~100������ 4�� ����� �ջ���
		
		int i = 0;
		int sum = 0;
		while(i <= 100) {
			if(i % 4 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("4�� ����� ��1 :" + sum);
		
		int j  = 0;
		sum = 0;
		while(j <= 100) {
			if(j % 4 != 0) {
				continue;
			}
			sum += j;
			j++;
		}
		System.out.println("4�� ����� ��2 : " + sum);

	}

}