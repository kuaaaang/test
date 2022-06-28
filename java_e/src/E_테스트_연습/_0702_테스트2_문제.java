package E_테스트_연습;

import java.util.Arrays;
import java.util.Scanner;

public class _0702_테스트2_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[문제] 
		아래 배열 c는 번호와 값이 한쌍인 배열이다. 
		번호를 하나를 입력받고 c배열에 있는 번호이면, 
		그번호와  값만 제외하고 d배열에 복사한다.
		[예]  
			c[] = { 1001, 40, 1002, 65, 1003, 70 };
			입력 : 1002 
			c[] = {1001, 40, 1003, 70}; 
		*/
		Scanner scan = new Scanner(System.in);
		
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = null;
		
		int count = 0;
		int index = 0;
		int a = 0;
		System.out.println("번호를 입력하세요.");
		int n = scan.nextInt();
		for(int i = 0; i<c.length; i+=1) {
			if(n == c[i]) {
				count += 1;
				a = i;
			}
			else {continue;}
		}
		
		if(count != 0) {d = new int[4];}
		else if(count == 0) {d = new int[6];}
		
		for(int i = 0; i<c.length; i+=1) {
			if(c[i] != c[a] && c[i] != c[a+1]) {
				d[index] = c[i];
				index += 1;
			}
		}
		
		System.out.println(Arrays.toString(d));
		
		scan.close();
	}
}
