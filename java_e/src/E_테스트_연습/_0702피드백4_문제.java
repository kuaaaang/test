package E_�׽�Ʈ_����;

import java.util.Arrays;
import java.util.Random;

public class _0702�ǵ��4_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	
	 	���� arr �迭�� ��ȣ�� ������ ���������� ����� �迭�̴�.
	 	�������� 0~5�� �Է¹޴´�. 
	 	�������� �����ε����� �����ϰ� b�� ������ ����Ѵ�.
	 	���� ������ �߰��� ������Ų��.
	 	[����1] 
	 		�������� 0~5�� �̴µ� ��ȣ�� �ε����� �̴´ٸ� �ٷ� ���� ���� �����ϰ� b�� �����Ѵ�.
	 	[����2]
	 		�������� 0~5�� �̴µ� ������ �ε����� �̴´ٸ� �ٷ� ���� ���� �����ϰ� b�� �����Ѵ�.
	 	[����1]
	 		3 ==> 40 �� �ش�ǹǷ� 1002�� 40�� �����Ѵ�.
	 		b = {1001,20,1003,50};
	 	[����2]
	 		0 ==> 1001 �� �ش�ʷ� 1001��20�� �����Ѵ�.
	 		b = {1002,40,1003,50}
	 */
		Random ran = new Random();
		int arr [] = {1001,20,1002,40,1003,50};
		int b [] = null;
		
		b = new int[arr.length-2];
		int r = ran.nextInt(6);
		int index = 0;
		
		System.out.println("�������� : " + r);
		if(r%2 == 0) {
			for(int i = 0; i<arr.length; i+=1) {
				if(arr[r] != arr[i] && arr[r+1] != arr[i]) {
					b[index] = arr[i];
					index += 1;
					if(index == 5) {break;}
				}
			}
		}
		else if(r%2 == 1) {
			for(int i = 0; i<arr.length; i+=1) {
				if(arr[r] != arr[i] && arr[r-1] != arr[i]) {
					b[index] = arr[i];
					index += 1;
					if(index == 5) {break;}
				}
			}
		}
		
		System.out.println(Arrays.toString(b));
	}
}
