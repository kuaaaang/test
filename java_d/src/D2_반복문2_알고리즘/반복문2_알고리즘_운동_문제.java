package D2_반복문2_알고리즘;

public class 반복문2_알고리즘_운동_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
		  철수는 저녁 6시에 30분에 집에서 3km 떨어진 공원을 가는데,
		  처음에는 시속 3km로 걷다가 도중에 시속 6km로 달려갔다.
		  철수는 공원에 7시 10에도착했다.
		  걸어간 거리와 달려간 거리를 구하시오.
		*/
		int x = 40;
		int y = 0;
		while(y>=0 && y<=40) {
			if(x*3 + y*6 == 3*60) {
				System.out.println("3km로 달려간 거리 : " + x*3/60.0 + "km ,  6km로 달려간 거리 : " + y*6/60.0 + "km");
			}
		    x = x - 1;
		    y = y + 1;	
	   }
	}
}
