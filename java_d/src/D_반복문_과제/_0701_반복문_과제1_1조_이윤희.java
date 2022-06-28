package D_반복문_과제;

public class _0701_반복문_과제1_1조_이윤희 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  철수는 30개짜리 계단의 최상단에 서있다. 
		  제일아래까지 내려가려고 한다. 
		  철수가 내려갈때 왼쪽발로 밟은 계단을 출력하시오. 
		  아래조건들을 참고하시오.
		  [조건]
		  [1] 철수는 무조건 한계단씩 내려간다. 
		  [2] 철수는 첫발은 왼쪽다리부터 계단을 내려간다. 
		  [3] 출력을 다섯번할때 마다 반대편다리로 바꿔서 출력하시오.
		  
		  [예시]
		   29 27 25 23 21 
		   20 18 16 14 12 
		   11 9  7  5  3
		   2			 
		*/
		int count = 0;
		
		for(int i = 30; i>0; i-=1) {
			if((count/5)%2 == 0) {
				if(i%2 == 1) {
					System.out.printf("%2d  " , i);
					count += 1;
					if(count%5 == 0) {System.out.println();}
				}else {continue;}
			}
			else if((count/5)%2 == 1) {
				if(i%2 == 0) {
					System.out.printf("%2d  " , i);
					count += 1;
					if(count%5 == 0) {System.out.println();}
				}else {continue;}
			}
		}
	}
}
