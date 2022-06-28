package D2_반복문2_알고리즘;

public class 반복문2_프로젝트_요금제_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 [문제]
		 아래와같은 휴대요금제가 있다 
		 B를 선택할경우 A보다 더 경제적이될려면,
		 통화시간을 얼마까지 사용해야될까요? 
		 정답을 초로 구하시오.
		 A요금제 기본요금 17500원 초당 5원 
		 B요금제 기본요금 31000원 초당 2원  
		*/
		int 차액 = 31000-17500;
		int t = 0;
		
//		while(t>=0) {if(t*3>차액) {System.out.println(t + "초");
//		                             t = -2;}
//		             t = t + 1;
//		             }
		
		
		while(t>=0) {
			t = t + 1;
			if(t*3>차액) {
				System.out.println(t + "초");
			    t = -1;
			}
        }
		
		System.out.println(차액 + "원");
		System.out.println(4501*3);
		
		System.out.println("------------------------");
		
		for(int i = 0; i>=0; i+=1) {
			if(i*3>차액) {
				System.out.println(i + "초");
				System.out.println(i*3 + "원");
				break;
			}
		}
		
	}
}

