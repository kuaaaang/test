package F1_문자열1_기본이론;

import java.util.Scanner;

public class 문자열1_알고리즘_문자열비교_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  # 문자열 비교
		  . equals() 메서드 사용없이 equals 직접구현 문자의 일치여부 비교
		  예)
		  코끼리
		  입력 = 티라노사우루스
		  출력 = false
		*/
		Scanner scan = new Scanner(System.in);
			
		String name = "코끼리";
			
		System.out.print("동물 이름을 입력하세요 : ");	// ex) 티라노사우루스
		String myName = scan.next();
		
		if(name.length() == myName.length()) {
			int count = 0;
			for(int i = 0; i<name.length(); i+=1){
				if(name.charAt(i) == myName.charAt(i)) {
					count += 1;
				}
			}
			if(count == name.length()) {System.out.println("일치");}
			else {System.out.println("불일치");}
		}
		else {System.out.println("불일치");}
		
//		if(name.length() == myName.length()) {
//			boolean check = false;
//			for(int i = 0; i < name.length(); i++) {
//				if(name.charAt(i) != myName.charAt(i)) {
//					check = true;
//					break;
//				}
//			}
//			if(check == true) {
//				System.out.println("땡");
//			}else {
//				System.out.println("정답");
//			}
//	
//		}else {
//			System.out.println("땡");
//		}
			
	}
}
