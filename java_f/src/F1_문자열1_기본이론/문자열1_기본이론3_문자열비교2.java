package F1_문자열1_기본이론;

public class 문자열1_기본이론3_문자열비교2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자 => 수치화  : 아스키코드표
		System.out.println((int)'a');
		System.out.println((int)'b');
		
		System.out.println("------------------");
		
		/*
		 문자들은 기본적으로 숫자를 가지고있다.
		 compareTo 는  빼기 를 뜻한다. 	
		 만약에 "a" 가  숫자 10이라면 "b" 는 11이다.
		 a에서 b를 뺀다면 ==> 음수가 나올것이다.
		 
		 * 문자A - 문자B *
		 1) 음수 ==> 문자A가 사전에서 앞에 위치한다.
		 2) 양수 ==> 문자B가 사전에서 앞에 위치한다.
		 3) 0  ==> 문자A와 문자B가 같다.	
		*/

		String str1 = "가";
		String str2 = "나";
		String str3 = "다";
		
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);			// 음수
		
		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);			// 양수
		
		int rs3 = str1.compareTo(str1);
		System.out.println(rs3);			// 0
	}
}
