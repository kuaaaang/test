package D_�ݺ���_����;

public class _0701_�ݺ���_����1_1��_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  ö���� 30��¥�� ����� �ֻ�ܿ� ���ִ�. 
		  ���ϾƷ����� ���������� �Ѵ�. 
		  ö���� �������� ���ʹ߷� ���� ����� ����Ͻÿ�. 
		  �Ʒ����ǵ��� �����Ͻÿ�.
		  [����]
		  [1] ö���� ������ �Ѱ�ܾ� ��������. 
		  [2] ö���� ù���� ���ʴٸ����� ����� ��������. 
		  [3] ����� �ټ����Ҷ� ���� �ݴ���ٸ��� �ٲ㼭 ����Ͻÿ�.
		  
		  [����]
		   29 27 25 23 21 
		   20 18 16 14 12 
		   11 9  7  5  3
		   2			 
		*/
		int count = 0;
		
		for(int i = 30; i>0; i-=1) {
			if((count/5)%2 == 0) {
				if(i%2 == 1) {
					System.out.printf("%2d  " , i);
					count += 1;
					if(count%5 == 0) {System.out.println();}
				}else {continue;}
			}
			else if((count/5)%2 == 1) {
				if(i%2 == 0) {
					System.out.printf("%2d  " , i);
					count += 1;
					if(count%5 == 0) {System.out.println();}
				}else {continue;}
			}
		}
	}
}
