package F2_���ڿ�2_�˰���;

public class ���ڿ�2_�˰���_����ȯ3_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����) �̸��� ������ �Ʒ��Ͱ��� �ϳ��� ���ڿ��� ����
		// ����) "��ö��/87,�̸���/42,�̿���/95"
				
		String[] name = { "��ö��", "�̸���", "�̿���" };
		int[] score = { 87, 42, 95 };
				
		String str = "";
		
		for(int i = 0; i<name.length; i+=1) {
			if(i<2) {str += name[i] + "/" + score[i] + ",";}
			else if(i==2) {str += name[i] + "/" + score[i];}
			
		}
		str = str.substring(0,str.length()-1);
		System.out.println(str);
	}
}
