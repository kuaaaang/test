package E8_배열8_심화프로젝트;

import java.util.Arrays;

public class 배열8_프로젝트_달팽이_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [달팽이]
		  아래와같이 출력하시오.
		   
		  1   2   3   4   5	
		  16  17  18  19  6	
		  15  24  25  20  7	
		  14  23  22  21  8	
		  13  12  11  10  9
		*/
		int arr[][] = new int [5][5];
		int count = 1;
		
		while(true) {
			
			if(count<6 || (count>16 && count<20) || count==25) {
				if(count/10 == 0) {
					for(int a = 0; a<5; a+=1) {
						arr[0][a] = count;
						count += 1;
					}
				}
				else if(count/10 == 1) {
					for(int a = 1; a<arr.length-1; a+=1 ) {
						arr[1][a] = count;
						count += 1;
					}
				}
				else if(count == 25) {
					arr[2][2] = count;
					count += 1;
				}
			}
			else if((count>5 && count<10) ||(count>19 && count<22)) {
				if(count/10 == 0) {
					for(int b = 1; b<arr.length; b+=1 ) {
						arr[b][4] = count;
						count += 1;
					}
				}
				else if(count/10 > 0) {
					for(int b = 2; b<arr.length-1; b+=1 ) {
						arr[b][3] = count;
						count += 1;
					}
				}
			}
			else if((count>9 && count<14) ||(count>21 && count<24)) {
				if(count/10 == 1) {
					for(int a = arr.length-2; a>=0; a-=1 ) {
						arr[4][a] = count;
						count += 1;
					}
				}
				else if(count/10 == 2) {
					for(int a = arr.length-3; a>0; a-=1 ) {
						arr[3][a] = count;
						count += 1;
					}
				}
			}
			else if((count>13 && count<17) ||(count>23 && count<25)) {
				if(count/10 == 1) {
					for(int b = arr.length-2; b>0; b-=1 ) {
						arr[b][0] = count;
						count += 1;
					}
				}
				else if(count/10 == 2) {
					for(int b = arr.length-3; b>1; b-=1 ) {
						arr[b][1] = count;
						count += 1;
					}
				}
			}

			if(count == 26) {break;}
		}
		
		for(int i = 0; i<arr.length; i+= 1) {
			for(int j = 0; j<arr.length; j+= 1) {
				System.out.printf("%2d" , arr[i][j]);
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}
