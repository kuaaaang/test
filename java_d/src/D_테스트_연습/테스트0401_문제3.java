package D_테스트_연습;

public class 테스트0401_문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[문제] 
			[1] 48의 약수중 일의자리가 2~6사이인 수를 출력하시오.
			[2] 위 조건의 약수의 개수도 출력하시오.
		[정답]
			2 3 4 6 12 16 24 
			악수의 개수 : 7개
		*/
		
		int i = 0;
		int count = 0;
		while(i<=48) {
			i += 1;
			if(48 % i == 0 && i%10>=2 && i%10<=6) {
				System.out.println(i);
				count += 1;
			}
		}
		System.out.println();
		System.out.println(count + "개");
		
	}
}
