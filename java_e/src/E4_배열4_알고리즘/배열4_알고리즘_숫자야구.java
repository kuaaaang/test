package E4_배열4_알고리즘;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class 배열4_알고리즘_숫자야구 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  [숫자 야구 게임]
		  1. me에 1~9 사이의 숫자 3개를 저장
		     (단, 중복되는 숫자는 저장 불가)
		     예) 1,1,1 
		  2. com과 me를 비교해 정답을 맞출 때까지 반복
		  3. 숫자와 자리가 같으면 		strike += 1
		     숫자만 같고 자리가 틀리면 	ball += 1
		  예)
		  정답 : 1 7 3
		  3 1 5		: 2b
		  1 5 6		: 1s
		  ...
		*/
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		int[] com = {0, 0, 0};
		int[] me = new int[3];
		
		
		for(int i = 0; i<com.length;) {
			int r = ran.nextInt(9)+1;
			boolean check1 = false;
			
			for(int j = 0; j<com.length; j+=1) { // for문 으로 해야 중복을 방지할 수 있다.
				if(r == com[j]) {
					check1 = true;
				}		
			}
			if(check1 == false) {
				com[i] = r;
				i+=1; // 중복이 아닌 것으 확인 후에 추가, 맨 위에 for문에 넣을 경우 0이 나오게됨
			}
		}	
		
		System.out.println(Arrays.toString(com));
		
		while(true) {
			int count = 0;
			System.out.println("숫자를 입력하세요[1~9]");
			while(true) {
				if(count == 3) {
					break;
				}
				int n = scan.nextInt();
				boolean check2 = false;
				for(int i = 0; i<count; i+=1) {
					if(n == me[i]) {
						check2 = true;
						break;
					}
				}
				if(n>0 && n<=9 && check2 == false) {
					me[count] = n;
					count += 1;
					System.out.println(Arrays.toString(me));
				}else if(n<=0 || n>9) {
					System.out.println("숫자를 다시 입력하세요.");
				}else {
					System.out.println("중복 : " + n);
				}
			}
			
			System.out.println("-----------------------------");
			
			int s = 0;
			int b = 0;
			for(int i = 0; i<3; i+=1) {
				for(int j = 0; j<3; j+=1) {
					if(me[i] == com[j]) {
						if(i == j) {s += 1;}
						else {b += 1;}
					}
				}
			}
			System.out.println(Arrays.toString(me));
			System.out.println(s + "스트라이크 , " + b + "볼");
			
			if(s == 3) {
				System.out.println("종료!");
				break;
		    }
			
		}
		
		scan.close();
	}
}

