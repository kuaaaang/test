package E6_배열6_알고리즘;

import java.util.Arrays;

public class 배열6_알고리즘_두개뽑아서더하기_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   /*	
		 [1] arr 배열에서 숫자 2개씩 뽑아서 더한값을 차례대로 result 에 저장후출력
		 [2] 자기차례 인덱스의 값은  더하지않는다.		
		  (1) [인덱스 0] 의값 2 + (1,3,4,1) ==> 2 + 1 , 2 + 3 , 2 + 4 , 2 + 1
		  (2) [인덱스 1] 의값 1 + (2,3,4,1) ==> 1 + 2 , 1 + 3 , 1 + 4 , 1 + 1
		  (3) [인덱스 2] 의값 3 + (2,1,4,1) ==> 3 + 2 , 3 + 1 , 3 + 4 , 3 + 1
		   ....		
		 [추가 조건] result 에 저장된값들중 중복되는 값은 전부 삭제후 출력 
	   */
		int arr[]  = {2,1,3,4,1};
		int result [] = new int[20];
		
		int count = 0;
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr.length; j+=1) {
				if(i == j) {
					continue;
				}
				else {
					result[count] = arr[i] + arr[j];
					count += 1;
				}
			}
		}
		System.out.println(Arrays.toString(result));
		
		System.out.println("----------------------------");
		
		for(int i = 0; i<result.length; i+=1) {
			for(int j = 0; j<result.length; j+=1) {
				if(result[i]!=result[j]) {
					int temp = result[i];
					for(int k = 0; k<result.length; k+=1) {
						if(result[k] == temp) {
							result[k] = 0;
							
							int index1 = 0;
							int index2 = 0;
							for(int l = 0; l<result.length; l+=1) {
								if(result[l] != 0) {
									int temp2 = result[index1];
									result[index1] = result[index2];
									result[index2] = temp2;
									index2 += 1;
								}
								index1 += 1;
							}
						}
					}
					System.out.println(Arrays.toString(result));
				}
				else if(result[i]==result[j]) {continue;}
			}
		}	
		// System.out.println(Arrays.toString(result));
	}
}
