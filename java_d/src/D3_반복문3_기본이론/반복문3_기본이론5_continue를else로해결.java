package D3_반복문3_기본이론;

import java.util.Scanner;

public class 반복문3_기본이론5_continue를else로해결 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   continue 는 else 를 이용해서 충분히 사용하지않고도 식을 만들수가있다.
		   continue 는 굳이 사용안해도된다.
		*/	
		Scanner scan = new Scanner(System.in);
			boolean run = true;
			while (run) {
				System.out.println("1.햄버거");
				System.out.println("2.콜라");
				System.out.println("3.감자");

				int sel = scan.nextInt();

				if (sel != 1 && sel != 2 && sel != 3) {
					System.out.println("잘못된 입력입니다.");
				}
				else{
					if (sel == 1) {
						System.out.println("햄버거");
					} else if (sel == 2) {
						System.out.println("콜라");
					} else if (sel == 3) {
						System.out.println("감자");
					}
				}		
			}
		scan.close();
	}
}
