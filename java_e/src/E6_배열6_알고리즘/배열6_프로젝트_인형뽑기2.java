package E6_배열6_알고리즘;

import java.util.Arrays;

public class 배열6_프로젝트_인형뽑기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  위 데이터는 인형뽑기 기계의 데이터 이다. (7 x 5) 사이즈
		  [인형번호] 
		  [1 : 호랑이] [2 : 곰] [3 : 사자] [4 : 기린]
		  -------------------------------------------------
		  [1] 숫자 0 은 비어있는것을뜻한다.
		  [2] 숫자 0 이 아닌곳은 인형이 있는것을 뜻하고 숫자는 인형번호이다.
		  [3] input의 데이터는 오늘 손님들이 인형을 선택한 인덱스번호이다.
		  [4] 세로단위로 한라인이고, 인덱스번호는 가로로 선택이 된다. (예 0~4번까지 가능)
		  [5] 인형은 각라인별 아래서 부터뽑힌다. 맨 아래가 뽑히므로 전부 한칸씩 내려온다.
		  예) input ==> 1 ==> 2,1,4,1,1 라인이고 맨아래 1 이 뽑히면 2,1,4,1 이된다.
		  [6] 만약에 전부 값이 0인 라인을 선택하게되면, "꽝" 출력 
		  [7] 오늘 판매된 인형 이름을 출력하시요. 
		  예) 
		     1 ==> [1:호랑이]
		     0 ==> [2:곰]
		     0 ==> [4:기린]
		     3 ==> [3:사자]
		     3 ==> [0:꽝]
		     4 ==> [3:사자]
		     4 ==> [4:기린]
		*/
	     	String 인형[] = {"호랑이" , "곰" , "사자" , "기린"};
	     	// 1 2 4 3 0 3 4 // 호랑이 곰 기린 사자 꽝 사자 기린
		
		    int machine[][] = {
					{0,0,0,0,0},
					{0,0,0,0,3},
					{0,2,0,0,3},
					{3,1,3,0,1},
					{1,4,2,0,2},
					{4,1,4,0,4},
					{2,1,4,3,3},
			};
			int input[] = {1,0,0,3,3,4,4};
			
			int count = 0;
			int total = 0;
			for(int k = 0; k<input.length; k+=1){
				System.out.println(Arrays.toString(machine[k]));
			}
			System.out.println();
			
			for(int i = 0; i<input.length; i+=1){
				
				for(int j = 6; j>=0; j-=1) {
					if(machine[j][input[i]] == 0) {
						count += 1;
					}
					else if(machine[j][input[i]] != 0) {
						System.out.println(인형[(machine[j][input[i]])-1] + "인형을 뽑았습니다.");
						total += 1;
						for(int l = 6; l>0; l-=1) {
							machine[l][input[i]] = 0;
							int temp = machine[l][input[i]];
							machine[l][input[i]] = machine[l-1][input[i]];
							machine[l-1][input[i]] = temp;
						}
						break;
					}
					if(count == 7) {System.out.println("꽝!");}
				}
				for(int k = 0; k<input.length; k+=1){
					System.out.println(Arrays.toString(machine[k]));
				}
				System.out.println();
			}
			System.out.println("판매된 인형 : " + total + "개");	
	}
}
