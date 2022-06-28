package B3_논리연산자_기본이론;

public class 논리연산자_알고리즘_점심_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
		  
		  철수와 영희는 점심을 사기위해 편의점에 갔다.
		  철수는 샌드위치3개 우유1개을 사고 지불한 금액이 7500이고 
		  영희가 샌드위치1개 우유1개 지불한금액이 3500 이다.
		  
		  샌드위치와 우유의 가격을 구하시오.
		*/
		/*
		System.out.println(샌드위치 * 3 + 우유 == 철수 && 샌드위치 + 우유 == 영희);
		System.out.println(샌드위치 * 2 == (철수 - 영희));
		샌드위치 =  (철수 - 영희)/2;		
		우유 = 영희 - 샌드위치;	
		*/
		
		int 철수 = 7500;
		int 영희 = 3500;
		int 샌드위치2 = 철수-영희;
		int 샌드위치 = 샌드위치2/2;
		int 우유 = 영희 - 샌드위치;
		
		System.out.print("샌드위치 : ");
		System.out.println(샌드위치 + "원");
		System.out.print("우유 : ");
		System.out.println(우유 + "원");
	}
}
