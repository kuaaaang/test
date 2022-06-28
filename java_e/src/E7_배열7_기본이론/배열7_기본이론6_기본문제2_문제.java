package E7_배열7_기본이론;

import java.util.Arrays;

public class 배열7_기본이론6_기본문제2_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		  아래 classList배열은 다섯반의 시험점수를 저장한데이터이다.
		  
		  각반의 총점이 높은순서대로 세반을 을 뽑아서 win 배열에 저장후 
		  win 배열의 모든 내용을 출력하시오.
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
				System.out.println("class" + (i+1) + " 총점 : " + t);
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
