package E_테스트_연습;

import java.util.Random;

public class _0702피드백1_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	
	 	숫자를 0~4까지 순차적으로 출력한다. 
	 	아래조건을 참고한다.
	 	[조건1] 랜덤으로 0~4의 숫자를 하나저장하고 그숫자에는 출력하지않고 공백으로 출력한다.
	 	[조건2] 위 숫자를 순차적으로 출력하기때문에 공백일떄는 숫자가 증가하지않는다.
	 	
	 	[예시1] 
	 		랜덤숫자가 2라고 가정할때  
	 		[결과] 01 23 
	 	
		[예시2] 
			랜덤숫자가 3라고 가정할때  
	 		[결과] 012 3 
	 */
		Random ran = new Random();
		
		int arr[] = new int[5];
		int r = ran.nextInt(5);
		int num = 0;
		
		System.out.println("랜덤숫자 : " + r);
		System.out.println();
		for(int i = 0; i<arr.length; i+=1) {
			if(i != r) {
				System.out.print(num);
				num += 1;
				}
			else if(i == r) {System.out.print(" ");}
		}
	}
}
