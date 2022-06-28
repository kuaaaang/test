package E7_배열7_기본이론;

public class 배열7_기본이론2_배열의주소개념2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d[] = {10, 20, 30}; //a,b,c 를 한번에
		
		int t1[] = {1, 2, 3};
		int t2[] = {4, 5, 6};
		int t3[] = {7, 8, 9};
		int t4[][] = new int[3][]; // t1, t2, t3를 한번에
		t4[0] = t1;
		t4[1] = t2;
		t4[2] = t3;
		
		
		int[][] arr = new int[3][3]; // 변수 13개 (그려져야 함)
		/*
		    _arr_    |   [0]_[1]_[2]
		   |     |   |  |___|___|___|
		   |_____|   |         __ __ __
		      3      | [0] -> |__|__|__|
		             |         __ __ __             _[0]_ _[1]_ _[2]_
		             | [1] -> |__|__|__|    ==>    |_|_|_|_|_|_|_|_|_|
		             |         __ __ __             3
		             | [2] -> |__|__|__|
		             |
		   (stack)   |      (heap)
		*/
		
		System.out.println(arr[0]);		// [I@7852e922
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		System.out.println(arr[1]);		// [I@4e25154f
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;

		System.out.println(arr[2]);		// [I@70dea4e
		arr[2][0] = 70;
		arr[2][1] = 80;
		arr[2][2] = 90;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------");
		
		int[] temp = arr[1];
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
	}
}
