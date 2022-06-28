package E7_배열7_기본이론;

import java.util.Arrays;

public class 배열7_알고리즘_인풋티켓 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	    영화관 예매를 기록할려고한다. 영화관크기는 4 * 3 사이즈이다 (y , x) 		
		input의 데이터는 3개씩 5 번이다. 
		input의 데이터3개는 각각 {y , x , 회원번호}를 뜻한다. 		
		input의 데이터를 영화관에 기록후 출력 
		[예]  
	
		---------------------------------------------------------
	    [1] { 1,1,1001 } 
	    {출력 : 예매를 완료합니다.}
	 	{
			{0	,   0,	0},
			{0	,1001,	0},
			{0	,   0,	0},
			{0	,   0,	0}
		}; 

		---------------------------------------------------------
	    [2] { 2,2,1003 } 
	    {출력 : 예매를 완료합니다.}
	 	{
			{0   ,    0,    0},
			{0   , 1001,    0},
			{0   ,    0, 1003},
			{0   ,    0,	0}
		}; 

		---------------------------------------------------------
	    [3] { 0,0,1006 } 
	    {출력 : 예매를 완료합니다.}
	 	{
			{1006,  0,	 0},
			{0	,1001,	 0},
			{0	,   0,1003},
			{0	,   0,	 0}
		}; 

		---------------------------------------------------------
	    [4] { 1,1,5422 } 
	 	{출력 : 이미 예매한 자리입니다.}

		---------------------------------------------------------
		[5] {0,0,1006} //이미예매를 한자리이므로
		{출력 : 예매를 취소합니다.}
	 	{
			{0  ,   0,	 0},
			{0	,1001,	 0},
			{0	,   0,1003},
			{0	,   0,	 0}
		}; 
	 */
		int[][] 영화관 = {
				{0,0,0},
				{0,0,0},
				{0,0,0},
				{0,0,0}
			};
		
		int input[][] = {
				{1,1,1001},
				{2,2,1003},
				{0,0,1006},
				{1,1,5422},
				{0,0,1006},
		};
		
		for(int j = 0; j<영화관.length; j+=1) {
			System.out.println(Arrays.toString(영화관[j]));
		}
		System.out.println();
		
		for(int i = 0; i<input.length; i+=1) {
			int y = input[i][0];
			int x = input[i][1];
			int id = input[i][2];
			
			System.out.println(Arrays.toString(input[i]));
			
			
			if(영화관[y][x] == 0) {
				System.out.println("예매를 완료합니다.");
				영화관[y][x] = id;
			}
			else if(영화관[y][x] != 0) {
				if(영화관[y][x] == id){
					System.out.println("예매를 취소합니다.");
					영화관[y][x] = 0;
				}
				else if(영화관[y][x] != id) {
					System.out.println("이미 예매된 자리입니다.");
				}
			}
			for(int j = 0; j<영화관.length; j+=1) {
				for(int k = 0; k<영화관[j].length; k+=1) {
					System.out.printf("[%4d]" , 영화관[j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
