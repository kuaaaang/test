package E3_�迭3_�⺻�̷�;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class �迭3_������Ʈ_���°��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [���� ����]
		  
		  1. ���� ���ڰ� �����ִ� ī�� 2�徿 5��Ʈ���ִ�. (��10��)
		  2. front �� ī�带 ����� ���¸� ���Ѵ�. 
		  3. ���� front �� �����Ѵ�. 
		  4. front �� �ִ� ī�� 2���� �����Ѵ�. (���콺�������Ƿ� �ε����� ����)
		  5. ������ī�� 2���� ������ ������  back �� �����ؼ� ����� ǥ���Ѵ�. 
		     back�� ��� ���� �� ä������ ������ ����ȴ�.
		     
		   [����] ���� �ε��� �����Ҽ�����. 
		   
		   ��)
		   [1] �ʱ�ȭ 
		     front = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e' };
		     back  = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-' };
		  
		   [2] ���� 
		     front = {'a', 'e', 'c', 'b', 'd', 'c', 'b', 'd', 'a', 'e'};
		
		   [3] �ε��� �Է� 	   
		     1) �ε��� 2�� ==>  0 , 8  ==>front �迭�� �ε��� 0, �� 8 �� ����  a , a �� 
		                ���� ���� �����̹Ƿ� back �� ����
		     	back  =  {'a', '-', '-', '-', '-', '-', '-', '-', 'a', '-' };
		     	
		     2) �ε��� 2�� ==>  1 , 2  ==>front �迭�� �ε��� 1, �� 2�� ���� e , c �� 
		                ���� �ٸ������̹Ƿ� �ƹ��Ͼ���
		     	back  =  {'a', '-', '-', '-', '-', '-', '-', '-', 'a', '-' };	
		*/
		Random ran = new Random();
		Scanner scan =  new Scanner(System.in);
		
		char[] front = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e'};
		char[] back = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'};
		System.out.println(Arrays.toString(front));
		int count = front.length/2;
		
		for(int i = 0; i<1000; i+=1) {
			int r1 = ran.nextInt(9);
			int r2 = ran.nextInt(9);
			
			char temp = front[r1];
			front[r1] = front[r2];
			front[r2] = temp;
		}
		System.out.println(Arrays.toString(front));
		System.out.println("���� ����!");

		while(true) {
			System.out.println(Arrays.toString(back));
			if(count == 0) {
				System.out.println("����!");
				break;
			}else {
				System.out.println("�ڸ� 2���� �������ּ���.[0~9]");
				int a = scan.nextInt();
				int b = scan.nextInt();
				
				if(front[a] == front[b]) {
					System.out.println("����!");
					back[a] = front[a];
					back[b] = front[b];
					count -=1 ;
				}
				else{System.out.println("��");}
			}
		}
		
		scan.close();
	}
}
