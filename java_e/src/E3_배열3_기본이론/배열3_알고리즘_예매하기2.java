package E3_�迭3_�⺻�̷�;

import java.util.Arrays;

public class �迭3_�˰���_�����ϱ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  1) seatList �� ���� ��ȭ�� ���Ż�Ȳ �̴�.
		  2) seatIndex �� ���� �ҷ��� �¼� ��ȣ�̰�
		  3) userList �� ȸ����ȣ�̴� 
		  
		  4) seatIndex �� user �� ������ ������ ��ü ���Ż�Ȳ ��� 
		  5) �¼��� ��������� �����Ҽ��ִ�.
		  6) �¼��� �̹� ���� �Ǿ������� 2���������� �Ѱ������� 
		  7) [���� 1] �̹� ���ŵǾ�������, ȸ����ȣ�� ������ ������� 0���� ����
		  8) [���� 2] �̹� ���ŵǾ��ְ� , ȸ����ȣ�� �ٸ��� "x" ��� 
		 
		  -��) 1 , 1003 ==> ���� �Ǿ�������, 1003���� ���������Ƿ� ���� ��ҵȴ� 
		       ==> seatList[] = {1003,0,0,0,1002,0,1001};
		  		
		  -��) 1 , 1002 ==> ������ ������������Ƿ� ���� ����
		       ==> seatList[] = {1003,1002,0,0,1002,0,1001};
		       
		  -��) 4 , 1005 ==> ���� �Ǿ��ְ�, ȸ����ȣ�� �ٸ��� ==> "x"
		*/
			int seatList[] = {1003,1003,0,0,1002,0,1001};		
			int seatIndex[] = {1,1,4};
			int userList [] = {1003,1002,1005};
			
			for(int i = 0; i<seatIndex.length; i+=1) {
				System.out.println(userList[i] + "��  ���� ��Ȳ : ");
				
				if(seatList[seatIndex[i]] == 0) {
					seatList[seatIndex[i]] = userList[i];
					System.out.print(Arrays.toString(seatList));
					System.out.println();
				}
				else {
					if(seatList[seatIndex[i]] == userList[i]) {
						seatList[seatIndex[i]] = 0;
						System.out.println(userList[i] + "��  ���Ű� ��ҵǾ����ϴ�.");
						System.out.print(Arrays.toString(seatList));
						System.out.println();
					}
					else{System.out.println("X");}
				}
			}
	}
}
