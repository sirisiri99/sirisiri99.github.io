package sec1;

public class Array1 {	// �迭

	public static void main(String[] args) {
		// �迭 : ���� Ÿ���� ���� ���� ���� ������ ������
		int jum1 = 100, jum2 = 80, jum3 = 90;
		int jum4 = 70, jum5 = 80, jum6 = 60;
		//	Arrjum[0] ...............Arrjum[5]
		int[] Arrjum = {100, 80, 90, 70, 80, 60};
		
		int tot = 0;
		for(int i =0; i < Arrjum.length; i++) {
			System.out.println(i + "��° ���� : " + Arrjum[i]);
			tot+=Arrjum[i];
		}
		
		int tot1 = 0;
		int[] Arrjum2 = {100, 80, 90, 70, 80, 60};
		for(int i = 0; i < Arrjum2.length; i++ ) {
			System.out.println(i + "��° ���� : " + Arrjum2[i]);
			tot1 += Arrjum2[i];
		}
		System.out.println(tot1);
		
	}

}