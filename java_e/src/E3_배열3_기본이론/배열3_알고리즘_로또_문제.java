package E3_�迭3_�⺻�̷�;

import java.util.Random;
import java.util.Arrays;

public class �迭3_�˰���_�ζ�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		    [����]
		  
		 	[�ζ�] 
			1~45������ ������ 6 ���� lotto1 �� �����ҷ��� �Ѵ�.
			[����] �ߺ��Ǵ¼��ڴ� ������Ѵ�. 
		*/
		Random ran = new Random();
		int lotto1[] = new int[6];
		boolean check[] = new boolean[45];
				
		int i = 0;
		int count = 0;
		while(true) {
			int r = ran.nextInt(45);
			if(check[i] == false) {
				lotto1[count] = r+1;
				count += 1;	
				i +=1;
			}if(count == 6) {break;}
		}
		
		System.out.println(Arrays.toString(lotto1));	
	}
}
