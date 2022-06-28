package E_배열_과제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 발표 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("===============미 니 게 임=================");
		
		while(true) {
			System.out.println();
			System.out.println("게임선택 : [1] 팩맨 [2] 집찾기 [3] 윷놀이 [4] 종료");
			int ss = scan.nextInt();
			
			if(ss == 1) {
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
								System.out.print("[★]");
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
										if(game[i][j] == 3) {System.out.print("[★]");}
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
										if(game[i][j] == 3) {System.out.print("[★]");}
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
										if(game[i][j] == 3) {System.out.print("[★]");}
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
										if(game[i][j] == 3) {System.out.print("[★]");}
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
						if(ex2 < 9) {
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
								if(game[i][j] == 3) {System.out.print("[★]");}
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
								if(game[i][j] == 3) {System.out.print("[★]");}
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
			else if(ss == 2) {
				int map[][]= {  
						  {1,0,0,0,4,0,0,0,0,0,},
						  {0,0,0,0,4,0,0,0,0,0,},
						  {0,0,0,0,0,0,0,0,0,4,},
						  {4,4,0,3,0,0,3,0,0,4,},
						  {0,0,0,4,4,4,0,0,0,4,},
						  {3,0,3,0,3,0,3,0,3,0,},
						  {4,0,0,3,0,0,3,0,0,0,},
						  {4,0,0,0,0,0,0,0,4,4,},
						  {0,0,0,0,0,4,0,0,0,0,},
						  {0,0,0,3,0,4,3,0,0,2,},
				  };
	
						System.out.println();
						int y1=0;//p1 열 
						int x1=0;//p1 행
						int y2=9;//p2 열
						int x2=9;//p2 행
						int k=0;
						
				while(k==0) {
					//집랜덤돌리기
					int r1=ran.nextInt(7)+2;//집의 위치를 랜덤으로 돌려서 정한다
					int r2=ran.nextInt(7)+2;
					//map[r1][r2]>p1집
					//map[r2][r1]>p1집
					int move=1;//p1,p2차례
					
					//랜덤으로 돌린 집의 위치가 길이 아닌 경우 다시!
					boolean check=false;
					if(map[r1][r2]!=0 || map[r2][r1]!=0 || r1==r2 ) {//0이 아니거나 r1,r2의 값이 같아 집이 같은경우
						check=true;
					}
//					System.out.println();
//					System.out.println("r1:"+r1+" r2:"+r2);
					
					//p1,p2 집이 위치를 잡은 후
					while(check==false) {
							
					System.out.println("---------------------------------");
					for(int i=0; i<map.length; i++) {
						System.out.println();
					
						for(int j=0; j<map.length; j++) {
							
						if(i%3==0 && j%3==0 && i/3>=1 && j/3>=1 && j!=9) {//아이템 달리는 구간 
								System.out.print("♪♬♪");
								}
						else if(i==5 && j%2==0) {//함정 넘어지는 구간 
							System.out.print("※ ※");
						}
						else if(map[i][j]==0) {//길,집위치표시
							if(r1==i && r2==j) {//p1집
								System.out.print("★■★");
							}
							else if(r2==i && r1==j) {//p2집
								System.out.print("★■★");
							}
							else {//길
							System.out.print("   ");
							}
						}else if(map[i][j]==4) {//벽
							System.out.print("▦▦▦");
						}else if(map[i][j]==1) {//player1
							System.out.print("/♠/");
						}else if(map[i][j]==2) {//player2
							System.out.print("/♣/");
						}
					}
					}
					System.out.println();
					System.out.println("---------------------------------");
					//player1
					if(move%2==1) {
						System.out.println("p1이동:"+"1.left  2.right 3.up 4.down");
						int sel = scan.nextInt();//이동위치
						
						if(sel==1) {//왼쪽으로 이동
							
							if(x1>0) {//x1 0보다 커야지 가능
							if(map[y1][x1-1]!=4) {//벽이아닐경우
								map[y1][x1]=0;//원래있던자리
								map[y1][x1-1]=1;//옮긴자리
								x1=x1-1;
								if( y1==5 && x1%2==0) {//5열 짝수행 넘어지는구간
									System.err.println("뒤로넘어졌습니다");
									map[y1][x1]=0;//옮겨진자리에서 다시 뒤로간다
									x1=x1+1;
									map[y1][x1]=1;
								}
							}
							}
						}else if(sel==2) {//오른쪽이동
							
							if(x1<map.length-1) {
							if(map[y1][x1+1]!=4) {
								map[y1][x1]=0;
								map[y1][x1+1]=1;
								x1=x1+1;
								if(y1==5 && x1%2==0) {
									System.err.println("뒤로넘어졌습니다");
									map[y1][x1]=0;
									x1=x1-1;
									map[y1][x1]=1;
									
								}
							}
							}
						}else if(sel==3) {//위로이동
							
							if(y1>0) {
							if(map[y1-1][x1]!=4) {
								map[y1][x1]=0;
								map[y1-1][x1]=1;
								y1=y1-1;
								if(y1==5 && x1%2==0) {
									System.err.println("뒤로넘어졌습니다");
									map[y1][x1]=0;
									y1=y1+1;
									map[y1][x1]=1;
								}
							}
							}
						}else if(sel==4) {//아래로이동
							
							if(y1<map.length-1) {
							if(map[y1+1][x1]!=4) {
								map[y1][x1]=0;
								map[y1+1][x1]=1;
								y1=y1+1;
								if(y1==5 && x1%2==0) {
									System.err.println("뒤로넘어졌습니다");
									map[y1][x1]=0;
									y1=y1-1;
									map[y1][x1]=1;
								}
							}
							}
						}move+=1;//다음턴
						//달리는 구간
						if(y1%3==0 && x1%3==0 && y1/3>=1 && x1/3>=1 && x1!=9 ) {
							move+=1;//한번더
							System.out.println("~~~~~~~~~~~~~p1달리는중~~~~~~~~~~~~~~");
							}
						//2번짝수
					}else {
						System.out.println("p2이동: "+"1.left  2.right 3.up 4.down");
						int sel = scan.nextInt();
						if(sel==1) {//왼쪽이동
							
							if(x2>0) {//x1 0보다 커야지 가능
							if(map[y2][x2-1]!=4) {//벽이아닐경우
								map[y2][x2]=0;
								map[y2][x2-1]=2;
								x2=x2-1;
								if(x2==5 && y2%2==0) {
									System.err.println("뒤로넘어졌습니다");
									map[y2][x2]=0;
									x2=x2+1;
									map[y2][x2]=2;
								}
							}
							}
						}else if(sel==2) {//오른쪽이동
						
							if(x2<map.length-1) {
							if(map[y2][x2+1]!=4) {
								map[y2][x2]=0;
								map[y2][x2+1]=2;
								x2=x2+1;
								if(y2==5 && x2%2==0) {
									System.err.println("뒤로넘어졌습니다");
									map[y2][x2]=0;
									x2=x2-1;
									map[y2][x2]=2;
								}
							}
							}
						}else if(sel==3) {//위로이동
							
							if(y2>0) {
							if(map[y2-1][x2]!=4) {
								map[y2][x2]=0;
								map[y2-1][x2]=2;
								y2=y2-1;
								if(y2==5 && x2%2==0) {
									System.err.println("뒤로넘어졌습니다");
									map[y2][x2]=0;
									y2=y2+1;
									map[y2][x2]=2;
								}
							}
							}
						}else if(sel==4) {//아래로이동
							
							if(y2<map.length-1) {
							if(map[y2+1][x2]!=4) {
								map[y2][x2]=0;
								map[y2+1][x2]=2;
								y2=y2+1;
								if( y2==5 && x2%2==0) {
									System.err.println("뒤로넘어졌습니다");
									map[y2][x2]=0;
									y2=y2-1;
									map[y2][x2]=2;
								}
							} 
							}
						}move+=1;
						//달리는구간
						if(y2%3==0 && x2%3==0 && y2/3>=1 && x2/3>=1 && x2!=9) {
							move+=1;//한번더
							System.out.println("~~~~~~~~~~~~~p2달리는중~~~~~~~~~~~~~~");
							}
					}//종료, 플레이어원위치
					if(y1==r1 && x1==r2) {//map[r1][r2]>p1집
						System.out.println("p1집도착");
						System.out.println("p1승!게임종료");
						
						k=-1;//종료
						break;
					}else if(y1==r2 && x1==r1) {//p2집에도착
						System.err.println("!!!p1이 p2집 도착!!!");//되돌려놓기
						System.err.println("p1은 출발지점으로 다시 돌아가기");
						map[y1][x1]=0;
						x1=0;
						y1=0;
						map[y1][x1]=1;
					
						}
					else if(y2==r2 && x2==r1) {//map[r2][r1]>p2집
							System.out.println("!!!!p2집도착!!!!");
							System.out.println("p2승!게임종료");
						    k=-1;//종료
							break;
						}else if(y2==r1 && x2==r2) {//p1집에도착
							System.err.println("!!!!p2가 p1집 도착!!!!");
							System.err.println("p2는 출발지점으로 다시 돌아가기");
							map[y2][x2]=0;//집위치
							y2=9;
							x2=9;
							map[y2][x2]=2;//원위치
							
						}
						}
						}
			}
			else if(ss == 3) {
				int[][] map = new int[7][7];
				int leftSpace = 2; // 감소 후 증가 인덱스
				int rightSpcace = 4; // 증가 후 감소
				int input = -1;
				int select = 0;
				int cpuSelect = -1;
				int playerPoint = 48; // 분기점 판별 포인트
				int cpuPoint= 48;
				int playerMove = 0; // 몇칸 이동인가 분기점 판별 칸수
				int cpuMove = 0;
				int playerChangePoint = playerPoint; // 칸수 판별 포인트
				int cpuChangePoint = 48;
				boolean playerSpace = false; // 공백 건너뛸 판별 변수
				boolean cpuSpace = false; 
				int clear = 1;
				int cpuClear = 1;
				boolean over = false;
				int turn = 0;
				while (true) {
					if (input == 9) {
						break;
					}
					leftSpace = 2; // 감소 후 증가 인덱스
					rightSpcace = 4; // 증가 후 감소
					
					int[] yut = new int[4];
					int yutCount = 0;
					for (int i = 0; i < yut.length; i++) { // 윷 던지기
						int r = ran.nextInt(2);
						yut[i] = r;
						if (r == 1) {
							yutCount++;
						}
					}
					if (yutCount == 0) { // 모
						yutCount = 5;
					}
					
					int count = 0; // 배열위치 비교 변수
					int tempCount = 0;
					boolean insert = false;
					boolean delete = false;
					//배열에 넣어고 지우기 ==> 둘 다 true면 break;
					// player
					int k = 0;
					while (true) {
						if (k == 7) {
							k = 0;
						}
						if (insert == true && delete == true) {
							break;
						}
						for (int j = 0; j < map[k].length;j++) {
							if (map[k][j] == 1) {
								map[k][j] = 0;
								delete = true;
							}
							if (count == playerChangePoint) {
								map[k][j] = 1;
								insert = true;
							}
							count++;
						}
						if (count == 49) {
							delete = true;
						}
						k++;
					}
					// cpu
					insert = false;
					delete = false;
					k = 0;
					count = 0;
					while (true) {
						if (k == 7) {
							k = 0;
						}
						if (insert == true && delete == true) {
							break;
						}
						
						for (int j = 0; j < map[k].length;j++) {
							if (map[k][j] == 2) {
								map[k][j] = 0;
								delete = true;
							}
							if (count == cpuChangePoint) {
								map[k][j] = 2;
								insert = true;
							}
							if (map[k][j] == 1 && cpuChangePoint == playerChangePoint) {
								map[k][j] = 0;
								playerChangePoint = 48;
							}
							count++;
						}
						if (count == 49) {
							delete = true;
							insert = true;
						}
						k++;
					}
					//============================================================
					// 출력
					for (int i = 0; i < map.length; i++) {
						for (int j = 0; j < map[i].length; j++) {
							if ( j == 3 && i != 3) {
								System.out.printf("     ");
							} else if (i == 3 && j != 3) {
								System.out.printf("     ");
							} else if (i != 0 && i != 6 && (leftSpace == j || rightSpcace == j)  ) { 
									System.out.printf("     ");
							} else if (map[i][j] == 1)  {
								System.out.printf("[● ] ");
							} else if (map[i][j] == 2) {
								System.out.printf("[▲ ] ");
							} else {
								System.out.printf("[  ] ");
							}
						}
						if (i == 3) {
							leftSpace--;
							rightSpcace ++;
						}
						if (i != 0 && i != 6 && i != 3) {
							if (leftSpace == 1) {
								leftSpace++;
							} else {
								leftSpace--;
							}
							if (rightSpcace == 5) {
								rightSpcace--;
							} else {
								rightSpcace++;
							}
						}
						System.out.println("\n");
					}
					System.out.println("\n");
					if (map[6][6] != 0 && over == true) {
		 				if (map[6][6] == 1) {
		 					System.err.println("player 승");
		 					break;
		 				} else {
		 					System.err.println("cpu 승");
		 					break;
		 				}
					}
					//============================================================
					if (turn % 2 == 0) { // 플레이어
						// 배열에 넣어주는 위치 구하기 따로 / 배열에 넣기 따로 / 출력 따로 / 배열에 넣어줄 위치 구하기
						if (playerMove/5 == clear) { 
							playerSpace = false;
							clear++;
						}
						if (playerChangePoint == 6) { // 각 분기점
							playerPoint = 6;
							System.out.println("player [1]왼쪽진행 [2]대각진행");
							select = scan.nextInt();
							if (select == 2) {
								playerMove = 100;
							}
						} else if (playerChangePoint == 24) {
							System.out.println("player [3]왼쪽진행 [4]오른쪽진행");
							select = scan.nextInt();
						} else if (playerChangePoint == 0) {
							System.out.println("player [5]대각진행 [6]아래쪽진행");
							select = scan.nextInt();
							if (select == 5) {
								playerMove = 10;
							}
						} else if (playerChangePoint == 42) {
							System.out.println("player [8]오른쪽진행");
							select = 8;
						}
						System.out.println("player의 윷 던지기 ");
						input = scan.nextInt();
						System.out.println(Arrays.toString(yut));
						System.out.println(yutCount);
						if (yutCount == 4 || yutCount == 5) {
							if (yutCount == 5) {
								System.err.println("모! \n한번더 던지기!");
							} else {
								System.err.println("윷! \n한번더 던지기!");
							}
							turn++;
						}
						turn++;
						if (playerPoint == 48) { // 처음시작 포인트 구하기 ==> 매 분기구간마다 space false 리셋
							playerMove += yutCount; 
							tempCount = yutCount * 7;
							if (playerSpace == false) {//중간 공백 건너뛸 조건
								if (playerMove > 2) {
									playerChangePoint -= 7;
									playerSpace = true;
								}
							}
							playerChangePoint -= tempCount;
							if (playerChangePoint == cpuChangePoint) { // 매번 변할때 넣어야함
								System.out.println("컴퓨터 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
								cpuPoint = 48;
								cpuChangePoint = 48;
								cpuMove = 0;
								cpuSpace = false;
								cpuSelect = -1;
								cpuClear = 1;
							}
							if (playerChangePoint < 6) {
								playerPoint = 6;
								playerChangePoint = 6;
								select = 1;
								tempCount = playerMove - 5;
								playerChangePoint -= tempCount;
								if (playerChangePoint == cpuChangePoint) { // 매번 변할때 넣어야함
									System.out.println("컴퓨터 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
									cpuPoint = 48;
									cpuChangePoint = 48;
									cpuMove = 0;
									cpuSpace = false;
									cpuSelect = -1;
									cpuClear = 1;
								}
								if (playerMove >= 8) {
									playerChangePoint -= 1;
									playerSpace = true;
								}
								continue;
							}
						} if (select == 1) { // 6분기점==========================================
							playerMove += yutCount;
							tempCount = yutCount * 1;
							if (playerSpace == false) {
								if (playerMove >= 8) {
									playerChangePoint -= 1;
									playerSpace = true;
								}
							}
							playerChangePoint -= tempCount;
							if (playerChangePoint == cpuChangePoint) { // 매번 변할때 넣어야함
								System.out.println("컴퓨터 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
								cpuPoint = 48;
								cpuChangePoint = 48;
								cpuMove = 0;
								cpuSpace = false;
								cpuSelect = -1;
								cpuClear = 1;
							}
							if (playerChangePoint < 0) {
								playerPoint = 0;
								playerChangePoint = 0;
								tempCount = (playerMove - 10) * 7;
								playerChangePoint += tempCount;
								if (playerChangePoint == cpuChangePoint) { // 매번 변할때 넣어야함
									System.out.println("컴퓨터 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
									cpuPoint = 48;
									cpuChangePoint = 48;
									cpuMove = 0;
									cpuSpace = false;
									cpuSelect = -1;
									cpuClear = 1;
								}
								select = 6;
								continue;
							}
						} else  if (select == 2) { // 첫번째 대각
							playerMove += yutCount; 
							tempCount = yutCount * 6;
							playerChangePoint += tempCount;
							if (playerChangePoint == cpuChangePoint) { // 매번 변할때 넣어야함
								System.out.println("컴퓨터 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
								cpuPoint = 48;
								cpuChangePoint = 48;
								cpuMove = 0;
								cpuSpace = false;
								cpuSelect = -1;
								cpuClear = 1;
							}
							if (playerChangePoint >= 42) {
								tempCount = playerMove-106; // 대각무브 - 100
								System.out.println("player tempCount : "+tempCount);
								playerPoint = 42;
								playerChangePoint = 42;
								playerMove = 15;
								clear = 3;
								select = 8; // 여기부터 수정
								
								playerChangePoint += tempCount;
								if (playerChangePoint == cpuChangePoint) { // 매번 변할때 넣어야함
									System.out.println("컴퓨터 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
									cpuPoint = 48;
									cpuChangePoint = 48;
									cpuMove = 0;
									cpuSpace = false;
									cpuSelect = -1;
									cpuClear = 1;
								}
								if (playerChangePoint >= 45) {
									playerChangePoint += 1;
									playerSpace = true;
								}
								continue;
							}
						} else if (select == 4) { // 24에서 오른대각방향
							playerMove += yutCount; 
							tempCount = yutCount * 8;
							playerChangePoint += tempCount;
							if (playerChangePoint == cpuChangePoint) { // 매번 변할때 넣어야함
								System.out.println("컴퓨터 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
								cpuPoint = 48;
								cpuChangePoint = 48;
								cpuMove = 0;
								cpuSpace = false;
								cpuSelect = -1;
								cpuClear = 1;
							}
							if (playerChangePoint >= 48) {
								System.err.println("플레이어 승리");
								playerChangePoint = 48;
								over = true;
								continue;
							}
						} else if (select == 3) {
							playerMove += yutCount; 
							tempCount = yutCount * 6;
							playerChangePoint += tempCount;
							if (playerChangePoint == cpuChangePoint) { // 매번 변할때 넣어야함
								System.out.println("컴퓨터 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
								cpuPoint = 48;
								cpuChangePoint = 48;
								cpuMove = 0;
								cpuSpace = false;
								cpuSelect = -1;
								cpuClear = 1;
							}
							if (playerMove >= 106) {
								tempCount = playerMove-106; // 대각무브 - 100
								System.out.println("player tempCount : "+tempCount);
								playerPoint = 42;
								playerChangePoint = 42;
								playerMove = 15;
								clear = 3;
								select = 8; 
								
								playerChangePoint += tempCount;
								if (playerChangePoint == cpuChangePoint) { // 매번 변할때 넣어야함
									System.out.println("컴퓨터 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
									cpuPoint = 48;
									cpuChangePoint = 48;
									cpuMove = 0;
									cpuSpace = false;
									cpuSelect = -1;
									cpuClear = 1;
								}
								if (playerChangePoint >= 45) {
									playerChangePoint += 1;
									playerSpace = true;
								}
								continue;
							} else if (select == 5) { // 0기준 대각진행
								playerMove += yutCount; 
								tempCount = yutCount * 8;
								playerChangePoint += tempCount;
								if (playerChangePoint == cpuChangePoint) { // 매번 변할때 넣어야함
									System.out.println("컴퓨터 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
									cpuPoint = 48;
									cpuChangePoint = 48;
									cpuMove = 0;
									cpuSpace = false;
									cpuSelect = -1;
									cpuClear = 1;
								}
								if (playerChangePoint >= 48) {
									System.err.println("플레이어 승리");
									playerChangePoint = 48;
									over = true;
									continue;
								}
							} 
							
							} else  if (select == 6) { // 0기준 아래 진행
								playerMove += yutCount; 
								tempCount = yutCount * 7;
								System.out.println("tempCount : "+tempCount);
								if (playerSpace == false) {
									if (playerMove >= 13) {
										playerChangePoint += 7;
										playerSpace = true;
									}
								}
								playerChangePoint += tempCount;
								if (playerChangePoint == cpuChangePoint) { // 매번 변할때 넣어야함
									System.out.println("컴퓨터 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
									cpuPoint = 48;
									cpuChangePoint = 48;
									cpuMove = 0;
									cpuSpace = false;
									cpuSelect = -1;
									cpuClear = 1;
								}
								if (playerChangePoint >= 42) {
									playerPoint = 42;
									playerChangePoint = 42;
									select = 8;
									count = playerMove - 15;
									playerChangePoint += tempCount;
									if (playerChangePoint == cpuChangePoint) { // 매번 변할때 넣어야함
										System.out.println("컴퓨터 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
										cpuPoint = 48;
										cpuChangePoint = 48;
										cpuMove = 0;
										cpuSpace = false;
										cpuSelect = -1;
										cpuClear = 1;
									}
									if (playerMove >= 18) {
										playerChangePoint += 1;
										playerSpace = true;
									}
									continue;
								}
							} else if (select == 8 || select == 10) {
								playerMove += yutCount; 
								tempCount = yutCount * 1;
//								System.out.println("tempCount : "+tempCount);
								if (playerSpace == false) {
									if (playerMove >= 18) {
										playerChangePoint += 1;
										playerSpace = true;
									}
								}
								playerChangePoint += tempCount;
								if (playerChangePoint == cpuChangePoint) { // 매번 변할때 넣어야함
									System.out.println("컴퓨터 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
									cpuPoint = 48;
									cpuChangePoint = 48;
									cpuMove = 0;
									cpuSpace = false;
									cpuSelect = -1;
									cpuClear = 1;
								}
								if (playerChangePoint >= 48) {
									System.err.println("플레이어 승리");
									playerChangePoint = 48;
									over = true;
									continue;
								}
							}
						//============================================================
					} else { // cpu
						if (cpuMove/5 == cpuClear) {
							cpuSpace = false;
							cpuClear++;
						}
						if (cpuChangePoint == 6) { // 각 분기점
							cpuPoint = 6;
							System.out.println("cpu  [1]왼쪽진행 [2]대각진행");
							cpuSelect = scan.nextInt();
							if (cpuSelect == 2) {
								cpuMove = 100;
							}
						} else if (cpuChangePoint == 24) {
							System.out.println("cpu  [3]왼쪽진행 [4]오른쪽진행");
							cpuSelect = scan.nextInt();
						} else if (cpuChangePoint == 0 ) {
							System.out.println("cpu  [5]대각진행 [6]아래쪽진행");
							cpuSelect = scan.nextInt();
							if (cpuSelect == 5) {
								cpuMove = 100;
							}
						} else if (cpuChangePoint == 42) {
							System.out.println("cpu [8]오른쪽진행");
							cpuSelect = scan.nextInt();
						}
						System.out.println();
						System.out.println("cpu의 윷 던지기 ");
						input = scan.nextInt();
						System.out.println(Arrays.toString(yut));
						System.out.println(yutCount);
						if (yutCount == 4 || yutCount == 5) {
							if (yutCount == 5) {
								System.err.println("모! \n한번 더 던지기!");
							} else {
								System.err.println("윷! \n한번 더 던지기!");
							}
							turn++;
						}
						turn++;
						if (cpuPoint == 48) { // 처음시작 포인트 구하기 ==> 매 분기구간마다 space false 리셋
							cpuMove += yutCount; // 이부분 수정 => move값은 변함
							tempCount = yutCount * 7;
							if (cpuSpace == false) {//중간 공백 건너뛸 조건 음,,,
								if (cpuMove > 2) {
									cpuChangePoint -= 7;
									cpuSpace = true;
								}
							}
							cpuChangePoint -= tempCount;
							if (cpuChangePoint == playerChangePoint) { // 매번 변할때 넣어야함
								System.out.println("플레이어 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
								playerPoint = 48;
								playerChangePoint = 48;
								playerMove = 0;
								playerSpace = false;
								select = -1;
								clear = 1;
							}
							if (cpuChangePoint < 6) {
								cpuPoint = 6;
								cpuChangePoint = 6;
								cpuSelect = 1;
								tempCount = cpuMove - 5;
								cpuChangePoint -= tempCount;
								if (cpuChangePoint == playerChangePoint) { // 매번 변할때 넣어야함
									System.out.println("플레이어 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
									playerPoint = 48;
									playerChangePoint = 48;
									playerMove = 0;
									playerSpace = false;
									select = -1;
									clear = 1;
								}
								if (cpuMove >= 8) {
									cpuChangePoint -= 1;
									cpuSpace = true;
								}
								continue;
							}
						} if (cpuSelect == 1) { // 6분기점 왼이동
							cpuMove += yutCount;
							tempCount = yutCount * 1;
							if (cpuSpace == false) {
								if (cpuMove >= 8) {
									cpuChangePoint -= 1;
									cpuSpace = true;
								}
							}
							cpuChangePoint -= tempCount;
							if (cpuChangePoint == playerChangePoint) { // 매번 변할때 넣어야함
								System.out.println("플레이어 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
								playerPoint = 48;
								playerChangePoint = 48;
								playerMove = 0;
								playerSpace = false;
								select = -1;
								clear = 1;
							}
							if (cpuChangePoint < 0) {
								cpuPoint = 0;
								cpuChangePoint = 0;
								cpuSelect = 6;
								tempCount = (cpuMove - 10) * 7;
								cpuChangePoint += tempCount;
								if (cpuChangePoint == playerChangePoint) { // 매번 변할때 넣어야함
									System.out.println("플레이어 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
									playerPoint = 48;
									playerChangePoint = 48;
									playerMove = 0;
									playerSpace = false;
									select = -1;
									clear = 1;
								}
								continue;
							}
						}else  if (cpuSelect == 2) { // 첫번째 대각
							cpuMove += yutCount; 
							tempCount = yutCount * 6;
							cpuChangePoint += tempCount;
							if (playerChangePoint == cpuChangePoint) { // 매번 변할때 넣어야함
								System.out.println("컴퓨터 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
								playerPoint = 48;
								playerChangePoint = 48;
								playerMove = 0;
								playerSpace = false;
								select = -1;
								clear = 1;
							}
							if (cpuMove >= 106) {
								tempCount = cpuMove-106; // 6 - 대각포인트
								System.out.println("cpu tempCount : "+tempCount);
								cpuPoint = 42;
								cpuChangePoint = 42;
								cpuMove = 15;
								cpuClear = 3;
								cpuSelect = 8; // 여기부터 수정
								
								cpuChangePoint += tempCount;
								if (cpuChangePoint == playerChangePoint) { // 매번 변할때 넣어야함
									System.out.println("플레이어 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
									playerPoint = 48;
									playerChangePoint = 48;
									playerMove = 0;
									playerSpace = false;
									select = -1;
									clear = 1;
								}
								if (cpuChangePoint >= 45) {
									cpuChangePoint += 1;
									cpuSpace = true;
								}
								continue;
							}
						} else if (cpuSelect == 4) {
							cpuMove += yutCount; 
							tempCount = yutCount * 8;
							cpuChangePoint += tempCount;
							if (playerChangePoint == cpuChangePoint) { // 매번 변할때 넣어야함
								System.out.println("컴퓨터 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
								cpuPoint = 48;
								cpuChangePoint = 48;
								cpuMove = 0;
								cpuSpace = false;
								cpuSelect = -1;
								cpuClear = 1;
							}
							if (cpuChangePoint >= 48) {
								cpuChangePoint = 48;
								over = true;
								continue;
							}
						} else if (cpuSelect == 3) {
							cpuMove += yutCount; 
							tempCount = yutCount * 6;
							cpuChangePoint += tempCount;
							if (playerChangePoint == cpuChangePoint) { // 매번 변할때 넣어야함
								System.out.println("컴퓨터 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
								playerPoint = 48;
								playerChangePoint = 48;
								playerMove = 0;
								playerSpace = false;
								select = -1;
								clear = 1;
							}
							if (cpuMove >= 106) {
								tempCount = cpuMove-106; 
								System.out.println("cpu tempCount : "+tempCount);
								cpuPoint = 42;
								cpuChangePoint = 42;
								cpuMove = 15;
								cpuClear = 3;
								cpuSelect = 8; 
								
								cpuChangePoint += tempCount;
								if (cpuChangePoint == playerChangePoint) { // 매번 변할때 넣어야함
									System.out.println("플레이어 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
									playerPoint = 48;
									playerChangePoint = 48;
									playerMove = 0;
									playerSpace = false;
									select = -1;
									clear = 1;
								}
								if (cpuChangePoint >= 45) {
									cpuChangePoint += 1;
									cpuSpace = true;
								}
								continue;
							}
						} else if (cpuSelect == 5) { // 0기준 대각진행
							cpuMove += yutCount; 
							tempCount = yutCount * 8;
							cpuChangePoint += tempCount;
							if (playerChangePoint == cpuChangePoint) { // 매번 변할때 넣어야함
								System.out.println("컴퓨터 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
								cpuPoint = 48;
								cpuChangePoint = 48;
								cpuMove = 0;
								cpuSpace = false;
								cpuSelect = -1;
								cpuClear = 1;
							}
							if (cpuChangePoint >= 48) {
								cpuChangePoint = 48;
								over = true;
								continue;
							}
						} else if (cpuSelect == 6) { // 0기준 아래진행
							cpuMove += yutCount; 
							tempCount = yutCount * 7;
							if (cpuSpace == false) {
								if (cpuMove >= 13) {
									cpuChangePoint += 7;
									cpuSpace = true;
								}
							}
							cpuChangePoint += tempCount;
							if (cpuChangePoint == playerChangePoint) { // 매번 변할때 넣어야함
								System.out.println("플레이어 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
								playerPoint = 48;
								playerChangePoint = 48;
								playerMove = 0;
								playerSpace = false;
								select = -1;
								clear = 1;
							}
							if (cpuChangePoint >= 42) {
								cpuPoint = 42;
								cpuChangePoint = 42;
								cpuSelect = 8;
								tempCount = cpuMove - 15;
								cpuChangePoint += tempCount;
								if (cpuChangePoint == playerChangePoint) { // 매번 변할때 넣어야함
									System.out.println("플레이어 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
									playerPoint = 48;
									playerChangePoint = 48;
									playerMove = 0;
									playerSpace = false;
									select = -1;
									clear = 1;
								}
								if (cpuMove >= 18) {
									cpuChangePoint += 1;
									cpuSpace = true;
								}
								continue;
							}
						} else if (cpuSelect == 8 || cpuSelect == 10) {
							cpuMove += yutCount; 
							tempCount = yutCount * 1;
//							System.out.println("tempCount : "+tempCount);
							if (cpuSpace == false) {
								if (cpuMove >= 18) {
									cpuChangePoint += 1;
									cpuSpace = true;
								}
							}
							cpuChangePoint += tempCount;
							if (playerChangePoint == cpuChangePoint) { // 매번 변할때 넣어야함
								System.out.println("컴퓨터 잡힘! \n잡힌 말은 시작지점으로 돌아갑니다");
								playerPoint = 48;
								playerChangePoint = 48;
								playerMove = 0;
								playerSpace = false;
								select = -1;
								clear = 1;
							}
							if (cpuChangePoint >= 48) {
								System.err.println("플레이어 승리");
								cpuChangePoint = 48;
								over = true;
								continue;
							}
						}
					} 
				}
				}
			else if(ss == 4) {
				System.out.println("게임 종료!");
				break;
			}
			else {System.out.println("다시 입력하세요.");}
		}
	
		scan.close();
	}
}
