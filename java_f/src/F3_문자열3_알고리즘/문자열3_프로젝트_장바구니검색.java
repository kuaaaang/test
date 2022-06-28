package F3_¹®ÀÚ¿­3_¾Ë°í¸®Áò;

import java.util.Arrays;

public class ¹®ÀÚ¿­3_ÇÁ·ÎÁ§Æ®_Àå¹Ù±¸´Ï°Ë»ö {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String itemData = "1001/°í·¡¹ä,1002/»õ¿ì±ø,1003/Ä­ÃÝ";
		String userData = "3001/ÀÌ¸¸¼ö,3002/±èÃ¶¹Î,3003/ÀÌ¿µÈñ";
		
		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1001\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";
		
		//¹®Á¦1) È¸¿øº° ¾ÆÀÌÅÛ ±¸¸Å¸ñ·Ï Ãâ·Â 
		//¿¹) ÀÌ¸¸¼ö==> °í·¡¹ä3,Ä­ÃÝ1 / ±èÃ¶¹Î ==> °í·¡¹ä1 / ÀÌ¿µÈñ ==> °í·¡¹ä1,»õ¿ì±ø2
		
		String userList[] = userData.split(",");
		for(int i = 0; i<userList.length; i+=1) {
			String user[] = userList[i].split("/");
			System.out.print(user[1] + " ==> ");
			String itemList[] = itemData.split(",");
			String countList[][] = new String[itemList.length][2];
			for(int j = 0; j<itemList.length; j+=1) {
				String item[] = itemList[j].split("/");
				countList[j][0] = item[1]; // °úÀÚ ÀÌ¸§
				countList[j][1] = "0"; // °úÀÚ ±¸¸Å ¼ýÀÚ
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
		
		//¹®Á¦2) ¾ÆÀÌÅÛº°·Î ±¸ÀÔÇÑ È¸¿øÀÌ¸§ Ãâ·Â 
		//¿¹) °í·¡¹ä==> ÀÌ¸¸¼ö,±èÃ¶¹Î,ÀÌ¿µÈñ / »õ¿ì±ø==> ÀÌ¿µÈñ / Ä­ÃÝ==> ÀÌ¸¸¼ö
		
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
