package F3_���ڿ�3_�˰���;

import java.util.Arrays;

public class ���ڿ�3_������Ʈ_��ٱ��ϰ˻� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String itemData = "1001/����,1002/�����,1003/ĭ��";
		String userData = "3001/�̸���,3002/��ö��,3003/�̿���";
		
		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1001\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";
		
		//����1) ȸ���� ������ ���Ÿ�� ��� 
		//��) �̸���==> ����3,ĭ��1 / ��ö�� ==> ����1 / �̿��� ==> ����1,�����2
		
		String userList[] = userData.split(",");
		for(int i = 0; i<userList.length; i+=1) {
			String user[] = userList[i].split("/");
			System.out.print(user[1] + " ==> ");
			String itemList[] = itemData.split(",");
			String countList[][] = new String[itemList.length][2];
			for(int j = 0; j<itemList.length; j+=1) {
				String item[] = itemList[j].split("/");
				countList[j][0] = item[1]; // ���� �̸�
				countList[j][1] = "0"; // ���� ���� ����
			}
			
			String cartList[] = cartData.split("\n");
			for(int j = 0; j<cartList.length; j+=1) {
				String cart[] = cartList[j].split("/");
				if(cart[0].equals(user[0])) {
					for(int k = 0; k<itemList.length; k+=1) {
						String item[] = itemList[k].split("/");
						if(item[0].equals(cart[1])) {
							int count = Integer.parseInt(countList[k][1]);
							count += 1;
							countList[k][1] = count + "";
						}
					}
				}
			}
			
			for(int j = 0; j<countList.length; j+=1) {
				if(countList[j][1].equals("0") == false) {
					System.out.print(countList[j][0] + "" + countList[j][1] + " ");
				}
			}
			System.out.println();
		
		}
		
		System.out.println("---------------------------");
		
		//����2) �����ۺ��� ������ ȸ���̸� ��� 
		//��) ����==> �̸���,��ö��,�̿��� / �����==> �̿��� / ĭ��==> �̸���
		
		String snackList[] = itemData.split(",");
		for(int i = 0; i<snackList.length; i+=1) {
			String snack[] = snackList[i].split("/");
			System.out.print(snack[1] + " ==> ");
			String cusList[] = userData.split(",");
			String buyList[][] = new String[snackList.length][2];
			for(int j = 0; j<cusList.length; j+=1) {
				String customer[] = cusList[j].split("/");
				buyList[j][0] = customer[1];
				buyList[j][1] = "0";
			}
			
			String List[] = cartData.split("\n");
			for(int j = 0; j<List.length; j+=1) {
				String cart[] = List[j].split("/");
				if(cart[1].equals(snack[0])) {
					for(int k = 0; k<cusList.length; k+=1) {
						String customer[] = cusList[k].split("/");
						if(customer[0].equals(cart[0])) {
							int buy = Integer.parseInt(buyList[k][1]);
							buy += 1;
							buyList[k][1] = buy + "";
						}
					}
				}
			}
			
			for(int j = 0; j<buyList.length; j+=1) {
				if(buyList[j][1].equals("0") == false) {
					System.out.print(buyList[j][0] + "  ");
				}
			}
			System.out.println();
		}
	}
}
