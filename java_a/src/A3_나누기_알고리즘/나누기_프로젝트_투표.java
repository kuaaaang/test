package A3_나누기_알고리즘;

public class 나누기_프로젝트_투표 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        [문제] 
	 	 철수네 반은 학생이 40명이다.
	 	 철수와 , 영희 와 , 민수 이는 반장선거에 나갔다.
	 	 민수는 득표를 40% 를 획득했고, 
	 	 영희는 9표를 얻었다.
	 	 나머지는 철수가 득표를 했다.
	 	 철수의 득표를 구하시오.
	 	*/
		/*
		 민수 : 40*0.4
		 영희 : 9
		 철수 : 40 - 9 - (40*0.4)
		 */
		System.out.println(40 - 9 - (40*0.4));
	}
}
