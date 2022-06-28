package E2_배열2_기본이론;

public class 배열2_알고리즘_1등 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [문제]
		  
		  [1둥]
		    아래 데이터는 학생번호1개, 점수2개가 한세트이다. 		
			번호는 1001부터시작이고 , 점수는 0~100 이다. 
			예) 1001 , 20, 30 ==> 1001번 1번점수 20점, 2번점수 30점
			 		 
			1등의 번호 출력한다. 
			점수는 두점수의 합으로계산한다. 
		*/
		int arr[] = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1};
		
		int score1 = 0;
		int score2 = 0;
		int max = 0;
		int count = -3;
		
		for(int i = 0; i<9; i+=3) {
			score1 = arr[i + 1];
			score2 = arr[i + 2];
			int total = score1 + score2;
			System.out.println("번호 : " + arr[i] + " , 1번 점수 : " + score1 + " , 2번 점수 : " + score2 + " , 총합 : " + total);
			if (max<total) {
				max = total;
				count = count+3;
			}
		}
		 System.out.println("1등 점수 : " + max + " , 1등 번호 : " + arr[count]);
			
	}
}
