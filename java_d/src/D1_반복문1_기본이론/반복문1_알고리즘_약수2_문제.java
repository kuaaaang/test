package D1_�ݺ���1_�⺻�̷�;

public class �ݺ���1_�˰���_���2_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 [����]
		   18�� ����� ���� ���ϱ� 21�� ����� ������ ����Ͻÿ�.
		*/
		int i1 = 1;
		int i2 = 1;
		int count1 = 0;
		int count2 = 0;
		
		while(i1<=18){if(18%i1 == 0) {System.out.println(i1);
                                      count1 = count1 + 1;}
                      i1 = i1 + 1;
                      }

		System.out.println("----------------------------------------");	
		
	    while(i2<=21){if(21%i2 == 0) {System.out.println(i2);
	    	                          count2 = count2 + 1;}
	                  i2 = i2 + 1;
                      }
	    System.out.println("----------------------------------------");	
	    System.out.println("18�� ��� : " + count1 + " ��");
	    System.out.println("21�� ��� : " + count2 + " ��");
	    System.out.println(count1 + count2);
	}
}