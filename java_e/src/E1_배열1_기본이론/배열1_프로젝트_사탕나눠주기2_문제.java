package E1_�迭1_�⺻�̷�;

public class �迭1_������Ʈ_���������ֱ�2_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /*
	  	[���������ֱ�2]
	  
	   	�Ʒ� �迭�� ������ ����ִ� ������ ���̴�. 
		������ ������ ���� �ٸ��� �ѻ���� �Ѻ����� 25���� �����ٷ��� �ϰ��ִ�. 
		���������� ������ �Űܼ� ���� ������� �����ټ��ִ�.
		�����ټ��ִ� ������� 
		����� �迭�� �����Ͻÿ�.
	  */
		int ����[] =  {97, 53, 36, 22};	// �������� ������ 
		int �����[] = {0, 0, 0, 0};		
		
		for(int i = 0; i<3; i+=1) {
			int count = ����[i]/25;
			�����[i] = count;
			����[i] = ����[i]%25;
			����[i + 1] += ����[i];	
		}
		int ������ = ����[3] % 25;
		�����[3] = ����[3] / 25;
		
		for(int i = 0; i<4; i+=1) {
			System.out.print(����[i] + "  ");
			}
		
		System.out.println();
		
		for(int i = 0; i<4; i+=1) {
			System.out.print(�����[i] + "  ");
			}
		
		System.out.println();
		
		System.out.print(������);
			
	}
}
