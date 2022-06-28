package E_배열_과제;

import java.util.Arrays;
import java.util.Random;

public class _0801_과제_4조_이윤희 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[문제]
			5사이즈 배열에 (0~9)사이의 값을 5개를 랜덤으로 저장한다.
			배열의 각각의 값들중 홀수만 모아서 하나의 숫자로표현할려고한다. 
			하나의 숫자로표현 후 그수의 두배를 출력
		
		(예시) 
			arr ==> { 1,4,5,4,0 } ==> 에서 홀수만 모으면 숫자15 라고생각하고, 두배인 30을출력
		[정답]
			30
		*/  
		Random ran = new Random();
		
		int arr[] = new int[5];
		int ar[] = new int[5];
		
		for(int i = 0; i<5; i+=1) {
			int r = ran.nextInt(10);
			arr[i] = r;
		}
		System.out.println(Arrays.toString(arr));
		
		int count = 0;
		int a = 0;
		for(int i = 0; i<5; i+=1) {
			if(arr[i]%2 == 1) {
				ar[count] = arr[i];
				count += 1;
			}
		}
//		System.out.println(Arrays.toString(ar));
		
		System.out.print("숫자 : ");
		if(count == 0) {System.out.print(0);}
		else {
			for(int i = 0; i<count; i+=1) {
				System.out.print(ar[i]);
			}
		}
		System.out.println();
		
		if(count == 0) {System.out.println(0);}
		else if(count == 1) {System.out.println(ar[0]*2);}
		else if(count > 1) {
			for(int i = 0; i<count; i+=1) {
				if(count-i-1 == 0) {a += ar[i];}
				else if(count-i-1 == 1) {a += ar[i]*10;}
				else if(count-i-1 == 2) {a += ar[i]*100;}
				else if(count-i-1 == 3) {a += ar[i]*1000;}
				else if(count-i-1 == 4) {a += ar[i]*10000;}
			}
			System.out.println(a*2);
		}
		/*
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			int r = ran.nextInt(9);
			arr[i] = r;
		}
		System.out.println(Arrays.toString(arr));
		
		int index = arr.length-1;
		int sum = 0;
		int 자리수 = 1;
		for (int i = 0; i < arr.length; i++) {
			System.out.println( (i+1) +"번째");
			if (arr[index] % 2 == 1) {
				System.out.println(arr[index]);
				System.out.println(자리수);
				sum = sum + ( arr[index] * 자리수);
				자리수 = 자리수 * 10;
				System.out.println(sum);
			}
			System.out.println();
			index--;
		}
		System.out.println(sum);
		
		*/
	}
}
