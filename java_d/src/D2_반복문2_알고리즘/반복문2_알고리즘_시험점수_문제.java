package D2_�ݺ���2_�˰���;

public class �ݺ���2_�˰���_��������_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	       [����]
		        ö���� �ι��� ���迡�� ���� 80���� 72���� �޾Ҵ�.
		        �� ��° ���迡�� �ּ� �� ���̻��� �޾ƾ� 
		        
		        ������ ���輺���� ����� 82���̻��� �ɼ� ������?
		*/
		int i = 0;
		int count = 0;
		while(i>=0 && i<=100) {
			if((80+72+i)/3.0 >= 82) {
				count = count + 1;
		        if(count == 1) {
		        	System.out.println("�ּ� : " + i + "��");
		            i = 101;
		        }		
		    }
		i +=1;
		}
	}
}
