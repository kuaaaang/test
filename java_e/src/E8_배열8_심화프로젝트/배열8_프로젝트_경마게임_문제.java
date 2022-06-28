package E8_배열8_심화프로젝트;

import java.util.Arrays;
import java.util.Random;

public class 배열8_프로젝트_경마게임_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [경마 게임]
		 [1] 5 * 20 의 배열이 있다.
		 [2] 각 줄은 말이 달릴 트랙을 의미한다.
		 [3] 매 턴당 랜덤으로 1~4칸의 거리를 이동할수있다.
		 [4] 말이 전부 도착하면 게임은 끝난다. 각말들의 순위를 출력한다. 
		 [5] 단, 말이 동시에 도착하면 등수는 같다. 
	   */
		int horse[][] = new int[5][20];
		Random ran = new Random();
		int h1 = 0;
		int h2 = 0;
		int h3 = 0;
		int h4 = 0;
		int h5 = 0;
		
		int win[][] = new int[5][20];
		int turn = 0;
		
		while(true) {
			turn += 1;
			
			int r1 = ran.nextInt(4)+1;
			int r2 = ran.nextInt(4)+1;
			int r3 = ran.nextInt(4)+1;
			int r4 = ran.nextInt(4)+1;
			int r5 = ran.nextInt(4)+1;
			
			for(int i = 0; i<horse.length; i+=1) {
				for(int j = 0; j<horse[i].length; j+=1) {
					if(horse[i][j] != 0) {horse[i][j] = 0;}
				}
			}
			
			h1 += r1;
			if(h1>=19) {h1 = 19;}
			horse[0][h1] = 1;
			
			h2 += r2;
			if(h2>=19) {h2 = 19;}
			horse[1][h2] = 2;
			
			h3 += r3;
			if(h3>=19) {h3 = 19;}
			horse[2][h3] = 3;
			
			h4 += r4;
			if(h4>=19) {h4 = 19;}
			horse[3][h4] = 4;
			
			h5 += r5;
			if(h5>=19) {h5 = 19;}
			horse[4][h5] = 5;
			
			for(int i = 0; i<horse.length; i+=1) {
				System.out.println(Arrays.toString(horse[i]));
			}
			System.out.println();
			
			int count = 0;
			for(int i = 0; i<horse.length; i+=1) {
				if(horse[i][19] > 0 ) {
					count += 1;
					win[i][turn] = i+1;
					for(int j = 0; j<turn; j+=1) {
						if(win[i][turn] == win[i][j]) {
							win[i][turn] = 0;
						}
					}
				}
			}
			
			if(count == 5) {break;}
		}
		
//		for(int k = 0; k<win.length; k+=1) {
//			System.out.println(Arrays.toString(win[k]));
//		}
		
		
		int count2 = 1;
		
		for(int m = 0; m<20; m+=1) {
			int count3 = 0;
			
			for(int l = 0; l<win.length; l+=1) {
				if(win[l][m] > 0) {
					count3 += 1;
					if(count3 > 1) {count2 -= 1;}
					System.out.println(count2 + "등 : " + win[l][m] + "번 말");
					count2 += 1;
				}
			}
		}
	}
}
