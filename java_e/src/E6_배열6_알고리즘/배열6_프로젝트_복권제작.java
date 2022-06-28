package E6_배열6_알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 배열6_프로젝트_복권제작 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [복권제작]
		  1. lottoSet 배열은 5 * 7 사이즈 배열이다. 
		  2. 복권1개당 7줄이고 , 총 5개의 복권을 만들려고 한다.  
		  3. 복권 1줄의 내용은 1또는 7을 랜덤을 저장한다. 
		  4. 복권 1줄은 7이 연속으로 3개이상이면 "당첨" 이고 그 미만은 "꽝" 이다.
		  5. 5개 복권중에 1개만 당첨이고 4개는 꽝인 복권을 랜덤으로 생성해보자.
		  
		  예) 아래와 같이 한줄만 "당첨" 이고 나머지 4개는 "꽝"이다.
		  1177117 (꽝)
		  1117771 (당첨)
		  7171117 (꽝)
		  7711771 (꽝)
		  7171717 (꽝) 
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
		for(int i = 0; i<lotto.length; i+=1) { // 맨 위에만 당첨이 나오지 않도록 셔플
			System.out.print(Arrays.toString(lotto[i]));
			System.out.println();
			System.out.println();
		}
	}
}
