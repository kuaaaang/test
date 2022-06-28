package D2_반복문2_알고리즘;

public class 반복문2_알고리즘_시험점수_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	       [문제]
		        철수는 두번의 시험에서 각각 80점과 72점을 받았다.
		        세 번째 시험에서 최소 몇 점이상을 받아야 
		        
		        세번의 시험성정의 평균이 82점이상이 될수 있을까?
		*/
		int i = 0;
		int count = 0;
		while(i>=0 && i<=100) {
			if((80+72+i)/3.0 >= 82) {
				count = count + 1;
		        if(count == 1) {
		        	System.out.println("최소 : " + i + "점");
		            i = 101;
		        }		
		    }
		i +=1;
		}
	}
}
