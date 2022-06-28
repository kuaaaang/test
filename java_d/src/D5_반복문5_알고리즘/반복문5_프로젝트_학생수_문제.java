package D5_반복문5_알고리즘;

public class 반복문5_프로젝트_학생수_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*  
		  [문제]
			   a중학교 1학년 입학하는 학생들은 8줄 12줄 18줄로 세워도 항상 5명이 남을때,
			   1학년 전체 학생수를 구하여라.
			   (학생수는 200명이상 250명미만)
		*/
		int i = 200;
		while(i<250) {
			if(i%8 == 5 && i%12 == 5 && i%18 == 5) {
				System.out.println("학생수 : " + i + "명");
			}
		    i += 1;
		 }
	}
}
