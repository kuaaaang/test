package D4_반본문4_알고리즘;

import java.util.Scanner;

public class 반복문4_프로젝트_영수증_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [영수증 출력]
		  1. 5번 주문을 받는다.
		  2. 주문이 끝난 후, 돈을 입력받는다.
		  3. 각 메뉴별 주문수량과 총금액을 출력한다.
		  
		  예)
		  메뉴 선택 : 1
		  메뉴 선택 : 1
		  메뉴 선택 : 2
		  메뉴 선택 : 2
		  메뉴 선택 : 3
		  총 금액 = 31300원
		  현금 입력 : 32000
		  === 롯데리아 영수증 ===
		  1. 불고기 버거 : 2개
		  2. 새우  버거 : 2개
		  3. 콜     라 : 1개
		  4. 총  금  액 : 31300원
		  5. 잔     돈 : 700원
		*/
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;		
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		System.out.println(" === 롯데리아 메뉴 ===");
		System.out.println("1. 불고기 버거");
		System.out.println("2. 새우 버거");
		System.out.println("3. 콜  라");
		
		while(true){System.out.println("메뉴를 선택하세요.[1~3]");
		            int menu = scan.nextInt();
		            
		            if(menu == 1) {c1 = c1 + 1;}
		            else if(menu == 2) {c2 = c2 + 1;}
		            else if(menu == 3) {c3 = c3 + 1;}
		            else {System.out.println("메뉴를 다시 입력하세요.");}
		            if(c1+c2+c3 == 5) {break;}
		            }
		System.out.println("현금을 입력하세요.");
		int money = scan.nextInt();
		if(money < (c1*8700 + c2*6200 + c3*1500)) {System.out.println("현금이 부족합니다.");}
		System.out.println("=== 롯데리아 영수증 ===");
		System.out.println("1. 불고기 버거 : " + c1 + "개");
		System.out.println("2. 새우 버거 : " + c2 + "개");
		System.out.println("3. 콜  라 : " + c3 + "개");
		System.out.println("4. 총  금  액 : " + (c1*8700 + c2*6200 + c3*1500)  + "원");
		System.out.println("5. 잔     돈 : " + (money - (c1*8700 + c2*6200 + c3*1500)) + "원");
		
		scan.close();
	}
}
