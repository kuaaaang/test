package E1_배열1_기본이론;

import java.util.Random;

public class E1_배열_기본이론4_학생성적1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제1] array 배열에 1~100점 사이의 랜덤 정수를 5개 저장하고 출력
		 예)    87, 11, 92, 14, 47
		
		 [문제2] 전교생의 총점과 평균 출력
		 예)    총점(251) 평균(50.2)
		
		 [문제3] 성적이 60점 이상이면 합격. 합격생 수 출력
		 예)   2명
	   */
		Random ran = new Random();
		int[] array =  new int[5];
		
		int total = 0;
		int count = 0;
		for(int i = 0; i<5; i+=1) {int n = ran.nextInt(100)+1;
		                           array[i] = n;
		                           total += array[i];
		                           if(n>=60) {count +=1;}
		                           System.out.println(array[i]);}
		System.out.println("총점 : " + total + " , 평균 : " + (total/5.0));
		
		System.out.println("합격자 : " + count + "명");
	}
}
