package E5_배열5_기본이론;

import java.util.Arrays;

public class 배열5_알고리즘_압축하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 위 데이터는 압축전 데이터이다.
		 연속으로 이뤄진 데이터를 모아 압축할려고한다.
		 예) 33    ==> {3,2}
		 예) 55555 ==> {5,5}
		 예) 3     ==> {3,1};
		 예) 444   ==> {4,3};
		  0번은 압축할값 , 1번은 연속된개수 
		 문제) 위 압축전데이터를 분석후 2차원으로 저장하시요.
	   */
		int 압축전[] = {3,3,5,5,5,5,5,3,4,4,4};		
		int 압축후[][] = new int[4][2];		
		
		int count = 0;
		
		압축후[count][0] = 압축전[0];
		압축후[count][1] = 1;
		
		for(int i = 1; i<압축전.length; i+=1) {
			if(압축후[count][0] == 압축전[i]) {
				압축후[count][1] += 1;
			}else {
				count += 1;
				압축후[count][0] = 압축전[i];
				압축후[count][1] = 1;
			}
		}
		
		for(int i = 0; i<압축후.length; i+=1) {
			System.out.println(Arrays.toString(압축후[i]));
		}
	}
}
