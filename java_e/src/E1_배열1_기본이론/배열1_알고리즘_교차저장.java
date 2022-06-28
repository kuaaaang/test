package E1_배열1_기본이론;

public class 배열1_알고리즘_교차저장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [문제1] a의 값과 b의 값을 번갈아가면서 c에 저장한다.
		  [예] 
		  	c = {10,40,20,50,30,60}
		   
		  [문제2] d의 값을 번갈아가면서 e, f 에 각각 저장 
		  [예]
		  	e = {10,30,50}
		  	f = {20,40,60};
		  
		*/
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int c[] = {0,0,0,0,0,0};
			
		int d[] = {10,20,30,40,50,60};
		int e[] = {0,0,0};
		int f[] = {0,0,0};
		
		int count = 0;
		for(int i = 0; i<3; i+=1) {
			c[count] = a[i];
			count +=1;
			c[count] = b[i];
			count +=1;
		}
		for(int i = 0; i<6; i+=1) {
			System.out.println(c[i]);
		}
		
		System.out.println("----------------------------------");
		
		int count2 = 0;
		for(int i = 0; i<3; i+=1) { // count가 6까지, i는 3까지
			e[i] = d[count2];
			count2 +=1;
			f[i] = d[count2];
			count2 +=1;
		}
		for(int i = 0; i<3; i+=1) {
			System.out.println(e[i]);
		}
		System.out.println("---------------------------------");
		for(int i = 0; i<3; i+=1) {
			System.out.println(f[i]);
		}
		
	}
}
