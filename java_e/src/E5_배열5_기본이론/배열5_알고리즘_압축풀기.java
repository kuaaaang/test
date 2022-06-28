package E5_배열5_기본이론;

import java.util.Arrays;

public class 배열5_알고리즘_압축풀기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /*
	    array[][] = {3,2},{5,6},{2,1},{4,3}
		 위 데이터는 압축한 데이터이다.
		 위데이터의 규칙은 2개씩 짝을 이룬다.
		  1) 앞의 숫자 ==> 데이터 
		  2) 뒤의 숫자 ==> 개수이다.
		 예) {3,2} ==> 33
		 예) {5,6} ==> 555555
		 예) {2,1} ==> 2
		 예) {4,3} ==> 444
			 실제 데이터는 335555552444 인것이다. 
		 문제) 위데이터사이즈만큼 배열을 만들고 각각의 값을 저장후 출력 
		 예) temp = {3,3,5,5,5,5,5,5,2,4,4,4}
	   */	
		int array[][] = {
				{3,2},{5,6},{2,1},{4,3}
			};
		
		int a[] = new int[8];
		int data[] = new int[4];
		int num[] = new int[4];
		int count = 0;
		
		for(int i = 0; i<array.length; i+=1) {
			for(int j = 0; j<array[i].length; j+=1) {
				a[count] = array[i][j];
				count += 1;
			}
		}
		System.out.println(Arrays.toString(a));
		
		int n = 0;
		for(int i = 0; i<(a.length/2); i+=1) {
			data[i] = a[n];
			n += 1;
			num[i] = a[n];
			n += 1;		
		}
		System.out.println(Arrays.toString(data));
		System.out.println(Arrays.toString(num));
		
		int total = 0;
		for(int i = 0; i<num.length; i+=1) {
			total += num[i];
		}
		System.out.println(total);
		
		int [] temp = new int[total];	
		
		int index = 0;
		for(int i = 0; i<data.length; i+=1) {
			for(int j = 0; j<num[i]; j+=1) {
				temp[index] = data[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(temp));
	}
}
