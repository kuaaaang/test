package E2_�迭2_�⺻�̷�;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class �迭2_������Ʈ_���Ǳܱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		    [���Ǳܱ�]
		  
		    �������� ���ǹ迭�� 1 �Ǵ� 7 �� �����Ѵ�. 
		    ȭ���� { * * * * * * * } �̷��� ����Ѵ�.
			�ε��� 3���� �����ְ�, 
			�ε��� 3���� ���� ���� 7�̸�  ��÷�̴�.
			
		    [����1] 
		    	�ݵ�� 7�� 3���̻� �־�� �Ѵ�.	
				[��] 1,1,7,7,1,7,1
			
			[����2] 
				�ѹ� �� �ε����� �ǰ�������. 		
				[��] 2,2,2
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int ����[] = new int[7];
		int _1 = 0;
		int _7 = 0;
		int index = 0;
		
		
		while(true) {
			int n = ran.nextInt(2);
			if(n == 0 && _7 < 3) {
				����[index] = 7;
				index +=1;
				_7 +=1;
			}
			else if(n == 1 && _1 < 4) {
				����[index] = 1;
				index +=1;
				_1 +=1;
			}
			if(_1 == 4 && _7 == 3) {
				break;
			}
		}
		
		System.out.println();
		boolean check[] = new boolean[7];
		int count = 0;
		while(true) {
			for(int i = 0; i<7; i+=1) {
				if(check[i] == false) {
					System.out.print("*  ");
				}else{
					System.out.print(����[i] + "  ");
				}
			}
			System.out.println();
			
			if(count == 3) {break;}
			
			System.out.print("�ڸ��Է� : ");
			int s = scan.nextInt();
			if (s<0 || s>6) {
				System.out.println("����! �ٽ� �������ּ���.");
				continue;
			}
			if(check[s] == false) {
				check[s] = true;
				count +=1;
			}else if(check[s] == true) {
				System.out.println("�̹� ������ �ڸ��Դϴ�.");
			}
		}

		int win = 0;
		for(int i = 0; i<7; i+=1){
			if(check[i] == true && ����[i] == 7) {
				win +=1;
			}
		}
		if(win == 3) {System.out.println("��÷!");}
		else {System.out.println("��!");}
		System.out.println(Arrays.toString(����));	
		
		scan.close();		
	}
}
