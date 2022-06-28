package E5_배열5_기본이론;

import java.util.Scanner;

public class 배열5_알고리즘_소수여러개찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [소수여러개찾기]
		  정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
		  예)
		  입력 : 20
		  2, 3, 5, 7, 11, 13, 17, 19
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int n = scan.nextInt();
		
		for(int i = 1; i<=n; i+=1) {
			int count = 0;
			for(int j = 1; j<=n; j+=1) {
				if(i%j == 0) {count += 1;}
			}
			if(count == 2) {System.out.println(i);}
		}
		
		scan.close();
	}
}
