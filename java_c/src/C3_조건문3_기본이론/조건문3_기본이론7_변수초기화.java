package C3_조건문3_기본이론;

public class 조건문3_기본이론7_변수초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int a;
		//System.out.println(a);  //값을 저장하지 않고 사용하면 에러가난다.
		int b = 10;
		if(b == 10) {
			a = 10;
		}
		
		// 이클립스는 조건문(if)안의 내용을 인지 하지못하기때문에 
		// a의 값이 없는상태 8번라인의 a; 만 기억하고,
		// a의 값이 없다고판단에 값을 저장하지않고 사용하면 에러가난다.
		
		//	System.out.println(a);
	}
}
