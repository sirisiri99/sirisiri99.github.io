package sec1;

public class Array1 {	// 배열

	public static void main(String[] args) {
		// 배열 : 같은 타입을 가진 여러 개의 연속한 기억장소
		int jum1 = 100, jum2 = 80, jum3 = 90;
		int jum4 = 70, jum5 = 80, jum6 = 60;
		//	Arrjum[0] ...............Arrjum[5]
		int[] Arrjum = {100, 80, 90, 70, 80, 60};
		
		int tot = 0;
		for(int i =0; i < Arrjum.length; i++) {
			System.out.println(i + "번째 점수 : " + Arrjum[i]);
			tot+=Arrjum[i];
		}
		
		int tot1 = 0;
		int[] Arrjum2 = {100, 80, 90, 70, 80, 60};
		for(int i = 0; i < Arrjum2.length; i++ ) {
			System.out.println(i + "번째 점수 : " + Arrjum2[i]);
			tot1 += Arrjum2[i];
		}
		System.out.println(tot1);
		
	}

}
