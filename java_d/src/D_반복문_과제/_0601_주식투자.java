package D_�ݺ���_����;

import java.util.Random;

public class _0601_�ֽ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /*
		ö���� ���� �ֽĿ� ������ ���̱� �����ߴ�. 
		�ֽ��� ��°�� �ñ��ϱ� �����ߴ�. 
		�ֱ� �����ִ� �����ֽ��� ���캸��� �ߴ�.
		������ ����ϴ� �Ⱓ�� ���� �� �Ⱓ�� ����غ���. 
	 	[1] �������� 1~8���� ���� 10���� ���������� ����Ѵ�. 
	  	[2] �������ڴ� �ְ� ��ġ�� ���ϰ�  ���ڰ�ũ�� ��� ������ �϶��̴�. 
	  	[����] �Ʒ��Ͱ��� �������ڰ� ���Դٰ��ϸ�
	  		4 8 3 2 6 7 4 5 6 1
	  		
	  		(1) ó�� 4 - 8 �� ����̰� 8 ������ 3 �̱⶧���� �ִ� ��±Ⱓ�� 1�̴�.
	  		(2) �ٽ� 2 - 6 - 7 �� ����̰� 7������ 4�̱� ������ �ִ��±Ⱓ�� 2�̴�. 
	  		(3) 4 - 5 - 6 �� ����̰�  6 ���� 1�̱⶧���� �ִ��±Ⱓ�� 2�̴�. 
	  		(4) ���� ��ġ�� �����̸� ������� ġ���ʴ´�.    
	  	[����]
	  		2��
	  */
	    Random ran = new Random();
		
		int count = 0;
		int max = 0;
		int mcount = 0;
		int a = 0;
	    while(true) {
			int r = ran.nextInt(8)+1;
			System.out.print(r + "  ");
			count += 1;
			
			if(count == 1) {max = r;}
			
			else if(r>max && count != 1) {
				max = r;
				mcount += 1;
				if(mcount > a) {a=mcount;}
			}
			else if(r<=max) {
				max = r;
				mcount = 0;
			}
	
//			System.out.println(mcount + "    " + a);

			if(count == 10) {break;}
		}
	    
	    System.out.println();
		System.out.println("�ִ� ��±Ⱓ : " + a + "��");

	}
}
