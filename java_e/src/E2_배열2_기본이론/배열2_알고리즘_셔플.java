package E2_�迭2_�⺻�̷�;

import java.util.Random;

public class �迭2_�˰���_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���� 	
		// 1) �ε��� 2���� ����(0~5)���� �����ϰ� �� �ε����� ���� ��ȯ
		// 2) �� 1���� 10 �� �ݺ��ϸ� ����  ��� 
				
		//��) 1 , 2 ==> {10,30,20,40,50,60};  // 20 �� 30�� ��ȯ��.
				
		//��) 4 , 1 ==> {10,50,20,40,30,60};  // 50 �� 30�� ��ȯ��.
				
		//��) 3 , 3 ==> {10,50,20,40,30,60}; // ������ �ƹ��ϵ��Ȼ����.
		
		int arr[] = {10,20,30,40,50,60};
		
		Random ran = new Random();
		
		int count = 0;
		while(count<10) {
			int n1 = ran.nextInt(6);
			int n2 = ran.nextInt(6);
			System.out.println();
			System.out.println(n1 + " , " + n2);
			
			int temp = arr[n1];
			arr[n1] = arr[n2];
			arr[n2] = temp;
			
			for(int i = 0; i<6; i+=1) {
				System.out.print(arr[i] + "  ");
			}
			
			count +=1;
		}
		
		
		
	}

}
