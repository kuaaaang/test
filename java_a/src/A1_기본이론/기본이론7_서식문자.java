package A1_�⺻�̷�;

/*
 * # ��¹��� ����
 * 1. System.out.println();
 * 1) ln = new line
 * 2) �ٹٲ� ����
 * -----------------------------------
 * 2. System.out.print();
 * 1) �ٹٲ� �Ұ�
 * ------------------------------------
 * ����° ��¹� (���Ĺ���)
 * [1] System.out.printf("", );
 * [2] ���Ĺ����� ����
 * . %d : ����
 * . %f : �Ҽ�
 * . %c : ���� 1��
 * . %s : ���� ������
 */
public class �⺻�̷�7_���Ĺ��� {
	public static void main(String[] args) {
		
		System.out.println("-------------------------------");
		System.out.printf("%d", 10);
		System.out.println();	
		System.out.println("-------------------------------");
		// ���Ĺ��ڴ� �Ҽ����� �⺻ 6�ڸ��̴�.
		System.out.printf("%f", 3.14);
		System.out.println();
		System.out.printf("%.2f", 3.14); // �Ҽ��� ������ �����Ҽ��ִ�. 
		System.out.printf("%.2f", 10.12);
		System.out.println();
		System.out.printf("%.20f", 3.14); // �Ҽ��� ������ �����Ҽ��ִ�. 
		System.out.println();
		System.out.println("-------------------------------");
		System.out.printf("%c", 'b');
		System.out.println();
		System.out.println("-------------------------------");
		System.out.printf("%s", "��¹�������");
		System.out.println();
		System.out.println("-------------------------------");
	}
}