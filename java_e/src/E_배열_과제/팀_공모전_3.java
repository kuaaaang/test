package E_�迭_����;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ��_������_3 {
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scan= new Scanner(System.in);
		
		int[][] map = new int[7][7];
		int leftSpace = 2; // ���� �� ���� �ε���
		int rightSpcace = 4; // ���� �� ����
		int input = -1;
		int select = 0;
		int cpuSelect = -1;
		int playerPoint = 48; // �б��� �Ǻ� ����Ʈ
		int cpuPoint= 48;
		int playerMove = 0; // ��ĭ �̵��ΰ� �б��� �Ǻ� ĭ��
		int cpuMove = 0;
		int playerChangePoint = playerPoint; // ĭ�� �Ǻ� ����Ʈ
		int cpuChangePoint = 48;
		boolean playerSpace = false; // ���� �ǳʶ� �Ǻ� ����
		boolean cpuSpace = false; 
		int clear = 1;
		int cpuClear = 1;
		boolean over = false;
		int turn = 0;
		while (true) {
			if (input == 9) {
				break;
			}
			leftSpace = 2; // ���� �� ���� �ε���
			rightSpcace = 4; // ���� �� ����
			
			int[] yut = new int[4];
			int yutCount = 0;
			for (int i = 0; i < yut.length; i++) { // �� ������
				int r = rnd.nextInt(2);
				yut[i] = r;
				if (r == 1) {
					yutCount++;
				}
			}
			if (yutCount == 0) { // ��
				yutCount = 5;
			}
			
			int count = 0; // �迭��ġ �� ����
			int tempCount = 0;
			boolean insert = false;
			boolean delete = false;
			//�迭�� �־�� ����� ==> �� �� true�� break;
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
			// ���
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if ( j == 3 && i != 3) {
						System.out.printf("     ");
					} else if (i == 3 && j != 3) {
						System.out.printf("     ");
					} else if (i != 0 && i != 6 && (leftSpace == j || rightSpcace == j)  ) { 
							System.out.printf("     ");
					} else if (map[i][j] == 1)  {
						System.out.printf("[�� ] ");
					} else if (map[i][j] == 2) {
						System.out.printf("[�� ] ");
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
 					System.err.println("player ��");
 					break;
 				} else {
 					System.err.println("cpu ��");
 					break;
 				}
			}
			//============================================================
			if (turn % 2 == 0) { // �÷��̾�
				// �迭�� �־��ִ� ��ġ ���ϱ� ���� / �迭�� �ֱ� ���� / ��� ���� / �迭�� �־��� ��ġ ���ϱ�
				if (playerMove/5 == clear) { 
					playerSpace = false;
					clear++;
				}
				if (playerChangePoint == 6) { // �� �б���
					playerPoint = 6;
					System.out.println("player [1]�������� [2]�밢����");
					select = scan.nextInt();
					if (select == 2) {
						playerMove = 100;
					}
				} else if (playerChangePoint == 24) {
					System.out.println("player [3]�������� [4]����������");
					select = scan.nextInt();
				} else if (playerChangePoint == 0) {
					System.out.println("player [5]�밢���� [6]�Ʒ�������");
					select = scan.nextInt();
					if (select == 5) {
						playerMove = 10;
					}
				} else if (playerChangePoint == 42) {
					System.out.println("player [8]����������");
					select = 8;
				}
				System.out.println("player�� �� ������ ");
				input = scan.nextInt();
				System.out.println(Arrays.toString(yut));
				System.out.println(yutCount);
				if (yutCount == 4 || yutCount == 5) {
					if (yutCount == 5) {
						System.err.println("��! \n�ѹ��� ������!");
					} else {
						System.err.println("��! \n�ѹ��� ������!");
					}
					turn++;
				}
				turn++;
				if (playerPoint == 48) { // ó������ ����Ʈ ���ϱ� ==> �� �бⱸ������ space false ����
					playerMove += yutCount; 
					tempCount = yutCount * 7;
					if (playerSpace == false) {//�߰� ���� �ǳʶ� ����
						if (playerMove > 2) {
							playerChangePoint -= 7;
							playerSpace = true;
						}
					}
					playerChangePoint -= tempCount;
					if (playerChangePoint == cpuChangePoint) { // �Ź� ���Ҷ� �־����
						System.out.println("��ǻ�� ����! \n���� ���� ������������ ���ư��ϴ�");
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
						if (playerChangePoint == cpuChangePoint) { // �Ź� ���Ҷ� �־����
							System.out.println("��ǻ�� ����! \n���� ���� ������������ ���ư��ϴ�");
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
				} if (select == 1) { // 6�б���==========================================
					playerMove += yutCount;
					tempCount = yutCount * 1;
					if (playerSpace == false) {
						if (playerMove >= 8) {
							playerChangePoint -= 1;
							playerSpace = true;
						}
					}
					playerChangePoint -= tempCount;
					if (playerChangePoint == cpuChangePoint) { // �Ź� ���Ҷ� �־����
						System.out.println("��ǻ�� ����! \n���� ���� ������������ ���ư��ϴ�");
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
						if (playerChangePoint == cpuChangePoint) { // �Ź� ���Ҷ� �־����
							System.out.println("��ǻ�� ����! \n���� ���� ������������ ���ư��ϴ�");
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
				} else  if (select == 2) { // ù��° �밢
					playerMove += yutCount; 
					tempCount = yutCount * 6;
					playerChangePoint += tempCount;
					if (playerChangePoint == cpuChangePoint) { // �Ź� ���Ҷ� �־����
						System.out.println("��ǻ�� ����! \n���� ���� ������������ ���ư��ϴ�");
						cpuPoint = 48;
						cpuChangePoint = 48;
						cpuMove = 0;
						cpuSpace = false;
						cpuSelect = -1;
						cpuClear = 1;
					}
					if (playerChangePoint >= 42) {
						tempCount = playerMove-106; // �밢���� - 100
						System.out.println("player tempCount : "+tempCount);
						playerPoint = 42;
						playerChangePoint = 42;
						playerMove = 15;
						clear = 3;
						select = 8; // ������� ����
						
						playerChangePoint += tempCount;
						if (playerChangePoint == cpuChangePoint) { // �Ź� ���Ҷ� �־����
							System.out.println("��ǻ�� ����! \n���� ���� ������������ ���ư��ϴ�");
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
				} else if (select == 4) { // 24���� �����밢����
					playerMove += yutCount; 
					tempCount = yutCount * 8;
					playerChangePoint += tempCount;
					if (playerChangePoint == cpuChangePoint) { // �Ź� ���Ҷ� �־����
						System.out.println("��ǻ�� ����! \n���� ���� ������������ ���ư��ϴ�");
						cpuPoint = 48;
						cpuChangePoint = 48;
						cpuMove = 0;
						cpuSpace = false;
						cpuSelect = -1;
						cpuClear = 1;
					}
					if (playerChangePoint >= 48) {
						System.err.println("�÷��̾� �¸�");
						playerChangePoint = 48;
						over = true;
						continue;
					}
				} else if (select == 3) {
					playerMove += yutCount; 
					tempCount = yutCount * 6;
					playerChangePoint += tempCount;
					if (playerChangePoint == cpuChangePoint) { // �Ź� ���Ҷ� �־����
						System.out.println("��ǻ�� ����! \n���� ���� ������������ ���ư��ϴ�");
						cpuPoint = 48;
						cpuChangePoint = 48;
						cpuMove = 0;
						cpuSpace = false;
						cpuSelect = -1;
						cpuClear = 1;
					}
					if (playerMove >= 106) {
						tempCount = playerMove-106; // �밢���� - 100
						System.out.println("player tempCount : "+tempCount);
						playerPoint = 42;
						playerChangePoint = 42;
						playerMove = 15;
						clear = 3;
						select = 8; 
						
						playerChangePoint += tempCount;
						if (playerChangePoint == cpuChangePoint) { // �Ź� ���Ҷ� �־����
							System.out.println("��ǻ�� ����! \n���� ���� ������������ ���ư��ϴ�");
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
					} else if (select == 5) { // 0���� �밢����
						playerMove += yutCount; 
						tempCount = yutCount * 8;
						playerChangePoint += tempCount;
						if (playerChangePoint == cpuChangePoint) { // �Ź� ���Ҷ� �־����
							System.out.println("��ǻ�� ����! \n���� ���� ������������ ���ư��ϴ�");
							cpuPoint = 48;
							cpuChangePoint = 48;
							cpuMove = 0;
							cpuSpace = false;
							cpuSelect = -1;
							cpuClear = 1;
						}
						if (playerChangePoint >= 48) {
							System.err.println("�÷��̾� �¸�");
							playerChangePoint = 48;
							over = true;
							continue;
						}
					} 
					
					} else  if (select == 6) { // 0���� �Ʒ� ����
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
						if (playerChangePoint == cpuChangePoint) { // �Ź� ���Ҷ� �־����
							System.out.println("��ǻ�� ����! \n���� ���� ������������ ���ư��ϴ�");
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
							if (playerChangePoint == cpuChangePoint) { // �Ź� ���Ҷ� �־����
								System.out.println("��ǻ�� ����! \n���� ���� ������������ ���ư��ϴ�");
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
						if (playerChangePoint == cpuChangePoint) { // �Ź� ���Ҷ� �־����
							System.out.println("��ǻ�� ����! \n���� ���� ������������ ���ư��ϴ�");
							cpuPoint = 48;
							cpuChangePoint = 48;
							cpuMove = 0;
							cpuSpace = false;
							cpuSelect = -1;
							cpuClear = 1;
						}
						if (playerChangePoint >= 48) {
							System.err.println("�÷��̾� �¸�");
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
				if (cpuChangePoint == 6) { // �� �б���
					cpuPoint = 6;
					System.out.println("cpu  [1]�������� [2]�밢����");
					cpuSelect = scan.nextInt();
					if (cpuSelect == 2) {
						cpuMove = 100;
					}
				} else if (cpuChangePoint == 24) {
					System.out.println("cpu  [3]�������� [4]����������");
					cpuSelect = scan.nextInt();
				} else if (cpuChangePoint == 0 ) {
					System.out.println("cpu  [5]�밢���� [6]�Ʒ�������");
					cpuSelect = scan.nextInt();
					if (cpuSelect == 5) {
						cpuMove = 100;
					}
				} else if (cpuChangePoint == 42) {
					System.out.println("cpu [8]����������");
					cpuSelect = scan.nextInt();
				}
				System.out.println();
				System.out.println("cpu�� �� ������ ");
				input = scan.nextInt();
				System.out.println(Arrays.toString(yut));
				System.out.println(yutCount);
				if (yutCount == 4 || yutCount == 5) {
					if (yutCount == 5) {
						System.err.println("��! \n�ѹ� �� ������!");
					} else {
						System.err.println("��! \n�ѹ� �� ������!");
					}
					turn++;
				}
				turn++;
				if (cpuPoint == 48) { // ó������ ����Ʈ ���ϱ� ==> �� �бⱸ������ space false ����
					cpuMove += yutCount; // �̺κ� ���� => move���� ����
					tempCount = yutCount * 7;
					if (cpuSpace == false) {//�߰� ���� �ǳʶ� ���� ��,,,
						if (cpuMove > 2) {
							cpuChangePoint -= 7;
							cpuSpace = true;
						}
					}
					cpuChangePoint -= tempCount;
					if (cpuChangePoint == playerChangePoint) { // �Ź� ���Ҷ� �־����
						System.out.println("�÷��̾� ����! \n���� ���� ������������ ���ư��ϴ�");
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
						if (cpuChangePoint == playerChangePoint) { // �Ź� ���Ҷ� �־����
							System.out.println("�÷��̾� ����! \n���� ���� ������������ ���ư��ϴ�");
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
				} if (cpuSelect == 1) { // 6�б��� ���̵�
					cpuMove += yutCount;
					tempCount = yutCount * 1;
					if (cpuSpace == false) {
						if (cpuMove >= 8) {
							cpuChangePoint -= 1;
							cpuSpace = true;
						}
					}
					cpuChangePoint -= tempCount;
					if (cpuChangePoint == playerChangePoint) { // �Ź� ���Ҷ� �־����
						System.out.println("�÷��̾� ����! \n���� ���� ������������ ���ư��ϴ�");
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
						if (cpuChangePoint == playerChangePoint) { // �Ź� ���Ҷ� �־����
							System.out.println("�÷��̾� ����! \n���� ���� ������������ ���ư��ϴ�");
							playerPoint = 48;
							playerChangePoint = 48;
							playerMove = 0;
							playerSpace = false;
							select = -1;
							clear = 1;
						}
						continue;
					}
				}else  if (cpuSelect == 2) { // ù��° �밢
					cpuMove += yutCount; 
					tempCount = yutCount * 6;
					cpuChangePoint += tempCount;
					if (playerChangePoint == cpuChangePoint) { // �Ź� ���Ҷ� �־����
						System.out.println("��ǻ�� ����! \n���� ���� ������������ ���ư��ϴ�");
						playerPoint = 48;
						playerChangePoint = 48;
						playerMove = 0;
						playerSpace = false;
						select = -1;
						clear = 1;
					}
					if (cpuMove >= 106) {
						tempCount = cpuMove-106; // 6 - �밢����Ʈ
						System.out.println("cpu tempCount : "+tempCount);
						cpuPoint = 42;
						cpuChangePoint = 42;
						cpuMove = 15;
						cpuClear = 3;
						cpuSelect = 8; // ������� ����
						
						cpuChangePoint += tempCount;
						if (cpuChangePoint == playerChangePoint) { // �Ź� ���Ҷ� �־����
							System.out.println("�÷��̾� ����! \n���� ���� ������������ ���ư��ϴ�");
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
					if (playerChangePoint == cpuChangePoint) { // �Ź� ���Ҷ� �־����
						System.out.println("��ǻ�� ����! \n���� ���� ������������ ���ư��ϴ�");
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
					if (playerChangePoint == cpuChangePoint) { // �Ź� ���Ҷ� �־����
						System.out.println("��ǻ�� ����! \n���� ���� ������������ ���ư��ϴ�");
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
						if (cpuChangePoint == playerChangePoint) { // �Ź� ���Ҷ� �־����
							System.out.println("�÷��̾� ����! \n���� ���� ������������ ���ư��ϴ�");
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
				} else if (cpuSelect == 5) { // 0���� �밢����
					cpuMove += yutCount; 
					tempCount = yutCount * 8;
					cpuChangePoint += tempCount;
					if (playerChangePoint == cpuChangePoint) { // �Ź� ���Ҷ� �־����
						System.out.println("��ǻ�� ����! \n���� ���� ������������ ���ư��ϴ�");
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
				} else if (cpuSelect == 6) { // 0���� �Ʒ�����
					cpuMove += yutCount; 
					tempCount = yutCount * 7;
					if (cpuSpace == false) {
						if (cpuMove >= 13) {
							cpuChangePoint += 7;
							cpuSpace = true;
						}
					}
					cpuChangePoint += tempCount;
					if (cpuChangePoint == playerChangePoint) { // �Ź� ���Ҷ� �־����
						System.out.println("�÷��̾� ����! \n���� ���� ������������ ���ư��ϴ�");
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
						if (cpuChangePoint == playerChangePoint) { // �Ź� ���Ҷ� �־����
							System.out.println("�÷��̾� ����! \n���� ���� ������������ ���ư��ϴ�");
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
					if (playerChangePoint == cpuChangePoint) { // �Ź� ���Ҷ� �־����
						System.out.println("��ǻ�� ����! \n���� ���� ������������ ���ư��ϴ�");
						playerPoint = 48;
						playerChangePoint = 48;
						playerMove = 0;
						playerSpace = false;
						select = -1;
						clear = 1;
					}
					if (cpuChangePoint >= 48) {
						System.err.println("�÷��̾� �¸�");
						cpuChangePoint = 48;
						over = true;
						continue;
					}
				}
			} 
		}
	}
}
