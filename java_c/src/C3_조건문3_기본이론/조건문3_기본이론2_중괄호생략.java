package C3_조건문3_기본이론;

public class 조건문3_기본이론2_중괄호생략 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 	조건문의 범위에 해당하는 {} 중괄호를 생략할수있다.
		  	단, 1줄만 허용되며 정확한코딩습관을위해 사용하지않는것이 좋다.
		*/
			int a = 10;
			int b = 10;	
			if(a == b) 
				System.out.println("실행 O (1)");
				
			if(a == b) {
				System.out.println("실행 O (2) ");
			}
			
			System.out.println("------------------------------");
			
			if(a != b)
				System.out.println("실행 x (1)");
				System.out.println("실행 x (2) "); // 한줄만 적용되므로 출력된다.
			
			
			if(a != b) {
				System.out.println("실행 x (3)");
				System.out.println("실행 x (4) ");
			}
	}
}
