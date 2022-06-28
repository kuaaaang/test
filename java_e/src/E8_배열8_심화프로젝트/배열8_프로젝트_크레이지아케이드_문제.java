package E8_배열8_심화프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열8_프로젝트_크레이지아케이드_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [크레이지 아케이드]
		  1. 맵의 크기는 7 x 7 이다. 
		  2. 상(1)하(2)좌(3)우(4)로 이동이 가능하며,
		     폭탄설치(5), 폭파(6)로 설정한다. 
		  3. 벽(3), 플레이어(2), 폭탄(9), 아이템(4)로 설정한다.
		  4. 단, 폭탄이 설치된 순서대로 터져야 하며,
		     폭파 시 십자가 형태로 터진다.
		  5. 벽 파괴시 아이템이 랜덤하게 생성되어,
		     아이템을 먹으면 설치할 수 있는 폭탄의 개수가 증가된다.
		*/
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int map[][] = new int[7][7];
		int item[][] = new int[2][15];
		
		int a = 5;
		int b = 0;
		int c = 10;
		int d = 3;
		
		
		int py = ran.nextInt(7);
		int px = ran.nextInt(7);
		map[py][px] = 2;
		
		int count1 = 0;
		while(count1<10) { // 함정 설치
			int ry = ran.nextInt(7);
			int rx = ran.nextInt(7);
			
			if(map[ry][rx] == 0) {
				map[ry][rx] = 3;
				count1 += 1;
			}
			else {continue;}
		}
		
		int count2 = 0;
		while(count2<3) { // 아이템 설치
			int riy = ran.nextInt(7);
			int rix = ran.nextInt(7);
			
			if(map[riy][rix] == 0) {
				map[riy][rix] = 4;
				count2 += 1;
			}
			else {continue;}
		}
		
		while(true) { // 게임 시작
			System.out.println("------------------------");
			System.out.println("     " + "Crazy Arcade");
			System.out.println("------------------------");
			System.out.println("설치가능  폭탄 개수 : " + a + "EA");
			System.out.println("남아있는  폭탄 개수 : " + b + "EA");
			System.out.println("남아있는  벽돌 개수 : " + c + "EA");
			System.out.println("획득가능 아이템 개수 : " + d + "EA");
			System.out.println("------------------------");
			if(b>0) {
				System.out.println("설치된 폭탄 위치");
				for(int i = 0; i<b; i+=1){
					System.out.print("[" + (i+1) + "] " + item[0][i] + " : " + item[1][i]);
					System.out.println();
				}
				System.out.println("------------------------");
			}
			
			
			for(int i = 0; i<map.length; i+= 1) { // 플레이어(2), 벽(3), 아이템(4), 폭탄(9)
				for(int j = 0; j<map[i].length; j+= 1) {
					if(map[i][j] == 2) {System.out.print("[☆]");}
					else if(map[i][j] == 3) {System.out.print("[■]");}
					else if(map[i][j] == 4) {System.out.print("[♥]");}
					else if(map[i][j] == 9) {System.out.print("[※]");}
					else {System.out.print("[ ]");}
				}
				System.out.println();
			}
			map[py][px] = 2;
			
			System.out.println("[1. ↑][2. ↓][3. ←][4. →]");
			System.out.println("[5. 폭탄 설치][6. 폭탄 폭파]");
			System.out.print("입력 : ");
			int n = scan.nextInt();
			
			if(n == 1) { // 위
				if(py != 0 && map[py-1][px] == 0) {
					int temp = map[py][px];
					map[py][px] = map[py-1][px];
					map[py-1][px] = temp;
					py -= 1;
				}
				else if(py != 0 && map[py-1][px] == 4) {
					map[py][px] = 0;
					map[py-1][px] = 2;
					a += 1;
					d -= 1;
					py -= 1;
				}
				else {continue;}
			}
			else if(n == 2) { // 아래
				if(py != 6 && map[py+1][px] == 0) {
					int temp = map[py][px];
					map[py][px] = map[py+1][px];
					map[py+1][px] = temp;
					py += 1;
				}
				else if(py != 6 && map[py+1][px] == 4) {
					map[py][px] = 0;
					map[py+1][px] = 2;
					a += 1;
					d -= 1;
					py += 1;
				}
				else {continue;}
			}
			else if(n == 3) { // 왼쪽
				if(px != 0 && map[py][px-1] == 0) {
					int temp = map[py][px];
					map[py][px] = map[py][px-1];
					map[py][px-1] = temp;
					px -= 1;
				}
				else if(px != 0 && map[py][px-1] == 4) {
					map[py][px] = 0;
					map[py][px-1] = 2;
					a += 1;
					d -= 1;
					px -= 1;
				}
				else {continue;}
			}
			else if(n == 4) { // 오른쪽
				if(px != 6 && map[py][px+1] == 0) {
					int temp = map[py][px];
					map[py][px] = map[py][px+1];
					map[py][px+1] = temp;
					px += 1;
				}
				else if(px != 6 && map[py][px+1] == 4) {
					map[py][px] = 0;
					map[py][px+1] = 2;
					a += 1;
					d -= 1;
					px += 1;
				}
				else {continue;}
			}
			else if(n == 5) {
				if(a>0) {
					map[py][px] = 9;
					a -= 1;
					item[0][b] = py;
					item[1][b] = px;
					b += 1;
				}
				else {
					System.out.println("아이템이 없습니다.");
					continue;
				}
			}
			else if(n == 6) {
				if(b>0) {
					if(map[item[0][0]][item[1][0]] == 2 ||
					   (item[0][0] > 0 && map[item[0][0]-1][item[1][0]] == 2) ||
					   (item[0][0] < 6 && map[item[0][0]+1][item[1][0]] == 2) ||
					   (item[1][0] > 0 && map[item[0][0]][item[1][0]-1] == 2) ||
					   (item[1][0] < 6 && map[item[0][0]][item[1][0]+1] == 2)) {
						System.out.println("게임종료![캐릭터 사망]");
						break;
					}
					
					map[item[0][0]][item[1][0]] = 0;
					if(item[0][0] > 0 && map[item[0][0]-1][item[1][0]] != 0) {
						if(map[item[0][0]-1][item[1][0]] == 4) {
							c += 1;
							d -= 1;
						}
						map[item[0][0]-1][item[1][0]] = 0;
					    c -= 1;
					}if(item[0][0] < 6 && map[item[0][0]+1][item[1][0]] != 0) {
						if(map[item[0][0]+1][item[1][0]] == 4) {
							c += 1;
							d -= 1;
						}
						map[item[0][0]+1][item[1][0]] = 0;
					    c -= 1;
					}if(item[1][0] > 0 && map[item[0][0]][item[1][0]-1] != 0) {
						if(map[item[0][0]][item[1][0]-1] == 4) {
							c += 1;
							d -= 1;
						}
						map[item[0][0]][item[1][0]-1] = 0;
                        c -= 1;
                    }if(item[1][0] < 6 && map[item[0][0]][item[1][0]+1] != 0) {
                    	if(map[item[0][0]][item[1][0]+1] == 4) {
							c += 1;
							d -= 1;
						}
                    	map[item[0][0]][item[1][0]+1] = 0;
                        c -= 1;
                    }
					
					for(int k = 0; k<12; k+=1) {
						item[0][k] = 0;
						item[1][k] = 0;
						
						int tempy = item[0][k];
						item[0][k] = item[0][k+1];
						item[0][k+1] = tempy;
						
						int tempx = item[1][k];
						item[1][k] = item[1][k+1];
						item[1][k+1] = tempx;
					}
					b -= 1;
				}
				else {
					System.out.println("설치된 폭탄이 없습니다.");
					continue;
				}
			}
			if(c == 0) {
				for(int i = 0; i<map.length; i+= 1) {
					for(int j = 0; j<map[i].length; j+= 1) {
						if(map[i][j] == 2) {System.out.print("[☆]");}
						else if(map[i][j] == 3) {System.out.print("[■]");}
						else if(map[i][j] == 4) {System.out.print("[♥]");}
						else if(map[i][j] == 9) {System.out.print("[※]");}
						else {System.out.print("[ ]");}
					}
					System.out.println();
				}
				System.out.println("성공!");
				break;
			}
		}	
		scan.close();
	}
}
