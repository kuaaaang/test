package E1_�迭1_�⺻�̷�;

public class �迭1_�˰���_�簢����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	
		  [����] b �迭�� �Ʒ��Ͱ��� �簢�������������Ѵ�.
		  [��Ʈ] 3ĭ���� ���� �ٲ��ش�.

		   1 2 3
		   4 5 6
		   7 8 9  
        */
		int b [] = {1,2,3,4,5,6,7,8,9};
		
		for(int i = 0; i<9; i+=1) {
			System.out.print(b[i]);
			if(i%3==2) {System.out.println();}
		}
	}
}
