package D1_�ݺ���1_�⺻�̷�;

public class �ݺ���1_�˰���_���3_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	/*
	 [����] 
		50���� 100���� �ڿ����߿��� 9�� ����� ������ ����Ͻÿ�.
		[��] (54,63,72,81,90,99)  6 �� 
	*/
	int i = 0;
	int count = 0;
	while(i <= 100) {if(i>=50) {System.out.println(i);
	                            count = count +1;}
		             i = i +9;}
    System.out.println("--------------------------------");
	System.out.println(count + "��");
	}
}
//        int count = 0;		
//        int run = 1;
//        int num = 9;
//
//        int start = 50;
//        int max = 100;
//        int i = start;
//        while(run == 1) {if(i % num == 0) {System.out.println(i);
//		                                     count = count + 1;
//	                                         }
//	                       i += 1;
//                         if(i == max) {run = 0;}		
//                         }	
//        System.out.print(count + " (");
//        i = start;
//        run = 1;
//        count = 0;
//        while(run == 1) {if(i % num == 0) {System.out.print(i);
//		                                     count += 1;
//		                                     if(count < 6) {System.out.print(",");}	
//                                           }
//	                       i += 1;
//	                       if(i == max) {run = 0;}		
//                        }	
//        System.out.println(")");