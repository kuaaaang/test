package A1_기본이론;

/*
 * # 출력문의 종류
 * 1. System.out.println();
 * 1) ln = new line
 * 2) 줄바꿈 가능
 * -----------------------------------
 * 2. System.out.print();
 * 1) 줄바꿈 불가
 * ------------------------------------
 * 세번째 출력문 (서식문자)
 * [1] System.out.printf("", );
 * [2] 서식문자의 종류
 * . %d : 정수
 * . %f : 소수
 * . %c : 문자 1개
 * . %s : 문자 여러개
 */
public class 기본이론7_서식문자 {
	public static void main(String[] args) {
		
		System.out.println("-------------------------------");
		System.out.printf("%d", 10);
		System.out.println();	
		System.out.println("-------------------------------");
		// 서식문자는 소수점이 기본 6자리이다.
		System.out.printf("%f", 3.14);
		System.out.println();
		System.out.printf("%.2f", 3.14); // 소수점 개수를 제어할수있다. 
		System.out.printf("%.2f", 10.12);
		System.out.println();
		System.out.printf("%.20f", 3.14); // 소수점 개수를 제어할수있다. 
		System.out.println();
		System.out.println("-------------------------------");
		System.out.printf("%c", 'b');
		System.out.println();
		System.out.println("-------------------------------");
		System.out.printf("%s", "출력문의이해");
		System.out.println();
		System.out.println("-------------------------------");
	}
}