package C3_조건문3_기본이론;

public class 조건문3_기본이론4_if옵션_elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	  
	      if 문의 옵션  (2) else if 		  	  		  	  
	  	  if 만 가지고도 정확한 코드를 짤수있지만,
	  	  else if 사용하면   조건문의 조건이 여러개인경우 보다
	  	   효율적으로 코드를 작성할수있다.		  	  		  	 
	  	 --------------------------------------------		 
	  	  if(조건식1){
		 		조건식1이 참(true)일 때, 실행할 문장;
		  }else if(조건식2){
		  		조건식2가 참(true)일 때, 실행할 문장;
		  }else if(조건식3){
		  		조건식3이 참(true)일 때, 실행할 문장;
		  }else{
		  		위 조건을 모두 만족하지 않을 때, 실행할 문장;
		  }			 		
	    */		
		/*
		  if 에서 else if 2개 를 거쳐 else 까지 식이 하나로묶인다. 
		  else는 모든조건이 거짓이되면 작동한다. 	
		 */	
		System.out.println("1.사과 2.포도 3.감");
		int  select = 1;
		System.out.println("선택한 번호 : " + select);
		if(select == 1) 	 { System.out.println("1.사과");}
		else if(select == 2) { System.out.println("2.포도");}
		else if(select == 3) { System.out.println("3.감");}
		else {System.out.println("오류1");}
		//============================================
		System.out.println("자판기 : [1.과자 2.음료수 3.라면]");
		System.out.println("번호를 입력하세요 : ");
		select = 1;
		System.out.println("선택한 번호 : " + select);
		if(select == 1) { System.out.println("1.과자");}
		if(select == 2) { System.out.println("2.음료수");}
		if(select == 3) { System.out.println("3.라면");}
		if(select < 1 || select > 3) {System.out.println("[오류]");}
	}
}
