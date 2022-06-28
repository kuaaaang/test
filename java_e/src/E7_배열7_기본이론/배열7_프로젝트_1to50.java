package E7_배열7_기본이론;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열7_프로젝트_1to50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		  [1 to 50]
		  1. 구글에서 1 to 50 이라고 검색한다.
		  2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
		  3. 비슷하게 만들기 
		*/
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int game[] = new int [50];
		int temp[][] = new int[5][10];
		boolean[] check = new boolean[50];
		
		int i = 0;
		while(true) {
			int r = ran.nextInt(50)+1;
			if(check[r-1] == false) {
				game[i] = r;
				check[r-1] = true;
				i+=1;
			}
			if(i == 50) {break;}
		}
		
//		System.out.println(Arrays.toString(game));
		
		int c = 0;
		for(int j = 0; j<5; j+=1) {
				for(int k = 0; k<10; k+=1) {
					temp[j][k] = game[c];
					c+=1;
				}
		}
		for(int l = 0; l<temp.length; l+=1) {
			for(int m = 0; m<temp[l].length; m+=1) {
				System.out.printf("[%2d]" , temp[l][m]);		
			}
			System.out.println();
		}
		
		int a = 1;
		while(true) {
			System.out.println("숫자를 1~50까지 순서대로 위치를 입력하세요.");
			System.out.println("행");
			int x = scan.nextInt();
			System.out.println("열");
			int y = scan.nextInt();
			if(temp[y][x] == a) {
				temp[y][x] = 0;
				a += 1;
			}
			else {System.out.println("위치를 다시 확인해주세요. 찾을 숫자 : " + a);}
			
			for(int l = 0; l<temp.length; l+=1) {
				for(int m = 0; m<temp[l].length; m+=1) {
					System.out.printf("[%2d]" , temp[l][m]);		
				}
				System.out.println();
			}
			int count = 0;
			for(int l = 0; l<temp.length; l+=1) {
				for(int m = 0; m<temp[l].length; m+=1) {
					if(temp[l][m] == 0) {count += 1;}
				}
			}
			if(count == 50) {
				System.out.println("게임종료!");
				break;
			}
		}
	}
}
