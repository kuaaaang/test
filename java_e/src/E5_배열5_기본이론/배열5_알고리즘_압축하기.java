package E5_�迭5_�⺻�̷�;

import java.util.Arrays;

public class �迭5_�˰���_�����ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 �� �����ʹ� ������ �������̴�.
		 �������� �̷��� �����͸� ��� �����ҷ����Ѵ�.
		 ��) 33    ==> {3,2}
		 ��) 55555 ==> {5,5}
		 ��) 3     ==> {3,1};
		 ��) 444   ==> {4,3};
		  0���� �����Ұ� , 1���� ���ӵȰ��� 
		 ����) �� �����������͸� �м��� 2�������� �����Ͻÿ�.
	   */
		int ������[] = {3,3,5,5,5,5,5,3,4,4,4};		
		int ������[][] = new int[4][2];		
		
		int count = 0;
		
		������[count][0] = ������[0];
		������[count][1] = 1;
		
		for(int i = 1; i<������.length; i+=1) {
			if(������[count][0] == ������[i]) {
				������[count][1] += 1;
			}else {
				count += 1;
				������[count][0] = ������[i];
				������[count][1] = 1;
			}
		}
		
		for(int i = 0; i<������.length; i+=1) {
			System.out.println(Arrays.toString(������[i]));
		}
	}
}
