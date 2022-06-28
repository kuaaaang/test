package C2_조건문2_기본이론;

public class 조건문2_기본이론2_변수의생명주기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  중괄호안에서 소멸된 변수는 이후 다시 선언할수있다.
		*/	
			int a = 10;

			{
				int b = 20;
			}
			int b = 30; // b는 소멸했으므로 다시만들수있다.

			System.out.println(b);
	}
}
