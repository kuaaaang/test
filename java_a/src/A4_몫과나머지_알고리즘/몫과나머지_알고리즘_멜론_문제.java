package A4_몫과나머지_알고리즘;

public class 몫과나머지_알고리즘_멜론_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
    	문제) 
		        멜론음원사이트 에서는 정액제인 경우에는 10500원이고, 
		        한달간 무제한으로 내려받을수있고, 
		        정액제가 아닌경우에는 한 곡당 600원에 내려받을수있다.
		        최소 한달에 몇곡이상 내려받을때 정액제를 사용하는것이
		        좋을까? 
	    */
		System.out.println(10500/600);
		System.out.println(10500%600);
		/*
		17곡을 구매 한 후 300원이 남음 
		*/
		System.out.println((10500/600 + 1) + "곡");
	}
}
