package sec1;

public class Array2 {

	public static void main(String[] args) {
		
		int[] arr1 = {10, 40, 20, 15, 30};
		// int[] arr2;
		// arr2 = {40, 15, 10, 30, 20};	- ������ ����
		int[] arr2;  
		arr2 = new int[] {40, 15, 10, 30, 20};
		System.out.println(arr2.length);
		
		String[] names = null;
		names = new String[] {"�̱���", "�ø�", "���", "�޸�"};
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		float[] arr3 = {3.14f, 2.55f, 6.24f, 6.25f};
		
		// long[] arr4 = new long[5]; 
		// arr4 = {20, 40, 30, 15, 25};
		// - arr4[0] ~ arr4[4] �� �ʱ�ȭ�� 0���� ��
		double[] arr5 = new double[5];
		for(int i = 0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}
		// �迭�� �ʱ�ȭ�� ���� ������, ������ 0, �Ǽ��� 0.0, ���ڿ��� null�� �ʱ�ȭ
		
	}

}
