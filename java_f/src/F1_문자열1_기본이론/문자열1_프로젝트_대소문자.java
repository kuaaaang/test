package F1_���ڿ�1_�⺻�̷�;

import java.util.Scanner;

public class ���ڿ�1_������Ʈ_��ҹ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		���̵�� ��й�ȣ �Է¹ް� �α������ 		
		����) ��, ���̵�� ��й�ȣ�� 
		1) �빮�ڷ� �Է��ϴ� , 
		2) �ҹ��ڷ� �Է��ϴ� , 
		3) ��� �Է��ϴ� ���� �νĵǾ���Ѵ�.		
		*/
		Scanner scan = new Scanner(System.in);
		
		String dbid = "q1w2e3r4";
		String dbpw = "r4e3w2q1";
		
//		String str0 = "0123456789";
//		String str1 = "abcdefghijklmnopqrstuvwxyz";
//		String str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		boolean check = false;
	
		int t = 0;
		while(t==0) {
			System.out.println("���̵� �Է��ϼ���.");
			String id = scan.next();
			System.out.println("��й�ȣ�� �Է��ϼ���.");
			String pw = scan.next();
			
			if(id.length() == dbid.length()) {
				int countid = 0;
				int countpw = 0;
				
				for(int i = 0; i<dbid.length(); i+=1) {
					int a = (int)dbid.charAt(i);
					int b = (int)id.charAt(i);
					//48-57
					if(dbid.charAt(i) == id.charAt(i)) {
						countid += 1;
					}else {
						if((a-32 == b) || (a+32 == b) && (a<48 && a>57) ) {
							countid += 1;
						}
						else {
							System.out.println("���̵� ����ġ");
							break;
						}
					}
					if(countid == dbid.length()) {
						//��й�ȣ Ȯ��;
						for(int j = 0; j<dbpw.length(); j+=1) {
							int c = (int)dbpw.charAt(j);
							int d = (int)pw.charAt(j);
							
							if(dbpw.charAt(j) == pw.charAt(j)) {
								countpw += 1;
							}else {
								if((c-32 == d) || (c+32 == d) && (c<48 && c>57)) {
									countpw += 1;
								}
								else {
									System.out.println("��й�ȣ ����ġ");
									break;
								}
							}
							if(countpw == dbpw.length()) {
								System.out.println("�α��� ����!");
								t = 1;
							}
						}
					}
				}
			}
			else{
				System.out.println("���̵� ����ġ");
			}
		}	
		scan.close();
	}
}
