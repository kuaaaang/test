package E5_배열5_기본이론;

import java.util.Random;

public class 배열5_알고리즘_시험지나눠주기_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [시험지나눠주기]
		  
		  	아래 2차원배열은 3학년1반의 학생수를 표현한다.
		   	세로 4 가로 5의 총 학생수는 20명이고,
		   	각각의 값들은 각학생별 시험을보기위한 필요한 페이지 수이다. 
		   	학생마다 필요한 페이지수가 다르다. 	
		   	시험지를 나눠줄려고 한다. 인덱스위치 (0,0) 부터 나눠줄려고하는데	
			
		   	나눠주기 편하게하기위해서 지그재그로 나눠줄려고 한다. 		
			첫번째줄은 앞에서 부터 뒤로 이동한다. 3,1,5,4,1 
			두번째줄은 뒤에서 부터 앞으로 이동한다. 8,2,4,6,1
			다시 세번째줄은 앞에서부터 뒤로이동한다. 2,3,5,5,2 
			다시 네번째줄은 뒤에서부터 앞으로 이동한다. 2,1,7,1,6 
			  
			랜덤으로 학생수 1~20을 저장하고 , 각학생별 필요한 페이지수의 합을 출력한다.
			 예) 7 ==> {3 + 1 + 5 + 4 + 1} + {8 + 2}
			 예) 12 ==> {3 + 1 + 5 + 4 + 1} + {8 + 2 + 4 + 6 + 1} + {2 + 3}
		*/	
		    Random ran = new Random();
		
			int darr[][] = {
					{3,1,5,4,1},
					{1,6,4,2,8},
					{2,3,5,5,2},
					{6,1,7,1,2},
			};
		
			int r = ran.nextInt(20)+1;
			System.out.println(r);
			
			int a = 0;
			int count = 0;
			int total = 0;
			
			if(r%5 == 0) {
				count = r/5;
			}
			if(r%5 != 0) {
				count = (r/5)+1;
			}
			
			if(count == 1 || count == 3) {
				for(int i = 0; i<count; i+=1) {
					for(int j = 0; j<5; j+=1) {
						total += darr[i][j];
						a+=1;
						if(a==r) {break;}
					}
				}
			}
			
			if(count == 2 || count ==4) {
				for(int i = 0; i<count; i+=1) {
					for(int j = 4; j>=0; j-=1) {
						total += darr[i][j];
						a+=1;
						if(a==r) {break;}
					}
				}
			}
			
			System.out.println(total);
	}
}
