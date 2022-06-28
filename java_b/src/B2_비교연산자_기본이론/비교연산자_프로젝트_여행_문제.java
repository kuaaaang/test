package B2_비교연산자_기본이론;

public class 비교연산자_프로젝트_여행_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [문제]
			고속버스를 타고 여행을 떠나려한다.
			출발시간까지 1시간 여유가 있다.
			고속버스역과 상점을 시속 3km 로 걸어서 왕복을하고,
			10분동안 물건을 산다고하면 
			역에서  1.3km 떨어진 상점을 다녀올수있나요?
		*/
		double _3km = 60;
		double _1km = _3km/3;
		double 상점이동편도 = _1km*1.3;
		double 상점이동왕복 = 상점이동편도*2;
		
		System.out.println(상점이동왕복 + 10);
		System.out.println(상점이동왕복 + 10 <= 60);	
	}	
}
