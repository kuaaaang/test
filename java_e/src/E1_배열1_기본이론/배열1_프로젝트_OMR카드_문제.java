package E1_�迭1_�⺻�̷�;

import java.util.Random;

public class �迭1_������Ʈ_OMRī��_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [OMRī��]
		  
		  1. �迭 test�� ���蹮���� �������̴�.
		  2. �迭 student�� 1~5 ������ ���� ���� 5���� �����Ѵ�.	
		  3. ���ڸ����� ���ؼ� ������ ����Ѵ�.
		      ==> ������ true , Ʋ���� false
		  4. ������ �� ������ 20���̴�.
		  5. ������ ����Ѵ�.  
		   
		  [��]
		  test  = {1, 3, 4, 2, 5}
		  student = {1, 1, 4, 4, 3}
		  result  = {t, f, t, f, f} 
	    */
		Random ran = new Random();
		
		int[] test = {1, 3, 4, 2, 5};
		int[] student = new int[5];
		boolean[] result = new boolean[5];
		
		for(int i = 0; i<5; i+=1) {
			int n = ran.nextInt(5)+1;
			student[i] = n;
		}
		for(int i = 0; i<5; i+=1) {
			System.out.println("���� ���� ���� : " + test[i]);
		}
		for(int i = 0; i<5; i+=1) {
			System.out.println("�л� ����� : " + student[i]);
		}
		
		System.out.println("----------------------------------------");
		
		for(int i = 0; i<5; i+=1) {
			if(test[i]==student[i]) {
				System.out.print("T");
			}
			else {System.out.print("F");}
		}
		
		
	}
}
