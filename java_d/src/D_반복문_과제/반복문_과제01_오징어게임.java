package D_�ݺ���_����;

import java.util.Random;

public class �ݺ���_����01_��¡����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[��¡�����]
			ö���� ��¡����ӿ� �����Ͽ���.
			ù��° ������ "����ȭ���� �Ǿ����ϴ�" �̴�.
			��Ģ�� �Ʒ��Ͱ���.	
		[��Ģ]	
			[1] ��ü �Ÿ��� 0 ~ 25���� �Ÿ��� �ִ�.
			[2] ö���� ���� 0�� �ڸ��� �ִ�.
			[3] ö���� ���� 1 ~ 4�� �������ڸ��̴´�. ���ڸ�ŭ �̵��Ѵ�. 
			[4]	�̵��Ÿ��� �����ϸ�, ���� 25�̻��̵Ǹ� �¸��̸� �����Ѵ�.
			[5] ������ ���� 3 ~ 5�� �������ڸ��̴´�. 
			[6] �������� ū ���ڰ������� �����ΰ����� ���ֵǾ� �й��ϸ� �����Ѵ�.
			[7] 10�Ͼȿ� �������ϸ� �ð��ʰ��� �й��ϸ� �����Ѵ�.
			[8] ö���� �̵���θ� ���� ����Ͻÿ�.
		*/
		Random ran = new Random();
		
		int ������ġ = 0;
		int count = 0; 
		
		while(true) {
			
			System.out.println("������ġ : " + ������ġ);
			int ö�� = ran.nextInt(4)+1;
			int ���� = ran.nextInt(3)+3;
			System.out.println("ö�� : " + ö��);
			System.out.println("���� : " + ����);
			
			if(ö��>����) {
				System.out.println("���������ϴ�.");
				break;
			}
			else {
				������ġ = ������ġ + ö��;
				count += 1;
			}
			
			if(count >10) {
				System.out.println("�ð��ʰ�!");
				break;
			}

			if(������ġ >= 25){
				System.out.println("������ġ : " + ������ġ);
				System.out.println("�¸�!");
				break;
			}
		}
	}
}
