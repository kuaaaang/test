package E3_�迭3_�⺻�̷�;

import java.util.Arrays;

public class �迭3_�˰���_����ã��2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  1) seatList �� ��ȭ�� 7�ڸ��� ��Ÿ����. 
		  2) seatList �� ������ ��ȭ�� ������ ȸ����ȣ�� ��Ÿ����. 
		  3) numList �� ȸ����ȣ�̴�.
		  4) countList �� ��ȸ������ ���Ÿ� �󸶳� �ߴ��� ������ ǥ���Ѵ�.
		  5) seatList �� �˻��ؼ� �� ȸ������ ������ ���� countList�������Ѵ�.
		  
		  	��) int countList[] = {1,1,2,0};
		*/		
			int seatList[] = {1003,1003,0,0,1002,0,1001};		
			int numList[] = {1001,1002,1003,1004};
			int countList[] = {0,0,0,0};
		
		    for(int i = 0; i<numList.length; i+=1){
		    	int count = 0;
		    	for(int j = 0; j<seatList.length; j+=1) {
		    		if(numList[i] == seatList[j]) {count +=1;}
		    	}
		    	countList[i] = count;
		    }
			System.out.println(Arrays.toString(countList));
	}
}
