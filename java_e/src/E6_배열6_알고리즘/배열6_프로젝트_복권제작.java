package E6_�迭6_�˰���;

import java.util.Arrays;
import java.util.Random;

public class �迭6_������Ʈ_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [��������]
		  1. lottoSet �迭�� 5 * 7 ������ �迭�̴�. 
		  2. ����1���� 7���̰� , �� 5���� ������ ������� �Ѵ�.  
		  3. ���� 1���� ������ 1�Ǵ� 7�� ������ �����Ѵ�. 
		  4. ���� 1���� 7�� �������� 3���̻��̸� "��÷" �̰� �� �̸��� "��" �̴�.
		  5. 5�� �����߿� 1���� ��÷�̰� 4���� ���� ������ �������� �����غ���.
		  
		  ��) �Ʒ��� ���� ���ٸ� "��÷" �̰� ������ 4���� "��"�̴�.
		  1177117 (��)
		  1117771 (��÷)
		  7171117 (��)
		  7711771 (��)
		  7171717 (��) 
		*/
		Random ran = new Random();
		
		int lotto[][] = new int [5][7];
		
		int win = 0;
		
		for(int i = 0; i<5;) {
			for(int j = 0; j<lotto[i].length; j+=1) {
				int r = ran.nextInt(2);
				if(r == 0) {lotto[i][j] = 7;}
				else if(r == 1) {lotto[i][j] = 1;}
				
			}
			int count = 0;
			boolean check = false;
			for(int j = 0; j<lotto[i].length; j+=1) {
				if(lotto[i][j] == 7) {
					count += 1;
					if(count == 3) {
						check = true;
						break;
					}
				}else {count = 0;}
			}
			if(check == true && win == 0) {
				win = 1;
				i += 1;
			}
			else if(check == false && win == 1) {
				i += 1;
			}
		}
		for(int i = 0; i<lotto.length; i+=1) {
			System.out.println(Arrays.toString(lotto[i]));
		}
		int r = ran.nextInt(lotto.length);
		
		int temp[] = lotto[0];
		lotto[0] = lotto[r];
		lotto[r] = temp;
		System.out.println("------------------------");
		for(int i = 0; i<lotto.length; i+=1) { // �� ������ ��÷�� ������ �ʵ��� ����
			System.out.print(Arrays.toString(lotto[i]));
			System.out.println();
			System.out.println();
		}
	}
}
