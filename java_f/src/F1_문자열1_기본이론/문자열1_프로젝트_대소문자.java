package F1_문자열1_기본이론;

import java.util.Scanner;

public class 문자열1_프로젝트_대소문자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		아이디와 비밀번호 입력받고 로그인출력 		
		조건) 단, 아이디와 비밀번호는 
		1) 대문자로 입력하던 , 
		2) 소문자로 입력하던 , 
		3) 섞어서 입력하던 전부 인식되어야한다.		
		*/
		Scanner scan = new Scanner(System.in);
		
		String dbid = "q1w2e3r4";
		String dbpw = "r4e3w2q1";
		
//		String str0 = "0123456789";
//		String str1 = "abcdefghijklmnopqrstuvwxyz";
//		String str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		boolean check = false;
	
		int t = 0;
		while(t==0) {
			System.out.println("아이디를 입력하세요.");
			String id = scan.next();
			System.out.println("비밀번호를 입력하세요.");
			String pw = scan.next();
			
			if(id.length() == dbid.length()) {
				int countid = 0;
				int countpw = 0;
				
				for(int i = 0; i<dbid.length(); i+=1) {
					int a = (int)dbid.charAt(i);
					int b = (int)id.charAt(i);
					//48-57
					if(dbid.charAt(i) == id.charAt(i)) {
						countid += 1;
					}else {
						if((a-32 == b) || (a+32 == b) && (a<48 && a>57) ) {
							countid += 1;
						}
						else {
							System.out.println("아이디 불일치");
							break;
						}
					}
					if(countid == dbid.length()) {
						//비밀번호 확인;
						for(int j = 0; j<dbpw.length(); j+=1) {
							int c = (int)dbpw.charAt(j);
							int d = (int)pw.charAt(j);
							
							if(dbpw.charAt(j) == pw.charAt(j)) {
								countpw += 1;
							}else {
								if((c-32 == d) || (c+32 == d) && (c<48 && c>57)) {
									countpw += 1;
								}
								else {
									System.out.println("비밀번호 불일치");
									break;
								}
							}
							if(countpw == dbpw.length()) {
								System.out.println("로그인 성공!");
								t = 1;
							}
						}
					}
				}
			}
			else{
				System.out.println("아이디 불일치");
			}
		}	
		scan.close();
	}
}
