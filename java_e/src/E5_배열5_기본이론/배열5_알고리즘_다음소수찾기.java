package E5_배열5_기본이론;

import java.util.Scanner;

public class 배열5_알고리즘_다음소수찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [다음 소수 찾기]
		  1. 숫자를 한 개 입력받는다.
		  2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
		  
		  예) Enter Number ? 1000
		     1000보다 큰 첫번재 소수는 1009
		  예) Enter Number ? 500
		     500보다 큰 첫번째 소수는 503
		*/
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Enter Number ? ");
			int number = scan.nextInt();
			
			for(int i = number+1; i>number; i+=1) { // i = number로 할 경우, number가 소수면 number가 나옴
				int count = 0;
				for(int j = 1; j<=i; j+=1) { //j<=1; '=' 중요!
					if(i%j == 0) {count += 1;}
				}
				if(count == 2) {
					System.out.println(i);
					break;}
			}
			
		scan.close();	
	}
}
