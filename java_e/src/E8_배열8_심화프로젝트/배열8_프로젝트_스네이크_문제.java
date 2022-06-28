package E8_배열8_심화프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 배열8_프로젝트_스네이크_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [스네이크게임]
		  1. 10x10 배열을 0으로 채운다.
		  2. 스네이크는 1234로 표시한다.
		  3. 머리 상하좌우로 이동이 가능하며, 꼬리가 따라온다.
		  4. 자기몸하고 부딪히면, 사망한다.
		  5. 랜덤으로 아이템을 생성해
		     아이템을 먹으면 꼬리 1개가 자란다.
		  6. 꼬리는 최대 8개까지 증가할 수 있다.
		*/
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int arr[][] = new int [10][10];
		arr[0][3] = 1;
		arr[0][2] = 2;
		arr[0][1] = 3;
		arr[0][0] = 4;
		
		int count = 0;
		while(count<4) {
			int r1 = ran.nextInt(10);
			int r2 = ran.nextInt(10);
			if(arr[r1][r2] == 0) {
				arr[r1][r2] = 9;
				count += 1;
			}
			else {continue;}
		}
		
		int dir = 0; // 동: 0 서: 1 남: 2 북: 3 
		int y = 0;
		int x = 0;
		
		while(true) {
			for(int i = 0; i<arr.length; i+=1) {
				for(int j = 0; j<arr.length; j+=1) {
					if(arr[i][j] == 0) {System.out.print("[ ]");}
					else if(arr[i][j] == 1) {
						System.out.print("[★]");
						y = i;
						x = j;
					}
					else if(arr[i][j] == 9) {System.out.print("[♡]");}
					else {System.out.print("[■]");}
				}
				System.out.println();
			}
			System.out.println("1. ↑  2. ↓  3. ←  4. →");
			int n = scan.nextInt();
			
			if(n == 1) {
				if(y == 0) {continue;}
				else {
					int temp = arr[y][x];
					arr[y][x] = arr[y-1][x];
					arr[y-1][x] = temp;
					
//					if() {}
//					else if() {}
//					else if() {}
//					else if() {}
				}
			}
			else if(n == 2) {}
			else if(n == 3) {}
			else if(n == 4) {}
			else {System.out.println("다시 입력하세요.");}
		}
		
	}
}
