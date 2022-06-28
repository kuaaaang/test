package E2_배열2_기본이론;

import java.util.Random;

public class 배열2_알고리즘_셔플 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//셔플 	
		// 1) 인덱스 2개를 랜덤(0~5)으로 저장하고 각 인덱스의 값을 교환
		// 2) 위 1번을 10 번 반복하며 과정  출력 
				
		//예) 1 , 2 ==> {10,30,20,40,50,60};  // 20 과 30이 교환됨.
				
		//예) 4 , 1 ==> {10,50,20,40,30,60};  // 50 과 30이 교환됨.
				
		//예) 3 , 3 ==> {10,50,20,40,30,60}; // 같을땐 아무일도안생긴다.
		
		int arr[] = {10,20,30,40,50,60};
		
		Random ran = new Random();
		
		int count = 0;
		while(count<10) {
			int n1 = ran.nextInt(6);
			int n2 = ran.nextInt(6);
			System.out.println();
			System.out.println(n1 + " , " + n2);
			
			int temp = arr[n1];
			arr[n1] = arr[n2];
			arr[n2] = temp;
			
			for(int i = 0; i<6; i+=1) {
				System.out.print(arr[i] + "  ");
			}
			
			count +=1;
		}
		
		
		
	}

}
