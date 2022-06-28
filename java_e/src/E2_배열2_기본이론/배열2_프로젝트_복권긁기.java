package E2_배열2_기본이론;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class 배열2_프로젝트_복권긁기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		    [복권긁기]
		  
		    랜덤으로 복권배열에 1 또는 7 을 저장한다. 
		    화면은 { * * * * * * * } 이렇게 출력한다.
			인덱스 3개를 고를수있고, 
			인덱스 3개의 값이 전부 7이면  당첨이다.
			
		    [조건1] 
		    	반드시 7은 3개이상 있어야 한다.	
				[예] 1,1,7,7,1,7,1
			
			[조건2] 
				한번 고른 인덱스는 또고를수없다. 		
				[예] 2,2,2
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int 복권[] = new int[7];
		int _1 = 0;
		int _7 = 0;
		int index = 0;
		
		
		while(true) {
			int n = ran.nextInt(2);
			if(n == 0 && _7 < 3) {
				복권[index] = 7;
				index +=1;
				_7 +=1;
			}
			else if(n == 1 && _1 < 4) {
				복권[index] = 1;
				index +=1;
				_1 +=1;
			}
			if(_1 == 4 && _7 == 3) {
				break;
			}
		}
		
		System.out.println();
		boolean check[] = new boolean[7];
		int count = 0;
		while(true) {
			for(int i = 0; i<7; i+=1) {
				if(check[i] == false) {
					System.out.print("*  ");
				}else{
					System.out.print(복권[i] + "  ");
				}
			}
			System.out.println();
			
			if(count == 3) {break;}
			
			System.out.print("자리입력 : ");
			int s = scan.nextInt();
			if (s<0 || s>6) {
				System.out.println("오류! 다시 선택해주세요.");
				continue;
			}
			if(check[s] == false) {
				check[s] = true;
				count +=1;
			}else if(check[s] == true) {
				System.out.println("이미 선택한 자리입니다.");
			}
		}

		int win = 0;
		for(int i = 0; i<7; i+=1){
			if(check[i] == true && 복권[i] == 7) {
				win +=1;
			}
		}
		if(win == 3) {System.out.println("당첨!");}
		else {System.out.println("꽝!");}
		System.out.println(Arrays.toString(복권));	
		
		scan.close();		
	}
}
