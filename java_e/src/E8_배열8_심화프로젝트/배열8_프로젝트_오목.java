package E8_배열8_심화프로젝트;

import java.util.Scanner;

public class 배열8_프로젝트_오목 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   우리가 알고있는오목을 만들어보자. (삼삼 같은건 제외해도된다)
		*/
		Scanner scan = new Scanner(System.in);

		int size = 10;
		int[][] omok = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
		};
		
		int count = 0;
		while(true) {
			for(int i = 0; i<omok.length; i+=1) {
				for(int j = 0; j<omok[i].length; j+=1) {
					if(omok[i][j] == 1) {System.out.print("■");}
					else if(omok[i][j] == 2) {System.out.print("□");}
					else if(omok[i][j] == 0) {System.out.print("+");}
				}
				System.out.println();
			}
			
			if(count % 2 == 0) {
				System.out.println("Player1 위치를 선택하세요.");
				System.out.print("가로 : ");
				int x1 = scan.nextInt();
				System.out.print("세로 : ");
				int y1 = scan.nextInt();
				if(omok[y1][x1] == 0) {
					omok[y1][x1] = 1;
					count += 1;
				}
				else {System.out.println("이미 선택된 자리입니다.");}
			}
			else if(count % 2 == 1) {
				System.out.println("Player2 위치를 선택하세요.");
				System.out.print("가로 : ");
				int x2 = scan.nextInt();
				System.out.print("세로 : ");
				int y2 = scan.nextInt();
				if(omok[y2][x2] == 0) {
					omok[y2][x2] = 2;
					count += 1;
				}
				else {System.out.println("이미 선택된 자리입니다.");}
			}		
			
			int a = 0;
			int b = 0;
			
			for(int i = 0; i<omok.length; i+=1) { // 가로
				int win1 = 0;
				int win2 = 0;
				for(int j = 0; j<omok.length; j+=1) {
					if(omok[i][j] == 1) {
						win1 += 1;
						if(win1 >= 5) {
							a = 1;
						}
					}
					else if(omok[i][j] == 2) {
						win2 += 1;
						if(win2 >= 5) {
							b = 1;
						}
					}
					else {
						win1 = 0;
						win2 = 0;
					}
				}
			}
			for(int i = 0; i<omok.length; i+=1) { // 세로
				int win1 = 0;
				int win2 = 0;
				for(int j = 0; j<omok.length; j+=1) {
					if(omok[j][i] == 1) {
						win1 += 1;
						if(win1 >= 5) {
							a = 1;
						}
					}
					else if(omok[j][i] == 2) {
						win2 += 1;
						if(win2 >= 5) {
							b = 1;
							break;
						}
					}
					else {
						win1 = 0;
						win2 = 0;
					}
				}
			}	
			for(int i = 0; i<omok.length; i+=1) { // 대각선(\)
				int win1 = 0;
				int win2 = 0;
				for(int j = 0; j<omok[i].length; j+=1) {
					if(omok[i][j] == 1) {
						int x = j;
						int y = i;
						if(x<9 && y<9) {
							for(int k = 1; k+y<10 && k+x<10; k+=1) {
								if(omok[y+k][x+k] == 1) {
									win1 += 1;
									if(win1 >= 4) {a = 1;}
								}
								else if(omok[y+k][x+k] != 1) {win1 = 0;}
							}
						}
					}
					else if(omok[i][j] == 2) {
						int x = j;
						int y = i;
						if(x<9 && y<9) {
							for(int k = 1; k+y<10 && k+x<10; k+=1) {
								if(omok[y+k][x+k] == 2) {
									win2 += 1;
									if(win2 >= 4) {b = 1;}
								}
								else if(omok[y+k][x+k] != 2) {win2 = 0;}
							}
						}
					}
				}
			}
			for(int i = 0; i<omok.length; i+=1) { // 대각선(/)
				int win1 = 0;
				int win2 = 0;
				for(int j = 0; j<omok[i].length; j+=1) {
					if(omok[i][j] == 1) {
						int x = j;
						int y = i;
						if(x>0 && y<9) {
							for(int k = 1; y+k<10 && x-k>0; k+=1) {
								if(omok[y+k][x-k] == 1) {
									win1 += 1;
									if(win1 >= 4) {a = 1;}
								}
								else if(omok[y+k][x-k] != 1) {win1 = 0;}
							}
						}
					}
					else if(omok[i][j] == 2) {
						int x = j;
						int y = i;
						if(x>0 && y<9) {
							for(int k = 1; y+k<10 && x-k>0; k+=1) {
								if(omok[y+k][x-k] == 2) {
									win2 += 1;
									if(win2 >= 4) {b = 1;}
								}
								else if(omok[y+k][x-k] != 2) {win2 = 0;}
							}
						}
					}
				}
			}

			if(a != 0) {
				for(int i = 0; i<omok.length; i+=1) {
					for(int j = 0; j<omok[i].length; j+=1) {
						if(omok[i][j] == 1) {System.out.print("■");}
						else if(omok[i][j] == 2) {System.out.print("□");}
						else if(omok[i][j] == 0) {System.out.print("+");}
					}
					System.out.println();
				}
				System.out.println("Player1 win!");
				break;
			}
			if(b != 0) {
				for(int i = 0; i<omok.length; i+=1) {
					for(int j = 0; j<omok[i].length; j+=1) {
						if(omok[i][j] == 1) {System.out.print("■");}
						else if(omok[i][j] == 2) {System.out.print("□");}
						else if(omok[i][j] == 0) {System.out.print("+");}
					}
					System.out.println();
				}
				System.out.println("Player2 win!");
				break;
			}
		}		
		scan.close();
	}
}
