package F2_문자열2_알고리즘;

import java.util.Arrays;

public class 문자열2_알고리즘_형변환4_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		// 위 데이터에서 꼴등을 삭제후 다시 문자열로 변경
		
		//1) 문자열을 잘라서 배열에 저장한다.
		//2) 배열에서 꼴등을 삭제한다
		//3) 삭제한배열을 다시 문자열로 만든다.
		
		// str = "김철수/87,이영희/95";
		
		String arr1[] = str.split(",");
		String name[] = new String[arr1.length];
		int score[] = new int[arr1.length];
		
		for(int i = 0; i<arr1.length; i+=1) {
			String arr2[] = arr1[i].split("/");
			name[i] = arr2[0];
			score[i] = Integer.parseInt(arr2[1]);
		}
		
//		System.out.println(Arrays.toString(name));
//		System.out.println(Arrays.toString(score));
		
		int a = 0;
		int min = 100;
		for(int i = 0; i<score.length; i+=1) {
			if(score[i]<min) {
				min = score[i];
				a = i;
			}
		}
		
		String text = "";
		for(int i = 0; i<arr1.length; i+=1) {
			if(i != a) {
				text = text + name[i] + "/" + score[i] + ",";
			}
		}
		
//		System.out.println(text);
		
		System.out.println(text.substring(0, text.length()-1));
	}
}
