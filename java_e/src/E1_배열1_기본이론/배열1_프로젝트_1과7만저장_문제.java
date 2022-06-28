package E1_배열1_기본이론;

import java.util.Random;

public class 배열1_프로젝트_1과7만저장_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [문제] a 배열안에 1 또는 7만 랜덤으로 저장후 출력. 
		  [예] 1,7,7,1,1,7,7
		  
		  [추가문제] [1 => 4개] [7 => 3개] 고정
		*/
		Random ran = new Random();
		int a [] = new int[7];
		
		for(int i = 0; i<7; i+=1) {
			int n1 = ran.nextInt(2);
			if(n1==0) {
				a[i] = 1;
			}
			else if(n1==1) {
				a[i] = 7;
			}	
		}
		for(int i = 0; i<7; i+=1) {
			System.out.println(a[i]);
		}
		
		System.out.println("-------------------------------------");
		
		int count = 0;
		int count1 = 0;
		int count7 = 0;	
		while(true) {
			int n2 = ran.nextInt(2);
			if(n2==0 && count1<4) {
				a[count] = 1;
				count+=1;
				count1+=1;
			}
			else if(n2==1 && count7<3) {
				a[count] = 7;
				count+=1;
				count7+=1;
			}
			if(count1==4 && count7==3) {
				break;
			}
		}	
		for(int i = 0; i<7; i+=1) {
			System.out.print(a[i]);
		}	
	}
}
