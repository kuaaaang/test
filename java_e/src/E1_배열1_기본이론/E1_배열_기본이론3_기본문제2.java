package E1_배열1_기본이론;

public class E1_배열_기본이론3_기본문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  	array = {10,20,30,40,50};
		 
			[문제1] 4의 배수만 출력한다.
			[예] 20 40
			
			[문제2] 4의 배수의 합을 출력한다.
			[예] 60
			
			[문제3] 4의 배수의 개수를 출력한다.
			[예] 2
		*/
		
		int[] array = {10,20,30,40,50};
		
		for(int i = 0; i<5; i+=1) {if(array[i]%4==0) {System.out.println(array[i]);}}
		
		System.out.println("-----------------------------------");
		
		int total = 0;
		for(int i = 0; i<5; i+=1) {if(array[i]%4==0) {total += array[i];}}
		System.out.println(total);
		
		System.out.println("-----------------------------------");
		
		int count = 0;
		for(int i = 0; i<5; i+=1) {if(array[i]%4==0) {count += 1;}}
		System.out.println(count);
		
	}
}
