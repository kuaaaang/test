package F2_문자열2_알고리즘;

import java.util.Arrays;

public class 문자열2_알고리즘_형변환2_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
				
		String[] name = new String[3]; // 김철수,이만수,이영희
		int[] score = new int[3];      // 87,42,95
		
		int index = 0;
		String arr1[] = str.split(",");
		for(int i = 0; i<arr1.length; i+=1) {
			String arr2[] = arr1[i].split("/");
			for(int j = 0; j<arr2.length; j+=1) {
				name[index] = arr2[0];
				score[index] = Integer.parseInt(arr2[1]);
			}
			index += 1;
			if(index == 3) {break;}	
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
	}
}
