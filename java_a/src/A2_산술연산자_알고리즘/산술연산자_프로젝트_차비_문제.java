package A2_산술연산자_알고리즘;

public class 산술연산자_프로젝트_차비_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		[문제]
		   철수는 집에서 학교까지 버스를 타고 다닌다.
		   철수의 버스비는 1200원이다. 
		   
		   철수는 학교가끝나면 바로 학원을 간다.
		   학교를마치고 바로 학원을갈때는 지하철을 이용한다.
		   지하철요금은 1100원이다.
		   
		   철수가 학원에서 집으로 바로올때는 1300원의 차비가 든다.
		   철수가 학교에서 집으로 바로올때는 1200원의 차비가 든다.
		  
		   학교는 월화수목금 매일 다닌다.
		   학원은 월수금 만 다닌다.
		  	
		   이번달에 철수는 4주동안 학교와 학원을 다녔다.
		   이번달 필요한 총 차비를 구하시오.
		*/
		/*
		 월,수,금 : 집 -> 학교 -> 학원 -> 집
		 (1200+1100+1300)
		 화,목 : 집 -> 학교 -> 집
		 (1200+1200)
		 월화수목금 교통비 : (1200+1100+1300) + (1200+1200)
		 4주 교통비 = 4*(월화수목금 교통비)
		 */
		System.out.println(4*((1200+1100+1300)+(1200+1200)));
	}
}

