package E7_배열7_기본이론;

import java.util.Arrays;
import java.util.Scanner;

public class 배열7_프로젝트_식권자판기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [식권 자판기 프로그램]		
			1) 관리자   2) 사용자 
			관리자 ==> 1) 식권충전   2) 잔돈 충전 	 3)뒤로가기
			사용자 ==> 1) 구입 ==> ==> 입금 금액 입력 ==> 구매 매수 입력  ==> 잔돈출력 	
		    	     2)뒤로가기
			 조건 ) 예) 잔돈이 7600원이다. 5000원권이 없으면 1000원짜리 7장거슬러준다. 
			화면 
			 식권 가격 : 3200원 
			 식권 	  : ??매  (매진시 매진) 
			 50000원   : ?? 매  	// 10000원 : ?? 매	// 5000원 : ?? 매
			 1000원    : ?? 매   //  500원  : ?? 개	//  100원 : ?? 개 
	    */
		Scanner scan = new Scanner(System.in);
	
		int[] money   = {50000, 10000, 5000, 1000, 500, 100};
		int[] charges = {    1,     1,    1,    1,   5,  10};
		
		int tickets = 5;	// 식권 개수
		int price = 3200;	// 식권 가격
		int temp = 0;
			
		while(true) {
			System.out.println("1) 관리자   2) 사용자 ");
			System.out.print("메뉴 선택 : ");
			int n = scan.nextInt();
			
			if(n == 1) {
				while(true) {
					System.out.println("관리자");
					System.out.println("1) 식권충전   2) 잔돈 충전 	 3)뒤로가기");
					System.out.print("메뉴 선택 : ");
					int n1 = scan.nextInt();
					if(n1 == 1) {
						System.out.println("남은 식권 개수 : " + tickets + "매");
						System.out.println("충전할 식권 개수를 입력하세요.");
						int a = scan.nextInt();
						tickets += a;
					}
					else if(n1 == 2) {
						for(int i = 0; i<money.length; i+=1) {
							System.out.printf("%5d원 : %3d개" , money[i] , charges[i]);
							System.out.println();
						}
						System.out.println("충전할 잔돈을 입력하세요.");
						int b = scan.nextInt();
						
						if(b == 50000 || b == 10000 || b == 5000 || b == 1000 || b == 500 || b == 100) {
							for(int i = 0; i<money.length; i+=1) {
								if(money[i] == b){
									temp = i;
								}
							}
						}
						else {
							System.out.println("오류! 금액을 다시 입력하세요.");
							break;
						}
						
						System.out.println("충전할 잔돈 개수를 입력하세요.");
						int c = scan.nextInt();
						charges[temp] += c;
					}
					else if(n1 == 3) {break;}
					else {System.out.println("오류! 다시 입력하세요.");}
				}
			}
			
			else if(n == 2) {
				while(true) {
					System.out.println("사용자");
					System.out.println("1) 구입   2)뒤로가기");
					System.out.print("메뉴 선택 : ");
					int n2 = scan.nextInt();
					if(n2 == 1) {
						System.out.println("입금금액을 입력하세요.");
						int d = scan.nextInt();
						System.out.println("구매할 식권 개수를 입력하세요.");
						int e = scan.nextInt();
						if(e*3200>d) {
							System.out.println("잔액이 부족합니다.");
						    break;
						}
						else if(e*3200<=d) {
							System.out.println("구매한 식권 : " + e + "매");
							System.out.println("입금 급액 : " + d);
							System.out.println("총 구매 금액 : " + (e*3200));
							System.out.println("거스름돈 : " + (d-(e*3200)));
							int f = d-(e*3200);
							
							for(int i = 0; i<money.length; i+=1) {
								
								System.out.println(f);
								System.out.println(f/money[i]);
								
								if(f>=money[i]) {
									if(charges[i]<(f/money[i])) {
										System.out.println(money[i] + "원 : " + charges[i] + "개");
										f = f - (charges[i]*money[i]);
										charges[i] = 0;
									}
									else if(charges[i]>=(f/money[i])) {
										System.out.println(money[i] + "원 : " + (f/money[i]) + "개");
										charges[i] -= (f/money[i]);
										f = f - (money[i]*(f/money[i]));
									}
								}
								else if(f<money[i]) {
									continue;
								}
							}
							
						}
					}
					else if(n2 == 2) {break;}
					else {System.out.println("오류! 다시 입력하세요.");}			
				}
			}
			else {System.out.println("오류! 다시 입력하세요.");}
		}
//		scan.close();
	}
}
