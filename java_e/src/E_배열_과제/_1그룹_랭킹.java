package E_배열_과제;

import java.util.Arrays;

public class _1그룹_랭킹 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score[][] = {
				{1001, 20, 43, 54 , 0},
				{1002, 21, 73, 44 , 0},
				{1003, 65, 13, 55 , 0},
				{1004, 76, 63, 4 , 0},
		};		
		// 위 데이터는 학생 4명의 데이터이다.
		// 순서대로 [번호] , [국어] , [수학] , [영어] , [등수] 의 데이터이다. 		
		// 이제 등수를 넣어야한다. 각 과목별 등수별로 점수를 매기고 점수가 가장적은 학생이 1등이다. 
		/*
		 	1번학생은 국어 4등 , 수학3등 , 영어2등 으로 점수는 9점이다. 
		 	2번학생은 국어 3등 , 수학1등 , 영어3등 으로 점수는 7점이다.
		 	3번학생은 국어 2등 , 수학4등 , 영어1등 으로 점수는 7점이다.
		 	4번학생은 국어 1등 , 수학2등 , 영어4등 으로 점수는 7점이다.
		*/
		
		// 1등은 3명 , 4등은 1명이다. 아래와 같이 출력하면된다. 
		/*
				{1001, 20, 43, 54 , 4},
				{1002, 21, 73, 44 , 1},
				{1003, 65, 13, 55 , 1},
				{1004, 76, 63, 4 , 1},
		*/
		
		int rank[][] = new int[4][4];
		
		for(int i = 1; i<score.length; i+=1) {
			for(int j = 0; j<score.length; j+=1) {
				int count = 4;
				for(int k = 0; k<score.length; k+=1) {
					if(score[j][i]>score[k][i]) {
						count -=1;
					}
				}
				rank[j][i-1] = count;
			}
		}
		
		for(int i = 0; i<rank.length; i+=1) {
			int total = 0;
			for(int j = 0; j<rank.length-1; j+=1) {
				total += rank[i][j];
			}
			rank[i][3] = total;
//			System.out.println(Arrays.toString(rank[i]));
		}
		
		for(int i = 0; i<rank.length; i+=1) {
			int count = 1;
			for(int j = 0; j<rank.length; j+=1) {
				if(rank[i][3] > rank[j][3]) {
					count += 1;
				}
			} 
			score[i][4] = count;
		}
		
		for(int i = 0; i<score.length; i+=1) {
			System.out.println(Arrays.toString(score[i]));
		}
	}
}
