package D2_�ݺ���2_�˰���;

public class �ݺ���2_�˰���_������_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����]
			ö���� ������ x �� y �������� �����Ÿ� Ÿ�� �պ��Ͽ���. 
			������ �ü�15km , �ö��� �ü�12km �� �̵��Ͽ� ��  45���� �ɷ����� , 
			�������� x , y �Ÿ��� ���Ͻÿ�.
		*/
		int x = 45;
		int y = 0;
		while(x<=45 && x>=0) {
			if(x*15 == y*12) {
				System.out.println("�ü� 15km�� " + x + "�� , " + "�ü� 12km�� " + y + "��");
			}			
		    x = x-1;
		    y = y+1;
		}
		System.out.println("x,y �Ÿ� : " + 20/60.0*15 + "km");
	}
}
