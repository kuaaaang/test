package E8_�迭8_��ȭ������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭8_������Ʈ_ũ�����������̵�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [ũ������ �����̵�]
		  1. ���� ũ��� 7 x 7 �̴�. 
		  2. ��(1)��(2)��(3)��(4)�� �̵��� �����ϸ�,
		     ��ź��ġ(5), ����(6)�� �����Ѵ�. 
		  3. ��(3), �÷��̾�(2), ��ź(9), ������(4)�� �����Ѵ�.
		  4. ��, ��ź�� ��ġ�� ������� ������ �ϸ�,
		     ���� �� ���ڰ� ���·� ������.
		  5. �� �ı��� �������� �����ϰ� �����Ǿ�,
		     �������� ������ ��ġ�� �� �ִ� ��ź�� ������ �����ȴ�.
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
		while(count1<10) { // ���� ��ġ
			int ry = ran.nextInt(7);
			int rx = ran.nextInt(7);
			
			if(map[ry][rx] == 0) {
				map[ry][rx] = 3;
				count1 += 1;
			}
			else {continue;}
		}
		
		int count2 = 0;
		while(count2<3) { // ������ ��ġ
			int riy = ran.nextInt(7);
			int rix = ran.nextInt(7);
			
			if(map[riy][rix] == 0) {
				map[riy][rix] = 4;
				count2 += 1;
			}
			else {continue;}
		}
		
		while(true) { // ���� ����
			System.out.println("------------------------");
			System.out.println("     " + "Crazy Arcade");
			System.out.println("------------------------");
			System.out.println("��ġ����  ��ź ���� : " + a + "EA");
			System.out.println("�����ִ�  ��ź ���� : " + b + "EA");
			System.out.println("�����ִ�  ���� ���� : " + c + "EA");
			System.out.println("ȹ�氡�� ������ ���� : " + d + "EA");
			System.out.println("------------------------");
			if(b>0) {
				System.out.println("��ġ�� ��ź ��ġ");
				for(int i = 0; i<b; i+=1){
					System.out.print("[" + (i+1) + "] " + item[0][i] + " : " + item[1][i]);
					System.out.println();
				}
				System.out.println("------------------------");
			}
			
			
			for(int i = 0; i<map.length; i+= 1) { // �÷��̾�(2), ��(3), ������(4), ��ź(9)
				for(int j = 0; j<map[i].length; j+= 1) {
					if(map[i][j] == 2) {System.out.print("[��]");}
					else if(map[i][j] == 3) {System.out.print("[��]");}
					else if(map[i][j] == 4) {System.out.print("[��]");}
					else if(map[i][j] == 9) {System.out.print("[��]");}
					else {System.out.print("[ ]");}
				}
				System.out.println();
			}
			map[py][px] = 2;
			
			System.out.println("[1. ��][2. ��][3. ��][4. ��]");
			System.out.println("[5. ��ź ��ġ][6. ��ź ����]");
			System.out.print("�Է� : ");
			int n = scan.nextInt();
			
			if(n == 1) { // ��
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
			else if(n == 2) { // �Ʒ�
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
			else if(n == 3) { // ����
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
			else if(n == 4) { // ������
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
					System.out.println("�������� �����ϴ�.");
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
						System.out.println("��������![ĳ���� ���]");
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
					System.out.println("��ġ�� ��ź�� �����ϴ�.");
					continue;
				}
			}
			if(c == 0) {
				for(int i = 0; i<map.length; i+= 1) {
					for(int j = 0; j<map[i].length; j+= 1) {
						if(map[i][j] == 2) {System.out.print("[��]");}
						else if(map[i][j] == 3) {System.out.print("[��]");}
						else if(map[i][j] == 4) {System.out.print("[��]");}
						else if(map[i][j] == 9) {System.out.print("[��]");}
						else {System.out.print("[ ]");}
					}
					System.out.println();
				}
				System.out.println("����!");
				break;
			}
		}	
		scan.close();
	}
}
