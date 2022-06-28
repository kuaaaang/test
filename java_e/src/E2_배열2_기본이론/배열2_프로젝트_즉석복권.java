package E2_배열2_기본이론;

 import java.util.Random;
 import java.util.Scanner;

public class 배열2_프로젝트_즉석복권 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   즉석복권문제) 사이즈가 7인 배열이 있다. 
		    - [1. 복권 결과확인] 입력시 "당첨" 또는 "꽝" 출력 
		    - 1 또는 7을  랜덤으로 배열에 저장한다.   [예] 1,7,7,1,1,1,7
		    - 7이연속으로 3개이상이면 "당첨" 아니면 "꽝" 이다.
		    - 당첨이되면 3000원 획득한다.
		    - 꽝이되면 1000원 감소한다.
		    
		    [조건] 반드시 7은 3개이상 있어야한다. 
		*/
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int 복권[] = new int[7];
		
		int money = 1000;
		int count = 0;
		while(true) {
			System.out.println("[잔액 : " + money + "원]");
			System.out.println("[1. 복권 결과확인]");
			System.out.println("[2. 돈충전]");
			System.out.println("[0. 종료]");
			int n = scan.nextInt();
			
			if(n==1) {
				while(true) {
					int _7 = 0;
					for(int i = 0; i<7; i+=1) {
						int r = ran.nextInt(2);
						if(r==0) {
							복권[i] = 1;
						}
						else if(r==1) {
							복권[i] = 7;
							_7 +=1;
						}
					}
					if(_7 >= 3) {
						break;
					}
				}
				
				int _7 = 0;
				boolean win = false;
				for(int i = 0; i<7; i+=1) {
					if(복권[i] == 7) {
						_7 +=1;
						if(_7 >=3) {
							win = true;
							break;
						}
					}else {
						_7 = 0;
					}
				}
				for(int i = 0; i<7; i+=1) {System.out.print(복권[i] + "  ");}
				System.out.println();
				if(win == true) {money  = money + 3000;}
				else {money  = money - 1000;}
				
			}
			else if(n==2) {
				System.out.println("충전할 금액을 입력해주세요.");
				int pmoney = scan.nextInt();
				money = money + pmoney;
			}
			else if(n==0) {
				System.out.println("종료");
				break;
			}
			else {
				System.out.println("오류! 다시 선택하세요.");
			}
		}	
		scan.close();	
	}
}
