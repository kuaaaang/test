package E6_�迭6_�˰���;

import java.util.Arrays;

public class �迭6_�˰���_�ΰ��̾Ƽ����ϱ�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   /*	
		 [1] arr �迭���� ���� 2���� �̾Ƽ� ���Ѱ��� ���ʴ�� result �� ���������
		 [2] �ڱ����� �ε����� ����  �������ʴ´�.		
		  (1) [�ε��� 0] �ǰ� 2 + (1,3,4,1) ==> 2 + 1 , 2 + 3 , 2 + 4 , 2 + 1
		  (2) [�ε��� 1] �ǰ� 1 + (2,3,4,1) ==> 1 + 2 , 1 + 3 , 1 + 4 , 1 + 1
		  (3) [�ε��� 2] �ǰ� 3 + (2,1,4,1) ==> 3 + 2 , 3 + 1 , 3 + 4 , 3 + 1
		   ....		
		 [�߰� ����] result �� ����Ȱ����� �ߺ��Ǵ� ���� ���� ������ ��� 
	   */
		int arr[]  = {2,1,3,4,1};
		int result [] = new int[20];
		
		int count = 0;
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr.length; j+=1) {
				if(i == j) {
					continue;
				}
				else {
					result[count] = arr[i] + arr[j];
					count += 1;
				}
			}
		}
		System.out.println(Arrays.toString(result));
		
		System.out.println("----------------------------");
		
		for(int i = 0; i<result.length; i+=1) {
			for(int j = 0; j<result.length; j+=1) {
				if(result[i]!=result[j]) {
					int temp = result[i];
					for(int k = 0; k<result.length; k+=1) {
						if(result[k] == temp) {
							result[k] = 0;
							
							int index1 = 0;
							int index2 = 0;
							for(int l = 0; l<result.length; l+=1) {
								if(result[l] != 0) {
									int temp2 = result[index1];
									result[index1] = result[index2];
									result[index2] = temp2;
									index2 += 1;
								}
								index1 += 1;
							}
						}
					}
					System.out.println(Arrays.toString(result));
				}
				else if(result[i]==result[j]) {continue;}
			}
		}	
		// System.out.println(Arrays.toString(result));
	}
}
