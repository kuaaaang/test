package E1_배열1_기본이론;

import java.util.Scanner;

public class 배열1_알고리즘_삭제원리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [문제]
		   아래배열 a 의 안에 있는 값을 하나 입력받는다.
		   b배열안에 위에서 입력한 값을 제외하고 복사한다.
		   
		   [예] 30 ==> b[] = {10,20,40,50,0};
		   
		   [문제] 
		   아래 배열 c는 번호와 값이 한쌍인 배열이다. 
		   번호를 하나를 입력받고 c배열에 있는 번호이면, 
		   그번호와  값만 제외하고 d배열에 복사한다.
		   
		   [예] 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0}; 
		 */
		    Scanner scan = new Scanner(System.in);
			int a[] = { 10, 20, 30, 40, 50 };
			int b[] = { 0, 0, 0, 0, 0 };
					
			int c[] = { 1001, 40, 1002, 65, 1003, 70 };
			int d[] = { 0, 0, 0, 0, 0, 0 };
			
			System.out.println("숫자 입력 : [10, 20, 30, 40, 50]");
			int n1 = scan.nextInt();
			int count1 = 0;
			for(int i = 0; i<5; i+=1) {
				if(a[i]!=n1) {
					b[count1] = a[i];
				    count1 +=1;
				}	
			}
			for(int i = 0; i<5; i+=1) {
				System.out.println(b[i]);
			}
			
			System.out.println("---------------------------------");
			
			System.out.println("숫자 입력 : [1001, 40, 1002, 65, 1003, 70]");
			int n2 = scan.nextInt();
			int count2 = 0;
			for(int i = 0; i<6; i+=1) {
				if(c[i]!=n2) {
					d[count2] = c[i];
				    count2 +=1;
				}	
			}
			for(int i = 0; i<6; i+=1) {
				System.out.println(d[i]);
			}
			
			
			
			
			scan.close();
	}
}
