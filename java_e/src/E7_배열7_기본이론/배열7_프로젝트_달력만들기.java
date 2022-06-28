package E7_배열7_기본이론;

import java.util.Scanner;

public class 배열7_프로젝트_달력만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /*
	 	[달력만들기]
	  	년도와 월을 입력받고 달력을 만드시오.
	  	
	  	[윤년계산법] 아래의 경우는 윤년 이다. 
	  	
	  	1. 해(year)가 4로 나눠지면 윤년.
	  	2. 1번 조건이 맞더라도 100으로 나눠지면 윤년이 아니다.  
		3. 2번 조건이 맞더라도 400으로 나눠지면 윤년이다.
	  	
	  	[요일계산법]
	  	1년1월1일 이 월요일이다. 
	 */
		Scanner scan = new Scanner(System.in);
		
		int monthList[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.println("연도를 입력하세요.[1 이상]");
		int year = scan.nextInt();
		System.out.println("달을 입력하세요[1~12]");
		int month = scan.nextInt();
		
		int total1 = (year-1)*365;
		
		int add = 0; 
		for(int i = 1; i<year; i+=1) {
			if(i % 400 == 0 || (i % 100 != 0 && i%4 == 0)) {
				add += 1;
			}
		}
		System.out.println("total 1 : " + (add + total1));

//      * 수학적 계산 방법 *
		int total2=(year-1)*365
                +(year-1)/4
                -(year-1)/100
                +(year-1)/400;			
		System.out.println("total 2 : " + total2);// 2020년12월31일까지 (윤년포함)	
		
		for(int i = 0; i <month-1; i++) {
			if(i == 1) {
				if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0) ) {
					total2 += 1;
				}
			}
			total2 += monthList[i];
		}
		
		System.out.println("======================달 력========================");
		String week = "일월화수목금토";
		int weekIndex = total2%7;
//		System.out.println(week.charAt(weekIndex + 1));
//		System.out.println("-------------------------------------------------");
		for(int i = 0; i<week.length(); i+=1) {
			System.out.print(week.charAt(i) + "\t");
		}
		System.out.println();
		System.out.println("--------------------------------------------------");
		for(int i = 0; i<=monthList[month-1] + weekIndex; i+=1) {
			if(i>weekIndex) {
				System.out.print((i - weekIndex + "\t"));
			}
			else {System.out.print("\t");}
			if(i % 7 == 6) {System.out.println();}
		}
	}
}
