package E_�迭_����;

import java.util.Arrays;
import java.util.Random;

public class _0901_����_4��_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		ö���� ö���Ǹ�������� �������̴�. 
		map1�� map2 �� ���ӽ��������� ǥ���Ѵ�. 
		����1�� ö���� ��ġ�̴�. 
		�ֻ����� 1~6���� �ְ� �ֻ��� 2���� ������ ���ո�ŭ ������ �̵��Ѵ�. 
		
		�� 5�� �ݺ��ϰ� ��ȭ�� ö���� ��ġ��� 
		map1�� ���� �����ϸ� map2���̵��ؼ� �����ϰ�, 
		map2 �� ���� �����ϸ� �ٽ� map1 �� �̵��ؼ� �����Ѵ�. 
		
		[����]
			�ֻ��� 3 , 5 ==> 8
			int map1[] = {0,0,0,0,0,0,0,0,1,0};
			int map2[] = {0,0,0,0,0,0,0,0,0,0};
			
			�ֻ��� 2 , 1 ==> 3
			int map1[] = {0,0,0,0,0,0,0,0,0,0};
			int map2[] = {0,1,0,0,0,0,0,0,0,0};
			
			�ֻ��� 6 , 1 ==> 7
			int map1[] = {0,0,0,0,0,0,0,0,0,0};
			int map2[] = {0,0,0,0,0,0,0,0,1,0};
			
			�ֻ��� 3 , 3 ==> 6
			int map1[] = {0,0,0,0,1,0,0,0,0,0};
			int map2[] = {0,0,0,0,0,0,0,0,0,0};
	    */
		Random ran = new Random();
		
		int map1[] = {1,0,0,0,0,0,0,0,0,0};
		int map2[] = {0,0,0,0,0,0,0,0,0,0};
		
		int step = 0;
		int count = 0;
		
		System.out.println("===========ö���� ����===========");
		System.out.println(Arrays.toString(map1));
		System.out.println(Arrays.toString(map2));
		System.out.println();
		
		while(count<5) {
			int r1 = ran.nextInt(6)+1;
			int r2 = ran.nextInt(6)+1;	
			step += r1+r2;
			
			System.out.println("�ֻ��� : " + r1 + " , " + r2);
			System.out.println("�̵� : " + (r1+r2));
			
			if((step/10)%2 == 0) {
				for(int i = 0; i<map1.length; i+=1) {
					if(map1[i] == 1 || map2[i] == 1) {
						map1[i] = 0;
						map2[i] = 0;
					}
				}
				map1[(step%10)] = 1;
			}
			else if((step/10)%2 == 1) {
				for(int i = 0; i<map1.length; i+=1) {
					if(map1[i] == 1 || map2[i] == 1) {
						map1[i] = 0;
						map2[i] = 0;
					}
				}
				map2[(step%10)] = 1;
			}
			System.out.println(Arrays.toString(map1));
			System.out.println(Arrays.toString(map2));
			System.out.println();
			count += 1;
		}
		
	}
}
