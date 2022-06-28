package B1_변수_기본이론;

public class 변수_알고리즘_놀이공원_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[문제]
		 철수는 놀이공원에 갔습니다. 
		 놀이공원 입장료는 15000원 입니다.
		 철수는 이런저런 할인을 받아서 9000원에 입장했습니다.
		 몇 % 할인받은것일까요?
		*/
		int 입장료 = 15000;
		int 할인된입장료 = 9000;
		int 할인금액 = 입장료 - 할인된입장료;
		
		double 일퍼센트 = 입장료/100.0;
		double 할인퍼센트 = 할인금액/일퍼센트;
		System.out.printf("%.1f" , 할인퍼센트);
		
//		System.out.println();
//	    double 퍼센트 = (double)할인금액/입장료;
//	    double 답 = 퍼센트*100;
//	    System.out.println(답);
	}
}
