package F4_문자열4_FINAL;

public class 문자열4_프로젝트_수열_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
    	다음은 읽고 말하기 수열의 규칙입니다.
  
  		1, 11, 12, 1121, 122111, 112213
  
	 	첫번째 수열 : 1
	 	두번째 수열 : 1이 1개 = 11
	 	세번째 수열 : 1이 2개 = 12
	 	네번째 수열 : 1이 1개, 2가 1개 = 1121
	 	다섯번째 수열 : 1이 2개, 2가 1개, 1이 1개 = 122111
	 	여섯번재 수열 : 1이 1개, 2가 2개, 1이 3개 = 112213
	 	// 12221131
	 	// 1123123111
	 	// 12213111213113
	 	// 11221131132111311231
	 	
	 	이러한 수열의 10번째 숫자를 프로그램을 만들어 찾으시오.
	    */
		String num = "1";
		
	    System.out.println(num);
	    
	    for (int i = 0; i < 10; i++) {
	         String temp = num; // 기존(이전에 만들어진 수열)
	         
	         char c = num.charAt(0);
	         int count = 1;
	         num = c + ""; // 다음 수열 만드는 준비(첫 자리만 남기기)
	   
	         for (int j = 1; j < temp.length(); j++) {
	            if (c == temp.charAt(j)) {
	               count += 1;
	            } else { // 다음 수열 만들기
	               c = temp.charAt(j);
	               num += count;
	               num += temp.charAt(j);
	               count = 1;
	            }
	         }
	         num += count;
	         System.out.println(num);
	      }
	}
}
