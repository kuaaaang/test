package D6_반복문6_기본이론;

import java.util.Scanner;

public class 반복문6_기타이론6_뒤로가기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [뒤로가기]
		    쇼핑몰메인메뉴에서 남성의류를 선택후
		    뒤로가기 누르기전까지 남성의류 페이지를 유지할려고한다.
		  		
		  1. 남성의류
		  		1) 티셔츠
		  		2) 바지
		  		3) 뒤로가기
		  2. 여성의류
		  		1) 가디건
		  		2) 치마
		  		3) 뒤로가기
		  3. 종료
		*/
		Scanner scan = new Scanner(System.in);		
			boolean run = true;
			while(run) {
				
				System.out.println("1.남성의류");
				System.out.println("2.여성의류");
				System.out.println("0.종료");
				
				System.out.print("메뉴 선택 : ");
				int sel = scan.nextInt();			
				if(sel == 1) {		
					boolean run2 = true;
					while(run2) {
						System.out.println("1.티셔츠");
						System.out.println("2.바지");
						System.out.println("0.뒤로가기");
						System.out.print("메뉴 선택 : ");
						int sel2 = scan.nextInt();
						
						if(sel2 == 1) {
							System.out.println("티셔츠");
							
							
							
						}else if(sel2 == 2) {
							System.out.println("바지");
						}else if(sel2 == 0) {
							System.out.println("뒤로가기");
							run2 = false;
						}
						
					}
					
				}
				else if(sel == 2) {
					System.out.println("1)가디건");
					System.out.println("2)치마");
					System.out.println("0)뒤로가기");
				}
				else if(sel == 0) {				
					System.out.println("프로그램 종료");
					run = false;
				}
			}
	     scan.close();	
	}
}
