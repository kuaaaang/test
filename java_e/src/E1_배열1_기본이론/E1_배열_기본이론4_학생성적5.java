package E1_배열1_기본이론;

import java.util.Scanner;

public class E1_배열_기본이론4_학생성적5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*  
		   numberList = {1001, 1002, 1003, 1004, 1005};
		   scoreList  = { 87 ,  11 ,  45 ,  98 ,  23 };
		 
		   [문제] 학번을 입력받아 성적 출력한다. 
			 	 단, 없는학번 입력 시 예외처리 하시오.
			 예)
			 학번 입력 : 1002		성적 : 11점
			 학번 입력 : 1000		해당학번은 존재하지 않습니다. 
		*/
		Scanner scan = new Scanner(System.in);
		
		int numberList[] = {1001, 1002, 1003, 1004, 1005};
		int scoreList[]  = { 87 ,  11 ,  45 ,  98 ,  23 };
		
		System.out.println("학번을 입려하세요.");
		int n = scan.nextInt();
		
		int count = -1;
		for(int i = 0; i<5; i+=1) {
			if(n == numberList[i]) {count = i;
			}
		}
			
		if(count == -1) {
			System.out.println("해당학번은 존재하지 않습니다.");
		}
		else {
			System.out.println("학번 " + numberList[count] + " , 성적 : " + scoreList[count] + "점");
		}
			
		
		
		scan.close();
	}
}
