package F3_���ڿ�3_�˰���;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ���ڿ�3_�˰���_����ܾ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����) ����ܾ� ���߱�
		// ����ܾ ���� * �� ǥ�õȴ�.
		// ����ܾ �Է¹ް� Ʋ�������� �������� �ѱ��ھ� ��������. (������ 5���� ����)
		// (����) ���࿡ ���� ö�ڰ� �������� �ѹ��� ��������.
		// ���� �������ų� ���߸� ����
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int score = 100;
		String word = "performance";
		String meaning = "����";
		int check[] = new int[word.length()]; // ��Ʈ üũ�� ���ؼ� Ȯ���Ҽ��ִ�.
		
		int t = 0;
		while(t == 0) {
			System.out.println("�� : " + meaning);
			System.out.print("���� : ");
			for (int i = 0; i < word.length(); i++) {
				System.out.print("*");
			}
			System.out.println();
			System.out.println("����ܾ �Է��ϼ��� >>> ");
			String ans = scan.next();
			
			if(ans.length() == word.length()) {
				int count = 0;
				for(int j = 0; j < word.length(); j++) {
					if(word.charAt(j) == ans.charAt(j)) {
						count += 1;
					}
				}
				if(count == word.length()) {
					System.out.println("����!");
				}
				else {
					while (true) {
						score -= 5;
						if(score == 0) {
							System.out.println("����!");
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
							System.out.println("����!");
							break;
						}
						System.out.println("����ܾ �Է��ϼ��� >>> ");
						String answer = scan.next();
						int count2 = 0;
						for(int k = 0; k<word.length(); k+=1) {
							if(word.charAt(k) == answer.charAt(k)) {
								count2 += 1;
							}
						}
						if(count2 == word.length()) {
							System.out.println("����!");
							break;
						}
						else {continue;}
						
					}
				}
				System.out.println("���� : " + score);
				t = 1;
			}
			else {System.out.println("������ 11���� �Դϴ�. �ٽ� �Է��ϼ���.");}
		}
		scan.close();
	}
}
