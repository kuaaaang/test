package C4_조건문4_알고리즘;

import java.util.Random;
import java.util.Scanner;

public class 조건문4_프로젝트_연산자기호_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제] 
		  	[연산자 기호 맞추기 게임]
		  1. 1~10 사이의 랜덤 숫자 2개를 a와 b에 각각 저장한다. 예) a = 3 , b = 4 
		  
		  2. 1~4 사이의 랜덤 숫자 1개를 op에 저장한다.  예) op = 3
		  
		  3. op의 값은  연산자 기호에 해당된다. 예) op의값이 3이면 곱하기 이다.
		  	  [1] + [2] - [3] * [4] % 
		  
		  4. 화면에 숫자두개와 답을 출력한다.(단, 기호는 출력하면안된다.)
		     그리고 아래 선택할 보기를 출력한다.
		  예) 
		  		3 ? 4  = 12
		     	[1] + [2] - [3] * [4] % 
		     
		  5. 사용자는 기호를 맞추면된다. 예) 3 ==> 정답
		     
		   아쉽게도 답이 여러개 나올수있다. 아직은 수정불가능하고, 추후에 수정가능하다. 
		*/
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int a = ran.nextInt(10) + 1;
		int b = ran.nextInt(10) + 1;
		int op = ran.nextInt(4) + 1;
		int 답 = 0;
		
		if(op == 1) {답 = a+b;}
		else if(op == 2) {답 = a-b;}
		else if(op == 3) {답 = a*b;}
		else if(op == 4) {답 = a%b;}
		
		System.out.println(a + " ? " + b + " = " + 답);
	    System.out.println("정답을 입력하세요.");
	    System.out.println("[1] + [2] - [3] * [4] % ");
	    int n = scan.nextInt();
	    
	    if(n>4 || n<1){System.out.println("오류!");}
	    else {if(n == op) {System.out.println("정답!");}
	          else if(n != op) {System.out.println("오답!");}
	         }
		
		scan.close();
	}
}
