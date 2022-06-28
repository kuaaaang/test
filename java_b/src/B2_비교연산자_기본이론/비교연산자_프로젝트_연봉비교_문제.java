package B2_비교연산자_기본이론;

public class 비교연산자_프로젝트_연봉비교_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
		  작년 연봉은 970 원이다 올해는 11 프로 인상이 되었다. 
		  올해 우리 회사 평균 월급은 91 원이다. 
		  올해의 내연봉이 올해의 우리회사 평균 연봉 보다 큽니까?
		*/
		double 작년연봉 = 970;
		double 올해연봉 = 작년연봉/100*111;
		double 평균월급 = 91;
		double 평균연봉 = 평균월급*12;
		
		System.out.println(올해연봉);
		System.out.println(평균연봉);
		System.out.println(올해연봉 < 평균연봉);
		System.out.println(올해연봉 > 평균연봉);	
	}
}
