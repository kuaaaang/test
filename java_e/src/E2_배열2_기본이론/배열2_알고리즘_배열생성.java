package E2_�迭2_�⺻�̷�;

public class �迭2_�˰���_�迭���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [����]
		    [4�� ����� ����]
		  - [����1] arr �迭���� 4�� ����� ��� temp �迭�� ����
		  - ��! temp �� ���̸� 4�� ����� ���� ��ŭ�� �����Ѵ�.
		  - ��) 4�ǹ�� ������ 3���̹Ƿ� temp = new int[3];  
	    */
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		
		int count = 0;
		for(int i = 0; i<5; i+=1) {
			if(arr[i]%4==0) {count +=1;}
		}
		System.out.println("temp�� ���� : " + count);
		
		temp = new int[count];
		
		int i1 = 0;
		for(int i = 0; i<5; i+=1) {
			if(arr[i]%4==0) {
				temp[i1] = arr[i];
				i1+=1;
			}
		}
		
		for(int i = 0; i<temp.length; i+=1) {
			System.out.print(temp[i] + "  ");
		}
		
		
	}
}
