package E4_�迭4_�˰���;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class �迭4_�˰���_���ھ߱� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  [���� �߱� ����]
		  1. me�� 1~9 ������ ���� 3���� ����
		     (��, �ߺ��Ǵ� ���ڴ� ���� �Ұ�)
		     ��) 1,1,1 
		  2. com�� me�� ���� ������ ���� ������ �ݺ�
		  3. ���ڿ� �ڸ��� ������ 		strike += 1
		     ���ڸ� ���� �ڸ��� Ʋ���� 	ball += 1
		  ��)
		  ���� : 1 7 3
		  3 1 5		: 2b
		  1 5 6		: 1s
		  ...
		*/
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		int[] com = {0, 0, 0};
		int[] me = new int[3];
		
		
		for(int i = 0; i<com.length;) {
			int r = ran.nextInt(9)+1;
			boolean check1 = false;
			
			for(int j = 0; j<com.length; j+=1) { // for�� ���� �ؾ� �ߺ��� ������ �� �ִ�.
				if(r == com[j]) {
					check1 = true;
				}		
			}
			if(check1 == false) {
				com[i] = r;
				i+=1; // �ߺ��� �ƴ� ���� Ȯ�� �Ŀ� �߰�, �� ���� for���� ���� ��� 0�� �����Ե�
			}
		}	
		
		System.out.println(Arrays.toString(com));
		
		while(true) {
			int count = 0;
			System.out.println("���ڸ� �Է��ϼ���[1~9]");
			while(true) {
				if(count == 3) {
					break;
				}
				int n = scan.nextInt();
				boolean check2 = false;
				for(int i = 0; i<count; i+=1) {
					if(n == me[i]) {
						check2 = true;
						break;
					}
				}
				if(n>0 && n<=9 && check2 == false) {
					me[count] = n;
					count += 1;
					System.out.println(Arrays.toString(me));
				}else if(n<=0 || n>9) {
					System.out.println("���ڸ� �ٽ� �Է��ϼ���.");
				}else {
					System.out.println("�ߺ� : " + n);
				}
			}
			
			System.out.println("-----------------------------");
			
			int s = 0;
			int b = 0;
			for(int i = 0; i<3; i+=1) {
				for(int j = 0; j<3; j+=1) {
					if(me[i] == com[j]) {
						if(i == j) {s += 1;}
						else {b += 1;}
					}
				}
			}
			System.out.println(Arrays.toString(me));
			System.out.println(s + "��Ʈ����ũ , " + b + "��");
			
			if(s == 3) {
				System.out.println("����!");
				break;
		    }
			
		}
		
		scan.close();
	}
}

