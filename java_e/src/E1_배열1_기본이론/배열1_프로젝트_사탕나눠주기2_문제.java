package E1_배열1_기본이론;

public class 배열1_프로젝트_사탕나눠주기2_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /*
	  	[사탕나눠주기2]
	  
	   	아래 배열은 각병에 들어있는 사탕의 양이다. 
		사탕의 종류는 전부 다르고 한사람당 한병에서 25개씩 나눠줄려고 하고있다. 
		남은사탕은 옆으로 옮겨서 다음 사람한테 나눠줄수있다.
		나눠줄수있는 사람수를 
		사람수 배열에 저장하시오.
	  */
		int 사탕[] =  {97, 53, 36, 22};	// 각종류의 사탕수 
		int 사람수[] = {0, 0, 0, 0};		
		
		for(int i = 0; i<3; i+=1) {
			int count = 사탕[i]/25;
			사람수[i] = count;
			사탕[i] = 사탕[i]%25;
			사탕[i + 1] += 사탕[i];	
		}
		int 나머지 = 사탕[3] % 25;
		사람수[3] = 사탕[3] / 25;
		
		for(int i = 0; i<4; i+=1) {
			System.out.print(사탕[i] + "  ");
			}
		
		System.out.println();
		
		for(int i = 0; i<4; i+=1) {
			System.out.print(사람수[i] + "  ");
			}
		
		System.out.println();
		
		System.out.print(나머지);
			
	}
}
