package C_테스트_연습;

public class 테스트0304_문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[문제]
			다음 문장을 부등식으로 나타내시오.
			그리고 답을 구하시오.
		[설명]
			제주도 올레길을 갈때는 시속 2킬로미터로 걷고, 
		 	올때는 같은 길을 시속 3킬미터로 걸어서 
		 	전체 걸리는 시간을 5시간을 넘지 않으려고 한다.
		 	최대 몇킬로미터 지점까지 갔다가 되돌아오면되는지 구하시오.	
		 	주석으로 표현하시오.	 	
	*/
		/*
		 a = 시속 2km 시간
		 b = 시속 3km 시간
		 
		 a+b<=5
		 
		 2*a = 3*b
		*/
		
		int a = 3;
		int b = 2;
		
		System.out.println(a+b);
		System.out.println(2*a);
		System.out.println(3*b);
		
		System.out.println("최대 " + a*2 + "km");
	}
}
