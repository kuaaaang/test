package E7_�迭7_�⺻�̷�;

import java.util.Arrays;

public class �迭7_�˰���_�ϳ����ִ¼������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /*
	    �Ʒ� �迭���� ȥ���ִ� ���ڸ� �������� ���������鸸  temp1~3 �� ������ ���
		1) {1,2,2,1,0}  // 3�� ȥ������
		2) {4,4,0,0,0}  // 1,2,3 ȥ������
		3) {1,1,1,1,1}  // ����
	  */
		int test1[] = {1,2,3,2,1};		
		int test2[] = {1,3,4,4,2};
		int test3[] = {1,1,1,1,1};
		
		int temp1[] = new int[5];
		int temp2[] = new int[5];
		int temp3[] = new int[5];
		
		int temp[][] = new int[3][];
		temp[0] = test1;
		temp[1] = test2;
		temp[2] = test3;
		
		for(int i = 0; i<temp.length; i+=1) {
			for(int j = 0; j<temp[i].length; j+=1) {
				int count = 0;
				for(int k = 0; k<temp[i].length; k+=1) {
					if(temp[i][j] == temp[i][k]) {
						count += 1;
					}
				}
				if(count == 1) {
					temp[i][j]=0;
				}
			}
			
			int index1 = 0;
			int index2 = 0;
			for(int l = 0; l<temp[i].length; l+=1) {
				if(temp[i][index1] != 0) {
					int t = temp[i][index1];
					temp[i][index1] = temp[i][index2];
					temp[i][index2] = t;
					index2 += 1;
				}
				index1 += 1;	
			}
			
		}
		
		for(int i = 0; i<temp.length; i+=1) {
			System.out.println(Arrays.toString(temp[i]));
		}
		
	}
}
