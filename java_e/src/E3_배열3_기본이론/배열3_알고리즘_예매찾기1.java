package E3_�迭3_�⺻�̷�;

public class �迭3_�˰���_����ã��1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  1) seatList �� ��ȭ�� 7�ڸ��� ��Ÿ����. 
		  2) seatList �� ������ ��ȭ�� ������ ȸ����ȣ�� ��Ÿ����. 
		  3) find�� ������ �˻��ϰ����ϴ� ȸ����ȣ���̴�.
		  4) find �� ���� ��ȭ������ ã�� �ڸ��� ���������. ��, ���¹�ȣ�� "x" ���
		   - ��) [1] find : 1004 �� �����Ƿ� "x" ��� 
		   - ��) [2] find : 1003 �� 0 , 1
		   - ��) [3] find : 1001 �� 6 
		   - ��) [4] find : 1005 �� �����Ƿ� "x" ���  
	    */		
		    int find[] = {1004,1003,1001,1005};    
	    	int seatList[] = {1003,1003,0,0,1002,0,1001};		
			
			for(int i = 0; i<find.length; i+=1){
				System.out.println("[" + (i+1) + "] " + "find : " + find[i]);
				int count = 0; 
				
				for(int j = 0; j<seatList.length; j+=1) {
					if(find[i] == seatList[j]) {
						System.out.print(j + "�� �¼�");
						System.out.println();
						count =+1;
					}
				}
				if(count == 0) {System.out.println("X ������ �¼��� �����ϴ�.");}
			}
	}
}
