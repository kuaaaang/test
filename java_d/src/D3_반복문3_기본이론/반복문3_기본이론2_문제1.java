package D3_�ݺ���3_�⺻�̷�;

public class �ݺ���3_�⺻�̷�2_����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 for �� ����ؼ� Ǯ��� 		
		 ���� 1) 1���� 5���� ����Ͻÿ�.
		 ���� 1) 1, 2, 3, 4, 5
		 
		 ���� 2) 1���� 10���� �ݺ���, 5~9���� ����Ͻÿ�.
		 ���� 2) 5, 6, 7, 8, 9
		 
		 ���� 3) 1���� 10���� �ݺ��� 6~3���� ����Ͻÿ�.
		 ���� 3) 6, 5, 4, 3
		 
		 ���� 4) 1���� 10���� �ݺ��� 3�̸� 7�̻� ����Ͻÿ�.
		 ���� 4) 1, 2, 7, 8, 9, 10
	   */
		for(int i = 1; i <=5; i += 1) {System.out.println(i);}
		System.out.println("--------------------------------");
		
		for(int i = 1; i<=10; i += 1) {if(i>=5 && i<=9) {System.out.println(i);}}
		System.out.println("--------------------------------");
		
		for(int i = 10; i>=1; i -= 1) {if(i>=3 && i<=6) {System.out.println(i);}}
		System.out.println("--------------------------------");
		
		for(int i = 1; i<=10; i += 1) {if(i<3 || i>=7) {System.out.println(i);}}
		
		
		
	}
}
