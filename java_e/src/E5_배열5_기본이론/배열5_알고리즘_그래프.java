package E5_배열5_기본이론;

public class 배열5_알고리즘_그래프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	  	scoreList[] = {31, 76, 54, 2, 100, 23};
	  
		위 데이터는 학생 6명의 점수이다.	
		위 데이터를 그래프로 표현해볼려고한다.		
		 표시는 10의 자리숫자로 표현해서 개수만큼  * 로 출력할려고한다.		
		예)
		 31  ==> ***
		 76  ==> *******
		 54  ==> *****
		 2   ==> 
		 100 ==> **********
		 23  ==> **
		 */
		int scoreList[] = {31, 76, 54, 2, 100, 23};
		
		int count = 0;
		for(int i = 0; i<scoreList.length; i+=1) {
			int n = scoreList[i]/10;
			
			if(n == 0) {
				count = 0;
				System.out.print(scoreList[i] + " ==> ");
				System.out.print(" ");
			}
			if(n != 0) {
				count = n;
				System.out.print(scoreList[i] + " ==> ");
				for(int k = 0; k<count; k += 1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
