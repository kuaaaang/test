package D4_�ݺ���4_�˰���;

import java.util.Scanner;

public class �ݺ���4_������Ʈ_KEY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [Ű��ġ ã��] 
		  1. -1�� ���� ������ �Ϸ��� ���� �Է¹޴´�.
		  2. �� �� �� key ���� �� ��°�� ���ԵǾ� �ִ°��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		  3. ��, key�� ������ ���ԵǾ� ���� ��� �տ� ��Ÿ�� ���� ��ġ�� ����Ͻÿ�.
		  4. key�� �Ϸ��� �� �ȿ� ���� ��� "not found"�� ����Ͻÿ�.
		  
		  ��) 
		  result �� �Է� : 99
		  
		  �Է� : 10
		  �Է� : 99
		  �Է� : 20
		  �Է� : 99
		  �Է� : 30
		  �Է� : 99
		  �Է� : 10
		  �Է� : -1
		  
		  ��� : key�� 99�� ù���� ��Ÿ�� ���� 2��° �̴�.
		*/
		Scanner scan = new Scanner(System.in);
		
		int result = 99;
		int count = 0;
		int countx = 0;
		int i = 1;
		
		while(true) {System.out.println("key�� �Է� : ");
		             int key = scan.nextInt();
		             if(key == result) {count = i;}
		             if(key != result) {countx = countx + 1;}
		             
		             if(key == -1) {System.out.println("����");
		            		        break; 
		            		        }
		             
		             i +=1;
		             }
		if(countx != i) {System.out.println("key�� 99�� ù���� ��Ÿ�� ���� " + count + "��° �̴�.");}
 		if(countx == i) {System.out.println("not found");}
		
		scan.close();
	}
}
