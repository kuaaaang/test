package E_배열_과제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _1그룹_틀린조합찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
 		철수는 게임을 만들려고 한다.
 	
 		숫자다섯개를 랜덤( 1~9사이의숫자 )으로 저장한다.
 	
 		보기는 4개를 주고 4개중 3개는 같은조합으로 만들어져있고 그중1개만 다른조합으로 만들어져있다.
 		
 		틀린조합을 맞추면 되는게임이다. 
 		
 		
 		[예시]
 			랜덤숫자 18432 가 나왔다고 했을때 , 아래처럼 보기를 준다. 
 			----------------------------------------------
 			[문제] 틀린조합을 맞춰보세요.(1~4)
 						
 				[1] 81342 [2] 43218 [3] 32147 [4] 21843
 			----------------------------------------------
 			
 			1,2,4 번은 숫자는 다르지만 같은조합(18432만사용) 을 가지고 제시가되었으나, 
            3번 만 8대신 7이 들어가있다. 

 			정답 : 3을 맞추면 이기는 게임이다. 
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
			System.out.println("[문제] 틀린조합을 맞춰보세요.(1~4)");
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
				System.out.println("정답!");
				break;
			}
			else {
				System.err.println("오답!");
			}
		}
		
	}
}
