package D2_�ݺ���2_�˰���;

public class �ݺ���2_������Ʈ_�����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 [����]
		 �Ʒ��Ͱ��� �޴������� �ִ� 
		 B�� �����Ұ�� A���� �� �������̵ɷ���,
		 ��ȭ�ð��� �󸶱��� ����ؾߵɱ��? 
		 ������ �ʷ� ���Ͻÿ�.
		 A����� �⺻��� 17500�� �ʴ� 5�� 
		 B����� �⺻��� 31000�� �ʴ� 2��  
		*/
		int ���� = 31000-17500;
		int t = 0;
		
//		while(t>=0) {if(t*3>����) {System.out.println(t + "��");
//		                             t = -2;}
//		             t = t + 1;
//		             }
		
		
		while(t>=0) {
			t = t + 1;
			if(t*3>����) {
				System.out.println(t + "��");
			    t = -1;
			}
        }
		
		System.out.println(���� + "��");
		System.out.println(4501*3);
		
		System.out.println("------------------------");
		
		for(int i = 0; i>=0; i+=1) {
			if(i*3>����) {
				System.out.println(i + "��");
				System.out.println(i*3 + "��");
				break;
			}
		}
		
	}
}

