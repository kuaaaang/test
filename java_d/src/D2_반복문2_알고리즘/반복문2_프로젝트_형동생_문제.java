package D2_반복문2_알고리즘;

public class 반복문2_프로젝트_형동생_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
			동생이 오후 1시에 집을 나간지 12 분후에 형이 동생을 따라 나섰다.
			동생은 시속 2km로 걷고 형은 시속 6km 로 달렸을때 형과 동생이 만나는 건 몇분후입니까?	 			
		*/
		int t = 0;
		
		while(t>=0) {if(2*(t+12) == 6*t) {System.out.println("형과 동생은 " + t + "분 후에 만난다.");
		                                  t = -2;}
		             t = t + 1;
		             }
	}
}
