package C3_���ǹ�3_�⺻�̷�;

import java.util.Random;

public class ���ǹ�3_�⺻�̷�1_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����]  
		   1) import java.util.Random; �߰�
		   2) Random ran = new Random(); �߰� 
		   3) ���� main �żҵ�ȿ���  int r = ran.netInt(��������); 
		   4) ( 0 ~ ��������-1 )  ���̰��� ���´�. 
		*/		
	
			Random ran = new Random();
			// ��) 0 ~ 2 ������ ����
			int rNum = ran.nextInt(3); // 0���� 3�� ==> 0,1,2
			System.out.println(rNum);

			// ���� 1) 1 ~ 6 ������ ����
			rNum = ran.nextInt(6) + 1; // [0 ~ 5] + 1
			System.out.println(rNum);

			// ���� 2) -3 ~ 3 ������ ����
			rNum = ran.nextInt(7) - 3; // [0 ~ 6] - 3
			System.out.println(rNum);
	}
}
