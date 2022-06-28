package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_최소공배수3_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    /*
	   	[문제] 
	   		자전거로 운동장을 한바퀴도는데 철수는 90초 , 영희는 60초 , 민수는 45초가 걸립니다.
	   		이와같은 속력으로 같은곳에서 동시에 출발하여 같은 방향으로 운동장을 돌때, 
	   		1) 세사람이 처음으로 출발점에서 다시만나게되는것은 몇초뒤입니까?
	   		2) 다시만다게되었을때 민수는 몇바퀴 돌았을때입니까?  		
	    */
		int i = 1;
		while(true) {if(i%90==0 && i%60==0 && i%45==0) {System.out.println("세사람이 다시 만나게 되는 시간 : " + i + "초");
		                                                System.out.println("민수는 " + (i/45) + "바퀴를 돌았다.");
		                                                break;
		                                                }
			         i +=1;
	 	             }
	}
}
