package E7_배열7_기본이론;

import java.util.Random;
import java.util.Arrays;

public class 배열7_기본이론7_주소개념3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {10,20,30};
		int arr2[] = {40,50,60};
		int arr3[] = {70,80,90};
		
		int darr[][] = new int[3][];
		
		darr[0] = arr1;
		darr[1] = arr2;
		darr[2] = arr3;
		
		Random ran = new Random();
		
		for(int i = 0; i < 1000; i++) {
			int r1 = ran.nextInt(3);
			int r2 = ran.nextInt(3);
			int r3 = ran.nextInt(3);
			int r4 = ran.nextInt(3);
			int  temp = darr[r1][r2];
			darr[r1][r2] = darr[r3][r4];
			darr[r3][r4] = temp;
		}
		// 문제) 아래 실행했을때 어떤결과가 나올지 예상하시요.
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
}
