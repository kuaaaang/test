package E5_�迭5_�⺻�̷�;

public class �迭5_�˰���_�׷��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	  	scoreList[] = {31, 76, 54, 2, 100, 23};
	  
		�� �����ʹ� �л� 6���� �����̴�.	
		�� �����͸� �׷����� ǥ���غ������Ѵ�.		
		 ǥ�ô� 10�� �ڸ����ڷ� ǥ���ؼ� ������ŭ  * �� ����ҷ����Ѵ�.		
		��)
		 31  ==> ***
		 76  ==> *******
		 54  ==> *****
		 2   ==> 
		 100 ==> **********
		 23  ==> **
		 */
		int scoreList[] = {31, 76, 54, 2, 100, 23};
		
		int count = 0;
		for(int i = 0; i<scoreList.length; i+=1) {
			int n = scoreList[i]/10;
			
			if(n == 0) {
				count = 0;
				System.out.print(scoreList[i] + " ==> ");
				System.out.print(" ");
			}
			if(n != 0) {
				count = n;
				System.out.print(scoreList[i] + " ==> ");
				for(int k = 0; k<count; k += 1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
