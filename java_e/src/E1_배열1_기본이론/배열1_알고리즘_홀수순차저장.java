package E1_배열1_기본이론;

public class 배열1_알고리즘_홀수순차저장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [문제1] 다음 리스트를 이용해서 arr1 의 값중 홀수만 b 에 저장(위치는 동일한위치에 저장)
		  [예]   b = { 0, 49, 51, 0, 17 }
		  
		  [문제2] 다음 리스트를 이용해서 a 의 값중 홀수만 c 에 저장
		  [조건] 위치는 앞에서 부터 저장한다. 
		  [예]   c = { 49, 51, 17, 0, 0 }
		*/
		int arr1[] = { 10, 49, 51, 36, 17 };	
		int b[] = { 0,0,0,0,0 };	
		int c[] = { 0,0,0,0,0 };
		
		for(int i = 0; i<5; i+=1) {
			if(arr1[i]%2==1) {
				b[i]=arr1[i];
			}
		}
		for(int i = 0; i<5; i+=1) {
			System.out.println(b[i]);
		}
		
		System.out.println("-----------------------------------");
		
		int count = 0;
		for(int i = 0; i<5; i+=1) {
			if(arr1[i]%2==1) {
				c[count]=arr1[i];
				count +=1;
			}
		}
		for(int i = 0; i<5; i+=1) {
			System.out.println(c[i]);
		}	
	}
}
