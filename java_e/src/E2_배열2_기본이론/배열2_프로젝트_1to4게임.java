package E2_배열2_기본이론;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class 배열2_프로젝트_1to4게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [문제]
		  
		  [1to4 게임]
		  
		  [1] arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
		  [2] 사용자는 가장작은수1부터 순서대로 해당 방번호(인덱스)을 입력한다.
		  [3] 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
		  
		  [예]
		  
		  시작 : { 4 2 3 1 }
		  
		  인덱스 입력 : 3  ==> { 4 2 3 9 } ==> 1은 가장작은수이므로 9로 변경한다.
		  
		  인덱스 입력 : 0 ==>  { 4 2 3 9 }  ==> 4는 가장작은수가아니므로 변화가없다.
	    */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		boolean check[] = new boolean[4];
		int arr[] = new int[4];
		
		int i = 0;
		while(true) {
			int r = ran.nextInt(4);
			if(check[r] == false) {
				check[r] = true;
				arr[i] = r;
				i+=1;
			}
			if(i == 4) {break;}
		}
		for(int i1 = 0; i1 < 4; i1+=1) {
			arr[i1] += 1;
		}
		
		int count = 1;
		while(true) {
			System.out.println(Arrays.toString(arr));
			if(count > 4) {break;}
			
			System.out.println("가장 작은 숫자의 위치를 선택하세요.[0 ~ 3]");
			int n = scan.nextInt();
			if(arr[n] == count) {
				count = count + 1;
				arr[n] = 9;
			}
		}
	scan.close();	
	}
}
