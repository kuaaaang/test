package D_반복문_과제;

import java.util.Scanner;
import java.util.Random;

public class 팀과제_주석 {
	public static void main(String[] args) {
		//입력을 받을 스캐너와 확률 구현용 랜덤 생성
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		//가챠용 변수
		int gacha1 = 0; //R, SR, UR 결정
		int gacha2 = 0; //+ 여부 결정
		int urPercent = 5; //UR이 나올 확률
		int srPercent = 20; //SR이 나올 확률
		final int CHANCE = 5; //특별 가챠 선택시 확률 보정값
		final int URPLUS = 10; //UR등급 중 +가 나올 확률
		final int SRPLUS = 20; //R, SR등급 중 +가 나올 확률
		
		//자금, 비용 저장용 변수
		long money = 0; //가챠에 지를 수 있는 자금
		int lgacha = 1000; //일반 가챠 1회 가격
		int hgacha = 3000; //특별 가챠 1회 가격
		int chance = 0, charge = 0; //특별 가챠 적용 여부를 반영하기 위한 변수
		
		//항목을 선택할 변수
		int input = -1;
		
		System.out.println("돌려라 돌려, 가챠퐁!");
		//게임 진행용 무한 반복문
		while(true) {
			System.out.println("1)뽑아보자! 2)충전하자! 3)상품보자! 0)그만할래!");
			System.out.print("뭘 할거야?: ");
			input = scan.nextInt();
			
			if(input == 0) {
				break;
			} else if(input == 1) {
				System.out.println("확률이 낮은 일반 가챠는 " + lgacha + "원, 확률이 높은 특별 가챠는 " + hgacha +"원이야!");
				while(true) {
					System.out.println("지금 " + money + "원 있어!");
					
					int input2 = -1;
					do {
						System.out.print("뭘로 할래? (1:일반, 2:특별, 0:돌아가기): ");
						input2 = scan.nextInt(); //가챠 종류 선택
					}while(input2 < 0 || input2 > 2); //진행 가능한 숫자를 입력할 때까지 반복
					
					if(input2 == 0) break; //돌아가기를 입력했다면 여기서 그대로 나간다
					
					if(input2 == 1) { //일반 가챠를 선택했을 경우
						chance = 0; //확률 보정 없음
						charge = lgacha; //일반 가챠의 비용 적용
					} else { //특별 가챠를 선택했을 경우
						chance = CHANCE; //확률 보정 적용
						charge = hgacha; //특별 가챠의 비용 적용
					}
					
					int input3 = -1;
					do {
						System.out.print("10연 하면 SR 1명은 확정인데 할래?(1: 응, 2:아니): ");
						input3 = scan.nextInt(); //10연차 여부 결정
					}while(input3 < 1 || input3 > 2); //진행 가능한 숫자(후략)
					
					if(input3 == 1) charge *= 10; //10연차를 선택했다면 비용 10배 적용
					
					if(money < charge) { //최종적으로 필요한 비용이 부족한 경우
						System.out.println("돈이 부족한걸! 충전 더 하고 와!");
						break; //여기서 처음으로 돌아간다
					}
					
					money -= charge; //소지금에서 가챠 비용 차람
					
					if(input3 == 1) { //10연차를 선택했을 경우의 가챠 진행
						boolean check = true; //확률 보정을 체크하기 위한 변수. 가챠를 할 때마다 SR 이상이 나오는지 체크해서 한 번이라도 나온 경우 이 변수를 false로 만든다
						for(int i = 0; i < 10; i++) { //10연차이므로 10번 반복
							gacha1 = ran.nextInt(100); //각 단게는 0~99 범위 // 등급
							gacha2 = ran.nextInt(100); //각 단게는 0~99 범위 // +
							if(i == 9 && check == true) { //마지막 가챠인데 그 전까지 한 번도 SR 이상이 나오지 않았을 경우 무조건 SR 이상이 나오는 이 단락으로 들어온다
								double temp = 100.0 / (urPercent + srPercent + 5 * chance); //R 확률을 없애기 위해 UR, SR 확률이 전체에서 얼마나 차지하는지 구한 후
								if(gacha1 < (urPercent + chance) * temp) { //위에서 구한 비율을 UR 확률에 곱해서 R의 확률을 제거한다
									if(gacha2 < URPLUS) { //0부터 10(URPLUS의 값) 직전인 9까지는 UR+가 나올 확률로 설정
										System.out.println("UR+ 최고의 마스코트 페이몬");
									} else if(gacha2 < (100 - URPLUS) / 3 + URPLUS) { //UR의 전체 확률을 100으로 잡고, 그 중에서 UR+의 확률을 뺀 다음 UR 게채수로 나눠서 확률을 동등하게 만든다 
										System.out.println("UR 신뢰의 번개 라이덴"); //10부터 39까지
									} else if(gacha2 < (100 - URPLUS) / 3 * 2 + URPLUS) {
										System.out.println("UR 질풍의 질주 카즈하"); //40부터 69까지
									} else {
										System.out.println("UR 반암의 기둥 노엘"); //70부터 99까지
									}
								} else {
									if(gacha2 < SRPLUS) { //0부터 20(SRPLUS의 값) 직전인 19까지는 SR+의 확률
										System.out.println("SR+ 진리의 탐색자 알베도");
									} else if(gacha2 < (100 - SRPLUS) / 2 + SRPLUS) { //UR때와 마찬가지로, SR+의 확률을 뺀 다음 SR 개체수인 2로 나눠서 확률을 동등하게 만든다
										System.out.println("SR 천상의 화음 바바라"); //20부터 59까지
									} else {
										System.out.println("SR 진실된 믿음 연비"); //60부터 99까지
									}
								} //아직 마지막 가챠가 아니거나, 마지막 가챠더라도 이미 SR 이상이 나왔다면 이하의 보정 없는 가챠가 진행된다
							} else if(gacha1 < urPercent + chance) { //일반 가챠를 선택했다면 chance에 0이 들어가있으므로 urPercent의 값인 5% 확률로 UR이 나온다. 특별 가챠를 선택했다면 chance에 5가 들어가 합계 10% 확률이 된다
								check = false;
								if(gacha2 < URPLUS) {
									System.out.println("UR+ 최고의 마스코트 페이몬");
								} else if(gacha2 < (100 - URPLUS) / 3 + URPLUS) {
									System.out.println("UR 신뢰의 번개 라이덴");
								} else if(gacha2 < (100 - URPLUS) / 3 * 2 + URPLUS) {
									System.out.println("UR 질풍의 질주 카즈하");
								} else {
									System.out.println("UR 반암의 기둥 노엘");
								}
							} else if(gacha1 < urPercent + srPercent + 5 * chance) { //UR 확률인 urPercent와 SR 확률인 srPercent가 합산되어있지만, UR 확률을 위의 if문에서 거른 다음 else if로 이었기에 여기서 걸리는 건 UR 확률 범위를 제외한 SR 확률 부분뿐
								check = false;
								if(gacha2 < SRPLUS) {
									System.out.println("SR+ 진리의 탐색자 알베도");
								} else if(gacha2 < (100 - SRPLUS) / 2 + SRPLUS) {
									System.out.println("SR 천상의 화음 바바라");
								} else {
									System.out.println("SR 진실된 믿음 연비");
								}
							} else { //UR 확률과 SR 확률을 전부 비껴나간 나머지 부분
								if(gacha2 < SRPLUS) {
									System.out.println("R+ 나아가는 자 루미네");
								} else if(gacha2 < (100 - SRPLUS) / 2 + SRPLUS) {
									System.out.println("R 굳건한 의지 베넷");
								} else {
									System.out.println("R 마지막 보루 다이루크");
								}
							}
						}
						System.out.println("가 나왔어!");
					} else { //10연을 선택하지 않았다면 여기서 가챠 1회만 진행된다.
						gacha1 = ran.nextInt(100);
						gacha2 = ran.nextInt(100);
						if(gacha1 >= 100 - urPercent - chance) {
							if(gacha2 < URPLUS) {
								System.out.println("와우!!!! UR+ '최고의 마스코트 페이몬'이 나왔어!!");
							} else if(gacha2 < (100 - URPLUS) / 3 + URPLUS) {
								System.out.println("와우!!! UR '신뢰의 번개 라이덴'이 나왔어!");
							} else if(gacha2 < (100 - URPLUS) / 3 * 2 + URPLUS) {
								System.out.println("와우!! UR '질풍의 질주 카즈하'가 나왔어!");
							} else {
								System.out.println("와우! UR '반암의 기둥 노엘'이 나왔어!");
							}
						} else if(gacha1 >= 100 - urPercent - srPercent - 5 * chance) {
							if(gacha2 < SRPLUS) {
								System.out.println("오우!!! SR+ '진리의 탐색자 알베도'가 나왔어!");
							} else if(gacha2 < (100 - SRPLUS) / 2 + SRPLUS) {
								System.out.println("오우!! SR '천상의 화음 바바라'가 나왔어!");
							} else {
								System.out.println("오우! SR '진실된 믿음 연비'가 나왔어!");
							}
						} else {
							if(gacha2 < SRPLUS) {
								System.out.println("오!!! R+ '나아가는 자 루미네'가 나왔어!");
							} else if(gacha2 < (100 - SRPLUS) / 2 + SRPLUS) {
								System.out.println("오!! R '굳건한 의지 베넷'이 나왔어!");
							} else {
								System.out.println("오! R '마지막 보루 다이루크'가 나왔어!");
							}
						}
					}

					do {
						System.out.print("또 할래?(1: 응, 2:아니): "); //가챠가 끝난 다음 다시 할지 물어보는 단락
						input2 = scan.nextInt();
					}while(input2 < 1 || input2 > 2);
					
					if(input2 == 2) break; //안 하는 걸 선택했다면 가챠를 끝낸다.
				} //while(true) 반복문이므로, 중간에 break를 만나지 않았다면 가챠를 재개한다
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
			} else if(input == 3) { //상품을 보는 것을 선택한 경우
				System.out.println("현재 진행중인 가챠퐁에서 나오는 친구들은 아래와 같아!"); //상품 목록과 각각의 확률을 표기한다. 슬래시(/)를 기준으로 왼쪽은 일반 가챠의 확률, 오른쪽은 특별 가챠의 확률.
				System.out.println("UR: " + urPercent + "%/"+ (urPercent + CHANCE) +"%"); //UR등급 확률인 urPercent와, 특별 가챠 선택시의 보정값인 CHANCE를 이용해 각각의 확률을 표기
				double temp1 = urPercent / (100.0 / URPLUS); //UR+ 확률이 UR 등급의 확률에서 차지하는 비율을 계산한 뒤 UR 확률에 곱해서 UR+이 전체에서 차지하는 비율을 계산
				double temp2 = (urPercent + CHANCE) / (100.0 / URPLUS); //상기 계산을 특별 가챠를 기준으로 계산
				double temp3 = (urPercent - temp1) / 3; //UR 등급 전체 확률에서 UR+만의 확률을 제외한 다음 UR 등급 개체의 수인 3으로 나눠 각각의 확률을 계산
				double temp4 = (urPercent + CHANCE - temp2) / 3; //상기 계산을 특별 가챠를 기준으로 계산
				System.out.println(" +최고의 마스코트 페이몬 (" + temp1 + "%/" + temp2 + "%)");
				System.out.println(" 신뢰의 번개 라이덴 (" + temp3 + "%/" + temp4 + "%)");
				System.out.println(" 질풍의 질주 카즈하 (" + temp3 + "%/" + temp4 + "%)");
				System.out.println(" 반암의 기둥 노엘 (" + temp3 + "%/" + temp4 + "%)");
				System.out.println("SR: " + srPercent + "%/"+ (srPercent + CHANCE * 4) +"%");
				temp1 = srPercent / (100.0 / SRPLUS); //UR+ 때와 마찬가지로 전체 테이블에서 SR+이 차지하는 비율을 계산
				temp2 = (srPercent + 4 * CHANCE) / (100.0 / SRPLUS);
				temp3 = (srPercent - temp1) / 2; //일반 SR 개체 각각의 확률 계산
				temp4 = (srPercent + 4 * CHANCE - temp2) / 2;
				System.out.println(" +진리의 탐색자 알베도 (" + temp1 + "%/" + temp2 + "%)");
				System.out.println(" 천상의 화음 바바라 (" + temp3 + "%/" + temp4 + "%)");
				System.out.println(" 진실된 믿음 연비 (" + temp3 + "%/" + temp4 + "%)");
				System.out.println("R: " + ( 100 - urPercent - srPercent ) +"%/" + ( 100 - urPercent - srPercent - CHANCE * 5 ) +"%");
				temp1 = (100 - urPercent - srPercent) / (100.0 / SRPLUS);
				temp2 = (100 - urPercent - srPercent - CHANCE * 5) / (100.0 / SRPLUS);
				temp3 = (100 - urPercent - srPercent - temp1) / 2;
				temp4 = (100 - urPercent - srPercent - 5 * CHANCE - temp2) / 2;
				System.out.println(" +나아가는 자 루미네 (" + temp1 + "%/" + temp2 + "%)");
				System.out.println(" 굳건한 의지 베넷 (" + temp3 + "%/" + temp4 + "%)");
				System.out.println(" 마지막 보루 다이루크 (" + temp3 + "%/" + temp4 + "%)");
			} else {
				System.out.println("제대로 입력해줘!");
			}
		}
		
		//스캐너 안전 종료
		scan.close();
	}
}
