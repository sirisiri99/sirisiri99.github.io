package sec1;
//Ŭ���� : ���赵, ��ü�� ����� ���� Ʋ
//Ŭ������ ���� : �ɹ�(����)�ʵ�, �ɹ� �޼���, ������;
public class Sample1 {

	
		// �ɹ�(����)�ʵ� : �ش� ��ü�� ���� Ư���� �����ϰ� �ִ� ��ü�� ���� ����		
		int field1; // Field
		float field2;
		double field3;
		short field4;
		boolean field5;
		String field6;
		// ������(Constuctor)
		// : ���� �̸��� �Ȱ��� ��ü�� ���� �� �ִ� �Լ��� ����µ� �װ��� �����ڶ���
		// ����, ���� �Ǵ� ���Ǹ� ���� ������, ������ ������ �����Ͽ�
		// Sample1() { } (<=�⺻ ������)�� �ִٰ� ������ �ϰԵ�
		// �����ε� : ���� �̸����� �ŰԺ����� ������ Ÿ���� �޸��Ͽ� �޼��峪 �Լ��� �����ϴ°�
		Sample1() { }
		Sample1(int field1) {
			this.field1 = field1;
		}
		Sample1(int field1, float field2) {
			this.field1 = field1;
			this.field2 = field2;
		}
		public void method1() {	// �ɹ� �ż���(method)
			System.out.println("�޼���1");
		}
		public int getField1() {
			return field1;
		}
		public void setField1(int field1) {
			this.field1 = field1;
		}
		public float getField2() {
			return field2;
		}
		public void setField2(float field2) {
			this.field2 = field2;
		}
		public double getField3() {
			return field3;
		}
		public void setField3(double field3) {
			this.field3 = field3;
		}
		public short getField4() {
			return field4;
		}
		public void setField4(short field4) {
			this.field4 = field4;
		}
		public boolean isField5() {
			return field5;
		}
		public void setField5(boolean field5) {
			this.field5 = field5;
		}
		public String getField6() {
			return field6;
		}
		public void setField6(String field6) {
			this.field6 = field6;
		}
		public int method2() {
			return this.field1;
			
			
		
	}

}
