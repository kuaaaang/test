package F3_���ڿ�3_�˰���;

import java.util.Random;
import java.util.Scanner;

public class ���ڿ�3_�˰���_����Ÿ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  # Ÿ�ڿ��� ����[2�ܰ�]
		  1. ������ ���´�.(shuffle)
		  2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
		  3. �� ������ ������ ��, �ܾ��� ������ ��ġ �� ���� *�� ���
		  ��)
		  ���� : mys*l
		  �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
		  ���� : *sp
		  �Է� : jsp
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
				System.out.println("���� : " + words[i].substring(0,r3) + "*" + words[i].substring(r3+1));
				
				System.out.print("�Է� : ");
				String ans = scan.nextLine();
				for(int j = 0; j<words[i].length(); j+=1) {
					if(words[i].charAt(j) == ans.charAt(j)) {
						a += 1;
					}
				}
				if(a == words[i].length()) {
					System.out.println("����!");
					count += 1;
					i+=1;
				}
				else {
					System.out.println("����!");
					while(true) {
						System.out.print("�Է� : ");
						String answer = scan.nextLine();
						int b = 0;
						for(int j = 0; j<words[i].length(); j+=1) {
							if(words[i].charAt(j) == answer.charAt(j)) {
								b += 1;
							}
						}
						if(b == words[i].length()) {
							System.out.println("����!");
							count += 1;
							i+=1;
							break;
						}
					}
				}
			}
			if(count == words.length) {
				System.out.println("��������!");
				break;
			}
		}
		
	}
}
