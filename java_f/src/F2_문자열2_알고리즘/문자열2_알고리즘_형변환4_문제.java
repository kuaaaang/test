package F2_���ڿ�2_�˰���;

import java.util.Arrays;

public class ���ڿ�2_�˰���_����ȯ4_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "��ö��/87,�̸���/42,�̿���/95";
		
		// �� �����Ϳ��� �õ��� ������ �ٽ� ���ڿ��� ����
		
		//1) ���ڿ��� �߶� �迭�� �����Ѵ�.
		//2) �迭���� �õ��� �����Ѵ�
		//3) �����ѹ迭�� �ٽ� ���ڿ��� �����.
		
		// str = "��ö��/87,�̿���/95";
		
		String arr1[] = str.split(",");
		String name[] = new String[arr1.length];
		int score[] = new int[arr1.length];
		
		for(int i = 0; i<arr1.length; i+=1) {
			String arr2[] = arr1[i].split("/");
			name[i] = arr2[0];
			score[i] = Integer.parseInt(arr2[1]);
		}
		
//		System.out.println(Arrays.toString(name));
//		System.out.println(Arrays.toString(score));
		
		int a = 0;
		int min = 100;
		for(int i = 0; i<score.length; i+=1) {
			if(score[i]<min) {
				min = score[i];
				a = i;
			}
		}
		
		String text = "";
		for(int i = 0; i<arr1.length; i+=1) {
			if(i != a) {
				text = text + name[i] + "/" + score[i] + ",";
			}
		}
		
//		System.out.println(text);
		
		System.out.println(text.substring(0, text.length()-1));
	}
}
