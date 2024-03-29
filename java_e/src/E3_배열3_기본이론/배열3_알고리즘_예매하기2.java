package E3_배열3_기본이론;

import java.util.Arrays;

public class 배열3_알고리즘_예매하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  1) seatList 는 현제 영화관 예매상황 이다.
		  2) seatIndex 는 예매 할려는 좌석 번호이고
		  3) userList 는 회원번호이다 
		  
		  4) seatIndex 와 user 를 가지고 예매후 전체 예매상황 출력 
		  5) 좌석이 비어있으면 예매할수있다.
		  6) 좌석이 이미 예매 되어있으면 2가지조건중 한가지실행 
		  7) [조건 1] 이미 예매되어있으나, 회원번호가 같으면 예매취소 0으로 변경
		  8) [조건 2] 이미 예매되어있고 , 회원번호가 다르면 "x" 출력 
		 
		  -예) 1 , 1003 ==> 예매 되어있으나, 1003번이 예매했으므로 예매 취소된다 
		       ==> seatList[] = {1003,0,0,0,1002,0,1001};
		  		
		  -예) 1 , 1002 ==> 위에서 예매취소했으므로 예매 가능
		       ==> seatList[] = {1003,1002,0,0,1002,0,1001};
		       
		  -예) 4 , 1005 ==> 예매 되어있고, 회원번호도 다르다 ==> "x"
		*/
			int seatList[] = {1003,1003,0,0,1002,0,1001};		
			int seatIndex[] = {1,1,4};
			int userList [] = {1003,1002,1005};
			
			for(int i = 0; i<seatIndex.length; i+=1) {
				System.out.println(userList[i] + "님  예매 현황 : ");
				
				if(seatList[seatIndex[i]] == 0) {
					seatList[seatIndex[i]] = userList[i];
					System.out.print(Arrays.toString(seatList));
					System.out.println();
				}
				else {
					if(seatList[seatIndex[i]] == userList[i]) {
						seatList[seatIndex[i]] = 0;
						System.out.println(userList[i] + "님  예매가 취소되었습니다.");
						System.out.print(Arrays.toString(seatList));
						System.out.println();
					}
					else{System.out.println("X");}
				}
			}
	}
}
