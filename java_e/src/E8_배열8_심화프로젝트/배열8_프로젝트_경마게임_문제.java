package E8_�迭8_��ȭ������Ʈ;

import java.util.Arrays;
import java.util.Random;

public class �迭8_������Ʈ_�渶����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [�渶 ����]
		 [1] 5 * 20 �� �迭�� �ִ�.
		 [2] �� ���� ���� �޸� Ʈ���� �ǹ��Ѵ�.
		 [3] �� �ϴ� �������� 1~4ĭ�� �Ÿ��� �̵��Ҽ��ִ�.
		 [4] ���� ���� �����ϸ� ������ ������. �������� ������ ����Ѵ�. 
		 [5] ��, ���� ���ÿ� �����ϸ� ����� ����. 
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
					System.out.println(count2 + "�� : " + win[l][m] + "�� ��");
					count2 += 1;
				}
			}
		}
	}
}
