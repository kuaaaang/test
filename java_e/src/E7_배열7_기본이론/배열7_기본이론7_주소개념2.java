package E7_배열7_기본이론;

public class 배열7_기본이론7_주소개념2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,20,30};
		
		int darr[][] = {
				{10,20,30},
				{20,30,40},
				{30,40,50}
		};
		
		darr[0] = arr;  //  {10,20,30}
		darr[1] = arr;  //  {10,20,30}
		darr[2] = arr;  //  {10,20,30}
		
		arr[1] = 100;   //  {10,100,30}
		
		// 문제) 아래 실행했을때 어떤결과가 나올지 예상하시요.
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(darr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
