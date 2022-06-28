package B2_비교연산자_기본이론;

public class 비교연산자_프로젝트_경주_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	 	[문제] 
		  	자동차는 154키로의거리를 1시간18분에 달린다.
		  	트럭은 215키로의거리를 2시간17분에 달린다. 			  	
		  	자동차가 트럭보다 빠른가요? 
	    */
		double 자동차이동거리 = 154;
		double 자동차이동시간 = 78;
		double 자동차분속 = 자동차이동거리/자동차이동시간;
		double 트럭이동거리 = 215;
		double 트럭이동시간 = 137;
		double 트럭분속 = 트럭이동거리/트럭이동시간;
		
		System.out.println(자동차분속);
		System.out.println(트럭분속);
		
		System.out.println(자동차분속 < 트럭분속);
		System.out.println(자동차분속 > 트럭분속);		
	}
}
