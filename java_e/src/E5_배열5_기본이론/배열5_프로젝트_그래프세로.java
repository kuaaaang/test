package E5_�迭5_�⺻�̷�;

import java.util.Arrays;

public class �迭5_������Ʈ_�׷������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*  
	    scoreList[] = {31, 76, 54, 2, 100, 23};
	    �� �����ʹ� �л� 6���� �����̴�.		
		�� �����͸� �׷����� ǥ���غ������Ѵ�.
	 	ǥ�ô� 10�� �ڸ����ڷ� ǥ���ؼ� ������ŭ  * �� ����ҷ����Ѵ�.
	 	������ ���ʿ��� ���������� ǥ�������� �̹��� �Ʒ��� ���� ǥ���ҷ����Ѵ�.		
		  
		---------------------------------		                
		                 *
		                 *
		                 *
		        *        *
		 	    *        *
		  	    *  *     *
		        *  *     *
		     *  *  *     *
		     *  *  *     *  *
		  	 *  *  *     *  *
		    31 76 54 2 100 23
		---------------------------------	    
	*/
		int scoreList[] = {31, 76, 54, 2, 100, 23};
		
		int temp[][] = new int[10][scoreList.length];
				
		for(int i = 0; i<temp[0].length; i+=1) {
			int score = scoreList[i]/10;
			for(int j = 0; j<temp.length - score; j+=1) {
				temp[j][i] = 1;
			}
		}
		
		for(int i = 0; i<temp.length; i+=1) {
			for(int j = 0; j<temp[i].length; j+=1) {
				if(temp[i][j] == 1) {
					System.out.print("    ");
				}else {
					System.out.print(" *  ");
				}
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(scoreList));
	}
}
