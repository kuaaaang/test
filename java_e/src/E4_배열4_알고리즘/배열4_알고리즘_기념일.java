package E4_배열4_알고리즘;

public class 배열4_알고리즘_기념일 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [기념일]
		     철수와 영희는 3월 3일에 만났다. 		
			 철수는 영희와 100일 기념일에 축하파티를 할려고한다.
			 만난지 100일뒤는  몇월몇일인가?
			 단 윤년은 계산하지않는다.
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
		System.out.println(total); // 3월 3일을 일수로 바꾼다.
		total += 100;
		System.out.println(total);
		
		int day2 = 0;
		for(int i = 0; i<monthList.length; i+=1) {
			day2 = total;
			total = total - monthList[i];
			if(total<=0) {
				System.out.println();
				System.out.print("100일 : ");
				System.out.print((i+1) + "월");
				System.out.print(day2 + "일");
				break;
			}
		}
	}
}
