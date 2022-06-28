package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_최소공배수2_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
		   	철수와 민수는 같은 수영장에 다닌다
		   	철수는 4일마다 한번씩 가고 민수는 5일마다한번씩 간다.
		   	
		   	철수와 민수가 2월 3일날 처음만났다면 다음에 서로 만나는 날은 언제인가?
		   	
		*/
		int a = 4;
		int b = 5;
		int num1 = a;
		int num2 = b;
		
		while(true) {if(num1>num2) {num2 = num2 + 5;}
		             else if(num2>num1) {num1 = num1 + 4;}
		             else if(num1==num2) {System.out.println("최소공배수 : " + num1);
		                                  break;}
		             }
		System.out.println("철수와 민수는 2월 " + (3+num1) + "일에 만난다.");
	}
}
