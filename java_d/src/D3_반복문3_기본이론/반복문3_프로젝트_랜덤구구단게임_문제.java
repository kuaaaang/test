package D3_�ݺ���3_�⺻�̷�;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���3_������Ʈ_���������ܰ���_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   [���������� ����] (�ݺ������)
		  1. ���������� ������ 10ȸ �ݺ��Ѵ�.
		  2. ������ ���߸� 1������ 10���̴�.
		  3. ���� ���� ��, ������ ����Ѵ�.
		  4. ��, 3����������Ʋ���� ��������ϸ� 0���̵ȴ�.
		*/
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int countx = 0;
		int combo = 0;
		
		while(true) {int a = ran.nextInt(9) + 1;
		             int b = ran.nextInt(9) + 1;
		             int c = a*b;
		             System.out.println(a + " X " + b + " = ?");
			         System.out.println("���� �Է��ϼ���.");
		             int n = scan.nextInt();
		             
		             if(n == c) {System.out.println("����!");
		                         System.out.println();
		            	         count = count + 1;
		            	         combo = 0;
		                         if(count + countx == 10) {System.out.println("���� ����! �������� : ����" + (count) + "�� , ���� : " + countx + "��" );
		                        	                       break;}
		                         }
		             else if(n != c) {System.out.println("����!");
		                              System.out.println();
		                              countx = countx + 1;
		                              combo += 1;
		                              if(combo == 3) {System.out.println("3�� ���� ����! ������ �����մϴ�.");
		                                              break;}
		                              }
		             }
		scan.close();
	}
}
