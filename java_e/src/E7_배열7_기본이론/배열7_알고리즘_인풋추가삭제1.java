package E7_�迭7_�⺻�̷�;

import java.util.Arrays;

public class �迭7_�˰���_��ǲ�߰�����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /*
		1) array �迭�� ������3�̴�.		
		2) input �迭 ���� ������  �߰��� ������ �ݺ��� �����̴�.		
		3) ¦���ε����� ���� "�߰�" �̰�, 
		4) Ȧ���ε����� ���� "����" �̴�. 
		   [����] �������ڸ��� �ڿ������� ������ �о�� 0���� ǥ�� �Ѵ�. 	
		5) �ߺ��Ȱ��� "�߰�" �Ҽ����� , ���°��� "����"�Ҽ�����.
		6) input�� ������ ���� ó���ϰ� ó��������� 	
		��)
		 10 ==> ¦���ε����̹Ƿ� �߰� ==> array[] = {10,0,0};
		 20 ==> Ȧ���ε����̹Ƿ� ���� ==> 20�� �����Ƿ� ==> "�����Ұ��� �����ϴ�"
		 30 ==> ¦���ε����̹Ƿ� �߰� ==> array[] = {10,30,0};
		 10 ==> Ȧ���ε����̹Ƿ� ���� ==> array[] = {30,0,0};
		 30 ==> ¦���ε����̹Ƿ� �߰� ==> 30 ���̹� ����Ǿ ==> "�ߺ��˴ϴ�"
		 30 ==> Ȧ���ε����̹Ƿ� ���� ==> array[] = {0,0,0};
	   */
		int array[] = {0,0,0};
		int count = 0;
		int c = 0;
			
		int input[] = {10,20,30,10,30,30};
		
		for(int i = 0; i<input.length; i+=1) {
			if(i%2 == 0) {
				int a = 0;
				for(int j = 0; j<array.length; j+=1) {
					if(array[j] != input[i]) {
						a += 1;
						if(a==3) {
							System.out.println("�߰��� �� : " + input[i]);
							array[count] = input[i];
							count += 1;
						}
					}
					else if(array[j] == input[i]) {
						System.out.println("�ߺ��� ���Դϴ�.");
					}
				}
			}
			else if(i%2 != 0) {
				for(int j = 0; j<array.length; j+=1) {
					if(array[j] == input[i]) {
						System.out.println("������ �� : " + array[j]);
						array[j] = 0;
						for(int k = j; k<array.length-1; k+=1) {
							int temp = array[k];
							array[k] = array[k+1];
							array[k+1] = temp;
						}
					}
					else {c += 1;}
				}
				if(c == 3) {System.out.println("������ ���� �����ϴ�.");}
			}
			
			System.out.println(Arrays.toString(array));
			System.out.println();
		}
	}
}
