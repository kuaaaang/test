package B1_변수_기본이론;

public class 변수_기본이론7_자료형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[자료형변환] 	
				//자바는 같은타입끼리만 연산을 할수있다.
				// 정수 + 정수
				// 실수 + 실수
		        // 문자 + 문자
				
				
				// 1) 자동형변환 
				// 만약에 실수 + 정수 를 하면 내부적으로 정수를 실수로 형변환을 한다.
		        // 우선순위 : 실수  >>  정수 , (10.3 * 2) ==> (10.3 * 2.0)강제로 바뀜
				// 예) 10 + 3.0 ==> 10.0 + 3.0 , "10" + 3 ==> "10" + "3"
				System.out.println("[자동 형변환]");
				System.out.println(10 + 3);
				System.out.println(10 + 3.0);
				
				
				// 2) 강제형변환 (변수끼리 연산할때 필요)
				// 자료형이 다른 변수끼리 연산이 필요할때는 강제 형변환을 해야한다.  
				// 방법 ==> (형변환타입)변수;	
				System.out.println("[강제 형변환]");
				int a = 10;
				System.out.println(a);
				double b = (double)a ; // 강제 형변환 
				System.out.println(b);
				int c = (int) b; // 강제 형변환 
				System.out.println(c);
				
				
				// int c = a + b; // 에러가난다.
				int d = 10;
				double e = 143.23;
				int f = d + (int)e; // double이  int로 바뀌었다가 다시 double로 바꿔도 원래대로 되지는 않음
				                    // 143.23 ==>  143  ==> 143.0 (143.23 X)
				System.out.println(f);
	}
}
