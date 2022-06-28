package A1_기본이론;
/*
 * 
이스케이프 문자(escape sequence) - 역슬러시
1) \n	: 줄바꿈
2) \t	: tab (4칸 띄어쓰기)
3) \"	: " 를 출력한다.
4) \'	: ' 를 출력한다.

 */
public class 기본이론9_이스케이프문자 {
	public static void main(String[] args) {

		System.out.println("안녕\n하세요.");
		System.out.println("안녕");
		System.out.println("하세요.");
		System.out.println("----------------------");
		System.out.println("안녕\t하세요.");
		System.out.println("안녕    하세요.");
		System.out.println("----------------------");
		System.out.println("\"안녕하세요.\"");
		System.out.println("----------------------");
		System.out.println("\'안녕하세요.\'");
		System.out.println("----------------------");
	}
}
