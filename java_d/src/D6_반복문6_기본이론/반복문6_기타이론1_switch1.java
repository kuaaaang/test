package D6_반복문6_기본이론;

public class 반복문6_기타이론1_switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  스위치 케이스 (switch case)
		  사용예 : 비교대상이 전부 ==(같다) 일때만 사용가능하다. // 로그인 등에 사용
		  모양이 많이 불편하다. (if만 사용해도 무방하다.)
		   
		  1) switch    ==> 키워드
		  2) (값)       ==> 비교할값 
		  3) {}    	==> 영역 
		  4) case 값:   ==> 비교할값 
		  5)  내용  break ==> 비교할값과 내용 
		*/	

		
		int a = 2;			
		//----------------------------------
		if(a == 1) {
			System.out.println("a 는 1이다");
		}else if(a == 2) {
			System.out.println("a 는 2이다");
		}else if(a == 3) {
			System.out.println("a 는 3이다");
		}		
		//----------------------------------
		switch(a) {
		case 1: // case : ==
			System.out.println("a 는 1이다");
			break;
		case 2:
			System.out.println("a 는 2이다");
			break;
		case 3:
			System.out.println("a 는 3이다");
			break;
		}
	}
}
