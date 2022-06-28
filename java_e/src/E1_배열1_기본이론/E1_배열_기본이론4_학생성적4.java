package E1_배열1_기본이론;

public class E1_배열_기본이론4_학생성적4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   numberList = {1001, 1002, 1003, 1004, 1005};
		   scoreList  = { 87 ,  11 ,  45 ,  98 ,  23 };
		   [문제] 1등학생의 학번과 성적 출력한다.
		   [정답] 1004번(98점)
		*/
		int numberList[] = {1001, 1002, 1003, 1004, 1005};
		int scoreList[]  = { 87 ,  11 ,  45 ,  98 ,  23 };
		
		int maxn = 0;
		int maxs = 0;
		
		for(int i = 0; i<5; i+=1) {
			if(scoreList[i]>maxs) {
				maxs = scoreList[i];
		        maxn = numberList[i];
	        }                                                
	    }
		System.out.println("1등 학생 학번 : " + maxn + " , 성적 : " + maxs + "점");	
	}
}
