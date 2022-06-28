package B1_변수_기본이론;

public class 변수_기본이론1_변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # 변수(variable)
		 1. 변수란, 단 하나의 값을 저장할 수 있는 메모리 공간
		 2. 변수의 선언 : int a;    // 메모리 공간 할당
		 3. 변수의 초기화 : a = 10;	 // 값 저장(오른쪽 값을 왼쪽에 복사)
		                            int : 공간 , a : 이름 , 10 : 값
		 */
		         
		        // 자료형(Data Type)
		
				// 1. 정수 : integer
				int num;    
				num = 10;
				System.out.println("[정수]");
				System.out.println(num);
				System.out.println(10);
				
				// 2. 실수 : double(float의 2배), float
				double dNum = 3.14; //d : double의 약자 , 단어 2개가 겹쳐질때 뒤에 있는단어의 앞글자를 대믄자로!
				System.out.println("[실수]");
				System.out.println(dNum);
				
				// 3. 문자 한 개 : character
				
				System.out.println("[한글자(char)]");
				char c1 = 'a';          // char : 공간 , a : c1 , 10 : a
				System.out.println(c1);
				char c2 = '가';
				System.out.println(c2);
				
				// 4. 문자 여러개 : String
				System.out.println("[여러글자(String)]");
				String str = "java";   // String (문자여러개) 만 특이하게 색도검정색이고 대문자로시작한다.(이유는 뒤에나옴)
				System.out.println(str);
				
				System.out.println("[참과 거짓]");
				// 5. 참과 거짓 : boolean
				boolean result1 = true;
				System.out.println(result1);   //true = 1
				
				boolean result2 = false;
				System.out.println(result2);   //false = 0
	}
}
