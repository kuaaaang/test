package E_�׽�Ʈ_����;

import java.util.Arrays;
import java.util.Random;

public class _0702�ǵ��3_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[1] ����(1~9�����Ǽ���) �� ¦���� ���� �ټ����� ���� �迭�� ù��° �ڸ��� �����Ѵ�. 
		[2] �ε�������
		 �������� 5���ݺ��Ѵ�.
		 
		 [����]
		 	[0���ε���]
			 	2, 6, 4 ,2, 8 => total = 22 
			 	arr = {22, 0,0,0,0};
			[1���ε���]
			 	6, 4, 4 ,2, 2 => total = 18 
			 	arr = {22, 18, 0, 0, 0};
			...
		*/
		Random ran = new Random();
		int arr[] = new int[5];
		
		int index = 0;
		while(index <= 4) {
			int total = 0;
			for(int i = 0; i<5;) {
				int r = ran.nextInt(9)+1;
				if(r%2 == 0) {
					System.out.print(r + " ");
					total += r;
					i+= 1;
				}
			}
			System.out.println();
			System.out.println(total);
			if(index <= 4) {
				arr[index] = total;
				index += 1;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
