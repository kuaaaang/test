package E2_�迭2_�⺻�̷�;

public class �迭2_�˰���_1�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [����]
		  
		  [1��]
		    �Ʒ� �����ʹ� �л���ȣ1��, ����2���� �Ѽ�Ʈ�̴�. 		
			��ȣ�� 1001���ͽ����̰� , ������ 0~100 �̴�. 
			��) 1001 , 20, 30 ==> 1001�� 1������ 20��, 2������ 30��
			 		 
			1���� ��ȣ ����Ѵ�. 
			������ �������� �����ΰ���Ѵ�. 
		*/
		int arr[] = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1};
		
		int score1 = 0;
		int score2 = 0;
		int max = 0;
		int count = -3;
		
		for(int i = 0; i<9; i+=3) {
			score1 = arr[i + 1];
			score2 = arr[i + 2];
			int total = score1 + score2;
			System.out.println("��ȣ : " + arr[i] + " , 1�� ���� : " + score1 + " , 2�� ���� : " + score2 + " , ���� : " + total);
			if (max<total) {
				max = total;
				count = count+3;
			}
		}
		 System.out.println("1�� ���� : " + max + " , 1�� ��ȣ : " + arr[count]);
			
	}
}
