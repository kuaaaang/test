package E7_�迭7_�⺻�̷�;

import java.util.Arrays;

public class �迭7_�˰���_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 ö���� ������������. 
		 8�� ö���̰� 7�� ���̰� 0�� �̵������Ѱ��̴�.
		 dir �� ö���� �ٶ󺸴� �����̰� 0~3���� �ϵ����� �� ������ ǥ���Ѵ�. 	
		 input�� �����ʹ� 1�� ��ĭ�����̰� 2�� ��ȸ��(90��) 3�� ��ȸ��(90��)�̴�.
		 ȸ���� ���⸸ �ٲ�� �����̴°� ����.
		 input�� ���� �Է¹ް� �ش系���� ���� ����Ͻÿ�.
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
		// �� = 3  , �� = 1 ,  �� = 2 , �� = 0
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
						System.out.println("���� �������ϴ�.");
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
						System.out.println("���� �������ϴ�.");
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
						System.out.println("���� �������ϴ�.");
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
						System.out.println("���� �������ϴ�.");
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
