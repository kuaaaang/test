package E_배열_과제;

import java.util.Arrays;
import java.util.Random;

public class _0901_과제_4조_이윤희 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		철수는 철수의마블게임을 개발중이다. 
		map1과 map2 는 게임스테이지를 표현한다. 
		숫자1은 철수의 위치이다. 
		주사위는 1~6까지 있고 주사위 2개를 던저서 그합만큼 앞으로 이동한다. 
		
		총 5번 반복하고 변화된 철수의 위치출력 
		map1의 끝에 도달하면 map2로이동해서 전진하고, 
		map2 의 끝에 도달하면 다시 map1 로 이동해서 전진한다. 
		
		[예시]
			주사위 3 , 5 ==> 8
			int map1[] = {0,0,0,0,0,0,0,0,1,0};
			int map2[] = {0,0,0,0,0,0,0,0,0,0};
			
			주사위 2 , 1 ==> 3
			int map1[] = {0,0,0,0,0,0,0,0,0,0};
			int map2[] = {0,1,0,0,0,0,0,0,0,0};
			
			주사위 6 , 1 ==> 7
			int map1[] = {0,0,0,0,0,0,0,0,0,0};
			int map2[] = {0,0,0,0,0,0,0,0,1,0};
			
			주사위 3 , 3 ==> 6
			int map1[] = {0,0,0,0,1,0,0,0,0,0};
			int map2[] = {0,0,0,0,0,0,0,0,0,0};
	    */
		Random ran = new Random();
		
		int map1[] = {1,0,0,0,0,0,0,0,0,0};
		int map2[] = {0,0,0,0,0,0,0,0,0,0};
		
		int step = 0;
		int count = 0;
		
		System.out.println("===========철수의 마블===========");
		System.out.println(Arrays.toString(map1));
		System.out.println(Arrays.toString(map2));
		System.out.println();
		
		while(count<5) {
			int r1 = ran.nextInt(6)+1;
			int r2 = ran.nextInt(6)+1;	
			step += r1+r2;
			
			System.out.println("주사위 : " + r1 + " , " + r2);
			System.out.println("이동 : " + (r1+r2));
			
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
