package D_반복문_과제;

import java.util.Random;
import java.util.Scanner;

public class 팀과제_가챠 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [1] 처음 접속 시 기본 1000P 보상 지급
		 [2] 금액 충전 or 가챠 or 게임종료 선택
		 [3] 금액은 기본 1000P부터  충전 가능
		 [4] 가챠 아이템 등급 : [1 ~ 10] => 숫자가 높을 수록 희귀(나올 확률 적음)
		 [5] 가격 : 1000P -> 5회 연속 뽑기, 2000P -> 10회 연속 뽑기 
		 [6] 10회를 뽑을 경우 무조건 7등급 이상의 아이템이 3개 나온다. (5회는 5등급 이상 1개)
		*/
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int point = 1000;
		System.out.println("====랜던 뽑기 게임====");
		System.out.println("로그인 보상 1000P");
		System.out.println("보유 잔액 : " + point + "P");
		
		while(true) {
			System.out.println("[1.금액 충전] [2.뽑기] [3.게임종료]");
			int n = scan.nextInt();
			
			if(n == 1) {
				System.out.println("충전할 금액을 입력해주세요.(최소 단위 : 1000원)");
				int money = scan.nextInt();
				if(money>=1000) {
					System.out.println("충전이 완료되었습니다.");
					point += money;
					System.out.println("보유 잔액 : " + point + "P");
				}
				else if(money<1000){System.out.println("충전금액이 너무 적습니다.");}
				
			}
			else if(n == 2) {
				System.out.println("[1. 1회 뽑기(200P)] [2. 5회 뽑기(1000P)] [3. 10회 뽑기(2000P)]");
				System.out.println("보유 잔액 : " + point + "P");
				int n2 = scan.nextInt();
				
				int count = 0;
				int count_1 = 0;
				int count_2 = 0;
				int count_3 = 0;
				int count_4 = 0;
				int count_5 = 0;
				int count_6 = 0;
				int count_7 = 0;
				int count_8 = 0;
				int count_9 = 0;
				int count_10 = 0;
				
				if(n2 == 1) {
					if(point >= 200) {
						point -= 200;
						for(int i = 0; i<50; i+=1) {
							int r = ran.nextInt(10)+1;
							if(r == 1) {
								count_1 += 1;
								if(count_1/1>0 && count<1) {
							    	System.out.print(1 + "  ");
							    	count += 1;
							    }
							}
							else if(r == 2) {
								count_2 += 1;
							    if(count_2/2>0 && count<1) {
							    	System.out.print(2 + "  ");
							    	count += 1;
							    }
							}
							else if(r == 3) {
								count_3 += 1;
								if(count_3/3>0 && count<1) {
							    	System.out.print(3 + "  ");
							    	count += 1;
							    }
							}
							else if(r == 4) {
								count_4 += 1;
								if(count_4/4>0 && count<1) {
							    	System.out.print(4 + "  ");
							    	count += 1;
							    }
							}
							else if(r == 5) {
								count_5 += 1;
								if(count_5/5>0 && count<1) {
							    	System.out.print(5 + "  ");
							    	count += 1;
							    }
							}
							else if(r == 6) {
								count_6 += 1;
								if(count_6/6>0 && count<1) {
							    	System.out.print(6 + "  ");
							    	count += 1;
							    }
							}
							else if(r == 7) {
								count_7 += 1;
								if(count_7/7>0 && count<1) {
							    	System.out.print(7 + "  ");
							    	count += 1;
							    }
							}
							else if(r == 8) {
								count_8 += 1;
								if(count_8/8>0 && count<1) {
							    	System.out.print(8 + "  ");
							    	count += 1;
							    }
							}
							else if(r == 9) {
								count_9 += 1;
								if(count_9/9>0 && count<1) {
							    	System.out.print(9 + "  ");
							    	count += 1;
							    }
							}
							else if(r == 10){
								count_10 += 1;
								if(count_10/10>0 && count<1) {
							    	System.out.print(10 + "  ");
							    	count += 1;
							    }
							}
						}
						System.out.println();
					}
					else if(point<200) {
						System.out.println("잔액이 부족합니다.");
						System.out.println("충전 후 다시 이용하세요.");
					}
				}
				else if(n2 == 2) {
					if(point >= 1000) {
						point -= 1000;
						for(int i = 0; i<50; i+=1) {
							int r2 = ran.nextInt(10)+1;
							if(r2 == 1) {
								count_1 += 1;
								if(count_1/1>0 && count<5) {
							    	System.out.print(1 + "  ");
							    	count += 1;
							    }
							}
							else if(r2 == 2) {
								count_2 += 1;
							    if(count_2/2>0 && count<5) {
							    	System.out.print(2 + "  ");
							    	count += 1;
							    }
							}
							else if(r2 == 3) {
								count_3 += 1;
								if(count_3/3>0 && count<5) {
							    	System.out.print(3 + "  ");
							    	count += 1;
							    }
							}
							else if(r2 == 4) {
								count_4 += 1;
								if(count_4/4>0 && count<5) {
							    	System.out.print(4 + "  ");
							    	count += 1;
							    }
							}
							else if(r2 == 5) {
								count_5 += 1;
								if(count_5/5>0 && count<5) {
							    	System.out.print(5 + "  ");
							    	count += 1;
							    }
							}
							else if(r2 == 6) {
								count_6 += 1;
								if(count_6/6>0 && count<5) {
							    	System.out.print(6 + "  ");
							    	count += 1;
							    }
							}
							else if(r2 == 7) {
								count_7 += 1;
								if(count_7/7>0 && count<5) {
							    	System.out.print(7 + "  ");
							    	count += 1;
							    }
							}
							else if(r2 == 8) {
								count_8 += 1;
								if(count_8/8>0 && count<5) {
							    	System.out.print(8 + "  ");
							    	count += 1;
							    }
							}
							else if(r2 == 9) {
								count_9 += 1;
								if(count_9/9>0 && count<5) {
							    	System.out.print(9 + "  ");
							    	count += 1;
							    }
							}
							else if(r2 == 10){
								count_10 += 1;
								if(count_10/10>0 && count<5) {
							    	System.out.print(10 + "  ");
							    	count += 1;
							    }
							}
						}
						int a = ran.nextInt(6)+5;
						System.out.print(a);
						
						System.out.println();
					}
					else if(point<1000) {
						System.out.println("잔액이 부족합니다.");
						System.out.println("충전 후 다시 이용하세요.");
					}
				}
				else if(n2 == 3) {
					point -= 2000;
					if(point >= 2000) {
						for(int i = 0; i<50; i+=1) {
							int r3 = ran.nextInt(10)+1;
							if(r3 == 1) {
								count_1 += 1;
								if(count_1/1>0 && count<7) {
							    	System.out.print(1 + "  ");
							    	count += 1;
							    }
							}
							else if(r3 == 2) {
								count_2 += 1;
							    if(count_2/2>0 && count<7) {
							    	System.out.print(2 + "  ");
							    	count += 1;
							    }
							}
							else if(r3 == 3) {
								count_3 += 1;
								if(count_3/3>0 && count<7) {
							    	System.out.print(3 + "  ");
							    	count += 1;
							    }
							}
							else if(r3 == 4) {
								count_4 += 1;
								if(count_4/4>0 && count<7) {
							    	System.out.print(4 + "  ");
							    	count += 1;
							    }
							}
							else if(r3 == 5) {
								count_5 += 1;
								if(count_5/5>0 && count<7) {
							    	System.out.print(5 + "  ");
							    	count += 1;
							    }
							}
							else if(r3 == 6) {
								count_6 += 1;
								if(count_6/6>0 && count<7) {
							    	System.out.print(6 + "  ");
							    	count += 1;
							    }
							}
							else if(r3 == 7) {
								count_7 += 1;
								if(count_7/7>0 && count<7) {
							    	System.out.print(7 + "  ");
							    	count += 1;
							    }
							}
							else if(r3 == 8) {
								count_8 += 1;
								if(count_8/8>0 && count<7) {
							    	System.out.print(8 + "  ");
							    	count += 1;
							    }
							}
							else if(r3 == 9) {
								count_9 += 1;
								if(count_9/9>0 && count<7) {
							    	System.out.print(9 + "  ");
							    	count += 1;
							    }
							}
							else if(r3 == 10){
								count_10 += 1;
								if(count_10/10>0 && count<7) {
							    	System.out.print(10 + "  ");
							    	count += 1;
							    }
							}
						}
						for(int j = 0; j<3; j+=1) {
							int b = ran.nextInt(4)+7;
							System.out.print(b + "  ");
						}
						System.out.println();
					}
					else if(point<2000) {
						System.out.println("잔액이 부족합니다.");
						System.out.println("충전 후 다시 이용하세요.");
					}
				}
				
			}
			else if(n == 3) {
				System.out.println("게임 종료!");
				break;
			}
			else {
				System.out.println("다시 선택하세요.");
			}
			System.out.println();
		}
		scan.close();
	}
}
