package B2_비교연산자_기본이론;

public class 비교연산자_기본이론2_문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제1) 아래값이 true 가되도록  변수a 값을 변경해보자.
	    int a = 0;
	    a = 3;
	    boolean b = 2 * a - 1 > 4 ;
	    System.out.println(b);
	   
	   //문제2) 아래값이 true 가되도록  변수a2 값을 변경해보자.
	    int a2 = 0;
	    a2 = 3;
	    boolean b2 = 6 - 2 * a2 < a2 ;
	    System.out.println(b2);
	   
	   //문제3) 아래값이 true 가되도록  변수a3 값을 변경해보자.
	    int a3 = 0;
	    a3 = 1;
	    boolean b3 = 63 * a3 - 5 > 7 + 2 * a3;
	    System.out.println(b3);
	}
}
