package E7_�迭7_�⺻�̷�;

import java.util.Scanner;

public class �迭7_�˰���_����¡ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*
		   1~1000 ������ ���ڸ� �Է¹ް� ������ ���� ����Ͻÿ�.

		   �Է¹������� 
		  	1~10 ���� ���̸�  ==> 1
		   11~20 ���� ���̸� ==> 11 
		   21~30 ���� ���̸� ==> 21 
		   ......
		   
		   ��) 
		   	5 ==> 1
		   	24 ==> 21
		   	154 ==> 151 
		   	10 ==> 1
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.[1~1000]");
		int n = scan.nextInt();
		
		if(n<1 || n>1000) {System.out.println("����!");}
		else {
			if(n%10 != 0) {System.out.println(1 + (n/10*10));}
			else if(n%10 == 0) {System.out.println(1 + (((n/10)-1)*10));}
		}
	}
}
