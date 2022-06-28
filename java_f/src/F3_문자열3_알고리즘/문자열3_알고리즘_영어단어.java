package F3_문자열3_알고리즘;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 문자열3_알고리즘_영어단어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제) 영어단어 맞추기
		// 영어단어가 전부 * 로 표시된다.
		// 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
		// (조건) 만약에 같은 철자가 여러개면 한번에 벗겨진다.
		// 전부 벗겨지거나 맞추면 종료
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		int check[] = new int[word.length()]; // 힌트 체크를 통해서 확인할수있다.
		
		int t = 0;
		while(t == 0) {
			System.out.println("뜻 : " + meaning);
			System.out.print("문제 : ");
			for (int i = 0; i < word.length(); i++) {
				System.out.print("*");
			}
			System.out.println();
			System.out.println("영어단어를 입력하세요 >>> ");
			String ans = scan.next();
			
			if(ans.length() == word.length()) {
				int count = 0;
				for(int j = 0; j < word.length(); j++) {
					if(word.charAt(j) == ans.charAt(j)) {
						count += 1;
					}
				}
				if(count == word.length()) {
					System.out.println("정답!");
				}
				else {
					while (true) {
						score -= 5;
						if(score == 0) {
							System.out.println("종료!");
							break;
						}
						
						int a = 0;
						for(int k = 0; k<100; k+=1) {
							int r = ran.nextInt(word.length());
							if(check[r] == 0) {
								check[r] = 1;
								a = r;
								break;
							}
							
						}
						
						for(int k = 0; k<word.length(); k+=1) {
							if(word.charAt(a) == word.charAt(k)) {
								check[k] = 1;
							}
						}
						
						int count3 = 0;
						for(int k = 0; k<word.length(); k+=1) {
							if(check[k] == 0) {
								System.out.print("*");
							}
							else if(check[k] == 1) {
								System.out.print(word.charAt(k));
								count3 += 1;
							}
						}
						System.out.println();
						
						if(count3 == word.length()) {
							System.out.println("종료!");
							break;
						}
						System.out.println("영어단어를 입력하세요 >>> ");
						String answer = scan.next();
						int count2 = 0;
						for(int k = 0; k<word.length(); k+=1) {
							if(word.charAt(k) == answer.charAt(k)) {
								count2 += 1;
							}
						}
						if(count2 == word.length()) {
							System.out.println("정답!");
							break;
						}
						else {continue;}
						
					}
				}
				System.out.println("점수 : " + score);
				t = 1;
			}
			else {System.out.println("정답은 11글자 입니다. 다시 입력하세요.");}
		}
		scan.close();
	}
}
