package sec2;

public class ForEx1 {

	public static void main(String[] args) {
		//for(�ʱⰪ;���ǽ�;������) { �ݺ������ҹ���; }
		
		for(int i = 1; i <= 10; i++) {	// 1�� ����
			System.out.println(i);
		}
		
		for(int i = 0; i <= 10; i++) {
//			if(i % 2 == 0) {	// ¦���� ��� �ǳʶ��
//              continue;	// �ǳʶ��
//      }
			if(i % 2 == 1) {	// Ȧ���϶� ����
				System.out.println("i = " + i);
			}
		}
		System.out.println("-----------------");
		for(int i =1; i <= 10; i += 2) {	// 2�� ����
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
