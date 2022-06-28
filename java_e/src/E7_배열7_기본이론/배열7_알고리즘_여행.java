package E7_배열7_기본이론;

import java.util.Arrays;

public class 배열7_알고리즘_여행 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 철수는 여행을떠났다. 
		 8은 철수이고 7은 벽이고 0은 이동가능한곳이다.
		 dir 은 철수가 바라보는 방향이고 0~3까지 북동남서 의 방향을 표현한다. 	
		 input의 데이터는 1은 한칸전진이고 2는 좌회전(90도) 3은 우회전(90도)이다.
		 회전은 방향만 바뀌고 움직이는건 없다.
		 input을 전부 입력받고 해당내용을 전부 출력하시요.
	 */
		int map[][] = {
				{0,0,0,0,0,0,0},	
				{0,7,7,7,7,0,0},	
				{0,7,0,0,7,0,0},	
				{0,7,0,8,7,0,0},	
				{0,0,0,0,7,0,0},	
				{0,0,0,0,7,7,0},	
				{0,0,0,0,0,0,0}
		};		
		int dir = 0;		
		int input[] = {1,1,2,1,1,2,1,1,3,1,1};
		// 동 = 3  , 서 = 1 ,  남 = 2 , 북 = 0
		int a = 0;
		int b = 0;
		
		for(int j = 0; j<map.length; j+=1) {
			for(int k = 0; k<map[j].length; k+=1) {
				System.out.print(map[j][k]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i<input.length; i+=1) {
			
			for(int j = 0; j<map.length; j+=1) {
				for(int k = 0; k<map[j].length; k+=1) {
					if(map[j][k] == 8) {
						a = j;
						b = k;
					}
				}
			}
			
			if(input[i] == 1) {
				if(dir == 0) {
					if(map[a-1][b] == 7) {
						System.out.println("벽에 막혔습니다.");
						System.out.println();
						continue;
					}
					else if(map[a-1][b] == 0) {
						int temp = map[a-1][b];
						map[a-1][b] = map[a][b];
						map[a][b] = temp;
						for(int j = 0; j<map.length; j+=1) {
							for(int k = 0; k<map[j].length; k+=1) {
								System.out.print(map[j][k]);
							}
							System.out.println();
						}
						System.out.println();
					}
				}
				else if(dir == 1) {
					if(map[a][b-1] == 7) {
						System.out.println("벽에 막혔습니다.");
						System.out.println();
						continue;
					}
					else if(map[a][b-1] == 0) {
						int temp = map[a][b-1];
						map[a][b-1] = map[a][b];
						map[a][b] = temp;
						for(int j = 0; j<map.length; j+=1) {
							for(int k = 0; k<map[j].length; k+=1) {
								System.out.print(map[j][k]);
							}
							System.out.println();
						}
						System.out.println();
					}
				}
				else if(dir == 2) {
					if(map[a+1][b] == 7) {
						System.out.println("벽에 막혔습니다.");
						System.out.println();
						continue;
					}
					else if(map[a+1][b] == 0) {
						int temp = map[a+1][b];
						map[a+1][b] = map[a][b];
						map[a][b] = temp;
						for(int j = 0; j<map.length; j+=1) {
							for(int k = 0; k<map[j].length; k+=1) {
								System.out.print(map[j][k]);
							}
							System.out.println();
						}
						System.out.println();
					}
				}
				else if(dir == 3) {
					if(map[a][b+1] == 7) {
						System.out.println("벽에 막혔습니다.");
						System.out.println();
						continue;
					}
					else if(map[a][b+1] == 0) {
						int temp = map[a][b+1];
						map[a][b+1] = map[a][b];
						map[a][b] = temp;
					}
				}
			}
			else if(input[i] == 2) {
				if(dir == 0) {dir = 1;}
				else if(dir == 1) {dir = 2;}
				else if(dir == 2) {dir = 3;}
				else if(dir == 3) {dir = 0;}
			}
			else if(input[i] == 3) {
				if(dir == 0) {dir = 3;}
				else if(dir == 1) {dir = 0;}
				else if(dir == 2) {dir = 1;}
				else if(dir == 3) {dir = 2;}
			}
		}
	}
}
