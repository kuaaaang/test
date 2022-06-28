package B1_변수_기본이론;

public class 변수_알고리즘_봉사활동_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[문제]
		 철수 반학생은 16명이다.
		 8명은 양로원에 봉사활동을 다녀왔고
		 4명은 지하철 봉사활동을 다녀왔다. 
		 봉사활동을 다녀오지않은 학생의 비율은 몇%인가  
		*/
		int 반학생 = 16;
		int 양로원 = 8;
		int 지하철 = 4;
		int 미활동 = 반학생 - 양로원 - 지하철;
	
		
		double 퍼센트 = (double)미활동/반학생 ; // 강제형변환
        double 미활동비율 = 퍼센트*100 ;
		System.out.println(미활동비율);		
	}
}
