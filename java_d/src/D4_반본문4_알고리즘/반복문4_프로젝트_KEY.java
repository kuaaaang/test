package D4_반본문4_알고리즘;

import java.util.Scanner;

public class 반복문4_프로젝트_KEY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [키위치 찾기] 
		  1. -1이 나올 때까지 일련의 수를 입력받는다.
		  2. 위 수 중 key 값이 몇 번째에 포함되어 있는가를 출력하는 프로그램을 작성하시오.
		  3. 단, key가 여러개 포함되어 있을 경우 앞에 나타난 것의 위치를 출력하시오.
		  4. key가 일련의 수 안에 없는 경우 "not found"를 출력하시오.
		  
		  예) 
		  result 값 입력 : 99
		  
		  입력 : 10
		  입력 : 99
		  입력 : 20
		  입력 : 99
		  입력 : 30
		  입력 : 99
		  입력 : 10
		  입력 : -1
		  
		  결과 : key값 99가 첫번재 나타난 것은 2번째 이다.
		*/
		Scanner scan = new Scanner(System.in);
		
		int result = 99;
		int count = 0;
		int countx = 0;
		int i = 1;
		
		while(true) {System.out.println("key값 입력 : ");
		             int key = scan.nextInt();
		             if(key == result) {count = i;}
		             if(key != result) {countx = countx + 1;}
		             
		             if(key == -1) {System.out.println("종료");
		            		        break; 
		            		        }
		             
		             i +=1;
		             }
		if(countx != i) {System.out.println("key값 99가 첫번재 나타난 것은 " + count + "번째 이다.");}
 		if(countx == i) {System.out.println("not found");}
		
		scan.close();
	}
}
