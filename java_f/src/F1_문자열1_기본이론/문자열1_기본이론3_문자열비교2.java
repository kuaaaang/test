package F1_���ڿ�1_�⺻�̷�;

public class ���ڿ�1_�⺻�̷�3_���ڿ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� => ��ġȭ  : �ƽ�Ű�ڵ�ǥ
		System.out.println((int)'a');
		System.out.println((int)'b');
		
		System.out.println("------------------");
		
		/*
		 ���ڵ��� �⺻������ ���ڸ� �������ִ�.
		 compareTo ��  ���� �� ���Ѵ�. 	
		 ���࿡ "a" ��  ���� 10�̶�� "b" �� 11�̴�.
		 a���� b�� ���ٸ� ==> ������ ���ð��̴�.
		 
		 * ����A - ����B *
		 1) ���� ==> ����A�� �������� �տ� ��ġ�Ѵ�.
		 2) ��� ==> ����B�� �������� �տ� ��ġ�Ѵ�.
		 3) 0  ==> ����A�� ����B�� ����.	
		*/

		String str1 = "��";
		String str2 = "��";
		String str3 = "��";
		
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);			// ����
		
		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);			// ���
		
		int rs3 = str1.compareTo(str1);
		System.out.println(rs3);			// 0
	}
}
