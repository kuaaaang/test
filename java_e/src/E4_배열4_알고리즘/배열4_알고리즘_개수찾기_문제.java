package E4_�迭4_�˰���;

import java.util.Arrays;

public class �迭4_�˰���_����ã��_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		     [����ã��]
		 
		  	 ���帹�� ����ִ� ���ڰ�����
			 ���� ���� ����ִ� ������ ������ ���� ���Ͻÿ�.	
			 100 : 1��
			 3   : 5�� 	
			 �� : 6		
		*/
		//[1] ���ο� �迭�� ���� ��ø�����ʴ� ���� �����Ѵ�.
		//temp = {1,2,3,100}
		
		int[] arr = { 1, 2, 3, 3, 100, 1, 3, 3, 2, 3, 2 };	
		int temp[] = new int[arr.length];
		int tcount = 0;
		
		for(int i = 0; i<arr.length; i+=1) {
			boolean check = false;
			
			for(int j = 0; j<tcount; j+=1) { // �ߺ��� �� ��쿣
				if(temp[j] == arr[i]) {
					check = true;
					break;
				}
			}
			if(check == false) { // �ߺ��� ���� ���� ��쿣
				temp[tcount] = arr[i];
				tcount +=1;
			}
			
		}
		System.out.println(Arrays.toString(temp));
		System.out.println(tcount);

		int count[] = new int[tcount];
		
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr.length; j+=1) {
				if(arr[i] == temp[j]) {
					count[j] += 1;
				}
			}
		}
		System.out.println(Arrays.toString(count));	
		
		for(int i = 0; i<count.length; i+=1) {
			System.out.println(temp[i] + " : " + count[i] + "��");
		}
		
		int max = 0;
		int min = 5;
		int a = 0;
		int b = 0;
		
		for(int i = 0; i<count.length; i+=1){
			if(max<count[i]) {max = count[i];
			                  a = i;}
			if(min>count[i]) {min = count[i];
			                  b = i;}
		}
		
		System.out.println();
		System.out.println("���� ���� �� : " + temp[a] + " , " + max + "��");
		System.out.println("���� ���� �� : " + temp[b] + " , " + min + "��");
		System.out.println(max + min);
		
		
	}
}
