package F2_���ڿ�2_�˰���;

import java.util.Arrays;

public class ���ڿ�2_�˰���_����ȯ2_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����) �̸��� name�迭�� ������ score�迭�� ���� ���� �� ���
		
		String str = "��ö��/87,�̸���/42,�̿���/95";
				
		String[] name = new String[3]; // ��ö��,�̸���,�̿���
		int[] score = new int[3];      // 87,42,95
		
		int index = 0;
		String arr1[] = str.split(",");
		for(int i = 0; i<arr1.length; i+=1) {
			String arr2[] = arr1[i].split("/");
			for(int j = 0; j<arr2.length; j+=1) {
				name[index] = arr2[0];
				score[index] = Integer.parseInt(arr2[1]);
			}
			index += 1;
			if(index == 3) {break;}	
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
	}
}
