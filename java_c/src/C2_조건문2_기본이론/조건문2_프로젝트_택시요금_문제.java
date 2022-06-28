package C2_조건문2_기본이론;

import java.util.Scanner;

public class 조건문2_프로젝트_택시요금_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
			택시기본요금은 10000원입니다.
			
			기본요금으로는 10km 까지 이동 가능합니다. 
			
			10km이상 이동시 추가요금이 발생합니다. 
			
			추가요금은 3km이동할때마다 2300원씩 요금이 추가됩니다.
				
			이동거리를 입력받고 요금출력하시오.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이동거리를 입력하세요.");
		int km = scan.nextInt();
		
		if(km<=10) {System.out.println("요금은 10000원 입니다.");}
		if(km>10) { int a = (km-10)/3*2300;
		            if (((km-10)%3)>0) {a = a+2300;} 
			System.out.println("요금은" + (10000 + a) + "입니다.");}
		
		scan.close();
	}
}
