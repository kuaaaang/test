package E1_�迭1_�⺻�̷�;

public class �迭1_�˰���_�Ųٷ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  a = { 1,2,3,4,5 };
		  
		  [����] a �迭�� ���� b �迭�� �ϳ��� �����ϴµ� ������ �Ųٷ� ���� 
		  [��]   b = {5,4,3,2,1};
	    */
		int a[] = { 1,2,3,4,5 };
		int b[] = { 0,0,0,0,0 };
		
		int count = 4;
		
		for(int i = 0; i < 5; i+=1) {
			b[count] = a[i];
			count -= 1;
		}
		
		for(int i = 0; i < 5; i+=1) {
			System.out.println(b[i]);
		}
	}
}
