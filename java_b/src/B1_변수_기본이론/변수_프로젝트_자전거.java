package B1_변수_기본이론;

public class 변수_프로젝트_자전거 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  [문제]
		 	철수는 자전거를 타고 일정한 빠르기로 7분동안 23 / 30km를 갔습니다.
		 	철수가 자전거를 타고 45초동안 간 거리는 몇 km입니까?
		*/
		double _7분 = 23.0/30.0;
		double _1분 = _7분/7;
		double _1초 = _1분/60;
		double _45초 = _1초*45;
		
		System.out.printf("%f", _45초);		
	}
}
