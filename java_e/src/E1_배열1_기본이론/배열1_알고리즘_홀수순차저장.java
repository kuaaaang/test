package E1_�迭1_�⺻�̷�;

public class �迭1_�˰���_Ȧ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [����1] ���� ����Ʈ�� �̿��ؼ� arr1 �� ���� Ȧ���� b �� ����(��ġ�� ��������ġ�� ����)
		  [��]   b = { 0, 49, 51, 0, 17 }
		  
		  [����2] ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����
		  [����] ��ġ�� �տ��� ���� �����Ѵ�. 
		  [��]   c = { 49, 51, 17, 0, 0 }
		*/
		int arr1[] = { 10, 49, 51, 36, 17 };	
		int b[] = { 0,0,0,0,0 };	
		int c[] = { 0,0,0,0,0 };
		
		for(int i = 0; i<5; i+=1) {
			if(arr1[i]%2==1) {
				b[i]=arr1[i];
			}
		}
		for(int i = 0; i<5; i+=1) {
			System.out.println(b[i]);
		}
		
		System.out.println("-----------------------------------");
		
		int count = 0;
		for(int i = 0; i<5; i+=1) {
			if(arr1[i]%2==1) {
				c[count]=arr1[i];
				count +=1;
			}
		}
		for(int i = 0; i<5; i+=1) {
			System.out.println(c[i]);
		}	
	}
}
