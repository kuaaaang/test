package B1_변수_기본이론;

public class 변수_알고리즘_과일판매_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[문제]
		 - 가게에 과일 250개가 있다. 
		 - 그중에 오전에 120개가 팔렸고 오후에는  80개가 팔렸다.
		 - 남은 과일는 전체 과일의 몇 % 인가?
		*/
		int 과일 = 250;
		int 오전 = 120;
		int 오후 = 80;
		int 남은과일 = 과일 - 오전 - 오후;
		
		double 일퍼센트 = 과일/100.0;
		double 남은과일퍼센트 = 남은과일 / 일퍼센트;
		System.out.println(남은과일퍼센트);
		
//		System.out.println();
//		double 퍼센트 = (double)남은과일/과일;
//		double 답 = 퍼센트*100;
//		System.out.println(답);
	}
}
