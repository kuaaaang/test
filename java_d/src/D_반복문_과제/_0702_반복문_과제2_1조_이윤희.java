package D_�ݺ���_����;

public class _0702_�ݺ���_����2_1��_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /*
		����� 50 ����� �ִ�. ö���� ���� ����ܿ� ���ִ�. 
		ö���� �ѹ��� �ΰ�ܾ� ��������. 
		ö���� �޹߷� ��� ����� ����Ͻÿ�.
		�Ʒ������� �����Ͻÿ�.
		[1] ö���� �ѹ��� �ΰ�ܾ� ��������.
		[2] ö���� ���ʹߺ��� ��������.
		[3] 5������Ҷ����� �ٸ� ���� ����Ͻÿ�.
		
		48 44 40 36 32 
		30 26 22 18 14
		12 8  4
	 */	
		int count = 0;
		int line = 0;
		int left = 0;
		
		for(int i = 50; i>2; i-=2) {
			if(line % 2 == 0) {
				if(left%2 == 0) {
					System.out.printf("%2d  " , i-2);
					count += 1;
					if(count%5 == 0) {
						line+=1;
						System.out.println();
					}
				}
			}
			if(line % 2 == 1) {
				if(left%2 == 1) {
					System.out.printf("%2d  " , i-2);
					count += 1;
					if(count%5 == 0) {
						line+=1;
						System.out.println();
					}
				}
			}
			left += 1;
		}
	}
}
