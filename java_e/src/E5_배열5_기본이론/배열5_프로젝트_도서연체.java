package E5_�迭5_�⺻�̷�;

public class �迭5_������Ʈ_������ü {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  �Ʒ� �� �����������϶� ���� ��ü���� ���(��, ������ ��������ʴ´�)
		*/
			int rentalPeriod = 70;
			int [] rentalDay = {2020 , 12, 29};
			int [] today = {2021, 3, 10};
			
			int monthList[] = {31, 28, 31, 30, 31, 31, 30,
					31 , 30 , 31 , 30 , 31};
			
			int year = today[0] - rentalDay[0];
			
			int month_r = 0;
			for(int i = 0; i<rentalDay[1]-1; i+=1) {
				month_r += monthList[i];
			}
			int month_t = 0;
			for(int i = 0; i<today[1]-1; i+=1) {
				month_t += monthList[i];
			}
			
			System.out.println(month_r);
			System.out.println(month_t);
			
			System.out.println("-----------------------");
			
			System.out.println(month_r + rentalDay[2]);
			System.out.println(month_t + today[2]);
			
			System.out.println("-----------------------");
			
			System.out.println(365 - (month_r + rentalDay[2]));

			System.out.println("-----------------------");
			
			System.out.println((month_t + today[2])+(365 - (month_r + rentalDay[2])));
			
			System.out.println("-----------------------");
			
			if((month_t + today[2])+(365 - (month_r + rentalDay[2]))<=70){
				System.out.println("��ü X");
			}
			else {System.out.println("��ü O");}
	}
}
