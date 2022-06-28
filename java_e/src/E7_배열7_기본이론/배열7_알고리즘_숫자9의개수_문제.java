package E7_배열7_기본이론;

import java.util.Arrays;

public class 배열7_알고리즘_숫자9의개수_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		   mine = {0,9,0},
				  {9,0,9},
				  {0,0,9}
				  
		  	위 mine배열의 숫자 0의 자리에 숫자를 저장할려고한다.
		 	저장할숫자는 주변 8방향을 검사후 9의 개수를 저장후출력.
				
			 예) 아래와 같이 출력  
			   {2,9,2},
			   {9,4,9},
			   {1,3,9}
		 */
			int mine[][] = {
					{0,9,0},
					{9,0,9},
					{0,0,9}
			};
		
			for(int i = 0; i<mine.length; i+=1) {
				for(int j = 0; j<mine[i].length; j+=1) {
					if(mine[i][j] == 0) {
						int a = i;
						int b = j;
						int count = 0;
						for(int k = a-1; k<=a+1; k+=1){
							for(int l = b-1; l<=b+1; l+=1) {
								if(k>=0 && l>=0 && k<mine.length && l<mine[0].length && mine[k][l] == 9) {
									count += 1;
								}
								else if(k<0 || l<0|| k>=mine.length || l>=mine[0].length) {
									continue;
								}
							}
						}
						mine[i][j] = count;
					}
				}
			}
			
			for(int i = 0; i<mine.length; i+=1) {
				System.out.println(Arrays.toString(mine[i]));
			}	
	}
}
