package F3_���ڿ�3_�˰���;

public class ���ڿ�3_������Ʈ_��ٱ��ϻ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String item = "ĭ��/�����/����/�ݶ�/���̴�";
		String id = "qwer/abcd/java";
		
		
		String cart = "";
		cart += "qwer/����\n";
		cart += "qwer/�����\n";
		cart += "abcd/�ݶ�\n";
		cart += "java/ĭ��\n";
		cart += "qwer/ĭ��\n";
		cart += "java/����\n";
		cart += "abcd/���̴�";
		
		 String input[][] = {
				 {"qwer" , "3"}, 
				 {"abcd" , "1"}};
		// cart�����ʹ� ���� ��ٱ��� ��Ȳ�̴�.
		// input�����ʹ� ������ ��û�ѵ������̴�.
		
		// qwer�� ���̵��̰�  3 �� ������ȣ�̴�.
		// qwer ���忡���� ���ξ������� 3���ۿ� ������ ĭ�ݸ� ��������� 3�� 
		// ���������� ���� ��ü �����Ϳ����� 5��° �������̴�. 
		
		// ���������� abcd �� �ݶ�� ���̴� �� �����߰� ,
		// �ݶ� ��������� 1���� �����Ѱ��̰� �����δ�3���������� �����Ǿ���Ѵ�.
		
		/*
		 [ ���� ]
		    cart += "qwer/����\n";
			cart += "qwer/�����\n";
			cart += "java/ĭ��\n";
			cart += "java/����\n";
			cart += "abcd/���̴�";
	    */ 
		 String cartList[] = cart.split("\n");
		 String List[][] = new String[cartList.length][2];
		 
		 for(int i = 0; i<cartList.length; i+=1) {
			 String c[] = cartList[i].split("/");
			 List[i][0] = c[0];
			 List[i][1] = c[1];
		 }
		 	 
		 for(int i = 0; i<input.length; i+=1) {
			 int count = 0;
			 for(int j = 0; j<List.length; j+=1) {
				 if(List[j][0].equals(input[i][0])) {
					 count += 1;				 
					 if(count == Integer.parseInt(input[i][1])) {
						 List[j][0] = "";
						 List[j][1] = "";			 
					 }
				 }
			 }
		 }
		 
		 for(int i = 0; i<List.length; i+=1) {
			if(List[i][0].equals("") == false) {
				System.out.println(List[i][0] + "/" + List[i][1]);
			}
		 } 
	}
}
