package E2_�迭2_�⺻�̷�;

 import java.util.Random;
 import java.util.Scanner;

public class �迭2_������Ʈ_�Ｎ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   �Ｎ���ǹ���) ����� 7�� �迭�� �ִ�. 
		    - [1. ���� ���Ȯ��] �Է½� "��÷" �Ǵ� "��" ��� 
		    - 1 �Ǵ� 7��  �������� �迭�� �����Ѵ�.   [��] 1,7,7,1,1,1,7
		    - 7�̿������� 3���̻��̸� "��÷" �ƴϸ� "��" �̴�.
		    - ��÷�̵Ǹ� 3000�� ȹ���Ѵ�.
		    - ���̵Ǹ� 1000�� �����Ѵ�.
		    
		    [����] �ݵ�� 7�� 3���̻� �־���Ѵ�. 
		*/
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int ����[] = new int[7];
		
		int money = 1000;
		int count = 0;
		while(true) {
			System.out.println("[�ܾ� : " + money + "��]");
			System.out.println("[1. ���� ���Ȯ��]");
			System.out.println("[2. ������]");
			System.out.println("[0. ����]");
			int n = scan.nextInt();
			
			if(n==1) {
				while(true) {
					int _7 = 0;
					for(int i = 0; i<7; i+=1) {
						int r = ran.nextInt(2);
						if(r==0) {
							����[i] = 1;
						}
						else if(r==1) {
							����[i] = 7;
							_7 +=1;
						}
					}
					if(_7 >= 3) {
						break;
					}
				}
				
				int _7 = 0;
				boolean win = false;
				for(int i = 0; i<7; i+=1) {
					if(����[i] == 7) {
						_7 +=1;
						if(_7 >=3) {
							win = true;
							break;
						}
					}else {
						_7 = 0;
					}
				}
				for(int i = 0; i<7; i+=1) {System.out.print(����[i] + "  ");}
				System.out.println();
				if(win == true) {money  = money + 3000;}
				else {money  = money - 1000;}
				
			}
			else if(n==2) {
				System.out.println("������ �ݾ��� �Է����ּ���.");
				int pmoney = scan.nextInt();
				money = money + pmoney;
			}
			else if(n==0) {
				System.out.println("����");
				break;
			}
			else {
				System.out.println("����! �ٽ� �����ϼ���.");
			}
		}	
		scan.close();	
	}
}
