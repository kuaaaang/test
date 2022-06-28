package E5_배열5_기본이론;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class 배열5_프로젝트_사다리_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  # 사다리 게임
		  1. 인덱스 0~4를 하나선택한다. (가로개수가 5개) 맨위 에서 부터 내려간다.
		  2. 숫자 0 을 만나면 그냥 아래로 내려간다.
		  3. 숫자 1 을 만나면 오른쪽으로 이동후 내려간다.
		  4. 숫자 2 를 만나면 완쪽으로 이동후 내려간다.
		  5. 오늘의 메뉴 출력 
		  [심화] 전부 0으로 가득채운후 사다리를 랜덤으로 배치해보자.
		*/
			Scanner scan = new Scanner(System.in);
			Random ran = new Random();
			String menu[] = {"떡라면" , "돈까스" ,"짜장면" , "쫄면" , "된장찌개"};
			
			int ladder[][]= {
					{0,0,0,0,0},
					{1,2,0,1,2},
					{0,1,2,0,0},
					{0,0,1,2,0},
					{1,2,0,1,2},
					{0,1,2,0,0},
					{0,1,2,0,0},
					{0,0,1,2,0},
					{0,0,0,0,0}};
			
			System.out.println("번호를 입력하세요.[0~4]");
			int n = scan.nextInt();
			
			for(int i = 0; i< ladder.length; i+=1) {
				if(ladder[i][n] == 1) {
					n += 1;
				}
				else if(ladder[i][n] == 2) {
					n -= 1;
				}
			}
			System.out.println(menu[n]);

			System.out.println("-----------------------------");
			
			int 사다리타기[][]= {
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0}};
			
			for(int i = 0; i<100; i+=1) { // 그냥 랜덤으로 할 경우 경로가 겹치게 됨. // 2개를 넘어가서 경로가 안겹치게 해야 함
				int r1 = ran.nextInt(7)+1; // 세로
				int r2 = ran.nextInt(5);   // 가로
				int r3 = ran.nextInt(3);   // 들어갈 숫자(0,1,2)
				
				if(r3==0) {
					사다리타기[r1][r2] = 0;
				}
				else if(r3==1 && r2 != 4) {
					사다리타기[r1][r2] = 1;				
				}
				else if(r3==2 && r2 != 0) {
					사다리타기[r1][r2] = 2;
				}
			}
			
			for(int i = 0; i<7; i+=1) {
				for(int j = 0; j<5; j+=1) {
					if(사다리타기[i][j] == 1 && j<=3) {
//						int r4 = ran.nextInt(2);
						사다리타기[i+1][j+1] = 0;
//						else if(r4 == 1) {사다리타기[i+1][j+1] = 1;}
					}
					else if(사다리타기[i][j] == 2 && j>=1) {
//						int r4 = ran.nextInt(2);
						사다리타기[i+1][j-1] = 0;
//						else if(r4 == 1) {사다리타기[i+1][j-1] = 2;}	
					}
				}
			}	
	
			for(int i = 0; i<사다리타기.length; i+=1) {
				System.out.println(Arrays.toString(사다리타기[i]));
			}
			
			scan.close();
	}
}
