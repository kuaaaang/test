package E_�׽�Ʈ_����;

import java.util.Arrays;
import java.util.Scanner;

public class _0702_�׽�Ʈ2_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[����] 
		�Ʒ� �迭 c�� ��ȣ�� ���� �ѽ��� �迭�̴�. 
		��ȣ�� �ϳ��� �Է¹ް� c�迭�� �ִ� ��ȣ�̸�, 
		�׹�ȣ��  ���� �����ϰ� d�迭�� �����Ѵ�.
		[��]  
			c[] = { 1001, 40, 1002, 65, 1003, 70 };
			�Է� : 1002 
			c[] = {1001, 40, 1003, 70}; 
		*/
		Scanner scan = new Scanner(System.in);
		
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = null;
		
		int count = 0;
		int index = 0;
		int a = 0;
		System.out.println("��ȣ�� �Է��ϼ���.");
		int n = scan.nextInt();
		for(int i = 0; i<c.length; i+=1) {
			if(n == c[i]) {
				count += 1;
				a = i;
			}
			else {continue;}
		}
		
		if(count != 0) {d = new int[4];}
		else if(count == 0) {d = new int[6];}
		
		for(int i = 0; i<c.length; i+=1) {
			if(c[i] != c[a] && c[i] != c[a+1]) {
				d[index] = c[i];
				index += 1;
			}
		}
		
		System.out.println(Arrays.toString(d));
		
		scan.close();
	}
}
