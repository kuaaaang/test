package F2_문자열2_알고리즘;

import java.util.Scanner;

public class 문자열2_프로젝트_단어검색_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  # 단어 검색
		  1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
		  2. 단어가 존재하면 전부출력한다.
		  3. 부분검색도 되어야한다. 
		  예) ch ==> school , teacher , child
		*/
		Scanner scan = new Scanner(System.in);
			
		String[] text = {"school" , "teacher" , "child" ,"father" , "love"};
			
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		int wordCount = 0;
		String[] wordList = new String[text.length];
		
		for(int i = 0; i<text.length; i+=1) {
			for(int j = 0; j<text[i].length()-word.length()+1; j+=1) {
				int count = 0;
				for(int k = 0; k<word.length(); k+=1) {
					if(text[i].charAt(j+k) == word.charAt(k)) {
						count += 1;
					}
				}
				if(count == word.length()) {
					wordList[wordCount] = text[i];
					wordCount += 1;
					break;
				}
			}
		}
		for(int i = 0; i<wordCount; i+=1) {
			System.out.println(wordList[i]);
		}
		scan.close();
	}
}
