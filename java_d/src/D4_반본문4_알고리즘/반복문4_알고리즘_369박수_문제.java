package D4_�ݺ���4_�˰���;

public class �ݺ���4_�˰���_369�ڼ�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		   [369����]
		  1. 1~50���� �ݺ��� �Ѵ�.
		  2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
		  
		  3. ������ ���ڿ� 3�̳� 6�̳� 9�� �ΰ� �� "¦¦"
		  4. ������ ���ڿ� 3�̳� 6�̳� 9�� �Ѱ� �� "¦"
		  5. 3�̳� 6�̳� 9�� ������ �׳� ������� 
		  
		  ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
		*/
		
		int n = 1;
			
		while(n<=50) {int f = n%10;
		              int s = n/10;
			
		              int count = 0;
			          if(s==3 || s==6 || s==9) {count = count + 1;}
		              if(f==3 || f==6 || f==9) {count = count + 1;}
			
		              if(count == 1) {System.out.println("¦");}
			          else if(count == 2) {System.out.println("¦¦");}
                      else {System.out.println(n);}
			          
			          n = n + 1;
	             	 }
		
	}
}
