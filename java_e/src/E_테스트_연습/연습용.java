package E_�׽�Ʈ_����;

import java.util.Arrays;

public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = new int [5][5];
		
		int a = arr.length-1;
		for(int i = 0; i<arr.length; i+=1) {
				arr[i][i] = 1;
				arr[i][a] = 1;
				a -=1;
		}
		for(int i = 0; i<arr.length; i+=1) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
