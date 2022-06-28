package E5_배열5_기본이론;

public class 배열5_알고리즘_2차원배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 1) 전체 합 출력
		// 정답 1) 450

		// 문제 2) 4의 배수만 출력
	    // 정답 2) 20 40 60 80

		// 문제 3) 4의 배수의 합 출력
		// 정답 3) 200

		// 문제 4) 4의 배수의 개수 출력
		// 정답 4) 4
		
		int[][] arr = new int[3][3];

		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr[i].length; j+=1) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 문제1
		
		int total = 0;
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr[i].length; j+=1) {
				total += arr[i][j];
			}
		}
		System.out.println(total);
		System.out.println();
		
		// 문제2
		
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr[i].length; j+=1) {
				if(arr[i][j] % 4 == 0) {
					System.out.print(arr[i][j] + "  ");
				}
			}
		}
		System.out.println();
		System.out.println();
		
		// 문제3
		
		int total4 = 0;
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr[i].length; j+=1) {
				if(arr[i][j] % 4 == 0) {
					total4 += arr[i][j];
				}
			}
		}
		System.out.println(total4);
		System.out.println();
		
		// 문제4
		
		int count = 0;
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr[i].length; j+=1) {
				if(arr[i][j] % 4 == 0) {
					count += 1;
				}
			}
		}
		System.out.println(count);
		
		
	}
}
