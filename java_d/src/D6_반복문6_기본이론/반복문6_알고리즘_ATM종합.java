package D6_�ݺ���6_�⺻�̷�;

import java.util.Scanner;

public class �ݺ���6_�˰���_ATM���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [ATM]
		   [�ڷΰ���] �� Ȱ���� �ܰ躰�� ����� �����Ѵ�. 
		   [ȸ������] �� ���� �迭���� �����ϴ�.
		 
		  ����ȭ����         ==> [1.�α��� 0.���� ]
		  1�� �α��� ���ý�     ==> [1.�Ա� 2.��� 3.��ü 4.��ȸ 5.�������� 0.�α׾ƿ�]  
		  2�� ���� ���ý�       ==> [����] 
		  -------------------------------------------------
		  [�߰�����] 
		  [1] 5.�������� ���ý� ==> ��й�ȣ�� �ٲܼ��ִ�.
		  [2] 0.�α׾ƿ� ���ý� ==> �ڷ� ���ư��� [1.�α��� 0.����] ȭ���� �ٽó��´�.         
		  [3] �α��� 3�����н� ���� �����Ѵ�. 
		*/
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int log = -1; // -1(�α׾ƿ�), 1111(dbAcc1�α���), 2222(dbAcc2�α���)
		int r = 1;
		
		while(r == 1) {System.out.println("[1.�α��� 0.���� ]");
		               int n1 = scan.nextInt();
		               if(n1==1) {if(log == -1) {int count = 0;
		            	                        while(true) {System.out.println("���̵� �Է��ϼ���.");
                                                             int id = scan.nextInt();
                                                             System.out.println("��й�ȣ�� �Է��ϼ���.");
                                                             int pw = scan.nextInt();
                                                             if(id==dbAcc1 && pw==dbPw1) {log=id;
                                                        	                              System.out.println("�α��� ����!");
                                                        	                              break;
                                                                                          }
                                                             else if(id==dbAcc2 && pw==dbPw2) {log=id;
                                                                                               System.out.println("�α��� ����!");
                                                                                               break;
                                                                                               }
                                                             else {count = count + 1;
                                                                   System.out.println("�α��� ����");
                                                                   System.out.println(count + "�� ����, 3�� ���н� ����˴ϴ�.");}
                                                             if(count == 3) {System.out.println("3�� ����! �����մϴ�!");
                                                                             r = 0;
                                                                             break;
                                                                             }
                                                             }
                                                }
		                         if(log != -1) {while(true) {System.out.println("[1.�Ա� 2.��� 3.��ü 4.��ȸ 5.�������� 0.�α׾ƿ�]");
		                                                     int n2 = scan.nextInt();
		                                                     if(n2 == 1) {System.out.println("�Ա�");
		                                                                  System.out.println("�Ա��� �ݾ��� �Է����ּ���.");
		                                                                  int pmoney = scan.nextInt();
		                                                                  if(log==dbAcc1) {dbMoney1 += pmoney;}
		                                                                  else if(log==dbAcc2) {dbMoney2 += pmoney;}
		                                                                  System.out.println("�ԱݿϷ�");
		                                                                  }
		                                                     else if(n2 == 2) {System.out.println("���");
		                                                                       System.out.println("����� �ݾ��� �Է����ּ���.");
		                                                                       int mmoney = scan.nextInt();
		                                                                       if(log==dbAcc1) {if(dbMoney1 < mmoney || mmoney<0) {System.out.println("��� ������ �ݾ��� �ƴմϴ�.");}
		                                                                                        else if(dbMoney1 >= mmoney && mmoney>=0){dbMoney1 -= mmoney;
		                                                                                        	                                     System.out.println("��ݿϷ�");}
		                                                                                                                                 }
                                                                               else if(log==dbAcc2) {dbMoney2 -= mmoney;
                                                                                                     if(dbMoney2 < mmoney || mmoney<0) {System.out.println("��� ������ �ݾ��� �ƴմϴ�.");}
                                                                                                     else if(dbMoney2 >= mmoney && mmoney>=0){dbMoney2 -= mmoney;
                                                            	                                                                              System.out.println("��ݿϷ�");}
                                                                                                                                              }
		                                                                       }
		                                                     else if(n2 == 3) {System.out.println("��ü");
		                                                                       System.out.println("��ü�� ���¹�ȣ�� �Է����ּ���.");
		                                                                       int ���� = scan.nextInt();
		                                           							   System.out.println("��ü�� �ݾ��Է� : ");
		                                           							   int money = scan.nextInt();
		                                           							   if(���� == dbAcc1 && log == dbAcc2 ) {dbMoney2 -= money;
		                                        							                                        dbMoney1 += money;}
		                                           							   else if(���� == dbAcc2 && log == dbAcc1) {dbMoney1 -= money;
		                                        								                                        dbMoney2 += money;}
		                                        							System.out.println("��ü�Ϸ�.");
		                                        			
		                                                     
		                                                                       }
		                                                     else if(n2 == 4) {System.out.println("��ȸ");
		                                                                       if(log==dbAcc1) {System.out.println("�ܾ� : " + dbMoney1);}
                                                                               else if(log==dbAcc2) {System.out.println("�ܾ� : " + dbMoney2);}
		                                                                       }
		                                                     else if(n2 == 5) {System.out.println("��������");
		                                                                       System.out.println("������ ��й�ȣ�� �Է����ּ���.");
		                                                                       int newpw = scan.nextInt();
		                                                                       if(log==dbAcc1) {dbPw1 = newpw;}
                                                                               else if(log==dbAcc2) {dbPw2 = newpw;}
		                                                                       }
		                                                     else if(n2 == 0) {System.out.println("�α׾ƿ��Ǿ����ϴ�.");
		                                                                       log = -1;
		                                                                       break;
		                                                                       }
		                                                     else {System.out.println("����! ��ȣ�� �ٽ� �����ϼ���.");}
		                                                     }
		                    	                }
		                       }
		             else if(n1==0) {System.out.println("����!");
		            	             r = 0;
		                             }
		             else {System.out.println("����! �ٽ� �����ϼ���.");}   
		             }
		scan.close();
	}
}
