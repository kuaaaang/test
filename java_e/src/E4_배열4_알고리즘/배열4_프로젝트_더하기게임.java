package E4_배열4_알고리즘;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class 배열4_프로젝트_더하기게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [더하기게임]	
			1) 1~10 사이의 숫자를 랜덤으로 7개보여준다. (중복금지)
			2) 그안에서 3개의 인덱스를 고를수있게해준다. (중복금지)
			3) 숫자를 랜덤 으로 하나 제시하는데  인덱스3개의 값의 합이
			   제시된 숫자랑 같으면 정답. 
			   단, 정답은 여러개 일수있다. 
			4) 반드시 정답의 경우의 수는 있어야한다.	 
			   단! 중복으로 값을 고를순없다. 
			 [예]
			    보기  = {1,5,8,6,4,2,9};
			    제시어 = 13	
			    정답) 인덱스 ==> 0,2,4  ==>  1 + 8 + 4	
			 
			    잘못된예) 인덱스 ==> 5,5,6 ==> 2 + 2 + 9
	    */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int a[] = new int[10];
		int b[] = new int[7];
		for(int i = 0; i<a.length; i+=1) {
			a[i] += i + 1;
		}
		for(int i = 0; i<1000; i+=1) {
			int r1 = ran.nextInt(a.length);
			int r2 = ran.nextInt(a.length);
			int temp = a[r1];
			a[r1] = a[r2];
			a[r2] = temp;
		}
		System.out.println(Arrays.toString(a));
		
		for(int i = 0; i<7; i+=1) {
			b[i] = a[i];
		}
		
		System.out.println(Arrays.toString(b));
		int c[] = new int[3];	
		for(int i = 0; i<c.length;) {
			int r = ran.nextInt(7);
			boolean check = false;
			for(int j = 0; j<i; j+=1) {
				if(c[j] == r) {
					check = true;
				}
				
			}
			if(check == false) {
				c[i] = r;
				i += 1;
			}
		}
		System.out.println(Arrays.toString(c));
		int total = 0;
		for(int i = 0; i<c.length; i+=1) {
			total += b[c[i]];
		}
		System.out.println(total);
		
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println();
		
		while(true) {
			int me[] = new int[3];
			System.out.println(Arrays.toString(b));
			System.out.println(total);
			System.out.println("[문제] 인덱스를 3개 고르세요.");
			
			int count = 0;
			for(int i = 0; i<me.length;) {		
				int n  = scan.nextInt();
				boolean check = false;
				
				for(int j = 0; j<me.length; j+=1) {
					if(n == me[j]) {
						check = true;
						System.out.println("이미 선택한 숫자입니다.");}
				}
				if(check == false) {
					me[i] = n;
					i += 1;
					check = true;
				}	
			}
			int metotal = 0;
			for(int i = 0; i<me.length; i+=1) {
				metotal += b[me[i]];
			}
			if(metotal == total) {
				System.out.println("정답");
				break;
			}else {System.out.println("오답");}
		}
	}
}
