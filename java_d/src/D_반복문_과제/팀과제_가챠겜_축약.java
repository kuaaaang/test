package D_반복문_과제;

import java.util.Scanner;
import java.util.Random;

public class 팀과제_가챠겜_축약 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		//가챠용 변수
		int gacha = 0; //+ 여부 결정
		int URPLUS = 10; //UR등급 중 +가 나올 확률
		
		//자금, 비용 저장용 변수
		long money = 0; // 자금
		int price = 1000; //가챠 1회 가격
		int charge = 0; // 총 가격
		
		//항목을 선택할 변수
		int input = -1;
		int input3 = 0;
		
		System.out.println("돌려라 돌려, 가챠퐁!");
		
		while(true) {
			System.out.println("1)뽑아보자! 2)충전하자! 3)상품보자! 0)그만할래!");
			System.out.print("뭘 할거야?: ");
			input = scan.nextInt();
			
			if(input == 0) {
				System.out.println("게임이 종료됩니다.");
				break;
			}else if(input == 1) {
				System.out.println("지금 " + money + "원 있어!");
				
				int input2 = -1;
				do {
					System.out.print("가챠 할래? (1:할래, 0:안해): ");
					input2 = scan.nextInt();
				}while(input2 < 0 || input2 > 1);
				
				if(input2 == 0) break;
				else {
					System.out.println("(1. 한번뽑기)(2. 10회 뽑기)");
					input3= scan.nextInt();
					charge = price;
					if(input3==2) {
						charge=price*10; // 10회 뽑기를 선택한 경우 가격 설정
					}
				}
				
				if(money < charge) {
					System.out.println("돈이 부족한걸! 충전 더 하고 와!");
					continue;
				}
				
				if(input3==1) {
					money -= charge;
					gacha = ran.nextInt(100); // 확률 100% 중에서
					if(gacha < URPLUS) { // URPLUS == 10
						System.out.println("와우!!!! UR+ '최고의 마스코트 페이몬'이 나왔어!!");//0부터 9까지
					} else if(gacha < (100 - URPLUS) / 3 + URPLUS) { // (100-10)/3 + 10 = 30+10 = 40
						System.out.println("와우!!! UR '신뢰의 번개 라이덴'이 나왔어!"); //10부터 39까지
					} else if(gacha < (100 - URPLUS) / 3 * 2 + URPLUS) { // ((100-10)/3)*2 + 10 = 60+10 = 70
						System.out.println("와우!! UR '질풍의 질주 카즈하'가 나왔어!"); //40부터 69까지
					} else {
						System.out.println("와우! UR '반암의 기둥 노엘'이 나왔어!"); //70부터 99까지
					}
				}
				if(input3==2) {
					money -= charge;
					for(int r=1; r<=10; r+=1) {
						gacha = ran.nextInt(100);
						if(gacha < URPLUS) {
							System.out.println("와우!!!! UR+ '최고의 마스코트 페이몬'이 나왔어!!");//0부터 9까지
						} else if(gacha < (100 - URPLUS) / 3 + URPLUS) {
							System.out.println("와우!!! UR '신뢰의 번개 라이덴'이 나왔어!"); //10부터 39까지
						} else if(gacha < (100 - URPLUS) / 3 * 2 + URPLUS) {
							System.out.println("와우!! UR '질풍의 질주 카즈하'가 나왔어!"); //40부터 69까지
						} else {
							System.out.println("와우! UR '반암의 기둥 노엘'이 나왔어!"); //70부터 99까지
						}	
					}
				}
				
			} else if(input == 2) { //돈 충전 선택시
				long temp = 0; //충전할 액수를 받는 변수
				System.out.print("얼마나 충전할래?: ");
				temp = scan.nextLong(); //입력하는 액수를 받아들인다
				if(temp <= 0) { //양수가 아닌 값을 입력한 경우 충전을 하지 않는다
					System.out.println("도로 빼가는 건 안 돼!");
				} else { //정상적으로 금액을 입력한 경우
					money += temp; //입력받은 액수를 충전한 뒤
					System.out.println("충전됐어! " + money + "원 있어!"); //현재 보유한 액수를 알려준다
				}
			} else if(input == 3) {
				System.out.println("현재 진행중인 가챠퐁에서 나오는 친구들은 아래와 같아!");
				double temp = (100 - URPLUS) / 3.0;  // (100-10)/3.0 = 30.0
				System.out.println(" +최고의 마스코트 페이몬 (" + (double)URPLUS + "%)");
				System.out.println(" 신뢰의 번개 라이덴 (" + temp + "%)");
				System.out.println(" 질풍의 질주 카즈하 (" + temp + "%)");
				System.out.println(" 반암의 기둥 노엘 (" + temp + "%)");
			}
	}
		scan.close();
	}
}