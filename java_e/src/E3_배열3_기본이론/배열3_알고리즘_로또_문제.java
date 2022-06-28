package E3_배열3_기본이론;

import java.util.Random;
import java.util.Arrays;

public class 배열3_알고리즘_로또_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		    [문제]
		  
		 	[로또] 
			1~45사이의 랜덤값 6 개를 lotto1 에 저장할려고 한다.
			[조건] 중복되는숫자는 없어야한다. 
		*/
		Random ran = new Random();
		int lotto1[] = new int[6];
		boolean check[] = new boolean[45];
				
		int i = 0;
		int count = 0;
		while(true) {
			int r = ran.nextInt(45);
			if(check[i] == false) {
				lotto1[count] = r+1;
				count += 1;	
				i +=1;
			}if(count == 6) {break;}
		}
		
		System.out.println(Arrays.toString(lotto1));	
	}
}
