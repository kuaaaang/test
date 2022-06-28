package D6_반복문6_기본이론;

import java.util.Scanner;

public class 반복문6_프로젝트_rpg던전탐험 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	     [반복문 최종프로젝트] 시간제한없이 자유롭게 하면된다.
		  [던전탐험게임]
		  플레이어는 무기 방어구 체력 돈 운 등의 데이터가 있다. (추가 가능)
		  플레이어와 적은 1명으로 하고 1명이상은 추후 배열에서 가능하다.
		  
		  1) 메인메뉴 ==> [1.여관] [2.대장간] [3.던전][0.종료]
		  
		  2) [1.여관] 은 소지금을 소모해 체력과 스킬회복 또는 아이템구입을 한다.
		  				 ==> [1.숙박(체력,스킬회복)][2.물약구입][0.뒤로가기]
		  3) [2.대장간] 은 소지금을 소모해 랜덤으로 무기와 방어구 업그레이드 시켜준다. 
		  			    ==> [1.무기업][2.방어구업][0.뒤로가기]
		  4) [3.던전] 은 몬스터를 만나 전투를한다. ==> [1.공격][2.스킬][3.물약먹기][0.뒤로가기]
		  			스킬은 2번 공격을 한다.
		  			물약을 먹으면 체력이 회복한다. 
		  			승리하면 돈을 획득한다. 
		*/
		Scanner scan = new Scanner(System.in);
		
		int 현재체력 = 150;
		int 최대체력 = 200;
		int 공격력 = 15;
		int 방어력 = 10;
		int 물약개수 = 5;
		int 스킬개수 = 2;
		int 소지금 = 100;
		
		int 몬스터현재체력 = 150;
		int 몬스터최대체력 = 150;
		int 몬스터공격력 = 10;
		int 몬스터소지금 = 15;
		
		int run = 1;
		while(run == 1) {System.out.println("=============던 전 탐 험=============");
			             System.out.println("[1.여관] [2.대장간] [3.던전] [0.종료]");
			             int n = scan.nextInt();
			             while(n==1) {System.out.println("[1.여관]");
			                          System.out.println("[1.숙박(체력,스킬회복)][2.물약구입][0.뒤로가기]");
			                          int n1 = scan.nextInt();
			                          if(n1 == 1) {System.out.println("숙박(체력,스킬회복)");
			                                       현재체력 = 최대체력;
			                                       스킬개수 = 3;
			                                       if(소지금<10) {System.out.println("소지금이 부족합니다.");}
			                                       else {소지금 = 소지금 - 10;
			                                    	     System.out.println("체력 : 250 , 스킬 : 3번 , 소지금 : " + 소지금 + "G");}
			                                             }
			                          else if(n1 == 2) {System.out.println("물약구입");
			                                            물약개수 = 물약개수 + 1;
			                                            if(소지금<5) {System.out.println("소지금이 부족합니다.");}
			                                            else {소지금 = 소지금 - 5;
			                                            	  System.out.println("물약개수 : " + 물약개수 + "개 , 소지금 : " + 소지금 + "G");}
			                                                  }
			                          else if(n1 == 0) {break;}
			                          }
			             
			             while(n==2) {System.out.println("[2.대장간]");
                                      System.out.println("[1.무기업][2.방어구업][0.뒤로가기]");
                                      int n2 = scan.nextInt();
                                      if(n2 == 1) {System.out.println("무기업");
                                                   공격력 = 공격력 + 5;
                                                   if(소지금<5) {System.out.println("소지금이 부족합니다.");}
		                                           else {소지금 = 소지금 - 5;
	                                            	     System.out.println("공격력 : " + 공격력 + " , 소지금 : " + 소지금 + "G");}
                                                         } 
			                          else if(n2 == 2) {System.out.println("방어구업");
			                                            방어력 = 방어력 + 5;
                                                        if(소지금<5) {System.out.println("소지금이 부족합니다.");}
                                                        else {소지금 = 소지금 - 5;
                                   	                          System.out.println("방어력 : " + 방어력 + " , 소지금 : " + 소지금 + "G");}
                                                        } 
			                          else if(n2 == 0) {break;}
			                          }
			             
			             while(n==3) {System.out.println("[3.던전]");
			                          System.out.println("몬스터현재 체력 : " + 몬스터현재체력 + " , 내 현재체력 : " + 현재체력);
                                      System.out.println("[1.공격][2.스킬][3.물약먹기][0.뒤로가기]");
                                      int n3 = scan.nextInt();
                                      if(n3 == 1) {System.out.println("공격");
                                                   몬스터현재체력 = 몬스터현재체력 - 공격력;
                                                   if(몬스터현재체력>0) {System.out.println("몬스터현재 체력 : " + 몬스터현재체력);
                                                                     System.out.println("몬스터가 공격합니다.");
                                                                     System.out.println("현재체력 : " + (현재체력 - 몬스터공격력));
                                                                     현재체력 = 현재체력 - 몬스터공격력;
                                                                     if(현재체력<=0 ) {System.out.println("사망");
                                                                                     run = 0;
                                                                                     break;
                                                                                     }
                                                                     }
                                                   else if(몬스터현재체력<=0) {System.out.println("몬스터 퇴치 성공! 보상 : 15G");
                                                                           소지금 = 소지금 + 몬스터소지금;
                                                                           몬스터현재체력 = 몬스터최대체력;
                                                                           break;}
                                                   }
			                          else if(n3 == 2) {System.out.println("스킬(데미지 2배)");
			                                            if(몬스터현재체력>0) {if(스킬개수 <=0) {System.out.println("스킬개수가 부족합니다. 스킬을 사용할수 없습니다.");}
			                                                              else {몬스터현재체력 = 몬스터현재체력 - 공격력 - 공격력;
			                                                              System.out.println("몬스터현재 체력 : " + 몬스터현재체력);
                                                                          System.out.println("몬스터가 공격합니다.");
                                                                          System.out.println("현재체력 : " + (현재체력 - 몬스터공격력));
                                                                          현재체력 = 현재체력 - 몬스터공격력;
                                                                          스킬개수 = 스킬개수 - 1;
                                                                          if(현재체력<=0 ) {System.out.println("사망");
                                                                                          run = 0;
                                                                                          break;
                                                                                          }
			                                                            	    }
                                                                           }
                                                        else if(몬스터현재체력<=0) {System.out.println("몬스터 퇴치 성공! 보상 : 15G");
                                                                                소지금 = 소지금 + 몬스터소지금;
                                                                                몬스터현재체력 = 몬스터최대체력;
                                                                                break;}
			                                            }
			                          else if(n3 == 3) {System.out.println("물약먹기");
			                                            if(물약개수<=0) {System.out.println("물약개수가 부족합니다. 물약을 사용할수 없습니다.");}
			                                            물약개수 = 물약개수 - 1;
			                                            현재체력 = 현재체력 + 10;
			                                            System.out.println("현재체력 : " + 현재체력);
			                                            }
			                          else if(n3 == 0) {break;}
                                      }
			             
			             if(n==0) {System.out.println("게임종료");
			                       run=0;}
		                }
		scan.close();
	}
}
