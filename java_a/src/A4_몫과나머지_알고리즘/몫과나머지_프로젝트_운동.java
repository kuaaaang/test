package A4_몫과나머지_알고리즘;

public class 몫과나머지_프로젝트_운동 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		[문제]
		 	승환이는 일정한 빠르기로 운동장을 5바퀴도는 데 1시간 15분걸렸습니다. 		 
		  	7바퀴를 도는데는 얼마나 걸릴까요? (시간분 으로 표현)	 
		*/
		/*
		 1시간 15분 = 75분
		 1바퀴를 도는 시간 : 75/5
		*/
		 System.out.print(((7*(75/5))/60) + "시간 ");
		 System.out.println(((7*(75/5))%60) + "분");
	}
}
