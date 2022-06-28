package D3_반복문3_기본이론;

import java.util.Random;
import java.util.Scanner;

public class 반복문3_프로젝트_랜덤구구단게임_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   [랜덤구구단 게임] (반복문사용)
		  1. 랜덤구구단 게임을 10회 반복한다.
		  2. 정답을 맞추면 1문제당 10점이다.
		  3. 게임 종료 후, 성적을 출력한다.
		  4. 단, 3번연속으로틀리면 즉시종료하며 0점이된다.
		*/
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int countx = 0;
		int combo = 0;
		
		while(true) {int a = ran.nextInt(9) + 1;
		             int b = ran.nextInt(9) + 1;
		             int c = a*b;
		             System.out.println(a + " X " + b + " = ?");
			         System.out.println("답을 입력하세요.");
		             int n = scan.nextInt();
		             
		             if(n == c) {System.out.println("정답!");
		                         System.out.println();
		            	         count = count + 1;
		            	         combo = 0;
		                         if(count + countx == 10) {System.out.println("게임 종료! 최종성적 : 정답" + (count) + "개 , 오답 : " + countx + "개" );
		                        	                       break;}
		                         }
		             else if(n != c) {System.out.println("오답!");
		                              System.out.println();
		                              countx = countx + 1;
		                              combo += 1;
		                              if(combo == 3) {System.out.println("3번 연속 오답! 게임을 종료합니다.");
		                                              break;}
		                              }
		             }
		scan.close();
	}
}
