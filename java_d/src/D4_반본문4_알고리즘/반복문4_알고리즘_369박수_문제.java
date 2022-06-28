package D4_반본문4_알고리즘;

public class 반복문4_알고리즘_369박수_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		   [369게임]
		  1. 1~50까지 반복을 한다.
		  2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
		  
		  3. 각각의 숫자에 3이나 6이나 9가 두개 면 "짝짝"
		  4. 각각의 숫자에 3이나 6이나 9가 한개 면 "짝"
		  5. 3이나 6이나 9가 없으면 그냥 숫자출력 
		  
		  예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
		*/
		
		int n = 1;
			
		while(n<=50) {int f = n%10;
		              int s = n/10;
			
		              int count = 0;
			          if(s==3 || s==6 || s==9) {count = count + 1;}
		              if(f==3 || f==6 || f==9) {count = count + 1;}
			
		              if(count == 1) {System.out.println("짝");}
			          else if(count == 2) {System.out.println("짝짝");}
                      else {System.out.println(n);}
			          
			          n = n + 1;
	             	 }
		
	}
}
