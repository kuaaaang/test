package E6_�迭6_�˰���;

public class �迭6_�˰���_��������ã�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /*
		  input �� �迭���� ������  array�迭�� ����� ��ġ�ϰ�,
		  �׼����� ��ġ�ϸ�  true , �ƴϸ� false ��� 	
		  
		��) input1�� ������  6,1,8  �̰� array ��  
			index 5~7(6,1,8) �� ���� ������ ��ġ�Ѵ�.
		���)  true	
			  	
		��) input2�� ������ array �迭�� �ִ°���� ��ġ������, 
		   input2 ������ 6,3 �̰�, array �� ���� 3,6 ���� ������ �ٸ���.
		���) false
	  */
			int array[] = {1,3,3,6,5,6,1,8,9};	
			int input1[] = {6,1,8};
			int input2[] = {6,3};
			int win = 0;
			
			for(int i = 0; i<array.length-(input1.length-1); i+=1) {
				int count1 =0;
				for(int j = 0; j<input1.length; j+=1) {
					System.out.print("[" + input1[j] + " " + array[j + i]  + "]");
					if(input1[j] == array[i+j]) {
						count1 += 1;
					}
				}
				System.out.println();
				if(count1 == 3) {
					win = 1;
				}
			}
			if(win == 1) {
				System.out.println("�ִ�.");
			}
			else {System.out.println("����.");
			}	
			
			System.out.println("---------------------------------");
			
			for(int i = 0; i<array.length-(input2.length-1); i+=1) {
				int count2 =0;
				for(int j = 0; j<input2.length; j+=1) {
					System.out.print("[" + input2[j] + " " + array[j + i]  + "]");
					if(input2[j] == array[i+j]) {
						count2 += 1;
					}
				}
				System.out.println();
				if(count2 == 3) {
					win = 2;
				}
			}
			if(win == 2) {
				System.out.println("�ִ�.");
			}
			else {System.out.println("����.");
			}	
	}
}
