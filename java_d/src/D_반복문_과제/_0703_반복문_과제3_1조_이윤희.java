package D_�ݺ���_����;

import java.util.Arrays;
import java.util.Random;

public class _0703_�ݺ���_����3_1��_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
        �������� (1~9) ������ ����  8���� ����Ѵ�. 
        �� �Ʒ��� ������ �����Ѵ�. 
        
        ���� ��� ���ڰ� 4 5 6 1 2 3 4 5 �̶�� �Ѵٸ�
        �Ʒ��� ���� ����Ѵ�. 
        
        [���]
           4 5 6
           5 6 1
           6 1 2
           1 2 3
           2 3 4
           3 4 5 
        */
		Random ran = new Random();
		int arr[] = new int[8];
		
		for(int i = 0; i<8; i+=1) {
			int r = ran.nextInt(9)+1;
			arr[i] = r;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		for(int i = 0; i<arr.length-2; i+=1) {
			System.out.println(arr[i] + " " + arr[i+1] + " " + arr[i+2]);
		}
	}
}
