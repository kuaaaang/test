package E_배열_과제;

import java.util.Scanner;

public class 팀_공모전_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  - 팩맨
		  - 모든 아이템을 다 먹으면 성공
		  - 적과 부딪히면 사망
		  - 적은 일정 범위만 규칙적으로 움직인다.
		*/
		Scanner scan = new Scanner(System.in);
		
		int game[][] = {
				{0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0},
				{0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0},
				{0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0},
				{0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0},
				{0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0},
				{0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 5},
				{0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0},
				{0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0},
				{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 3}
		};
		
		int py = 0;
		int px = 0;
		int ey1 = 0;
		int ex1 = 0;
		int ey2 = 0;
		int ex2 = 0;
		int _1 = 0;
		int _2 = 0;
		
		while(true) {
			for(int i = 0; i<game.length; i+=1) {
				for(int j = 0; j<game[i].length; j+=1) {
					if(game[i][j] == 5) {
						System.out.print("[§]");
						ey1 = i;
						ex1 = j;
					}
					if(game[i][j] == 4) {
						System.out.print("[§]");
						ey2 = i;
						ex2 = j;
					}
					if(game[i][j] == 3) {
						System.out.print("[◑]");
						py = i;
						px = j;
					}
					if(game[i][j] == 2) {System.out.print("[ ]");}
					if(game[i][j] == 1) {System.out.print("[■]");}
					if(game[i][j] == 0) {System.out.print("[○]");}
				}
				System.out.println();
			}
			
			System.out.println();
			System.out.println("[1. ↑][2. ↓][3. ←][4. →]");
			System.out.print("입력 : ");
			int n = scan.nextInt();
			
			if(n==1) {
				if(py != 0 && game[py-1][px] != 1) {
					if(game[py-1][px] == 4 || game[py-1][px] == 5) {
						System.err.println("GAME OVER!");
						
						for(int i = 0; i<game.length; i+=1) {
							for(int j = 0; j<game[i].length; j+=1) {
								if(game[i][j] == 3) {
									game[i][j] = 0;
								}
							}
						}
						for(int i = 0; i<game.length; i+=1) {
							for(int j = 0; j<game[i].length; j+=1) {
								if(game[i][j] == 5) {System.out.print("[§]");}
								if(game[i][j] == 4) {System.out.print("[§]");}
								if(game[i][j] == 3) {System.out.print("[◑]");}
								if(game[i][j] == 2) {System.out.print("[ ]");}
								if(game[i][j] == 1) {System.out.print("[■]");}
								if(game[i][j] == 0) {System.out.print("[○]");}
							}
							System.out.println();
						}
						break;
					}
					else {
						int temp = game[py][px];
						game[py][px] = 2;
						game[py-1][px] = temp;
						py -= 1;
					}
				}
			}
			else if(n==2) {
				if(py != 9 && game[py+1][px] != 1) {
					if(game[py+1][px] == 4 || game[py+1][px] == 5) {
						System.err.println("GAME OVER!");
						
						for(int i = 0; i<game.length; i+=1) {
							for(int j = 0; j<game[i].length; j+=1) {
								if(game[i][j] == 3) {
									game[i][j] = 0;
								}
							}
						}
						for(int i = 0; i<game.length; i+=1) {
							for(int j = 0; j<game[i].length; j+=1) {
								if(game[i][j] == 5) {System.out.print("[§]");}
								if(game[i][j] == 4) {System.out.print("[§]");}
								if(game[i][j] == 3) {System.out.print("[◑]");}
								if(game[i][j] == 2) {System.out.print("[ ]");}
								if(game[i][j] == 1) {System.out.print("[■]");}
								if(game[i][j] == 0) {System.out.print("[○]");}
							}
							System.out.println();
						}
						break;
					}
					else {
						int temp = game[py][px];
						game[py][px] = 2;
						game[py+1][px] = temp;
						py += 1;
					}
				}
			}
			else if(n==3) {
				if(px != 0 && game[py][px-1] != 1) {
					if(game[py][px-1] == 4 || game[py][px-1] == 5) {
						System.err.println("GAME OVER!");
						
						for(int i = 0; i<game.length; i+=1) {
							for(int j = 0; j<game[i].length; j+=1) {
								if(game[i][j] == 3) {
									game[i][j] = 0;
								}
							}
						}
						for(int i = 0; i<game.length; i+=1) {
							for(int j = 0; j<game[i].length; j+=1) {
								if(game[i][j] == 5) {System.out.print("[§]");}
								if(game[i][j] == 4) {System.out.print("[§]");}
								if(game[i][j] == 3) {System.out.print("[◑]");}
								if(game[i][j] == 2) {System.out.print("[ ]");}
								if(game[i][j] == 1) {System.out.print("[■]");}
								if(game[i][j] == 0) {System.out.print("[○]");}
							}
							System.out.println();
						}
						break;
					}
					else {
						int temp = game[py][px];
						game[py][px] = 2;
						game[py][px-1] = temp;
						px -= 1;
					}
				}
			}
			else if(n==4) {
				if(px != 10 && game[py][px+1] != 1) {
					if(game[py][px+1] == 4 || game[py][px+1] == 5) {
						System.err.println("GAME OVER!");
						
						for(int i = 0; i<game.length; i+=1) {
							for(int j = 0; j<game[i].length; j+=1) {
								if(game[i][j] == 3) {
									game[i][j] = 0;
								}
							}
						}
						for(int i = 0; i<game.length; i+=1) {
							for(int j = 0; j<game[i].length; j+=1) {
								if(game[i][j] == 5) {System.out.print("[§]");}
								if(game[i][j] == 4) {System.out.print("[§]");}
								if(game[i][j] == 3) {System.out.print("[◑]");}
								if(game[i][j] == 2) {System.out.print("[ ]");}
								if(game[i][j] == 1) {System.out.print("[■]");}
								if(game[i][j] == 0) {System.out.print("[○]");}
							}
							System.out.println();
						}
						break;
					}
					else {
						int temp = game[py][px];
						game[py][px] = 2;
						game[py][px+1] = temp;
						px += 1;
					}
				}
			}
			else {continue;}

			if(_1 == 0) {
				if(ey1 != 9) {
					int temp = game[ey1][ex1];
					game[ey1][ex1] = game[ey1+1][ex1];
					game[ey1+1][ex1] = temp;
					ey1 += 1;
				}
				else {_1 = 1;}
			}
			else if(_1 == 1) {
				if(ey1 != 0) { 
					int temp = game[ey1][ex1];
					game[ey1][ex1] = game[ey1-1][ex1];
					game[ey1-1][ex1] = temp;
					ey1 -= 1;
				}
				else {_1 = 0;}
			}
			if(_2 == 0) {
				if(ex2 <= 9) {
					int temp = game[ey2][ex2];
					game[ey2][ex2] = game[ey2][ex2+1];
					game[ey2][ex2+1] = temp;
					ex2 += 1;
				}
				else {
					_2 = 2;
				}
			}
			else if(_2 == 2) {
				if(ex2 != 0) {
					int temp = game[ey2][ex2];
					game[ey2][ex2] = game[ey2][ex2-1];
					game[ey2][ex2-1] = temp;
					ex2 -= 1;
				}
				else {_2 = 0;}
			}
			
			if(game[ey1][ex1] == game[py][px] || game[ey2][ex2] == game[py][px]) {
				System.err.println("GAME OVER!");
				
				for(int i = 0; i<game.length; i+=1) {
					for(int j = 0; j<game[i].length; j+=1) {
						if(game[i][j] == 3) {
							game[i][j] = 0;
						}
					}
				}
				for(int i = 0; i<game.length; i+=1) {
					for(int j = 0; j<game[i].length; j+=1) {
						if(game[i][j] == 5) {System.out.print("[§]");}
						if(game[i][j] == 4) {System.out.print("[§]");}
						if(game[i][j] == 3) {System.out.print("[◑]");}
						if(game[i][j] == 2) {System.out.print("[ ]");}
						if(game[i][j] == 1) {System.out.print("[■]");}
						if(game[i][j] == 0) {System.out.print("[○]");}
					}
					System.out.println();
				}
				break;
			}
			
			int count = 0;
			for(int i = 0; i<game.length; i+=1) {
				for(int j = 0; j<game[i].length; j+=1) {
					if(game[i][j] == 0) {
						count += 1;
					}
				}
			}
			if(count == 0) {
				for(int i = 0; i<game.length; i+=1) {
					for(int j = 0; j<game[i].length; j+=1) {
						if(game[i][j] == 5) {System.out.print("[§]");}
						if(game[i][j] == 4) {System.out.print("[§]");}
						if(game[i][j] == 3) {System.out.print("[◑]");}
						if(game[i][j] == 2) {System.out.print("[ ]");}
						if(game[i][j] == 1) {System.out.print("[■]");}
						if(game[i][j] == 0) {System.out.print("[○]");}
					}
					System.out.println();
				}
				System.out.println();
				System.out.println("GAME CLEAR!");
				break;
			}
		}	
	}
}
