package E6_�迭6_�˰���;

import java.util.Arrays;

public class �迭6_������Ʈ_�����̱� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  �� �����ʹ� �����̱� ����� ������ �̴�. (7 x 5) ������
		  [������ȣ] 
		  [1 : ȣ����] [2 : ��] [3 : ����] [4 : �⸰]
		  -------------------------------------------------
		  [1] ���� 0 �� ����ִ°������Ѵ�.
		  [2] ���� 0 �� �ƴѰ��� ������ �ִ°��� ���ϰ� ���ڴ� ������ȣ�̴�.
		  [3] input�� �����ʹ� ���� �մԵ��� ������ ������ �ε�����ȣ�̴�.
		  [4] �� �δ����� �Ѷ����̰�, �ε�����ȣ�� ���η� ������ �ȴ�. (�� 0~4������ ����)
		  [5] ������ �����κ� ������������ �����Եȴ�. 
		  ��) input ==> 1 ==> 2,1,4,1,1 �����̰� ������ 2�� 0�̵ȴ�.
		  [6] ���࿡ ���� ���� 0�� ������ �����ϰԵǸ�, "��" ��� 
		  [7] ���� �Ǹŵ� ���� �̸��� ����Ͻÿ�. 
		  ��) 
		     1 ==> [2:��]
		     0 ==> [3:����]
		     0 ==> [1:ȣ����]
		     3 ==> [3:����]
		     3 ==> [0:��]
		     4 ==> [3:����]
		     4 ==> [3:����]
		*/
			String ����[] = {"ȣ����" , "��" , "����" , "�⸰"};
			// 2 3 1 3 0 3 3 // �� ���� ȣ���� ���� �� ���� ����
		
		    int machine[][] = { 
					{0,0,0,0,0},
					{0,0,0,0,3},
					{0,2,0,0,3},
					{3,1,3,0,1},
					{1,4,2,0,2},
					{4,1,4,0,4},
					{2,1,4,3,3},
			};
			int input[] = {1,0,0,3,3,4,4};
			
			int total = 0;
			for(int k = 0; k<input.length; k+=1){
				System.out.println(Arrays.toString(machine[k]));
			}
			System.out.println();
			
			for(int i = 0; i<input.length; i+=1){
				
				int count = 0;
				for(int j = 0; j<machine.length; j+=1) {
					if(machine[j][input[i]] == 0) {
						count += 1;
					}
					else if(machine[j][input[i]] != 0) {
						System.out.println(����[(machine[j][input[i]])-1] + "������ �̾ҽ��ϴ�.");
						machine[j][input[i]] = 0;
						total += 1;
						break;
					}
					if(count == 7) {
						System.out.println("��!");
					}
				}
				for(int k = 0; k<input.length; k+=1){
					System.out.println(Arrays.toString(machine[k]));
				}
				System.out.println();
			}
			System.out.println("�Ǹŵ� ���� : " + total + "��");
	}
}
