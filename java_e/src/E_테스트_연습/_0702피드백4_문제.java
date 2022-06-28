package E_테스트_연습;

import java.util.Arrays;
import java.util.Random;

public class _0702피드백4_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	
	 	다음 arr 배열은 번호와 점수를 순차적으로 기록한 배열이다.
	 	랜덤으로 0~5를 입력받는다. 
	 	랜덤으로 나온인덱스를 삭제하고 b에 저장후 출력한다.
	 	다음 조건을 추가로 만족시킨다.
	 	[조건1] 
	 		랜덤으로 0~5를 뽑는데 번호의 인덱스를 뽑는다면 바로 뒤의 값도 삭제하고 b에 저장한다.
	 	[조건2]
	 		랜덤으로 0~5를 뽑는데 점수의 인덱스를 뽑는다면 바로 앞의 값도 삭제하고 b에 저장한다.
	 	[예시1]
	 		3 ==> 40 에 해당되므로 1002와 40을 삭제한다.
	 		b = {1001,20,1003,50};
	 	[예시2]
	 		0 ==> 1001 에 해당됨로 1001과20을 삭제한다.
	 		b = {1002,40,1003,50}
	 */
		Random ran = new Random();
		int arr [] = {1001,20,1002,40,1003,50};
		int b [] = null;
		
		b = new int[arr.length-2];
		int r = ran.nextInt(6);
		int index = 0;
		
		System.out.println("랜덤숫자 : " + r);
		if(r%2 == 0) {
			for(int i = 0; i<arr.length; i+=1) {
				if(arr[r] != arr[i] && arr[r+1] != arr[i]) {
					b[index] = arr[i];
					index += 1;
					if(index == 5) {break;}
				}
			}
		}
		else if(r%2 == 1) {
			for(int i = 0; i<arr.length; i+=1) {
				if(arr[r] != arr[i] && arr[r-1] != arr[i]) {
					b[index] = arr[i];
					index += 1;
					if(index == 5) {break;}
				}
			}
		}
		
		System.out.println(Arrays.toString(b));
	}
}
