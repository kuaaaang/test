package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ִ�����2_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[����] 
			���� 42�ڷ�� ���찳 28���� �ִ��� ���� �л����� �������
	  	  	�Ȱ��� ������ �ַ����մϴ�. ������ ������ �ټ��ִ��� ����Ͻÿ�.
	   */
		int i = 1;
		int a = 0;
		
		while(i<=42) {if(42%i == 0 && 28%i == 0) {a = i;
		                                          System.out.println("����� : " + a);}
			          i +=1;
                      }
		System.out.println("�ִ� : " + a + "��");
	}
}
