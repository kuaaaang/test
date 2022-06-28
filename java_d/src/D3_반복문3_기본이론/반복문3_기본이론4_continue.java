package D3_반복문3_기본이론;

import java.util.Scanner;

public class 반복문3_기본이론4_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [보조제어문 2종류] 
		  
		  	[2.continue]  
		  		- 반복문의 조건식으로 바로 이동한다. 
		  		- 보통 특별한조건이 만족하면 더이상 남은식을 실행시키고 싶지 않을 때 사용한다.
		        - continue 는 else 를 이용해서 충분히 사용하지않고도 식을 만들수가있다.
		        - continue 는 굳이 사용안해도된다.
		*/
		Scanner scan = new Scanner(System.in);
			int run = 1;
			while (run == 1) {
				System.out.println("1.햄버거");
				System.out.println("2.콜라");
				System.out.println("3.감자");

				int sel = scan.nextInt();

				if (sel != 1 && sel != 2 && sel != 3) {
					System.out.println("잘못된 입력입니다.");
					continue; // continue를 사용하지 않을 경우 밑에 식은  else로 이어주어야 한다.
				}			
				if (sel == 1) {
					System.out.println("햄버거");
				} else if (sel == 2) {
					System.out.println("콜라");
				} else if (sel == 3) {
					System.out.println("감자");
				}
			}
		scan.close();
	}
}
