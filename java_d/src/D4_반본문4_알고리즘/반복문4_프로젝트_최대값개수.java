package D4_�ݺ���4_�˰���;

import java.util.Random;

public class �ݺ���4_������Ʈ_�ִ밪���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����] 
		  �������� 1~10 �� 10������ϰ� , 
		  ����ū���� ������ ���°�� �ߺ���µ� Ƚ������Ͻÿ�.
		*/
		Random ran = new Random();
		
		int count = 1;
		int maxcount = 0;
		int max = 0;
		while(count <=10) {int n = ran.nextInt(10) + 1;
		                   System.out.println(n);
        
		                   if(max<n) {max = n;
		                              maxcount = 1;
		                              }
		                   else if(max == n) {maxcount = maxcount + 1;}
		
		                   count = count + 1;
             	           }
		System.out.println("�ִ밪 : " + max + " , �ߺ� : " + maxcount + "��");
	}	
}
