package E7_�迭7_�⺻�̷�;

import java.util.Arrays;

public class �迭7_�˰���_��ǲ�߰�����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /*
		1) arr �迭�� ������3�̴�.		
		2) input �迭 ���� ������  �߰��� ������ �ݺ��� �����̴�.		
		3) 0�� �ε����� ���� "�߰�" �̰�, 
		4) 1�� �ε����� ���� "����" �̴�. 
		   [����] �������ڸ��� �ڿ������� ������ �о�� 0���� ǥ�� �Ѵ�. 	
		5) �ߺ��Ȱ��� "�߰�" �Ҽ����� , ���°��� "����"�Ҽ�����.
		6) input�� ������ ���� ó���ϰ� ó��������� 		
		��)
		 10 ==> ¦���ε����̹Ƿ� �߰� ==> arr[] = {10,0,0};
		 20 ==> Ȧ���ε����̹Ƿ� ���� ==> 20�� �����Ƿ� ==> "�����Ұ��� �����ϴ�"
		 30 ==> ¦���ε����̹Ƿ� �߰� ==> arr[] = {10,30,0};
		 10 ==> Ȧ���ε����̹Ƿ� ���� ==> arr[] = {30,0,0};
		 30 ==> ¦���ε����̹Ƿ� �߰� ==> 30 ���̹� ����Ǿ ==> "�ߺ��˴ϴ�"
		 30 ==> Ȧ���ε����̹Ƿ� ���� ==> arr[] = {0,0,0};
	   */	
		int arr[] = {0,0,0};
		int count = 0;
		int c = 0;
			
		int input[][] = {{10,20},{30,10},{30,30}};	
		
		for(int i = 0; i<input.length; i+=1) {
			int a = 0;
			for(int j = 0; j<arr.length; j+=1) {
				if(arr[j] != input[i][0]) {
					a += 1;
					if(a==3) {
						System.out.println("�߰��� �� : " + input[i][0]);
						arr[count] = input[i][0];
						count += 1;
					}
				}
				else if(arr[j] == input[i][0]) {
					System.out.println("�ߺ��� ���Դϴ�.");
				}
			}
			
			System.out.println(Arrays.toString(arr));
			System.out.println();
			
			for(int j = 0; j<arr.length; j+=1) {
				if(arr[j] == input[i][1]) {
					System.out.println("������ �� : " + arr[j]);
					arr[j] = 0;
					for(int k = j; k<arr.length-1; k+=1) {
						int temp = arr[k];
						arr[k] = arr[k+1];
						arr[k+1] = temp;
					}
				}
				else {c += 1;}
			}
			if(c == 3) {System.out.println("������ ���� �����ϴ�.");}
				
			System.out.println(Arrays.toString(arr));
			System.out.println();			
		}
	}
}
