package E6_�迭6_�˰���;

import java.util.Arrays;

public class �迭6_�˰���_��ǲ�����̵� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   /*
		 [�����̵�����]	
		 move = {1,0,0,0,8,0,0,0,1};	 
		 [1] move ���� 8�� �÷��̾��̴�
		 [2] move ���� 0�� �̵��Ҽ��ִ� ���̴�.
		 [3] move ���� 1�� �̵��Ҽ����� ���̴�. 

		 input �迭�� ������ ���������� �����ϰ�,�������Ͻÿ�.
		 input�ǰ��� 1�� �����̵� , 2�� �������̵��̴�. 
		 ������ �̵��ϸ�, "�̵��Ҽ������ϴ�" ��� 		
		 ����=> {1,0,0,0,8,0,0,0,1};
		 1 ==> {1,0,0,8,0,0,0,0,1};
		 1 ==> {1,0,8,0,0,0,0,0,1};
		 1 ==> {1,8,0,0,0,0,0,0,1};
		 1 ==> "�̵��Ҽ������ϴ�"
		 2 ==> {1,0,8,0,0,0,0,0,1};
		 2 ==> {1,0,0,8,0,0,0,0,1};
		 2 ==> {1,0,0,0,8,0,0,0,1};
	   */
		int move[] = {1,0,0,0,8,0,0,0,1};		
		int input[] = {1,1,1,1,2,2,2};
		
		int a = 0;
		for(int i = 0; i<input.length; i+=1) {
			System.out.println(Arrays.toString(move));
			for(int j = 0; j<input.length; j+=1) {
				if(move[j] == 8) {a = j;}
			}
			if(input[i] == 1) {
				if(move[a-1] == 1) {
					System.out.println("�̵��� �� �����ϴ�.");
				}
				else if(move[a-1] == 0) {
					System.out.println("�������� �̵�!");
					int temp1 = move[a];
					move[a] = move[a-1];
					move[a-1] = temp1;
				}
			}
			else if(input[i] == 2) {
				if(move[a+1] == 1) {
					System.out.println("�̵��� �� �����ϴ�.");
				}
				else if(move[a+1] == 0) {
					System.out.println("���������� �̵�!");
					int temp2 = move[a];
					move[a] = move[a+1];
					move[a+1] = temp2;
				}
			}
		}
		System.out.println(Arrays.toString(move));
	}
}
