package E6_배열6_알고리즘;

import java.util.Arrays;

public class 배열6_알고리즘_인풋숫자이동 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   /*
		 [숫자이동게임]	
		 move = {1,0,0,0,8,0,0,0,1};	 
		 [1] move 안의 8은 플레이어이다
		 [2] move 안의 0은 이동할수있는 길이다.
		 [3] move 안의 1은 이동할수없는 벽이다. 

		 input 배열의 내용을 순차적으로 실행하고,결과출력하시오.
		 input의값중 1은 왼쪽이동 , 2는 오른쪽이동이다. 
		 벽에서 이동하면, "이동할수없습니다" 출력 		
		 시작=> {1,0,0,0,8,0,0,0,1};
		 1 ==> {1,0,0,8,0,0,0,0,1};
		 1 ==> {1,0,8,0,0,0,0,0,1};
		 1 ==> {1,8,0,0,0,0,0,0,1};
		 1 ==> "이동할수없습니다"
		 2 ==> {1,0,8,0,0,0,0,0,1};
		 2 ==> {1,0,0,8,0,0,0,0,1};
		 2 ==> {1,0,0,0,8,0,0,0,1};
	   */
		int move[] = {1,0,0,0,8,0,0,0,1};		
		int input[] = {1,1,1,1,2,2,2};
		
		int a = 0;
		for(int i = 0; i<input.length; i+=1) {
			System.out.println(Arrays.toString(move));
			for(int j = 0; j<input.length; j+=1) {
				if(move[j] == 8) {a = j;}
			}
			if(input[i] == 1) {
				if(move[a-1] == 1) {
					System.out.println("이동할 수 없습니다.");
				}
				else if(move[a-1] == 0) {
					System.out.println("왼쪽으로 이동!");
					int temp1 = move[a];
					move[a] = move[a-1];
					move[a-1] = temp1;
				}
			}
			else if(input[i] == 2) {
				if(move[a+1] == 1) {
					System.out.println("이동할 수 없습니다.");
				}
				else if(move[a+1] == 0) {
					System.out.println("오른쪽으로 이동!");
					int temp2 = move[a];
					move[a] = move[a+1];
					move[a+1] = temp2;
				}
			}
		}
		System.out.println(Arrays.toString(move));
	}
}
