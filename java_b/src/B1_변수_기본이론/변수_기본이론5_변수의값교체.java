package B1_변수_기본이론;

public class 변수_기본이론5_변수의값교체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a와 b의 값 교체하기
				int a = 5;
				int b = 7;
				a = b;
				b = a;
				// 두 값이  서로  같아진다.
				// 순서대로만 진행! 동시에는 불가능!
				
				System.out.println("a = " + a); 
				System.out.println("b = " + b); 
				
				
				System.out.println("--------------------------");	
				// 교환은 아래와 같이 해야한다. 
				// x 와  y의 값 교체하기
				int x = 10;
				int y = 20;

				int z = x; // z = 10 , Z = 임시변수
				x = y; // x = 20
				y = z; // y = 10

				System.out.println("x = " + x);
				System.out.println("y = " + y);
				
				// 날짜별로 정리 등을 할때 사용
	}
}
