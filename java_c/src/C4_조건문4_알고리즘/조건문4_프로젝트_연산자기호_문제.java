package C4_���ǹ�4_�˰���;

import java.util.Random;
import java.util.Scanner;

public class ���ǹ�4_������Ʈ_�����ڱ�ȣ_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����] 
		  	[������ ��ȣ ���߱� ����]
		  1. 1~10 ������ ���� ���� 2���� a�� b�� ���� �����Ѵ�. ��) a = 3 , b = 4 
		  
		  2. 1~4 ������ ���� ���� 1���� op�� �����Ѵ�.  ��) op = 3
		  
		  3. op�� ����  ������ ��ȣ�� �ش�ȴ�. ��) op�ǰ��� 3�̸� ���ϱ� �̴�.
		  	  [1] + [2] - [3] * [4] % 
		  
		  4. ȭ�鿡 ���ڵΰ��� ���� ����Ѵ�.(��, ��ȣ�� ����ϸ�ȵȴ�.)
		     �׸��� �Ʒ� ������ ���⸦ ����Ѵ�.
		  ��) 
		  		3 ? 4  = 12
		     	[1] + [2] - [3] * [4] % 
		     
		  5. ����ڴ� ��ȣ�� ���߸�ȴ�. ��) 3 ==> ����
		     
		   �ƽ��Ե� ���� ������ ���ü��ִ�. ������ �����Ұ����ϰ�, ���Ŀ� ���������ϴ�. 
		*/
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int a = ran.nextInt(10) + 1;
		int b = ran.nextInt(10) + 1;
		int op = ran.nextInt(4) + 1;
		int �� = 0;
		
		if(op == 1) {�� = a+b;}
		else if(op == 2) {�� = a-b;}
		else if(op == 3) {�� = a*b;}
		else if(op == 4) {�� = a%b;}
		
		System.out.println(a + " ? " + b + " = " + ��);
	    System.out.println("������ �Է��ϼ���.");
	    System.out.println("[1] + [2] - [3] * [4] % ");
	    int n = scan.nextInt();
	    
	    if(n>4 || n<1){System.out.println("����!");}
	    else {if(n == op) {System.out.println("����!");}
	          else if(n != op) {System.out.println("����!");}
	         }
		
		scan.close();
	}
}
