package D5_�ݺ���5_�˰���;

public class �ݺ���5_������Ʈ_�л���_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*  
		  [����]
			   a���б� 1�г� �����ϴ� �л����� 8�� 12�� 18�ٷ� ������ �׻� 5���� ������,
			   1�г� ��ü �л����� ���Ͽ���.
			   (�л����� 200���̻� 250��̸�)
		*/
		int i = 200;
		while(i<250) {
			if(i%8 == 5 && i%12 == 5 && i%18 == 5) {
				System.out.println("�л��� : " + i + "��");
			}
		    i += 1;
		 }
	}
}
