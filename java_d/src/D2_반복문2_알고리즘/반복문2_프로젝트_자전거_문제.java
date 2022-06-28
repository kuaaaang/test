package D2_반복문2_알고리즘;

public class 반복문2_프로젝트_자전거_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
			학교에서 집까지 갈때 시속 15km로 자전거를 타고 가면 6km로 걸어가는거보다 
			18분  빨리 도착한다고 한다.
			학교에서 집까지의 거리를 구하시오.
		*/
		int t = 0;
		
		while(t>=0) {
			if(15*t == 6*(t+18)) {
				System.out.println("학교에서 집까지 시속 15km로 " + t + "분");
		        System.out.println("학교에서 집까지 시속 6km로 " + (t+18) + "분");
		        System.out.println("학교에서 집까지 거리 : " + (15*(t/60.0)) + "km");
		        t = -2;
		    }
		    t = t+1;
		}
	}
}