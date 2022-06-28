package E3_배열3_기본이론;

import java.util.Arrays;

public class 배열3_알고리즘_인풋쇼핑 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * [인풋 쇼핑]

		    -아래 3개의 배열은 [1.상품이름] [2.가격] [3.상품개수] 리스트목록이다 .
			
			[예] 현재 재고는 새우깡은 3개 , 감자깡 1개 , 고래밥 1개 있다.	
			
			 input 배열은 오늘 주문이 들어온순서이다.
			 주문이 들어올 때마다 countList배열의 값을 1감소시킨다.
			 총매출을 출력해보세요.
			 
			 [예] 첫번째 1 ==> 감자깡의 개수는 1이므로 판매할수있다.
			 [예] 두번째 2 ==> 고래밥의 개수는 1이므로 판매할수있다.
			 [예] 세번째 2 ==> 고랩밥의 개수가 이미 두번째에서 구입해서 0이되므로 판매불가.
			 [예] .... 나머지도 계산해보자.
			 
			 주문은 총  새우깡 2개 , 감자깡 3개 , 고래밥 3개 들어왔지만,
			 재고수량은 그보다 부족하기 때문에,
			 실제 판매한 품목은  새우깡 2개 , 감자깡 1개 , 고래밥 1개 이다.		
		 */
			String [] nameList = {"새우깡" , "감자깡" , "고래밥"};
			int [] priceList = {1000, 2100, 3300};
			int [] countList = {3,1,1};
			int [] input = {1,2,2,0,0,2,1,1};		
				
			int[] sel = {0, 0, 0};
			
			for(int i = 0; i<input.length; i+=1) {
				System.out.println();
				System.out.print((i+1) + "번 손님  ");
				if(countList[input[i]]>0) {
					countList[input[i]] -= 1;
					sel[input[i]] +=1 ;
					System.out.print(nameList[input[i]] + " 구매완료");
				}
				else {System.out.print(nameList[input[i]] + " 품절");
				}
				System.out.println();
				System.out.println("재고현황 : " + Arrays.toString(countList));
			}
			
			System.out.println();
			System.out.println("판매현황 : " + Arrays.toString(sel));
			
			int total = 0;
			for(int i = 0; i<sel.length; i+=1) {
				total = total + sel[i]*priceList[i];
			}
			
			System.out.println("총 판매금액 = " + total);
			
	}
}
