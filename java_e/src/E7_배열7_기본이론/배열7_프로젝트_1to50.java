package E7_�迭7_�⺻�̷�;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭7_������Ʈ_1to50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		  [1 to 50]
		  1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
		  2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
		  3. ����ϰ� ����� 
		*/
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int game[] = new int [50];
		int temp[][] = new int[5][10];
		boolean[] check = new boolean[50];
		
		int i = 0;
		while(true) {
			int r = ran.nextInt(50)+1;
			if(check[r-1] == false) {
				game[i] = r;
				check[r-1] = true;
				i+=1;
			}
			if(i == 50) {break;}
		}
		
//		System.out.println(Arrays.toString(game));
		
		int c = 0;
		for(int j = 0; j<5; j+=1) {
				for(int k = 0; k<10; k+=1) {
					temp[j][k] = game[c];
					c+=1;
				}
		}
		for(int l = 0; l<temp.length; l+=1) {
			for(int m = 0; m<temp[l].length; m+=1) {
				System.out.printf("[%2d]" , temp[l][m]);		
			}
			System.out.println();
		}
		
		int a = 1;
		while(true) {
			System.out.println("���ڸ� 1~50���� ������� ��ġ�� �Է��ϼ���.");
			System.out.println("��");
			int x = scan.nextInt();
			System.out.println("��");
			int y = scan.nextInt();
			if(temp[y][x] == a) {
				temp[y][x] = 0;
				a += 1;
			}
			else {System.out.println("��ġ�� �ٽ� Ȯ�����ּ���. ã�� ���� : " + a);}
			
			for(int l = 0; l<temp.length; l+=1) {
				for(int m = 0; m<temp[l].length; m+=1) {
					System.out.printf("[%2d]" , temp[l][m]);		
				}
				System.out.println();
			}
			int count = 0;
			for(int l = 0; l<temp.length; l+=1) {
				for(int m = 0; m<temp[l].length; m+=1) {
					if(temp[l][m] == 0) {count += 1;}
				}
			}
			if(count == 50) {
				System.out.println("��������!");
				break;
			}
		}
	}
}
