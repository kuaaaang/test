package D1_반복문1_기본이론;

public class 반복문1_프로젝트_가까운값_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제] 
		  	1 에서 200 사이의 숫자중 다음 조건에 전부 맞는 숫자를 출력.
		    [조건1] 6의 배수를출력
		    [조건2] 100에 가장가까운 수를 출력 
		 		
		 	정답 : 102
		*/
		int i = 1;
		while (i>=1) {if(i%6 == 0 && i>=94 && i<=106) {System.out.println(i);}
		              i = i + 1;}
		System.out.println("-----------------------------");
		System.out.println(100-96);
		System.out.println(102-100);
		System.out.println("102가 100에 가장 가까운 수");
	}
}
