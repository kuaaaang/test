package E7_배열7_기본이론;

import java.util.Arrays;

public class 배열7_기본이론5_기본문제1_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		  아래 class1~5 배열은 각반의 시험점수를 저장한데이터이다.
		  
		  각반의 총점이 높은순서대로 세반을 을 뽑아서 win 배열에 저장후 
		  win 배열의 모든 내용을 출력하시오.  
		*/
			int class1[] = {10,54,65,22,15};
			int class2[] = {65,14,24,75,25};
			int class3[] = {50,45,25,87,49};
			int class4[] = {11,66,5,21,95};
			int class5[] = {70,84,64,21,11};
		
			int temp[][] = new int[5][];
			temp[0] = class1;
			temp[1] = class2;
			temp[2] = class3;
			temp[3] = class4;
			temp[4] = class5;
			
			int total[] = new int[5];
			
			int win[][] = new int[3][];
			
			int max1 = 0;
			int max2 = 0;
			int max3 = 0;
			
			for(int i = 0; i<5; i+=1) {
				int t = 0;
				for(int j = 0; j<class1.length; j+=1) {
					t += temp[i][j];
				}
				total[i] = t;
				System.out.println("class" + (i+1) + " 총점 : " + t);
			}
			
			System.out.println("---------------------");
			System.out.println(Arrays.toString(total));
			System.out.println("---------------------");
			
			for(int i = 1; i<total.length; i+=1) {
				for(int j = 0; j<i; j+=1) {
					if(total[i]>total[j]) {
						int a = total[i];
						total[i] = total[j];
						total[j] = a;
					}
				}
			}
			System.out.println(Arrays.toString(total));
			System.out.println("---------------------");
			
			for(int i = 0; i<5; i+=1) {
				int t2 = 0;
				for(int j = 0; j<class1.length; j+=1) {
					t2 += temp[i][j];
				}
				if(total[0] == t2) {win[0] = temp[i];}
				if(total[1] == t2) {win[1] = temp[i];}
				if(total[2] == t2) {win[2] = temp[i];}
			}
			
			for(int i = 0; i<win.length; i+=1) {
				System.out.println(Arrays.toString(win[i]));
			}
	}
}
