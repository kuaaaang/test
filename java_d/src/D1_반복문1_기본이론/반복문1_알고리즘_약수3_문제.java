package D1_반복문1_기본이론;

public class 반복문1_알고리즘_약수3_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 [문제] 24의 약수중에서 4의 배수만출력하시오.
		*/
		int i = 1;
		while(i<=24) {if(24%i == 0 && i%4 == 0) {System.out.println(i);}
                      i = i + 1;		             
		              }
	}
}
