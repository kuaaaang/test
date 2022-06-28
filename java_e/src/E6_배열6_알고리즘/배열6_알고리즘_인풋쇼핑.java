package E6_배열6_알고리즘;

import java.util.Arrays;

public class 배열6_알고리즘_인풋쇼핑 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 nameList 배열은 상품이름리스트 , 
		 dataList 2차원배열은 각각 가격 , 상품개수 리스트목록이다 .		
		예) 현재 재고는 새우깡은 3개 , 감자깡 1개 , 고래밥 1개 있다.			
		 아래 배열은 오늘 주문이 들어온순서이다.
		 총매출을 출력해보세요.	
		
		
		예) 첫번째 1 ==> 감자깡의 개수는 1이므로 판매할수있다.
		예) 두번째 2 ==> 고래밥의 개수는 1이므로 판매할수있다.
		예) 세번째 2 ==> 고래밥의 개수가 이미 두번째에서 구입해서 0이되므로 판매불가.
		   ....
		   .... 		
		 주문은 총  새우깡 2개 , 감자깡 3개 , 고래밥 3개 들어왔지만 ,
		 실제 판매한 품목은  새우깡 2개 , 감자깡 1개 , 고래밥 1개 이다.
	   */
		String titleList[] = {"새우깡" , "감자깡" , "고래밥"};
		int dataList[][] = {
				{1000, 3},
				{2300, 1},
				{3100, 1}
		};
		int [] input = {1,2,2,0,0,2,1,1};
		
		int total = 0;
		for(int i = 0; i<input.length; i+=1) {
			System.out.println(Arrays.toString(titleList));
			if(dataList[input[i]][1]>0) {
				System.out.println(titleList[input[i]] + "판매완료");
				dataList[input[i]][1] -= 1;
				total = total + dataList[input[i]][0];
				System.out.println("남은 재고 : " + dataList[input[i]][1]);
			}
			else if(dataList[input[i]][1]==0) {
				System.out.println(titleList[input[i]] + "품절");
				System.out.println("판매할 수 없습니다.");
			}
		}
		System.out.println("총 매출 : " + total);
		
		
	}
}
