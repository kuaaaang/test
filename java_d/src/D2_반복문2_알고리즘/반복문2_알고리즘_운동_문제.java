package D2_�ݺ���2_�˰���;

public class �ݺ���2_�˰���_�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����]
		  ö���� ���� 6�ÿ� 30�п� ������ 3km ������ ������ ���µ�,
		  ó������ �ü� 3km�� �ȴٰ� ���߿� �ü� 6km�� �޷�����.
		  ö���� ������ 7�� 10�������ߴ�.
		  �ɾ �Ÿ��� �޷��� �Ÿ��� ���Ͻÿ�.
		*/
		int x = 40;
		int y = 0;
		while(y>=0 && y<=40) {
			if(x*3 + y*6 == 3*60) {
				System.out.println("3km�� �޷��� �Ÿ� : " + x*3/60.0 + "km ,  6km�� �޷��� �Ÿ� : " + y*6/60.0 + "km");
			}
		    x = x - 1;
		    y = y + 1;	
	   }
	}
}
