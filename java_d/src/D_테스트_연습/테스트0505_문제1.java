package D_�׽�Ʈ_����;

import java.util.Random;

public class �׽�Ʈ0505_����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		[����]
		[�ݺ�����������]	 	
			ö���� �μ��� ��ܿ��� ������������ �Ѵ�. 	 	
			ö���� �μ��� ���� 0 ~ 2 �� �������� �����Ѵ�.
			0 : ���� , 1 : ���� , 2 : ���� ���Ѵ�.	 
			ö���� �μ��� 50��° ����� ��ġ���� ������ �Ѵ�.
			���� ������ ����.	
			�̱�� 3ĭ�ö󰡱�, ���� 2ĭ�ö󰡱�, ���� 1ĭ�ö󰡱�.	 	
			���� �ƹ��� 100�̻� �����ϰų� �ѻ����� ������ 10�̻��̸� ������ ����ȴ�. 
			������ ����ɶ����� �λ���� �̵���θ� ����Ͻÿ�.
	    */
		Random ran = new Random();
		int p1p = 50;
		int p2p = 50;
		
		while(true) {
			int p1 = ran.nextInt(3);
			int p2 = ran.nextInt(3);
			System.out.println("ö�� ��ġ : " + p1p);
			System.out.println("�μ� ��ġ : " + p2p);
			System.out.println();
			System.out.println("ö�� : " + p1);
			System.out.println("�μ� : " + p2);
			
			if((p1==0 && p2==2) || (p1==1 && p2==0) || (p1==2 && p2==1)) {
				p1p += 3;
				p2p -= 1;
				System.out.println("ö�� win");
			}
			else if((p2==0 && p1==2) || (p2==1 && p1==0) || (p2==2 && p1==1)) {
				p1p -= 1;
				p2p += 3;
				System.out.println("�μ� win");
			}
			else if(p1==p2) {
				p1p += 2;
				p2p += 2;
				System.out.println("draw");
			}
			
			if(p1p >= 100 || p2p >= 100 || (p1p-p2p)>=10 || (p2p-p1p)>=10) {
				System.out.println("��������");
				System.out.println("ö�� ��ġ : " + p1p);
				System.out.println("�μ� ��ġ : " + p2p);
				break;
			}
		}
	}
}
