package E7_배열7_기본이론;

import java.util.Arrays;

public class 배열7_알고리즘_인풋추가삭제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /*
		1) arr 배열은 사이즈3이다.		
		2) input 배열 안의 값들은  추가와 삭제를 반복할 값들이다.		
		3) 0번 인덱스의 값은 "추가" 이고, 
		4) 1번 인덱스의 값은 "삭제" 이다. 
		   [조건] 삭제한자리는 뒤에서부터 앞으로 밀어내고 0으로 표시 한다. 	
		5) 중복된값은 "추가" 할수없고 , 없는값은 "삭제"할수없다.
		6) input의 값들을 전부 처리하고 처리과정출력 		
		예)
		 10 ==> 짝수인덱스이므로 추가 ==> arr[] = {10,0,0};
		 20 ==> 홀수인덱스이므로 삭제 ==> 20은 없으므로 ==> "삭제할값이 없습니다"
		 30 ==> 짝수인덱스이므로 추가 ==> arr[] = {10,30,0};
		 10 ==> 홀수인덱스이므로 삭제 ==> arr[] = {30,0,0};
		 30 ==> 짝수인덱스이므로 추가 ==> 30 은이미 저장되어서 ==> "중복됩니다"
		 30 ==> 홀수인덱스이므로 삭제 ==> arr[] = {0,0,0};
	   */	
		int arr[] = {0,0,0};
		int count = 0;
		int c = 0;
			
		int input[][] = {{10,20},{30,10},{30,30}};	
		
		for(int i = 0; i<input.length; i+=1) {
			int a = 0;
			for(int j = 0; j<arr.length; j+=1) {
				if(arr[j] != input[i][0]) {
					a += 1;
					if(a==3) {
						System.out.println("추가할 값 : " + input[i][0]);
						arr[count] = input[i][0];
						count += 1;
					}
				}
				else if(arr[j] == input[i][0]) {
					System.out.println("중복된 값입니다.");
				}
			}
			
			System.out.println(Arrays.toString(arr));
			System.out.println();
			
			for(int j = 0; j<arr.length; j+=1) {
				if(arr[j] == input[i][1]) {
					System.out.println("삭제할 값 : " + arr[j]);
					arr[j] = 0;
					for(int k = j; k<arr.length-1; k+=1) {
						int temp = arr[k];
						arr[k] = arr[k+1];
						arr[k+1] = temp;
					}
				}
				else {c += 1;}
			}
			if(c == 3) {System.out.println("삭제할 값이 없습니다.");}
				
			System.out.println(Arrays.toString(arr));
			System.out.println();			
		}
	}
}
