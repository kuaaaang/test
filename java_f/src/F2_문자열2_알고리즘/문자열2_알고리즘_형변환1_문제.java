package F2_���ڿ�2_�˰���;

import java.util.Arrays;

public class ���ڿ�2_�˰���_����ȯ1_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���ڿ� �Լ��� ����ؼ� Ǯ���
		
		String str = "11/100/89";
		// ���� 1) arr �迭�� �� ������ �����ϰ�, ���� ���
		// ���� 1) 200
		
		int[] arr = new int[3];
		String array[] = str.split("/");
		
		int total = 0;
		for(int i = 0; i<array.length; i+=1) {
			arr[i] = Integer.parseInt(array[i]);
			total += Integer.parseInt(array[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(total);
		
		System.out.println();
		
		// ���� 2) scores �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ����
		// ���� 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		
		for(int i = 0; i<scores.length; i+=1) {
			text += scores[i] + "/";
		}
		text = text.substring(0,text.length()-1);
		System.out.println(text);
	}
}
