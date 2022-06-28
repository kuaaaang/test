package E2_배열2_기본이론;

import java.util.Scanner;

public class 배열2_알고리즘_영화예매 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  # 영화관 좌석예매
		  1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
		  2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
		  3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
		  4. 한 좌석당 예매 가격은 12000원이다.
		  5. 프로그램 종료 후, 해당 영화관의 총 금액을 출력한다.
		  예)
		  seat = 0 0 0 0 0 0 0
		  
		  좌석선택 : 1
		  seat = 0 1 0 0 0 0 0
		  
		  좌석선택 : 3
		  seat = 0 1 0 1 0 0 0
		  
		  좌석선택 : 3
		  seat = 0 1 0 1 0 0 0
		  이미 예매가 완료된 자리입니다.
		  ----------------------
		  총금액 : 24000원
		*/
		Scanner scan = new Scanner(System.in);
		
		int seat[] = { 0 , 0 , 0 , 0 , 0 , 0 , 0 };
		
		int count = 0;
		while(true) {
			System.out.println();
			System.out.println("===메가 영화관===");				
			System.out.println("1.좌석예매");
			System.out.println("2.구매");
			int n1 = scan.nextInt();
			
			if(n1==1) {
				System.out.println("좌석예매");
				System.out.println("좌석을 선택하세요.[0 ~ 6]");
				for(int i = 0; i < 7; i+=1) {
					System.out.print(seat[i] + " ");
				}
				System.out.println();
				int n2 = scan.nextInt();
				if(n2>=0 && n2<=6 && seat[n2]==0) {
					seat[n2] = 1;
					count = count + 1;
					
					for(int i = 0; i < 7; i+=1) {
						System.out.print(seat[i] + " ");
					}
				}
				else if(n2>=0 && n2<=6 && seat[n2]==1) {
					System.out.println("이미 선택된 좌석입니다.");
				}
				else if(n2<0 || n2>6){
					System.out.println("오류! 올바른 좌석 번호를 입력하세요.");
				}
			}
			
			else if(n1==2) {
				int total = 12000*count;
				System.out.println("총금액 : " + total + "원");
				break;
			}
			
			else {System.out.println("오류! 다시 입력하세요.");}
		}
	    scan.close();
	}
}
