package E4_�迭4_�˰���;

import java.util.Arrays;

public class �迭4_�˰���_���μ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   [���μ�����]
		  
		     �� �迭�� 1~9�� ������ ����Ǿ� �ִ� 9�� �������� �迭�̴�.
			 [����1] array �迭�� �� �Ͱ��� �簢�� ������� ��� �ϰ� 
			 ������ ���� ���� garo1[] �� ���ʴ�� ���� 
			 
			 [����2] array �迭�� �� �Ͱ��� �簢�� ������� ��� �ϰ� 
			 ������ ���� ���� sero1[] �� ���ʴ�� ���� 
		*/
		int array[] = {
				2, 4, 6,
				8, 1, 5,
				9, 7, 3
		};
		int garo1[] = {0,0,0}; // {2+4+6 , 8+1+5 , 9+7+3}
		int sero1[] = {0,0,0}; // {2+8+9 , 4+1+7 , 6+5+3}
		
		for(int i = 0; i<array.length; i+=1){
			System.out.print(array[i]);
			if(i%3 == 2) {System.out.println();}
		}
		
		System.out.println();
		System.out.println("----------------------------");
		System.out.println();
		
		int gi = 0;
		int si = 0;
		for(int i = 0; i<array.length; i+=1) {
			garo1[gi] = garo1[gi] + array[i];
			sero1[si] = sero1[si] + array[i];
			si += 1;
			
			if(i%3 == 2) {
				gi += 1;
				si = 0;
			}
		}
		System.out.println(Arrays.toString(garo1));
		System.out.println(Arrays.toString(sero1));
		
				
	}
}
