package D_�ݺ���_����;

public class ��ü���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	 	�Ʒ��� ���� ����Ͻÿ�.	 	
	 	0	1
	 	1	2
	 	2	3
	 	3	4
	 	4	5	
	 	5	5		
	 	6	4
	 	7	3	
	 	8	2
	 	9	1
	 	0	1
	 	1	2	
	 	2	3
	 	3	4
	 	4	5
	 	5	5
	 	6	4
	 	7	3
	 	8	2
	 	9	1
	   */
		int count = 0;
		for(int i = 0; i<20; i+=1) {
			if((i/5)%2 == 0) {
				count = 0;
				for(int j = i; j<i+1; j+=1) {
					System.out.println((i%10) + "   " + ((j+1)%10));
				}
			}
			if((i/5)%2 == 1){
				for(int j = i; j<i+1; j+=1) {
					System.out.println((i%10) + "   " + (j-2*count)%10);
					count += 1;
				}
			}
		}
		
		
	}
}
