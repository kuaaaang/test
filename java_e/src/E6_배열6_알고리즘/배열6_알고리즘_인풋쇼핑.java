package E6_�迭6_�˰���;

import java.util.Arrays;

public class �迭6_�˰���_��ǲ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 nameList �迭�� ��ǰ�̸�����Ʈ , 
		 dataList 2�����迭�� ���� ���� , ��ǰ���� ����Ʈ����̴� .		
		��) ���� ���� ������� 3�� , ���ڱ� 1�� , ���� 1�� �ִ�.			
		 �Ʒ� �迭�� ���� �ֹ��� ���¼����̴�.
		 �Ѹ����� ����غ�����.	
		
		
		��) ù��° 1 ==> ���ڱ��� ������ 1�̹Ƿ� �Ǹ��Ҽ��ִ�.
		��) �ι�° 2 ==> ������ ������ 1�̹Ƿ� �Ǹ��Ҽ��ִ�.
		��) ����° 2 ==> ������ ������ �̹� �ι�°���� �����ؼ� 0�̵ǹǷ� �ǸźҰ�.
		   ....
		   .... 		
		 �ֹ��� ��  ����� 2�� , ���ڱ� 3�� , ���� 3�� �������� ,
		 ���� �Ǹ��� ǰ����  ����� 2�� , ���ڱ� 1�� , ���� 1�� �̴�.
	   */
		String titleList[] = {"�����" , "���ڱ�" , "����"};
		int dataList[][] = {
				{1000, 3},
				{2300, 1},
				{3100, 1}
		};
		int [] input = {1,2,2,0,0,2,1,1};
		
		int total = 0;
		for(int i = 0; i<input.length; i+=1) {
			System.out.println(Arrays.toString(titleList));
			if(dataList[input[i]][1]>0) {
				System.out.println(titleList[input[i]] + "�ǸſϷ�");
				dataList[input[i]][1] -= 1;
				total = total + dataList[input[i]][0];
				System.out.println("���� ��� : " + dataList[input[i]][1]);
			}
			else if(dataList[input[i]][1]==0) {
				System.out.println(titleList[input[i]] + "ǰ��");
				System.out.println("�Ǹ��� �� �����ϴ�.");
			}
		}
		System.out.println("�� ���� : " + total);
		
		
	}
}
