package D2_반복문2_알고리즘;

public class 반복문2_알고리즘_편의점_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
			철수가 편의점의 한개에 1000원인 흰우유와 한개에 1200원인 초코우유를 몇개 사서 
			총 15개의 우유를 샀다.
			20000원을 내고 4200원을 거슬러받았을때 철수가산 흰우유는 몇개인가요??
		*/
		int white = 1000;
		int choco = 1200;
		
		int money = 15800;
		
		int a = 15;
		int b= 0;
		
		while(b>=0 && b<=15) {
			if(a*white + b*choco == money) {
				System.out.println("흰우유 : " + a + "개 , 초코우유 : " + b + "개");
			}			
			a = a - 1;
			b = b + 1;
		}
	}
}
