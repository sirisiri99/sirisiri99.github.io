package sec2;

public class Operator2 {
	public static void main(String[] args) {
		int a=20; boolean b=true;	//�����Ϸ��� 2�ٷ� �ν�
		System.out.println("a="+a	//�����Ϸ��� 1�ٷ� �ν�
				+", b="+b);
		int c=20;
		int d = a + c;  //���׿���
		boolean e = !b;	//���׿���
		String pass = a>=20 ? "�հ�" : "���հ�";	//���� ������

	/*
		(operator) = ���� = ��ɾ�(Instruction)
		op-code	operand		
		������	�ǿ�����
		end				=> 	��0�ּ� ��ɾ� ����
		!		b		=>	����(unary)	=> ��1�ּ� ��ɾ� ����
		+		a, c	=>	����(binary)	=> ��2�ּ� ��ɾ� ����
		=		d		
		?:		����, ��, ����		��Ÿ		=> ��3�ּ� ��ɾ� ����
	*/
	}
}