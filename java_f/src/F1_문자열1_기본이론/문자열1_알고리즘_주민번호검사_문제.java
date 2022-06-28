package F1_문자열1_기본이론;

public class 문자열1_알고리즘_주민번호검사_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jumin = "890101-2012932";
		
		// 문제 1) 성별 출력
		// 정답 1) 여성
		
		// 문제 2) 나이 출력
		// 정답 2) 33세
		
		System.out.println(jumin.charAt(7));
		if(jumin.charAt(7) == '2') {
			System.out.println("여성");
		}else {System.out.println("남성");}
		
		String a = jumin.substring(0,2);
		System.out.println(a);
		int _1900 = Integer.parseInt(a) + 1900;
		System.out.println(_1900);
		
		System.out.println("나이 : " + (2022-_1900 + 1) + "세" + "(만 " + (2022-_1900) + "세)");
	}
}
