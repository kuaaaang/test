package D_�ݺ���_����;

import java.util.Random;
import java.util.Scanner;

public class ������_��í {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [1] ó�� ���� �� �⺻ 1000P ���� ����
		 [2] �ݾ� ���� or ��í or �������� ����
		 [3] �ݾ��� �⺻ 1000P����  ���� ����
		 [4] ��í ������ ��� : [1 ~ 10] => ���ڰ� ���� ���� ���(���� Ȯ�� ����)
		 [5] ���� : 1000P -> 5ȸ ���� �̱�, 2000P -> 10ȸ ���� �̱� 
		 [6] 10ȸ�� ���� ��� ������ 7��� �̻��� �������� 3�� ���´�. (5ȸ�� 5��� �̻� 1��)
		*/
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int point = 1000;
		System.out.println("====���� �̱� ����====");
		System.out.println("�α��� ���� 1000P");
		System.out.println("���� �ܾ� : " + point + "P");
		
		while(true) {
			System.out.println("[1.�ݾ� ����] [2.�̱�] [3.��������]");
			int n = scan.nextInt();
			
			if(n == 1) {
				System.out.println("������ �ݾ��� �Է����ּ���.(�ּ� ���� : 1000��)");
				int money = scan.nextInt();
				if(money>=1000) {
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					point += money;
					System.out.println("���� �ܾ� : " + point + "P");
				}
				else if(money<1000){System.out.println("�����ݾ��� �ʹ� �����ϴ�.");}
				
			}
			else if(n == 2) {
				System.out.println("[1. 1ȸ �̱�(200P)] [2. 5ȸ �̱�(1000P)] [3. 10ȸ �̱�(2000P)]");
				System.out.println("���� �ܾ� : " + point + "P");
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
						System.out.println("�ܾ��� �����մϴ�.");
						System.out.println("���� �� �ٽ� �̿��ϼ���.");
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
						System.out.println("�ܾ��� �����մϴ�.");
						System.out.println("���� �� �ٽ� �̿��ϼ���.");
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
						System.out.println("�ܾ��� �����մϴ�.");
						System.out.println("���� �� �ٽ� �̿��ϼ���.");
					}
				}
				
			}
			else if(n == 3) {
				System.out.println("���� ����!");
				break;
			}
			else {
				System.out.println("�ٽ� �����ϼ���.");
			}
			System.out.println();
		}
		scan.close();
	}
}
