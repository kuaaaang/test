package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�����1_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  
	  	[����]
	   		12�� 15�� ������� �����ͺ��� ������� 5���� ��� 
	    */
		
		int count = 0;
		int a = 12;
		int b = 15;
		int num1 = a;
		int num2 = b;
		while(count<5) {if(num1>num2) {num2 += b;}
		                 else if(num2>num1) {num1 += a;}
		                 else if(num1==num2) {count = count + 1;
		                                      System.out.println(num1);
		                                      num1 += a;}
			             }
	}
}
		