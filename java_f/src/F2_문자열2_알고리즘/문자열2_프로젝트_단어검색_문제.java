package F2_���ڿ�2_�˰���;

import java.util.Scanner;

public class ���ڿ�2_������Ʈ_�ܾ�˻�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  # �ܾ� �˻�
		  1. �ܾ �Է¹޾� text���� ���� �ӿ� �ش� �ܾ �ִ��� �˻��Ѵ�.
		  2. �ܾ �����ϸ� ��������Ѵ�.
		  3. �κа˻��� �Ǿ���Ѵ�. 
		  ��) ch ==> school , teacher , child
		*/
		Scanner scan = new Scanner(System.in);
			
		String[] text = {"school" , "teacher" , "child" ,"father" , "love"};
			
		System.out.print("�˻��� �ܾ �Է��ϼ��� : ");
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
