package D2_반복문2_알고리즘;

public class 반복문2_알고리즘_두지점_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
			철수네 가족은 x 와 y 두지점을 자전거를 타고 왕복하였다. 
			갈때는 시속15km , 올때는 시속12km 로 이동하여 총  45분이 걸렸을때 , 
			두지점의 x , y 거리를 구하시오.
		*/
		int x = 45;
		int y = 0;
		while(x<=45 && x>=0) {
			if(x*15 == y*12) {
				System.out.println("시속 15km로 " + x + "분 , " + "시속 12km로 " + y + "분");
			}			
		    x = x-1;
		    y = y+1;
		}
		System.out.println("x,y 거리 : " + 20/60.0*15 + "km");
	}
}
