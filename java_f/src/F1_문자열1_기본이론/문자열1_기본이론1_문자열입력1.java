package F1_문자열1_기본이론;

import java.util.Scanner;

public class 문자열1_기본이론1_문자열입력1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
			
		//문자열은 next() 를 사용한다. 단, 공백은 인식못한다.
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		                // next는 하나의 단어만 출력해준다.
		                // 공백(띄어쓰기)이 있는경우 그 앞 까지만 출력

		System.out.println("name = " + name);
		
		scan.close();
	}
}
// 영단어 뒤에 있는 소괄호 : 매서드 or 함수 ( ex) next(); )
//                                         ----