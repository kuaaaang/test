package D3_반복문3_기본이론;

public class 반복문3_기본이론6_for무한 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [1]초기식, [2]조건식, [3]증감식 중에서 [3]증감식을 적지않으면 무한반복이된다.
		*/
			int n = 0;
			for(int i = 0; i == 0;) {
				System.out.println(n);
				if(n >= 4) {
					i = 1;
				}
				n += 1;
			}
			
			int n1 = 0;
			for(int run = 1; run == 1;) {
				System.out.println(n1);
				if(n1 >= 4) {
					run = 0;
				}
				n1 += 1;
			}
			
			//for 무한반복 (break)를 사용해서 종료시킬수있다. 
			for(;;) {
				System.out.println("~~");
			}	
	}
}
