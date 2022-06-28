package E_배열_과제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 팀_공모전_3 {
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scan= new Scanner(System.in);
		
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
				int r = rnd.nextInt(2);
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
//						System.out.println("tempCount : "+tempCount);
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
//					System.out.println("tempCount : "+tempCount);
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
}
