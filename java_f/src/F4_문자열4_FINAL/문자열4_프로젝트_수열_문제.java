package F4_���ڿ�4_FINAL;

public class ���ڿ�4_������Ʈ_����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
    	������ �а� ���ϱ� ������ ��Ģ�Դϴ�.
  
  		1, 11, 12, 1121, 122111, 112213
  
	 	ù��° ���� : 1
	 	�ι�° ���� : 1�� 1�� = 11
	 	����° ���� : 1�� 2�� = 12
	 	�׹�° ���� : 1�� 1��, 2�� 1�� = 1121
	 	�ټ���° ���� : 1�� 2��, 2�� 1��, 1�� 1�� = 122111
	 	�������� ���� : 1�� 1��, 2�� 2��, 1�� 3�� = 112213
	 	// 12221131
	 	// 1123123111
	 	// 12213111213113
	 	// 11221131132111311231
	 	
	 	�̷��� ������ 10��° ���ڸ� ���α׷��� ����� ã���ÿ�.
	    */
		String num = "1";
		
	    System.out.println(num);
	    
	    for (int i = 0; i < 10; i++) {
	         String temp = num; // ����(������ ������� ����)
	         
	         char c = num.charAt(0);
	         int count = 1;
	         num = c + ""; // ���� ���� ����� �غ�(ù �ڸ��� �����)
	   
	         for (int j = 1; j < temp.length(); j++) {
	            if (c == temp.charAt(j)) {
	               count += 1;
	            } else { // ���� ���� �����
	               c = temp.charAt(j);
	               num += count;
	               num += temp.charAt(j);
	               count = 1;
	            }
	         }
	         num += count;
	         System.out.println(num);
	      }
	}
}
