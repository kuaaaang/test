package E_테스트_연습;

public class _0702피드백2_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		반복문을 사용해서 아래와 같이 출력해보세요.
		[예시]
				0 30
				1 29
				2 27
				3 24
				4 20
				5 15
				6 9
				7 2
				8 -6
				9 -15
	 */
		int a = 0;
		int b = 30;
		
		for(int i = 0; i<10; i+=1) {
			System.out.print(a + " ");
			System.out.print(b-a);
			System.out.println();
			b = b-a;
			a += 1;
		}
	}
}
