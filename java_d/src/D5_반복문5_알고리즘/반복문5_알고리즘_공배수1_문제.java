package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_공배수1_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  
	  	[문제]
	   		12와 15의 공배수를 작은것부터 순서대로 5개만 출력 
	    */
		
		int count = 0;
		int a = 12;
		int b = 15;
		int num1 = a;
		int num2 = b;
		while(count<5) {if(num1>num2) {num2 += b;}
		                 else if(num2>num1) {num1 += a;}
		                 else if(num1==num2) {count = count + 1;
		                                      System.out.println(num1);
		                                      num1 += a;}
			             }
	}
}
		