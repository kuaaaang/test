package E7_�迭7_�⺻�̷�;

import java.util.Arrays;

public class �迭7_�˰���_����9�ǰ���_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		   mine = {0,9,0},
				  {9,0,9},
				  {0,0,9}
				  
		  	�� mine�迭�� ���� 0�� �ڸ��� ���ڸ� �����ҷ����Ѵ�.
		 	�����Ҽ��ڴ� �ֺ� 8������ �˻��� 9�� ������ ���������.
				
			 ��) �Ʒ��� ���� ���  
			   {2,9,2},
			   {9,4,9},
			   {1,3,9}
		 */
			int mine[][] = {
					{0,9,0},
					{9,0,9},
					{0,0,9}
			};
		
			for(int i = 0; i<mine.length; i+=1) {
				for(int j = 0; j<mine[i].length; j+=1) {
					if(mine[i][j] == 0) {
						int a = i;
						int b = j;
						int count = 0;
						for(int k = a-1; k<=a+1; k+=1){
							for(int l = b-1; l<=b+1; l+=1) {
								if(k>=0 && l>=0 && k<mine.length && l<mine[0].length && mine[k][l] == 9) {
									count += 1;
								}
								else if(k<0 || l<0|| k>=mine.length || l>=mine[0].length) {
									continue;
								}
							}
						}
						mine[i][j] = count;
					}
				}
			}
			
			for(int i = 0; i<mine.length; i+=1) {
				System.out.println(Arrays.toString(mine[i]));
			}	
	}
}
