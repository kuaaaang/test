package E1_배열1_기본이론;

public class 배열1_알고리즘_채팅원리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [문제1] 
		  		array1 배열의 값들을 앞으로 한칸씩 당기고 맨뒤에 a의  값을 저장한다.
		  		[예] array1 = {20,30,40,50,90};
		  
		  [문제2] array2 의 배열을 뒤로 하나씩 밀어낸후 맨 앞에 b의 값을 저장한다.
		  		[예] array2 = {60,10,20,30,40};
		*/
		int array1[] = { 10,20,30,40,50 };
		int a = 90;
		
		int array2[] = { 10,20,30,40,50 };
		int b = 60;
		
		for(int i = 0; i<4; i+=1) {
			array1[i] = array1[i+1];
		}
		array1[4] = a;
		for(int i = 0; i<5; i+=1) {
			System.out.println(array1[i]);
		}
		
		System.out.println("------------------------------");
		
		int count = 4;
		for(int i = 0; i<4; i+=1) {
			array2[count] = array2[count-1];
			count -=1;
		}
		array2[0] = b;
		for(int i = 0; i<5; i+=1) {
			System.out.println(array2[i]);
		}
		
		
	}
}
