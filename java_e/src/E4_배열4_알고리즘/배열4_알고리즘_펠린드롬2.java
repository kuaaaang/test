package E4_배열4_알고리즘;

import java.util.Arrays;

public class 배열4_알고리즘_펠린드롬2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /* 
	    [펠림드롬]
	    
	    - 펠림드롬이란 앞에서 시작해도 뒤에서시작해도 똑같은 값이다.
	    
	  	위 배열에서 0이나 1을 제외한 나머지 값들이 페린드롬인지 출력한다.
		[예] 1과 0을 전부 제외하면 3,2,2,3 이므로 펠린드롬이다.
	 */
		int arr[] = {1,3,0,0,2,1,2,3,0};
		
		int temp[] = new int[arr.length];
		int tcount = 0;
		
		for(int i = 0; i<arr.length; i+=1) {
			if(arr[i] != 0 && arr[i] != 1) {
				temp[tcount] = arr[i];
				tcount += 1;
			}
		}
		System.out.println(Arrays.toString(temp));
		System.out.println(tcount);
		
		System.out.println();
		
		int a = tcount-1;
		boolean check = false;
		for(int j = 0; j<tcount/2; j+=1) {
			if(temp[j] != temp[a]) {
				check = true;
				break;
			}
			a -= 1;
		}
		if(check == false) {System.out.println("펜린드롬 O");}
		else {System.out.println("펠린드롬 X");}
	}
}
