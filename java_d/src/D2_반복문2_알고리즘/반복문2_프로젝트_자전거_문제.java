package D2_�ݺ���2_�˰���;

public class �ݺ���2_������Ʈ_������_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����]
			�б����� ������ ���� �ü� 15km�� �����Ÿ� Ÿ�� ���� 6km�� �ɾ�°ź��� 
			18��  ���� �����Ѵٰ� �Ѵ�.
			�б����� �������� �Ÿ��� ���Ͻÿ�.
		*/
		int t = 0;
		
		while(t>=0) {
			if(15*t == 6*(t+18)) {
				System.out.println("�б����� ������ �ü� 15km�� " + t + "��");
		        System.out.println("�б����� ������ �ü� 6km�� " + (t+18) + "��");
		        System.out.println("�б����� ������ �Ÿ� : " + (15*(t/60.0)) + "km");
		        t = -2;
		    }
		    t = t+1;
		}
	}
}