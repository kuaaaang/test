package E4_�迭4_�˰���;

import java.util.Arrays;

public class �迭4_�˰���_�縰���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /* 
	    [�縲���]
	    
	    - �縲����̶� �տ��� �����ص� �ڿ��������ص� �Ȱ��� ���̴�.
	    
	  	�� �迭���� 0�̳� 1�� ������ ������ ������ �丰������� ����Ѵ�.
		[��] 1�� 0�� ���� �����ϸ� 3,2,2,3 �̹Ƿ� �縰����̴�.
	 */
		int arr[] = {1,3,0,0,2,1,2,3,0};
		
		int temp[] = new int[arr.length];
		int tcount = 0;
		
		for(int i = 0; i<arr.length; i+=1) {
			if(arr[i] != 0 && arr[i] != 1) {
				temp[tcount] = arr[i];
				tcount += 1;
			}
		}
		System.out.println(Arrays.toString(temp));
		System.out.println(tcount);
		
		System.out.println();
		
		int a = tcount-1;
		boolean check = false;
		for(int j = 0; j<tcount/2; j+=1) {
			if(temp[j] != temp[a]) {
				check = true;
				break;
			}
			a -= 1;
		}
		if(check == false) {System.out.println("�渰��� O");}
		else {System.out.println("�縰��� X");}
	}
}
