package F2_���ڿ�2_�˰���;

import java.util.Arrays;

public class ���ڿ�2_�˰���_����ȯ5_split����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aaa/bbbb/ccc";
		
		String[] temp = str.split("/");
		
		// split�� �ڵ����� ���ڿ��� �迭�� ������ش�.
		// split�� ��������ʰ� ���� �߶� �迭�� �־��.

		//����) �����ڸ� �������� str �� ������ �߶󳻼� temp2 �迭�� ���� 
		
		String ������ = "/";
		String [] temp2 = null;
		
		int count = 0;
		for(int i = 0; i<str.length(); i+=1) {
			if(str.charAt(i) == '/') {
				count += 1;
			}
		}
		temp2 = new String[count+1];
		
		int a = 0;
		int b = 0;
		int index = 0;
		for(int i = 0; i<str.length(); i+=1) {
			if(str.charAt(i) == '/') {
				b = i;
				temp2[index] = str.substring(a , b);
				index += 1;
				a = b+1;
			}
		}
		temp2[index] = str.substring(a , str.length());
		
		System.out.println(Arrays.toString(temp2));
	}
}
