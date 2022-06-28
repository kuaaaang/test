package D_테스트_연습;

import java.util.Random;
import java.util.Scanner;

public class 테스트0505_문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[홀짝게임]		  
			[1] 1~10사이의 숫자를 랜덤으로 저장한다.
		  	[2] 입력을 "홀"이면 1  , "짝"이면2 을 입력한다.  랜덤숫자를 맞춰보세요. [1.홀] [2.짝] 
		  	[3] 홀짝을 맞추는게임이다. 
		  	[4] 기본금은 3000원을 가지고시작한다. 정답을 맞추면 500원 이득을 보고,틀리면 1000원 손해를 본다.
		  	[5] 매게임이 끝날때마다 게임을 계속할지 종료할지 선택한다.  
		  	[6] 게임종료후 남은자금을 출력하시오.
	        [7] 돈이없으면 강제종료된다. 
	        [8] 치트키는 -100을 입력하면 정답을 보여준다. 
	    */
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int money = 3000;
		
		while(true) {
			int r = ran.nextInt(10)+1;
			System.out.println("   [홀짝 게임]   ");
			System.out.println(" [1.홀] [2.짝] ");
			int n = scan.nextInt();
			
			if(n == 1) {
				System.out.println("홀!");
				if(r%2 == 0) {
					System.out.println("숫자 : " + r);
					System.out.println("오답!");
					money -= 1000;
				}
				else if(r%2 == 1) {
					System.out.println("숫자 : " + r);
					System.out.println("정답!");
					money += 500;
				}
			}
			else if(n == 2) {
				System.out.println("짝!");
				if(r%2 == 0) {
					System.out.println("숫자 : " + r);
					System.out.println("정답!");
					money += 500;
				}
				else if(r%2 == 1) {
					System.out.println("숫자 : " + r);
					System.out.println("오답!");
					money -= 1000;
				}
			}
			else if(n == -100) {
				System.out.println("치트!");
				System.out.println("숫자 : " + r);
			}
			
			System.out.println("현재 금액 : " + money);
			System.out.println();
			System.out.println("[1.계속] [2.종료]");
			int n2 = scan.nextInt();
			if(n2 == 1) {
				continue;
			}
			else if(n2 ==2) {
				System.out.println("종료");
				break;
			}

			if(money<0) {
				System.out.println("파산");
				break;
			}
		}
    	scan.close();
	}
}
