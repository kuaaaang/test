package B3_��������_�⺻�̷�;

public class ��������_�⺻�̷�2_����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����1) �Ʒ� ���� ���� true �� �������� ���� �����غ�����.
				int a = 1;
				int b = 2;
				int c = 3;
				int d = 4;
				
				a = 2;
				b = 1;
				c = 1;
				d = 1;

				System.out.println(a * d == c + b && a > b);
				
				// ����2) �Ʒ� ���� ���� true �� �������� ���� �����غ�����.
				a = 1;
				b = 2;
				c = 3;
				d = 4;
				
				a = 2;
				b = 1;
				c = 6;
				d = 1;
				
				System.out.println(a / d + 3 == c - b && a > b);
				
				// ����3) �Ʒ� ���� ���� true �� �������� ���� �����غ�����.
				a = 1;
				b = 2;
				c = 3;
				d = 4;
				
				a = 2;
				b = 1;
				c = 1;
				d = 2;
				
				System.out.println(a % d == c % b && a > b);
				
				// ����4) �Ʒ� ���� ���� true �� �������� ���� �����غ�����.
				a = 1;
				b = 2;
				c = 3;
				d = 4;
				
				a = 3;
				b = 2;
				c = 3;
				d = 2;
				
				System.out.println((a - d) * 3 == c / 3 + b && a > b);
	}
}
