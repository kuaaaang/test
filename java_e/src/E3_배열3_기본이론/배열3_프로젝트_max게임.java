package E3_�迭3_�⺻�̷�;

import java.util.Scanner;
import java.util.Arrays;

public class �迭3_������Ʈ_max���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [max����]
		  
		  1. ���� ū ���� ã�� �Է��Ѵ�.
		  2. �����̸� �ش� ���� 0���� �����Ѵ�.
		  3. arr�迭�� ��� ���� 0���� ����Ǹ� ���α׷��� ����ȴ�.
		  ��)
		  11, 87, 42, 100, 24
		  �Է� : 100
		  
		  11, 87, 42, 0, 24
		  �Է� : 87
		  
		  11, 0, 42, 0, 24
		  �Է� : 24 ==> �ִ밪�� �ƴϹǷ� �ƹ��ϾȻ���
		*/
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};
		
		int i = 0;
		int count = arr.length;
		while(true) {
			System.out.println(Arrays.toString(arr));
			System.out.println("���� ū ���� �Է��ϼ���.");
			int n = scan.nextInt();
			
			int max = 0;
			for(int j = 0; j<arr.length; j+=1) {
				if(max<=arr[j]) {
					max = arr[j];
					i = j;
				}
			}	
			if(n==max) {
				System.out.println("����");
				arr[i] = 0;
				count -= 1;
			}else {System.out.println("����");
			}
			i+=1;
			if(count == 0) {
				System.out.println(Arrays.toString(arr));
				System.out.println("����!");
				break;
			}
		}	
		scan.close();
	}
}
