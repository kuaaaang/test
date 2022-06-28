package E1_배열1_기본이론;

public class 배열1_알고리즘_사각형출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	
		  [문제] b 배열을 아래와같이 사각형모양으로출력한다.
		  [힌트] 3칸마다 줄을 바꿔준다.

		   1 2 3
		   4 5 6
		   7 8 9  
        */
		int b [] = {1,2,3,4,5,6,7,8,9};
		
		for(int i = 0; i<9; i+=1) {
			System.out.print(b[i]);
			if(i%3==2) {System.out.println();}
		}
	}
}
