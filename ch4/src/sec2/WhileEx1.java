package sec2;

public class WhileEx1 {

	public static void main(String[] args) {
		//ī��Ʈ���� �ʱ�ȭ; while(���ǽ�) { �ݺ����๮��; ������; }
		//���ǰ� �������, ī��Ʈ������ ������ ��ġ�� ���� �� ����� ���� �޶���
		
		int i = 0, sum = 0;	// ī��Ʈ���� �ʱ�ȭ
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
