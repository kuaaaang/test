package E3_�迭3_�⺻�̷�;

import java.util.Arrays;

public class �迭3_�˰���_��ǲ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * [��ǲ ����]

		    -�Ʒ� 3���� �迭�� [1.��ǰ�̸�] [2.����] [3.��ǰ����] ����Ʈ����̴� .
			
			[��] ���� ���� ������� 3�� , ���ڱ� 1�� , ���� 1�� �ִ�.	
			
			 input �迭�� ���� �ֹ��� ���¼����̴�.
			 �ֹ��� ���� ������ countList�迭�� ���� 1���ҽ�Ų��.
			 �Ѹ����� ����غ�����.
			 
			 [��] ù��° 1 ==> ���ڱ��� ������ 1�̹Ƿ� �Ǹ��Ҽ��ִ�.
			 [��] �ι�° 2 ==> ������ ������ 1�̹Ƿ� �Ǹ��Ҽ��ִ�.
			 [��] ����° 2 ==> ������ ������ �̹� �ι�°���� �����ؼ� 0�̵ǹǷ� �ǸźҰ�.
			 [��] .... �������� ����غ���.
			 
			 �ֹ��� ��  ����� 2�� , ���ڱ� 3�� , ���� 3�� ��������,
			 �������� �׺��� �����ϱ� ������,
			 ���� �Ǹ��� ǰ����  ����� 2�� , ���ڱ� 1�� , ���� 1�� �̴�.		
		 */
			String [] nameList = {"�����" , "���ڱ�" , "����"};
			int [] priceList = {1000, 2100, 3300};
			int [] countList = {3,1,1};
			int [] input = {1,2,2,0,0,2,1,1};		
				
			int[] sel = {0, 0, 0};
			
			for(int i = 0; i<input.length; i+=1) {
				System.out.println();
				System.out.print((i+1) + "�� �մ�  ");
				if(countList[input[i]]>0) {
					countList[input[i]] -= 1;
					sel[input[i]] +=1 ;
					System.out.print(nameList[input[i]] + " ���ſϷ�");
				}
				else {System.out.print(nameList[input[i]] + " ǰ��");
				}
				System.out.println();
				System.out.println("�����Ȳ : " + Arrays.toString(countList));
			}
			
			System.out.println();
			System.out.println("�Ǹ���Ȳ : " + Arrays.toString(sel));
			
			int total = 0;
			for(int i = 0; i<sel.length; i+=1) {
				total = total + sel[i]*priceList[i];
			}
			
			System.out.println("�� �Ǹűݾ� = " + total);
			
	}
}
