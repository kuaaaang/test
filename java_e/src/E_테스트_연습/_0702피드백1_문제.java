package E_�׽�Ʈ_����;

import java.util.Random;

public class _0702�ǵ��1_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	
	 	���ڸ� 0~4���� ���������� ����Ѵ�. 
	 	�Ʒ������� �����Ѵ�.
	 	[����1] �������� 0~4�� ���ڸ� �ϳ������ϰ� �׼��ڿ��� ��������ʰ� �������� ����Ѵ�.
	 	[����2] �� ���ڸ� ���������� ����ϱ⶧���� �����ϋ��� ���ڰ� ���������ʴ´�.
	 	
	 	[����1] 
	 		�������ڰ� 2��� �����Ҷ�  
	 		[���] 01 23 
	 	
		[����2] 
			�������ڰ� 3��� �����Ҷ�  
	 		[���] 012 3 
	 */
		Random ran = new Random();
		
		int arr[] = new int[5];
		int r = ran.nextInt(5);
		int num = 0;
		
		System.out.println("�������� : " + r);
		System.out.println();
		for(int i = 0; i<arr.length; i+=1) {
			if(i != r) {
				System.out.print(num);
				num += 1;
				}
			else if(i == r) {System.out.print(" ");}
		}
	}
}
