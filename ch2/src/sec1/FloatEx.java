package sec1;

public class FloatEx {
	public static void main(String[] args) {
		//�Ǽ�(float point number) : �ε��Ҽ����� -> float(4byte), double(8byte)
		int kor = 90;
		int eng = 70;
		int mat = 100;
		int tot = kor + eng + mat;	//������ ������ �������� ������ �����Ƿ� ������ �Ǽ��� �����ؾ� �Ǽ� ����� ���� 
		float avg = tot / 3.0f;		//����� �Ҽ��� ���ϰ� ���� �� �����Ƿ� 
		double pi1 = 3.1415;
		float pi2 = 3.1415f;
		int radius = 20;
		float area = radius * radius * pi2;
		float data1 = 3e6f;	//3*10��6�� : 3000000 -> ����
		float data2 = 3e-6f; //3*10��-6�� : 0.0000003 -> ����
		System.out.println("���� : "+tot);
		System.out.println("��� : "+avg);
		System.out.println("�������� 20�� ���� ���� : "+area);
		//ǥ�������� �ʹ� ���� Ÿ���� ����, �Ը� ū �����͸� �����ϰų� ó������ ���ϹǷ� -> Ÿ�� ������ ū �� ���
		//ǥ�������� �ʹ� ũ��, �޸� �뷮�� ���� �����ϰ� �ǹǷ� ū �޸𸮰� �ʿ��ϸ�, ����ӵ��� �������Ƿ� -> Ÿ�� ������ ���� �� ���
		//������ �����ϰ��� �ϴ� ������Ʈ�� ���� ������ �Ը� ���ϰ�, Ÿ���� �����ؾ� �Ѵ�.
	}
}