package C2_조건문2_기본이론;

public class 조건문2_알고리즘_옷_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[문제] 
			상점에서 24600원 짜리 옷을샀습니다.
			1000원짜리 지폐로만 옷값을 낸다면 몇장이 필요한가요?
		*/
		int 옷 = 24600;
		int 장 = 옷/1000;
		   if(옷%1000>0) {장 = 장 + 1;}
		   
		   System.out.println(장 + "장");
	}
}
