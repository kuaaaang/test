package D_�׽�Ʈ_����;

import java.util.Random;

public class �׽�Ʈ0505_����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		[ö���Ǹ���]
			ö���� ��������� �ϰ��ִ�. 	
			0~20������ ������ �ְ� ö���� 0�� ��ġ�� �ִ�. 
			20�� �Ѿ�� ���������̴�. 
			�ֻ����� 1~6������ ���ڰ� ���´�.	
			3�� ����� �ڸ��� �����̴�.(3,6,9,12,15,18) 
			���������� �ѹ��� �ֻ����� ������ 4�̻��� ���ڰ� ������ ����Ż���̵Ǹ� ��ĭ ������ �����Ѵ�.
			������ �����ϸ� �ڷ� ��ĭ �������Եȴ�. 	
			ö���� ������ ���������� ö���� �̵���θ� ���� ����Ͻÿ�. 	
	    */
		Random ran = new Random();
		int a = 0;
		int count = 1;
		
		System.out.println("[���� ����]");
		System.out.println("������ġ : " + a);
		System.out.println();
		
		while(true) {
			int r = ran.nextInt(6)+1;
			
			if(a%3 != 0 && a<20 || a == 0) {
				System.out.println("�ֻ��� : " + r);
				a += r;
				System.out.println("������ġ : " + a);
			}
			
			else if(a%3 == 0 && a<20 && a != 0) {
				System.out.println("����!");
				int n = ran.nextInt(6)+1;
				System.out.println("�ֻ����� �����ϴ�.[4�̻��� ������ Ż��!]    �ֻ��� : "  + n);
				if(n>=4) {
					System.out.println("���� Ż��!");
					a += 1;
					System.out.println("������ġ : " + a);
				}
				else if(n<4) {
					System.out.println("Ż�� ����");
					a -= 1;
					System.out.println("������ġ : " + a);
				}
			}
			
			if(a>=20) {
				System.out.println("����!");
				break;
			}
			System.out.println();
			count += 1;
		}
	}
}
