package D6_반복문6_기본이론;

public class 반복문6_기타이론2_switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   스위치 케이스 (switch case)
		   사용예 : 비교대상이 전부 ==(같다) 일때만 사용가능하다.
		   모양이 많이 불편하다. (if만 사용해도 무방하다.)
		   
		   [1] default ==> if문의 else와 같은역활을한다.
		*/	
			
			int a = 4;			
			//----------------------------------
			if(a == 1) {
				System.out.println("a 는 1이다");
			}else if(a == 2) {
				System.out.println("a 는 2이다");
			}else if(a == 3) {
				System.out.println("a 는 3이다");
			}else {
				System.out.println("1~3은 아니다.");
			}
			//----------------------------------
			switch(a) {
			case 1:
				System.out.println("a 는 1이다");
				break;
			case 2:
				System.out.println("a 는 2이다");
				break;
			case 3:
				System.out.println("a 는 3이다");
				break;
			default : // default = else
				System.out.println("1~3은 아니다.");
			 // break;
			}	
	}
}
