package E_�׽�Ʈ_����;

public class _0702�ǵ��2_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		�ݺ����� ����ؼ� �Ʒ��� ���� ����غ�����.
		[����]
				0 30
				1 29
				2 27
				3 24
				4 20
				5 15
				6 9
				7 2
				8 -6
				9 -15
	 */
		int a = 0;
		int b = 30;
		
		for(int i = 0; i<10; i+=1) {
			System.out.print(a + " ");
			System.out.print(b-a);
			System.out.println();
			b = b-a;
			a += 1;
		}
	}
}
