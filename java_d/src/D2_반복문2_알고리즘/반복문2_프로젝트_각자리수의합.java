package D2_�ݺ���2_�˰���;

import java.util.Random;

public class �ݺ���2_������Ʈ_���ڸ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����]
		 1~999 ������ �������ڸ� �����ϰ� �� �ڸ����� ���� ����Ͻÿ�.
		 ��) 8 ==> 8
		 ��) 28 ==> 2 + 8
		 ��) 999 ==> 9 + 9 + 9
		*/
		Random ran = new Random();
		int n = ran.nextInt(999) + 1;
		int _100 = n/100;
		int _10 = (n%100)/10;
		int _1 = (n%100)%10;
		
		System.out.println(n);
		System.out.println(_100 + _10 + _1);
	}
}
