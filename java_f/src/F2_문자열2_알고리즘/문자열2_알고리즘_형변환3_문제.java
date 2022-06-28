package F2_문자열2_알고리즘;

public class 문자열2_알고리즘_형변환3_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제) 이름과 성적을 아래와같이 하나의 문자열로 연결
		// 정답) "김철수/87,이만수/42,이영희/95"
				
		String[] name = { "김철수", "이만수", "이영희" };
		int[] score = { 87, 42, 95 };
				
		String str = "";
		
		for(int i = 0; i<name.length; i+=1) {
			if(i<2) {str += name[i] + "/" + score[i] + ",";}
			else if(i==2) {str += name[i] + "/" + score[i];}
			
		}
		str = str.substring(0,str.length()-1);
		System.out.println(str);
	}
}
