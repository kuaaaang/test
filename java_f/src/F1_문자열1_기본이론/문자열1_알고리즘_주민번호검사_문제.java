package F1_���ڿ�1_�⺻�̷�;

public class ���ڿ�1_�˰���_�ֹι�ȣ�˻�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jumin = "890101-2012932";
		
		// ���� 1) ���� ���
		// ���� 1) ����
		
		// ���� 2) ���� ���
		// ���� 2) 33��
		
		System.out.println(jumin.charAt(7));
		if(jumin.charAt(7) == '2') {
			System.out.println("����");
		}else {System.out.println("����");}
		
		String a = jumin.substring(0,2);
		System.out.println(a);
		int _1900 = Integer.parseInt(a) + 1900;
		System.out.println(_1900);
		
		System.out.println("���� : " + (2022-_1900 + 1) + "��" + "(�� " + (2022-_1900) + "��)");
	}
}
