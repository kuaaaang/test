package E7_�迭7_�⺻�̷�;

import java.util.Arrays;

public class �迭7_�⺻�̷�6_�⺻����2_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		  �Ʒ� classList�迭�� �ټ����� ���������� �����ѵ������̴�.
		  
		  ������ ������ ����������� ������ �� �̾Ƽ� win �迭�� ������ 
		  win �迭�� ��� ������ ����Ͻÿ�.
		*/
			int classList[][] = {
					 {10,54,65,22,15},
					 {65,14,24,75,25},
					 {50,45,25,87,49},
					 {11,66,5,21,95},
					 {70,84,64,21,11}
			};
		
			int total[] = new int[5];
			
			int win[][] = new int[3][];
			
			for(int i = 0; i<classList.length; i+=1) {
				int t = 0;
				for(int j = 0; j<classList[i].length; j+=1) {
					t += classList[i][j];
				}
				total[i] = t;
				System.out.println("class" + (i+1) + " ���� : " + t);
			}
			
			System.out.println("---------------------");
			System.out.println(Arrays.toString(total));
			System.out.println("---------------------");
			
			for(int i = 1; i<total.length; i+=1) {
				for(int j = 0; j<i; j+=1) {
					if(total[i]>total[j]) {
						int t = total[i];
						total[i] = total[j];
						total[j] = t;
					}
				}
			}
			System.out.println(Arrays.toString(total));
			System.out.println("---------------------");
			
			for(int i = 0; i<classList.length; i+=1) {
				int t2 = 0;
				for(int j = 0; j<classList[i].length; j+=1) {
					t2 += classList[i][j];
				}
				if(total[0] == t2) {win[0] = classList[i];}
				if(total[1] == t2) {win[1] = classList[i];}
				if(total[2] == t2) {win[2] = classList[i];}
			}
			
			for(int i = 0; i<win.length; i+=1) {
				System.out.println(Arrays.toString(win[i]));
			}
			
			
			
	}
}
