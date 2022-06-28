package E4_배열4_알고리즘;

public class 배열4_알고리즘_팰린드롬1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {1,5,4,5,3,2,2,3,5,4,5,1};
		int arr2[] = {1,5,4,5,3,2,3,5,4,5,1};
		//위 배열들이 각각 팰린드롬인지 아닌지 출력하시요.
		
		//팰린드롬이란? 
		
		// 앞에서부터 읽을 때와
		// 뒤에서부터 읽을 때 똑같은 숫자가 나오면 팰린드롬이다
		// 예) 2112
		// 예) 12321
		int a = arr1.length-1;
		boolean check1 = false;
		for(int i = 0; i<arr1.length/2; i+=1) {
			if(arr1[i] != arr1[a]) {
				check1 = true;
				break;
			}
			a -= 1;
		}
		if(check1 == true) {System.out.println("아니다.");}
		else {System.out.println("맞다.");}
		
		System.out.println("---------------------------------------");
		
		int b = arr2.length-1;
		boolean check2 = false;
		for(int j = 0; j<arr2.length/2; j+=1) {
			if(arr2[j] != arr2[b]) {
				check2 = true;
				break;
			}
			b -= 1;
		}
		if(check2 == true) {System.out.println("아니다.");}
		else {System.out.println("맞다.");}
	}
}
