package F1_문자열1_기본이론;

public class 문자열1_알고리즘_채팅_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  위채팅을 아래서 위로 출력하는데 ,
		  철수는 왼쪽정렬 ,
		  영희는 오른쪽정렬로 출력해보자. 
		*/	
		String wordList [][]= {
				{"철수", "영희야 안녕"} , 
				{"영희", "철수야 안녕"} ,  
				{"철수", "오늘 점심같이 먹을래?"}, 
				{"영희", "아니 약속있어. 다음에 먹자."} , 
				{"철수", "그래 다음에 먹자."}
			};
			
		/*
		  "영희야 안녕"
		 			        "철수야 안녕"
		  "오늘 점심같이 먹을래?"
		        "아니 약속있어. 다음에 먹자."
		  "그래 다음에 먹자."
	   */
		for(int i = 0; i<wordList.length; i+=1) {
			if(wordList[i][0] == "철수") {
				System.out.printf("\"%-25s" , wordList[i][1] + "\"");
			}
			else if(wordList[i][0] == "영희") {
				wordList[i][1] = "\"" + wordList[i][1];
				System.out.printf("%25s\"" , wordList[i][1]);
			}
			System.out.println();
		}
	}
}
