package F1_���ڿ�1_�⺻�̷�;

import java.util.Arrays;

public class ���ڿ�1_�⺻�̷�8_���ڿ��迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] test = {"aaa" , "bbb" , "ccc"};
		System.out.println(Arrays.toString(test));
		
		
		// String �� �迭�� ���鶧 new �� ����ԵǸ� null �� �ʱ�ȭ �Ǿ��ִ�.
		String [] temp = new String[3];		
		System.out.println(Arrays.toString(temp));
		
		//null + "test" = "nelltest"
		temp[0] = temp[0] + "test";
		System.out.println(temp[0]);
		
		for(int i = 0; i < temp.length; i++) {
			temp[i] = "";
		}
		System.out.println(Arrays.toString(temp));
	}
}
