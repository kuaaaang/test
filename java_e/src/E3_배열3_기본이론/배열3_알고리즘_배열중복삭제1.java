package E3_�迭3_�⺻�̷�;

import java.util.Arrays;
import java.util.Scanner;

public class �迭3_�˰���_�迭�ߺ�����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			 [����] ���� �Է¹ް� ���� 
			 [����] ���࿡ �������� ������ ������ ����ù��°�� ��  �Ѱ��� ���� �� b �� ���������� ���� 
			 
			 		  data[] = {5,2,6,8,5,6};
			 		  
			 [��] 2 ==>  b [] = {5,6,8,5,6,0};
			 [��] 6 ==>  b [] = {5,2,8,5,6,0};
		 */
		    Scanner scan = new Scanner(System.in);
		    
		    int data[] = {5,2,6,8,5,6};
			int b [] = {0,0,0,0,0,0};
			
			System.out.println("������ ���� �Է��ϼ���. [5,2,6,8,5,6]");
			int n = scan.nextInt(); 

			int j = -1;
			for(int i = 0; i<data.length; i+=1) {
				if(n == data[i]) {
					j = i;
					break;
				}
			}
			
			if(j == -1) {System.out.println("�Է��� ���ڰ� �������� �ʽ��ϴ�.");}
			else {
				int index = 0;
				for(int i = 0; i<data.length; i+=1) {
					if(i != j) {
						b[index] = data[i];
						index +=1;
					}
				}
			}
		
		System.out.println(Arrays.toString(b));
			
		scan.close();
	}
}
