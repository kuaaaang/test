package D4_�ݺ���4_�˰���;

import java.util.Scanner;

public class �ݺ���4_������Ʈ_369����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [369����]
			  1~ 10000 ������ ���ڸ� �Է¹ް� 
			  3�̳� 6�̳� 9��  ��������Ͻÿ�.
		 
			  ��) 9999 ==> 4
			  ��) 36 ==> 2
			  ��) 1 ==> 0
			  ��) 222 ==> 0  
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.[1~10000]");
		int n = scan.nextInt();
		int �ӽ� = n;
		int count = 0;
	
		while(true) {int temp = �ӽ�%10;
			         if(temp == 3 || temp == 6 || temp == 9) {count = count + 1;}
		             
			         �ӽ� = �ӽ�/10;
		             if(�ӽ�== 0) {break;}	            
		             }	            
		 if(n<=0 || n>10000) {System.out.println("���ڸ� �ٽ� �Է��ϼ���.");}
		 else {System.out.println(count + "��");}	
		 scan.close();
	}
}
