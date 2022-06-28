package E6_배열6_알고리즘;

import java.util.Scanner;

public class 배열6_알고리즘_연속빈칸찾기_정답수정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*

		 [1] 배열 arr 은 1과 0으로 되어있다.
		 [2] 숫자1 은 이미 채워진 자리이고 0은 비어있는자리이다.
		 [3] input 변수에 값을 입력받고 아래 내용대로 구현 
		  	예) input => 3 ==> 인덱스 2부터 연속으로 3칸이 비어있으므로, 
		 		{0,1,1,1,1,1,0,0};	
		 		
		 	예) input => 4 ==> 연속으로4칸 비어있는자리가 없으므로 "x"
		 		{0,1,0,0,0,1,0,0};
		 		
		 	예) input => 1 ==> 인덱스 0의 자리가 비어있으므로 
		 		{1,1,0,0,0,1,0,0};	
		*/
		    Scanner scan = new Scanner(System.in);
		
		    System.out.println("숫자를 입력하세요.");
		    int n = scan.nextInt();
			int arr[] = {0,1,0,0,0,1,0,0};			
			int count = 0;
			int startIndex = -1;
			boolean check = false;
			for(int i = 0; i<arr.length; i+=1) {
				if(arr[i] == 0) {
					if(count == 0) {
						startIndex = i;
					}
					count += 1;
					if(count == n) {
						check = true;
						break;
					}
				}
				else {count = 0;}
			}
			System.out.println();
			if(check == false) {System.out.println("비어있는 자리가 없다.");}
			else {System.out.println("비어있는 자리가 있다.");}
			
			scan.close();
	}
}
