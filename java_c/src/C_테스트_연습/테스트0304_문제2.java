package C_테스트_연습;

public class 테스트0304_문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	
	    [문제]
			아래내용을 식으로 작성하고, 답을구하시오.
		[설명]
			철수는 총거리가 8km인 산책로를 걷는데 
			처음에는 시속 6km로 달리다가 도중에 힘이들어
			남은거리는 시속 3km로 걸어서 2시간 만에 산책을 마쳤다. 
			시속 6km로 달린거리와 시속 3km로 걸은거리를 각각 구하시오.
			주석으로 표현하시오.
		[힌트]
			분속으로 바꾸면 계산이 쉽다.
	    */
		/*
		  a = 시속 6km로 간 거리
		  b = 시속 3km로 간 거리
		  a2 = 시속 6km로 간 시간(분) = a/6*60 = 10a
		  b2 = 시속 3km로 간 시간(분) = b/3*60 = 20b
		  
		  a+b = 8
		  10a + 20b = 120
		  a + 2b = 12
		*/
		int a = 4;
		int b = 4;
		
		System.out.println(a+b);
		System.out.println(a + 2*b);
		System.out.println("시속 6km로 " + a + "km"); 
		System.out.println("시속 3km로 " + b + "km"); 
	}
}
