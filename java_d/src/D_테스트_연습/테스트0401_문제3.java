package D_�׽�Ʈ_����;

public class �׽�Ʈ0401_����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[����] 
			[1] 48�� ����� �����ڸ��� 2~6������ ���� ����Ͻÿ�.
			[2] �� ������ ����� ������ ����Ͻÿ�.
		[����]
			2 3 4 6 12 16 24 
			�Ǽ��� ���� : 7��
		*/
		
		int i = 0;
		int count = 0;
		while(i<=48) {
			i += 1;
			if(48 % i == 0 && i%10>=2 && i%10<=6) {
				System.out.println(i);
				count += 1;
			}
		}
		System.out.println();
		System.out.println(count + "��");
		
	}
}
