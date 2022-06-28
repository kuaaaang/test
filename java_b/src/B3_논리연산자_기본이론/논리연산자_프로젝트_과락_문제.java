package B3_논리연산자_기본이론;

public class 논리연산자_프로젝트_과락_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제] 과락
		   3과목의 평균이 60점 이상이면 합격입니다.
		   단, 평균이 합격일지라도, 어느 한과목이 50점 미만이면 불합격입니다.
		   아래 시험점수는 합격인가요?
		*/
		int kor = 100;
		int eng = 87;
		int math = 49;
		int total = kor + eng + math;
		double 평균 = total/3.0;
		
		System.out.println(평균 > 60 && kor > 50 && eng > 50 && math > 50);		
	}
}
