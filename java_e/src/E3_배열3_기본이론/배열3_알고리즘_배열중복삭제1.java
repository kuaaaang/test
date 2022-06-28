package E3_배열3_기본이론;

import java.util.Arrays;
import java.util.Scanner;

public class 배열3_알고리즘_배열중복삭제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			 [문제] 값을 입력받고 삭제 
			 [조건] 만약에 같은값이 여러개 있으면 가장첫번째의 값  한개만 삭제 후 b 에 순차적으로 저장 
			 
			 		  data[] = {5,2,6,8,5,6};
			 		  
			 [예] 2 ==>  b [] = {5,6,8,5,6,0};
			 [예] 6 ==>  b [] = {5,2,8,5,6,0};
		 */
		    Scanner scan = new Scanner(System.in);
		    
		    int data[] = {5,2,6,8,5,6};
			int b [] = {0,0,0,0,0,0};
			
			System.out.println("삭제할 값을 입력하세요. [5,2,6,8,5,6]");
			int n = scan.nextInt(); 

			int j = -1;
			for(int i = 0; i<data.length; i+=1) {
				if(n == data[i]) {
					j = i;
					break;
				}
			}
			
			if(j == -1) {System.out.println("입력한 숫자가 존재하지 않습니다.");}
			else {
				int index = 0;
				for(int i = 0; i<data.length; i+=1) {
					if(i != j) {
						b[index] = data[i];
						index +=1;
					}
				}
			}
		
		System.out.println(Arrays.toString(b));
			
		scan.close();
	}
}
