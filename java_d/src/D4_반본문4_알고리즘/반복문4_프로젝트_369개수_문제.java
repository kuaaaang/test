package D4_반본문4_알고리즘;

import java.util.Scanner;

public class 반복문4_프로젝트_369개수_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [369게임]
			  1~ 10000 사이의 숫자를 입력받고 
			  3이나 6이나 9의  개수출력하시오.
		 
			  예) 9999 ==> 4
			  예) 36 ==> 2
			  예) 1 ==> 0
			  예) 222 ==> 0  
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.[1~10000]");
		int n = scan.nextInt();
		int 임시 = n;
		int count = 0;
	
		while(true) {int temp = 임시%10;
			         if(temp == 3 || temp == 6 || temp == 9) {count = count + 1;}
		             
			         임시 = 임시/10;
		             if(임시== 0) {break;}	            
		             }	            
		 if(n<=0 || n>10000) {System.out.println("숫자를 다시 입력하세요.");}
		 else {System.out.println(count + "개");}	
		 scan.close();
	}
}
