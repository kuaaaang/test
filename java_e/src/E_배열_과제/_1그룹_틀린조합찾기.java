package E_�迭_����;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _1�׷�_Ʋ������ã�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
 		ö���� ������ ������� �Ѵ�.
 	
 		���ڴټ����� ����( 1~9�����Ǽ��� )���� �����Ѵ�.
 	
 		����� 4���� �ְ� 4���� 3���� ������������ ��������ְ� ����1���� �ٸ��������� ��������ִ�.
 		
 		Ʋ�������� ���߸� �Ǵ°����̴�. 
 		
 		
 		[����]
 			�������� 18432 �� ���Դٰ� ������ , �Ʒ�ó�� ���⸦ �ش�. 
 			----------------------------------------------
 			[����] Ʋ�������� ���纸����.(1~4)
 						
 				[1] 81342 [2] 43218 [3] 32147 [4] 21843
 			----------------------------------------------
 			
 			1,2,4 ���� ���ڴ� �ٸ����� ��������(18432�����) �� ������ ���ð��Ǿ�����, 
            3�� �� 8��� 7�� ���ִ�. 

 			���� : 3�� ���߸� �̱�� �����̴�. 
 		*/
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		boolean check1[] = new boolean[9];
		int arr[] = new int [5];
		for(int i = 0; i<5;) {
			int r1 = ran.nextInt(9);
			if(check1[r1] == false) {
				check1[r1] = true;
				arr[i] = r1 +1;
				i += 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		boolean check2[] = new boolean[4];
		int game [] = new int[4];
		for(int i = 0; i<3;) {
			int r2 = ran.nextInt(4);
			if(check2[r2] == false) {
//				System.out.println(r2);
				check2[r2] = true;
				for(int j = 0; j<10; j+=1) {
					int a = ran.nextInt(5);
					int b = ran.nextInt(5);
					int temp = arr[a];
					arr[a] = arr[b];
					arr[b] = temp;
				}
//				System.out.println(Arrays.toString(arr));
				int count = 1;
				int total = 0;
				for(int j = arr.length-1; j>=0; j-=1) {
					total += (count*arr[j]);
					count = count * 10;
//					System.out.println(total);
				}	
				game[r2] = total;
				i += 1;
			}
		}
//		System.out.println(Arrays.toString(game));
		
		while(true) {
			System.out.println("[����] Ʋ�������� ���纸����.(1~4)");
			for(int i = 0; i<game.length; i+=1) {
				if(check2[i] == true) {
					System.out.println("[" + (i+1) + "] " + game[i]);
				}
				else if(check2[i] == false){
					boolean check3[] = new boolean[9];
					int temp[] = new int [5];
					for(int j = 0; j<5;) {
						int r3 = ran.nextInt(9);
						if(check3[r3] == false) {
							check3[r3] = true;
							temp[j] = r3 +1;
							j += 1;
						}
					}
					int c = 1;
					int t = 0;
					for(int j = temp.length-1; j>=0; j-=1) {
						t += (c*temp[j]);
						c = c * 10;
					}
					System.out.println("[" + (i+1) + "] " + t);
				}
			}
			int n = scan.nextInt();
			if(check2[(n-1)] == false) {
				System.out.println("����!");
				break;
			}
			else {
				System.err.println("����!");
			}
		}
		
	}
}
