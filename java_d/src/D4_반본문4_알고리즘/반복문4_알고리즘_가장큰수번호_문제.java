package D4_�ݺ���4_�˰���;

import java.util.Random;

public class �ݺ���4_�˰���_����ū����ȣ_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [����1] �ݺ����� ����Ͽ� �������� 1~9 �� 5������Ѵ�. 
		       1) ���������� ����ū���� ��ȣ�� ���
	             (��ȣ�� ��¼����̴�.)
		       2) ����ū���� �������ִٸ� ����ù��° ��ȣ�� ��� 
		      ��) 
		      		1, 7, 4, 7, 5 ==>   ����ū�� : 7 ,  ��ȣ : 2  
		         	����ū���� 2������ ù��°��ȣ�� ���

		  [����2] �ݺ����� ����Ͽ� �������� 1~9 �� 5������Ѵ�. 
		       1) ����������  ����ū���� ��ȣ�� ���
	             (��ȣ�� ��¼����̴�.)
		       2) ����ū���� �������ִٸ� ���帶���� ��ȣ�� ��� 
		      ��) 
		      		1, 7, 4, 7, 5 ==>   ����ū�� : 7 , ��ȣ : 4  
		      		����ū���� 2������ ������ ��ȣ�� ���
	   */
		Random ran = new Random();
		
		int count1 = 1;
		int max1 = 0;
		while(count1 <= 5 ) {int n1 = ran.nextInt(9)+1;
			                 System.out.println(n1);
		                     if(max1<n1) {max1=n1;
		                                 System.out.println("����ū�� : " + max1 + " , ��ȣ : " + count1);}
		                    count1 = count1 + 1;
		                    }
		
		System.out.println("-----------------------------");

		int count2 = 1;
		int max2 = 0;
		while(count2 <= 5) {int n2 = ran.nextInt(9)+1;
                            System.out.println(n2);
                            if(max2<=n2) {max2=n2;
                                          System.out.println("����ū�� : " + max2 + " , ��ȣ : " + count2);}
                            count2 = count2 + 1;
                            }
	}
}
