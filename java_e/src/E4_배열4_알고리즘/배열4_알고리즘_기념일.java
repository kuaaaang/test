package E4_�迭4_�˰���;

public class �迭4_�˰���_����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [�����]
		     ö���� ����� 3�� 3�Ͽ� ������. 		
			 ö���� ����� 100�� ����Ͽ� ������Ƽ�� �ҷ����Ѵ�.
			 ������ 100�ϵڴ�  ��������ΰ�?
			 �� ������ ��������ʴ´�.
		*/
		int monthList[] =
				{31, 28, 31, 30, 
				 31, 30, 31, 31, 
				 30, 31, 30, 31};
			
		int day = 3;
		int month = 3;
		
		int total = 0;
		for(int i = 0; i<month-1; i+=1) {
			total += monthList[i];
		}
		System.out.println(total);
		total += day;
		System.out.println(total); // 3�� 3���� �ϼ��� �ٲ۴�.
		total += 100;
		System.out.println(total);
		
		int day2 = 0;
		for(int i = 0; i<monthList.length; i+=1) {
			day2 = total;
			total = total - monthList[i];
			if(total<=0) {
				System.out.println();
				System.out.print("100�� : ");
				System.out.print((i+1) + "��");
				System.out.print(day2 + "��");
				break;
			}
		}
	}
}
