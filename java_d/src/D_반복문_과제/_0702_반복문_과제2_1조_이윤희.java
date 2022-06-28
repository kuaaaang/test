package D_반복문_과제;

public class _0702_반복문_과제2_1조_이윤희 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /*
		계단이 50 계단이 있다. 철수는 제일 윗계단에 서있다. 
		철수는 한번에 두계단씩 내려간다. 
		철수가 왼발로 디딘 계단을 출력하시오.
		아래조건을 참고하시오.
		[1] 철수는 한번에 두계단씩 내려간다.
		[2] 철수는 왼쪽발부터 내려간다.
		[3] 5번출력할때마다 다른 발을 출력하시오.
		
		48 44 40 36 32 
		30 26 22 18 14
		12 8  4
	 */	
		int count = 0;
		int line = 0;
		int left = 0;
		
		for(int i = 50; i>2; i-=2) {
			if(line % 2 == 0) {
				if(left%2 == 0) {
					System.out.printf("%2d  " , i-2);
					count += 1;
					if(count%5 == 0) {
						line+=1;
						System.out.println();
					}
				}
			}
			if(line % 2 == 1) {
				if(left%2 == 1) {
					System.out.printf("%2d  " , i-2);
					count += 1;
					if(count%5 == 0) {
						line+=1;
						System.out.println();
					}
				}
			}
			left += 1;
		}
	}
}
