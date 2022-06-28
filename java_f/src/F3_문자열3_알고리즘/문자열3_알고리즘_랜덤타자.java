package F3_문자열3_알고리즘;

import java.util.Random;
import java.util.Scanner;

public class 문자열3_알고리즘_랜덤타자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  # 타자연습 게임[2단계]
		  1. 문제를 섞는다.(shuffle)
		  2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
		  3. 단 문제를 출제할 때, 단어의 랜덤한 위치 한 곳만 *로 출력
		  예)
		  문제 : mys*l
		  입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
		  문제 : *sp
		  입력 : jsp
		  ...
		*/
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		for(int i = 0; i<100; i+=1) {
			int r1 = ran.nextInt(4);
			int r2 = ran.nextInt(4);
			
			String temp = words[r1];
			words[r1] = words[r2];
			words[r2] = temp;;
		}
		
		int count = 0;
		while(true) {
			for(int i = 0; i<words.length;) {
				int r3 = ran.nextInt(words[i].length());
				int a = 0;
				System.out.println("문제 : " + words[i].substring(0,r3) + "*" + words[i].substring(r3+1));
				
				System.out.print("입력 : ");
				String ans = scan.nextLine();
				for(int j = 0; j<words[i].length(); j+=1) {
					if(words[i].charAt(j) == ans.charAt(j)) {
						a += 1;
					}
				}
				if(a == words[i].length()) {
					System.out.println("정답!");
					count += 1;
					i+=1;
				}
				else {
					System.out.println("오답!");
					while(true) {
						System.out.print("입력 : ");
						String answer = scan.nextLine();
						int b = 0;
						for(int j = 0; j<words[i].length(); j+=1) {
							if(words[i].charAt(j) == answer.charAt(j)) {
								b += 1;
							}
						}
						if(b == words[i].length()) {
							System.out.println("정답!");
							count += 1;
							i+=1;
							break;
						}
					}
				}
			}
			if(count == words.length) {
				System.out.println("게임종료!");
				break;
			}
		}
		
	}
}
